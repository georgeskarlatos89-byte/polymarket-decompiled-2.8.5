package io.intercom.android.sdk.fcm;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.intercom.twig.Twig;
import defpackage.ca6;
import defpackage.czf;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.push.IntercomPushClient;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class IntercomFcmMessengerService extends FirebaseMessagingService {
    public static final /* synthetic */ int a = 0;
    private static final IntercomPushClient pushClient = new IntercomPushClient();
    private static final Twig twig = LumberMill.getLogger();

    public static /* synthetic */ void b(Application application, Task task) {
        lambda$initialize$0(application, task);
    }

    public static void initialize(Application application) {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new ca6(application, 14));
    }

    private static /* synthetic */ void lambda$initialize$0(Application application, Task task) {
        if (!task.isSuccessful()) {
            twig.w("Fetching FCM registration token failed", task.getException());
            return;
        }
        String str = (String) task.getResult();
        twig.internal("FCM registration token fetched: " + str);
        pushClient.sendTokenToIntercom(application, str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(czf czfVar) {
        twig.d("Intercom push received: " + czfVar.O(), new Object[0]);
        pushClient.handlePush(getApplication(), czfVar.O());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        if (TextUtils.isEmpty(str)) {
            twig.e("Intercom push registration failed. Please make sure you have added a google-services.json file", new Object[0]);
        } else {
            pushClient.sendTokenToIntercom(getApplication(), str);
        }
    }
}
