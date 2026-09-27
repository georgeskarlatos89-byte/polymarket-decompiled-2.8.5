package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.dm0;
import defpackage.vj8;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    static {
        dm0.j("ForceStopRunnable$Rcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            dm0.g().getClass();
            String str = vj8.e;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
            intent2.setAction("ACTION_FORCE_STOP_RESCHEDULE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent2, 167772160);
            long currentTimeMillis = System.currentTimeMillis() + vj8.f;
            if (alarmManager != null) {
                alarmManager.setExact(0, currentTimeMillis, broadcast);
            }
        }
    }
}
