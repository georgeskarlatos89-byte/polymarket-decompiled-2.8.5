package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import defpackage.iad;
import defpackage.lbd;
import defpackage.obd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static String d;
    public static obd g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public NotificationManagerCompat(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public final void a(List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iad iadVar = (iad) it.next();
                NotificationChannel notificationChannel = new NotificationChannel(iadVar.a, iadVar.b, 4);
                notificationChannel.setDescription(iadVar.c);
                notificationChannel.setGroup(null);
                notificationChannel.setShowBadge(true);
                notificationChannel.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                notificationChannel.enableLights(false);
                notificationChannel.setLightColor(0);
                notificationChannel.setVibrationPattern(null);
                notificationChannel.enableVibration(false);
                arrayList.add(notificationChannel);
            }
            this.b.createNotificationChannels(arrayList);
        }
    }

    public boolean areNotificationsEnabled() {
        return this.b.areNotificationsEnabled();
    }

    public final void b(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            lbd lbdVar = new lbd(this.a.getPackageName(), i, str, notification);
            synchronized (f) {
                try {
                    obd obdVar = g;
                    if (obdVar == null) {
                        obdVar = new obd(this.a.getApplicationContext());
                        g = obdVar;
                    }
                    obdVar.b.obtainMessage(0, lbdVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.b.cancel(str, i);
            return;
        }
        this.b.notify(str, i, notification);
    }
}
