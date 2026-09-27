package defpackage;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pii implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Notification b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SystemForegroundService d;

    public pii(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.d = systemForegroundService;
        this.a = i;
        this.b = notification;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qii.a(this.d, this.a, this.b, this.c);
    }
}
