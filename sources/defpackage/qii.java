package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;
import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class qii {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            dm0 g = dm0.g();
            String str = SystemForegroundService.f;
            if (g.b <= 5) {
                m0.q(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            dm0 g2 = dm0.g();
            String str2 = SystemForegroundService.f;
            if (g2.b <= 5) {
                m0.q(str2, "Unable to start foreground service", e2);
            }
        }
    }
}
