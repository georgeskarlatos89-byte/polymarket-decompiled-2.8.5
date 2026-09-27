package defpackage;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class i8c implements d8c, d27 {
    public final k8c a;
    public final /* synthetic */ yh6 b;

    public i8c(yh6 yh6Var, k8c k8cVar) {
        this.b = yh6Var;
        this.a = k8cVar;
    }

    public final Pair a(int i, x7c x7cVar) {
        x7c x7cVar2;
        k8c k8cVar = this.a;
        x7c x7cVar3 = null;
        if (x7cVar != null) {
            int i2 = 0;
            while (true) {
                if (i2 < k8cVar.c.size()) {
                    if (((x7c) k8cVar.c.get(i2)).d == x7cVar.d) {
                        Object obj = x7cVar.a;
                        Object obj2 = k8cVar.b;
                        int i3 = vre.k;
                        x7cVar2 = x7cVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                } else {
                    x7cVar2 = null;
                    break;
                }
            }
            if (x7cVar2 == null) {
                return null;
            }
            x7cVar3 = x7cVar2;
        }
        return Pair.create(Integer.valueOf(i + k8cVar.d), x7cVar3);
    }

    @Override // defpackage.d8c
    public final void c(int i, x7c x7cVar, l7c l7cVar) {
        Pair a = a(i, x7cVar);
        if (a != null) {
            ((sii) this.b.j).c(new g8c(this, a, l7cVar, 0));
        }
    }

    @Override // defpackage.d8c
    public final void g(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar, IOException iOException, boolean z) {
        Pair a = a(i, x7cVar);
        if (a != null) {
            ((sii) this.b.j).c(new dh5(this, a, gnbVar, l7cVar, iOException, z));
        }
    }

    @Override // defpackage.d8c
    public final void p(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar, int i2) {
        Pair a = a(i, x7cVar);
        if (a != null) {
            ((sii) this.b.j).c(new ky(i2, 1, this, a, gnbVar, l7cVar));
        }
    }

    @Override // defpackage.d8c
    public final void q(int i, x7c x7cVar, l7c l7cVar) {
        Pair a = a(i, x7cVar);
        if (a != null) {
            ((sii) this.b.j).c(new g8c(this, a, l7cVar, 1));
        }
    }

    @Override // defpackage.d8c
    public final void w(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar) {
        Pair a = a(i, x7cVar);
        if (a != null) {
            ((sii) this.b.j).c(new h8c(this, a, gnbVar, l7cVar, 0));
        }
    }

    @Override // defpackage.d8c
    public final void x(int i, x7c x7cVar, gnb gnbVar, l7c l7cVar) {
        Pair a = a(i, x7cVar);
        if (a != null) {
            ((sii) this.b.j).c(new h8c(this, a, gnbVar, l7cVar, 1));
        }
    }
}
