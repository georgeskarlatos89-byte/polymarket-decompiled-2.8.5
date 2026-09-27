package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class iw6 implements jw6 {
    public final ScheduledFuture a;

    public iw6(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.jw6
    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
