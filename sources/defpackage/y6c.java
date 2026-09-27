package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y6c implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ z6c b;

    public y6c(z6c z6cVar, k6c k6cVar) {
        this.b = z6cVar;
        Handler n = u1k.n(this);
        this.a = n;
        k6cVar.e(this, n);
    }

    public final void a(long j) {
        boolean z;
        Surface surface;
        z6c z6cVar = this.b;
        if (this == z6cVar.u2 && z6cVar.I != null) {
            if (j == Long.MAX_VALUE) {
                z6cVar.G1 = true;
                return;
            }
            try {
                qje qjeVar = z6cVar.P1;
                z6cVar.v0(j);
                s8k s8kVar = z6cVar.p2;
                if (!s8kVar.equals(s8k.d) && !s8kVar.equals(z6cVar.q2)) {
                    z6cVar.q2 = s8kVar;
                    qjeVar.k0(s8kVar);
                }
                z6cVar.I1.e++;
                j8k j8kVar = z6cVar.S1;
                if (j8kVar.e != 3) {
                    z = true;
                } else {
                    z = false;
                }
                j8kVar.e = 3;
                j8kVar.l.getClass();
                j8kVar.g = u1k.L(SystemClock.elapsedRealtime());
                if (z && (surface = z6cVar.c2) != null) {
                    Handler handler = (Handler) qjeVar.b;
                    if (handler != null) {
                        handler.post(new p8k(qjeVar, surface, SystemClock.elapsedRealtime(), 0));
                    }
                    z6cVar.f2 = true;
                }
                z6cVar.d0(j);
            } catch (xq7 e) {
                z6cVar.H1 = e;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = u1k.a;
        a(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
