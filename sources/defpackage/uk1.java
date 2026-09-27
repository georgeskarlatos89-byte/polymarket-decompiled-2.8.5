package defpackage;

import android.os.Build;
import bo.app.z0;
import com.google.mlkit.common.MlKitException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class uk1 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ uk1(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return "Failed to start push unregistration.";
            case 1:
                return "Failed to retrieve the current user.";
            case 2:
                return "unregisterPush() succeeded. Clearing locally stored push token.";
            case 3:
                return "Failed to request geofence refresh with rate limit ignore: false";
            case 4:
                return ace.j(glg.class, "Failed to add synchronous subscriber for class: ");
            case 5:
                return "Failed to request Content Cards refresh from Braze servers.";
            case 6:
                return z0.a("Device build model matches a known crawler. Enabling mock network request mode. Device it: ", Build.MODEL);
            case 7:
                return "Failed to request Content Cards refresh from the cache.";
            case 8:
                return "Failed to flush push delivery events";
            case 9:
                return "Failed to retrieve the current user.";
            case 10:
                return "Failed to add subscriber to new in-app messages.";
            case 11:
                return "Failed to perform initial Braze singleton setup.";
            case 12:
                return "Failed to add subscriber for SDK authentication failures.";
            case 13:
                return "Applying any pending runtime configuration values";
            case 14:
                return "Clearing config values";
            case 15:
                return "Failed to subscribe to BrazeUserChangeEvent.";
            case 16:
                return "Failed to send initial BrazeUserChangeEvent upon subscribeToChangeUserEvents.";
            case 17:
                return "Sending cached update upon content card subscription";
            case MlKitException.UNSUPPORTED /* 18 */:
                return "Failed to send cached content cards upon subscribeToContentCardsUpdates.";
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return "logout() flushing pending data before unregistering push.";
            case 20:
                return "logout() unregisterPush succeeded. Wiping data and disabling SDK.";
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return "User dependency manager is uninitialized. Not publishing error.";
            case 22:
                return "Failed to request data flush.";
            case 23:
                return "***************************************************************************************";
            case 24:
                return "***************************************************************************************";
            case 25:
                return "ConfigurationProvider has not been initialized. Constructing a new one.";
            case 26:
                return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
            case 27:
                return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
            case 28:
                return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
            default:
                return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
        }
    }
}
