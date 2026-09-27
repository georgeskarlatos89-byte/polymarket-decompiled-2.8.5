package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l3f implements sfd {
    public final x03 a;
    public final gpc b;
    public t3f c;
    public final u3f d;
    public rq8 e;
    public boolean f = false;

    public l3f(x03 x03Var, gpc gpcVar, u3f u3fVar) {
        this.a = x03Var;
        this.b = gpcVar;
        this.d = u3fVar;
        synchronized (this) {
            this.c = (t3f) gpcVar.d();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [c3g, java.lang.Object] */
    @Override // defpackage.sfd
    public final void a(Object obj) {
        z03 z03Var = (z03) obj;
        if (z03Var != z03.CLOSING && z03Var != z03.CLOSED && z03Var != z03.RELEASING && z03Var != z03.RELEASED) {
            if ((z03Var == z03.OPENING || z03Var == z03.OPEN || z03Var == z03.PENDING_OPEN) && !this.f) {
                x03 x03Var = this.a;
                b(t3f.IDLE);
                ArrayList arrayList = new ArrayList();
                ?? obj2 = new Object();
                obj2.c = new Object();
                gw2 gw2Var = new gw2(obj2);
                obj2.b = gw2Var;
                obj2.a = ix2.class;
                try {
                    mx2 mx2Var = new mx2(obj2, x03Var);
                    arrayList.add(mx2Var);
                    x03Var.o(qt6.a(), mx2Var);
                    obj2.a = "waitForCaptureResult";
                } catch (Exception e) {
                    gw2Var.a(e);
                }
                ac3 i = t79.i(rq8.a(gw2Var), new k3f(this), qt6.a());
                k3f k3fVar = new k3f(this);
                ac3 i2 = t79.i(i, new q96(k3fVar, 10), qt6.a());
                this.e = i2;
                bm9 bm9Var = new bm9(this, arrayList, x03Var);
                i2.addListener(new yq8(0, i2, bm9Var), qt6.a());
                this.f = true;
                return;
            }
            return;
        }
        b(t3f.IDLE);
        if (this.f) {
            this.f = false;
            rq8 rq8Var = this.e;
            if (rq8Var != null) {
                rq8Var.cancel(false);
                this.e = null;
            }
        }
    }

    public final void b(t3f t3fVar) {
        synchronized (this) {
            try {
                if (this.c.equals(t3fVar)) {
                    return;
                }
                this.c = t3fVar;
                Objects.toString(t3fVar);
                o9n.e(3, "StreamStateObserver");
                this.b.i(t3fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.sfd
    public final void onError(Throwable th) {
        rq8 rq8Var = this.e;
        if (rq8Var != null) {
            rq8Var.cancel(false);
            this.e = null;
        }
        b(t3f.IDLE);
    }
}
