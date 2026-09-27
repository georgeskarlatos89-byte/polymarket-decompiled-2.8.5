package defpackage;

import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class lca extends tca implements mj4 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lca(jca jcaVar) {
        super(true);
        u14 u14Var;
        u14 u14Var2;
        boolean z = true;
        Q(jcaVar);
        Unsafe unsafe = oo4.a;
        long j = tca.a;
        t14 t14Var = (t14) unsafe.getObjectVolatile(this, j);
        if (t14Var instanceof u14) {
            u14Var = (u14) t14Var;
        } else {
            u14Var = null;
        }
        if (u14Var != null) {
            tca j2 = u14Var.j();
            while (!j2.J()) {
                t14 t14Var2 = (t14) oo4.a.getObjectVolatile(j2, j);
                if (t14Var2 instanceof u14) {
                    u14Var2 = (u14) t14Var2;
                } else {
                    u14Var2 = null;
                }
                if (u14Var2 != null) {
                    j2 = u14Var2.j();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override // defpackage.tca
    public final boolean J() {
        return this.d;
    }

    @Override // defpackage.tca
    public final boolean L() {
        return true;
    }

    @Override // defpackage.mj4
    public final boolean R(Throwable th) {
        return U(new uj4(th, false));
    }

    @Override // defpackage.mj4
    public final boolean g() {
        return U(Unit.INSTANCE);
    }
}
