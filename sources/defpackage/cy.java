package defpackage;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationManagerCompat;
import com.polymarket.clients.ClientNotifications;
import com.polymarket.clients.ClientNotificationsSettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cy implements ClientNotifications {
    public static m23 b;
    public final Context a;

    public cy(Context context) {
        this.a = context;
    }

    @Override // com.polymarket.clients.ClientNotifications
    public final void clearDeliveredNotifications(String str) {
        Iterable asList;
        str.getClass();
        NotificationManagerCompat from = NotificationManagerCompat.from(this.a);
        from.getClass();
        NotificationManager notificationManager = from.b;
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        if (activeNotifications == null) {
            asList = new ArrayList();
        } else {
            asList = Arrays.asList(activeNotifications);
        }
        asList.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : asList) {
            if (Intrinsics.areEqual(((StatusBarNotification) obj).getNotification().getGroup(), str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
        }
    }

    @Override // com.polymarket.clients.ClientNotifications
    public final Object readNotificationSettings(Continuation continuation) {
        ClientNotificationsSettings.AuthorizationStatus authorizationStatus;
        if (!NotificationManagerCompat.from(this.a).areNotificationsEnabled()) {
            authorizationStatus = ClientNotificationsSettings.AuthorizationStatus.denied;
        } else {
            authorizationStatus = ClientNotificationsSettings.AuthorizationStatus.authorized;
        }
        return new ClientNotificationsSettings(authorizationStatus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        if (r12.r() == r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.polymarket.clients.ClientNotifications
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestAuthorization(Continuation continuation) {
        ay ayVar;
        Object obj;
        int i;
        Object readNotificationSettings;
        if (continuation instanceof ay) {
            ayVar = (ay) continuation;
            int i2 = ayVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ayVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = ayVar.k;
                obj = u85.COROUTINE_SUSPENDED;
                i = ayVar.m;
                Activity activity = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.a(obj2);
                                return obj2;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.a(obj2);
                    } else {
                        ResultKt.a(obj2);
                        return obj2;
                    }
                } else {
                    ResultKt.a(obj2);
                    Context context = this.a;
                    if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                        ayVar.m = 1;
                        Object readNotificationSettings2 = readNotificationSettings(ayVar);
                        if (readNotificationSettings2 != obj) {
                            return readNotificationSettings2;
                        }
                    } else {
                        WeakReference weakReference = xf5.b;
                        if (weakReference != null) {
                            activity = (Activity) weakReference.get();
                        }
                        if (activity != null && Build.VERSION.SDK_INT >= 33 && d55.a(context, "android.permission.POST_NOTIFICATIONS") != 0 && (m9.t(activity, "android.permission.POST_NOTIFICATIONS") || !context.getSharedPreferences("notifications", 0).getBoolean("has_prompted", false))) {
                            SharedPreferences sharedPreferences = context.getSharedPreferences("notifications", 0);
                            sharedPreferences.getClass();
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putBoolean("has_prompted", true);
                            edit.apply();
                            ayVar.m = 2;
                            m23 m23Var = new m23(1, m7a.b(ayVar));
                            m23Var.t();
                            b = m23Var;
                            m9.s(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                        } else {
                            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                            intent.addFlags(268435456);
                            context.startActivity(intent);
                        }
                    }
                    return obj;
                }
                ayVar.m = 3;
                readNotificationSettings = readNotificationSettings(ayVar);
                if (readNotificationSettings != obj) {
                    return obj;
                }
                return readNotificationSettings;
            }
        }
        ayVar = new ay(this, continuation);
        Object obj22 = ayVar.k;
        obj = u85.COROUTINE_SUSPENDED;
        i = ayVar.m;
        Activity activity2 = null;
        if (i == 0) {
        }
        ayVar.m = 3;
        readNotificationSettings = readNotificationSettings(ayVar);
        if (readNotificationSettings != obj) {
        }
    }

    @Override // com.polymarket.clients.ClientNotifications
    public final void setBadgeCount(int i) {
    }
}
