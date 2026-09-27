package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import defpackage.czf;
import defpackage.fyg;
import defpackage.j84;
import defpackage.kbg;
import defpackage.lf7;
import defpackage.pxn;
import defpackage.q96;
import defpackage.qmn;
import defpackage.rsc;
import defpackage.ugn;
import io.sentry.android.core.m0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class FirebaseMessagingService extends lf7 {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_FCM_REGISTERED = "com.google.firebase.messaging.FCM_REGISTERED";
    static final String ACTION_FCM_UNREGISTERED = "com.google.firebase.messaging.FCM_UNREGISTERED";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private kbg rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // defpackage.lf7
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) fyg.F().e).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Type inference failed for: r6v3, types: [ysk, java.lang.Object] */
    @Override // defpackage.lf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        kbg kbgVar;
        Integer num;
        int i;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            if (ACTION_FCM_REGISTERED.equals(action)) {
                onRegistered(intent.getStringExtra(EXTRA_TOKEN));
                return;
            } else if (ACTION_FCM_UNREGISTERED.equals(action)) {
                onUnregistered(intent.getStringExtra(EXTRA_TOKEN));
                return;
            } else {
                intent.getAction();
                return;
            }
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (queue.contains(stringExtra)) {
                Log.isLoggable("FirebaseMessaging", 3);
                kbgVar = this.rpc;
                if (kbgVar == null) {
                    kbgVar = new kbg(getApplicationContext());
                    this.rpc = kbgVar;
                }
                j84 j84Var = new j84(intent);
                if (kbgVar.c.A() < 233700000) {
                    Bundle bundle = new Bundle();
                    Intent intent2 = j84Var.a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle.putString("google.message_id", stringExtra2);
                    Intent intent3 = j84Var.a;
                    if (intent3.hasExtra("google.product_id")) {
                        num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        bundle.putInt("google.product_id", num.intValue());
                    }
                    pxn e = pxn.e(kbgVar.b);
                    synchronized (e) {
                        i = e.a;
                        e.a = i + 1;
                    }
                    e.f(new qmn(i, 3, bundle, 0));
                    return;
                }
                Tasks.c(new IOException("SERVICE_NOT_AVAILABLE"));
                return;
            }
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(stringExtra);
        }
        String stringExtra3 = intent.getStringExtra("message_type");
        if (stringExtra3 == null) {
            stringExtra3 = "gcm";
        }
        char c = 65535;
        switch (stringExtra3.hashCode()) {
            case -2062414158:
                if (stringExtra3.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra3.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra3.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra3.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                onDeletedMessages();
                break;
            case 1:
                ugn.e(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = new Bundle();
                }
                extras.remove("androidx.content.wakelockid");
                if (q96.m(extras)) {
                    q96 q96Var = new q96(extras);
                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new rsc("Firebase-Messaging-Network-Io"));
                    ?? obj = new Object();
                    obj.a = newSingleThreadExecutor;
                    obj.b = this;
                    obj.c = q96Var;
                    try {
                        if (obj.D()) {
                            break;
                        } else {
                            newSingleThreadExecutor.shutdown();
                            if (ugn.h(intent)) {
                                ugn.f(intent.getExtras(), "_nf");
                            }
                        }
                    } finally {
                        newSingleThreadExecutor.shutdown();
                    }
                }
                onMessageReceived(new czf(extras));
                break;
            case 2:
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                Exception exc = new Exception(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, exc);
                break;
            case 3:
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                m0.p("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra3));
                break;
        }
        kbgVar = this.rpc;
        if (kbgVar == null) {
        }
        j84 j84Var2 = new j84(intent);
        if (kbgVar.c.A() < 233700000) {
        }
    }

    public void setRpcForTesting(kbg kbgVar) {
        this.rpc = kbgVar;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(czf czfVar) {
    }

    @Deprecated
    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onRegistered(String str) {
    }

    public void onUnregistered(String str) {
    }

    @Deprecated
    public void onSendError(String str, Exception exc) {
    }
}
