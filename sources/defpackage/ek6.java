package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ek6 extends f5 implements ScheduledFuture {
    public final ScheduledFuture h;

    public ek6(dk6 dk6Var) {
        this.h = dk6Var.a(new ba6(this, 2));
    }

    @Override // defpackage.f5
    public final void b() {
        boolean z;
        ScheduledFuture scheduledFuture = this.h;
        Object obj = this.a;
        if ((obj instanceof y4) && ((y4) obj).a) {
            z = true;
        } else {
            z = false;
        }
        scheduledFuture.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }
}
