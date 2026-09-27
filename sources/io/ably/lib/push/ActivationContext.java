package io.ably.lib.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.a5e;
import io.ably.lib.push.ActivationStateMachine;
import io.ably.lib.rest.AblyRest;
import io.ably.lib.types.AblyException;
import io.ably.lib.types.Callback;
import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.RegistrationToken;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class ActivationContext {
    protected AblyRest ably;
    protected ActivationStateMachine activationStateMachine;
    protected String clientId;
    protected final Context context;
    protected LocalDevice localDevice;
    protected final SharedPreferences prefs;
    private static final WeakHashMap<Context, ActivationContext> activationContexts = new WeakHashMap<>();
    private static final String TAG = ActivationContext.class.getName();

    public ActivationContext(Context context) {
        this.context = context;
        this.prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static /* synthetic */ void a(Callback callback, Task task) {
        lambda$getRegistrationToken$0(callback, task);
    }

    public static ActivationContext getActivationContext(Context context, AblyRest ablyRest) {
        ActivationContext activationContext;
        String str;
        WeakHashMap<Context, ActivationContext> weakHashMap = activationContexts;
        synchronized (weakHashMap) {
            try {
                activationContext = weakHashMap.get(context);
                if (activationContext == null) {
                    String str2 = TAG;
                    Log.v(str2, "getActivationContext(): creating new ActivationContext for this application");
                    ActivationContext activationContext2 = new ActivationContext(context);
                    weakHashMap.put(context, activationContext2);
                    str = str2;
                    activationContext = activationContext2;
                } else {
                    str = TAG;
                    Log.v(str, "getActivationContext(): returning existing ActivationContext for this application");
                }
                if (ablyRest != null) {
                    Log.v(str, "Setting Ably instance on the activation context");
                    activationContext.setAbly(ablyRest);
                } else {
                    Log.v(str, "Not setting Ably instance on the activation context");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activationContext;
    }

    private static /* synthetic */ void lambda$getRegistrationToken$0(Callback callback, Task task) {
        Log.v(TAG, "getRegistrationToken(): FirebaseMessaging#getToken() completed: task=" + task);
        if (task.isSuccessful()) {
            callback.onSuccess((String) task.getResult());
        } else {
            callback.onError(ErrorInfo.fromThrowable(task.getException()));
        }
    }

    public static void setActivationContext(Context context, ActivationContext activationContext) {
        Log.v(TAG, "setActivationContext(): applicationContext=" + context + ", activationContext=" + activationContext);
        activationContexts.put(context, activationContext);
    }

    public AblyRest getAbly() {
        if (this.ably != null) {
            Log.v(TAG, "getAbly(): returning existing Ably instance");
            return this.ably;
        }
        String str = TAG;
        Log.v(str, "getAbly(): creating new Ably instance");
        String str2 = getLocalDevice().deviceIdentityToken;
        if (str2 != null) {
            Log.v(str, "getAbly(): returning Ably instance using deviceIdentityToken");
            AblyRest ablyRest = new AblyRest(str2);
            this.ably = ablyRest;
            return ablyRest;
        }
        Log.e(str, "getAbly(): unable to create Ably instance using deviceIdentityToken");
        throw AblyException.fromErrorInfo(new ErrorInfo("Unable to get Ably library instance; no device identity token", 40000, CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
    }

    public synchronized ActivationStateMachine getActivationStateMachine() {
        try {
            if (this.activationStateMachine == null) {
                Log.v(TAG, "getActivationStateMachine(): creating new instance and returning that");
                this.activationStateMachine = new ActivationStateMachine(this);
            } else {
                Log.v(TAG, "getActivationStateMachine(): returning existing instance");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.activationStateMachine;
    }

    public Context getContext() {
        return this.context;
    }

    public AblyRest getDeviceIdentityTokenBasedAblyClient(String str) {
        ClientOptions copy = this.ably.options.copy();
        copy.clearAuthOptions();
        copy.token = str;
        return new AblyRest(copy);
    }

    public synchronized LocalDevice getLocalDevice() {
        Storage storage;
        try {
            if (this.localDevice == null) {
                Log.v(TAG, "getLocalDevice(): creating new instance and returning that");
                AblyRest ablyRest = this.ably;
                if (ablyRest != null) {
                    storage = ablyRest.options.localStorage;
                } else {
                    storage = null;
                }
                this.localDevice = new LocalDevice(this, storage);
            } else {
                Log.v(TAG, "getLocalDevice(): returning existing instance");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.localDevice;
    }

    public SharedPreferences getPreferences() {
        return this.prefs;
    }

    public void getRegistrationToken(Callback<String> callback) {
        Log.v(TAG, "getRegistrationToken(): callback=" + callback);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new a5e(callback, 2));
    }

    public void onNewRegistrationToken(RegistrationToken.Type type, String str) {
        String str2 = TAG;
        Log.v(str2, "onNewRegistrationToken(): type=" + type + ", token=" + str);
        LocalDevice localDevice = getLocalDevice();
        RegistrationToken registrationToken = localDevice.getRegistrationToken();
        if (registrationToken != null) {
            if (registrationToken.type != type) {
                Log.e(str2, "trying to register device with " + type + ", but it was already registered with " + registrationToken.type);
                return;
            }
            if (registrationToken.token.equals(str)) {
                return;
            }
        }
        Log.v(str2, "onNewRegistrationToken(): updating token");
        localDevice.setAndPersistRegistrationToken(new RegistrationToken(type, str));
        getActivationStateMachine().handleEvent(new ActivationStateMachine.GotPushDeviceDetails());
    }

    public void reset() {
        Log.v(TAG, "reset()");
        this.ably = null;
        getActivationStateMachine().reset();
        this.activationStateMachine = null;
        getLocalDevice().reset();
        this.localDevice = null;
    }

    public void setAbly(AblyRest ablyRest) {
        this.ably = ablyRest;
        this.clientId = ablyRest.auth.clientId;
    }

    public synchronized void setActivationStateMachine(ActivationStateMachine activationStateMachine) {
        Log.v(TAG, "setActivationStateMachine(): activationStateMachine=" + activationStateMachine);
        this.activationStateMachine = activationStateMachine;
    }

    public boolean setClientId(String str, boolean z) {
        ActivationStateMachine activationStateMachine;
        String str2 = TAG;
        Log.v(str2, "setClientId(): clientId=" + str + ", propagateGotPushDeviceDetails=" + z);
        boolean equals = str.equals(this.clientId);
        boolean z2 = equals ^ true;
        if (!equals) {
            this.clientId = str;
            if (this.localDevice != null) {
                Log.v(str2, "setClientId(): local device exists");
                this.localDevice.setClientId(str);
                if (this.localDevice.isRegistered() && (activationStateMachine = this.activationStateMachine) != null && z) {
                    activationStateMachine.handleEvent(new ActivationStateMachine.GotPushDeviceDetails());
                    return z2;
                }
            } else {
                Log.v(str2, "setClientId(): local device doest not exist");
            }
        }
        return z2;
    }

    public static ActivationContext getActivationContext(Context context) {
        return getActivationContext(context, null);
    }
}
