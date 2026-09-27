package io.intercom.android.sdk;

import android.app.Application;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.fcm.IntercomFcmMessengerService;
import io.intercom.android.sdk.logger.LumberMill;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class IntercomPushManager {
    private static final Twig TWIG = LumberMill.getLogger();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public enum IntercomPushIntegrationType {
        FCM,
        NONE
    }

    private static boolean fcmModuleInstalled() {
        if (getFcmServiceClass() != null) {
            return true;
        }
        return false;
    }

    private static Class getFcmServiceClass() {
        try {
            int i = IntercomFcmMessengerService.a;
            return IntercomFcmMessengerService.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static IntercomPushIntegrationType getInstalledModuleType() {
        IntercomPushIntegrationType intercomPushIntegrationType = IntercomPushIntegrationType.NONE;
        if (fcmModuleInstalled()) {
            TWIG.internal("FCM is installed");
            return IntercomPushIntegrationType.FCM;
        }
        return intercomPushIntegrationType;
    }

    public static void initializeFcmService(Application application) {
        Class fcmServiceClass = getFcmServiceClass();
        if (fcmServiceClass != null) {
            try {
                fcmServiceClass.getDeclaredMethod("initialize", Application.class).invoke(null, application);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                TWIG.internal("FCM is installed but initialize method was not found");
            }
        }
    }
}
