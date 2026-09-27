package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class zl {
    public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }
}
