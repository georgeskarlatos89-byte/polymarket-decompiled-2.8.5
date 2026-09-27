package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.dm0;
import defpackage.kok;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = dm0.j("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dm0 g = dm0.g();
        Objects.toString(intent);
        g.getClass();
        try {
            kok b = kok.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (kok.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = b.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    b.i = goAsync;
                    if (b.h) {
                        goAsync.finish();
                        b.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            dm0.g().f(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
