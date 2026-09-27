package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class n54 extends n1 {
    public nse L;
    public du9 M;

    @Override // defpackage.lu9
    public final void E0(vt1 vt1Var, hse hseVar) {
        boolean z;
        ArrayList arrayList = (ArrayList) vt1Var.b;
        m1();
        if (this.v && this.z == null) {
            wt8 wt8Var = new wt8(this);
            c1(wt8Var);
            this.z = wt8Var;
        }
        if (hseVar == hse.Main) {
            if (this.M == null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (f9m.d((du9) arrayList.get(i))) {
                        du9 du9Var = (du9) arrayList.get(0);
                        du9Var.i = true;
                        this.M = du9Var;
                        if (this.v) {
                            k1(du9Var);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                du9 du9Var2 = (du9) arrayList.get(i2);
                if (du9Var2.i || !du9Var2.h || du9Var2.d) {
                    float f = ((q9k) qqn.b(this, as4.t)).f();
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        du9 du9Var3 = (du9) arrayList.get(i3);
                        long j = du9Var3.c;
                        du9 du9Var4 = this.M;
                        du9Var4.getClass();
                        if (Math.abs(ogd.d(ogd.e(j, du9Var4.c))) > f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (du9Var3.i || z) {
                            r1(true);
                            return;
                        }
                    }
                    return;
                }
            }
            ((du9) arrayList.get(0)).i = true;
            if (this.v) {
                du9 du9Var5 = this.M;
                du9Var5.getClass();
                j1(du9Var5.c, true);
                this.w.invoke();
            }
            this.M = null;
            return;
        }
        if (hseVar == hse.Final && this.M != null) {
            int size4 = arrayList.size();
            for (int i4 = 0; i4 < size4; i4++) {
                du9 du9Var6 = (du9) arrayList.get(i4);
                if (du9Var6.i && !Intrinsics.areEqual(du9Var6, this.M)) {
                    r1(true);
                    return;
                }
            }
        }
    }

    @Override // defpackage.n1, defpackage.qse
    public final void f0() {
        super.f0();
        r1(false);
    }

    @Override // defpackage.n1, defpackage.qse
    public final void o(gse gseVar, hse hseVar, long j) {
        super.o(gseVar, hseVar, j);
        if (hseVar == hse.Main) {
            if (this.L == null) {
                if (lli.e(gseVar, true)) {
                    nse nseVar = (nse) gseVar.a.get(0);
                    nseVar.a();
                    this.L = nseVar;
                    if (this.v) {
                        l1(nseVar);
                        return;
                    }
                    return;
                }
                return;
            }
            List list = gseVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!hqn.c((nse) list.get(i))) {
                    long h1 = h1(j);
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        nse nseVar2 = (nse) list.get(i2);
                        if (nseVar2.b() || hqn.f(nseVar2, j, h1)) {
                            r1(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((nse) list.get(0)).a();
            if (this.v) {
                nse nseVar3 = this.L;
                nseVar3.getClass();
                j1(nseVar3.c, false);
                this.w.invoke();
            }
            this.L = null;
            return;
        }
        if (hseVar == hse.Final && this.L != null) {
            List list2 = gseVar.a;
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                nse nseVar4 = (nse) list2.get(i3);
                if (nseVar4.b() && !Intrinsics.areEqual(nseVar4, this.L)) {
                    r1(false);
                    return;
                }
            }
        }
    }

    @Override // defpackage.n1
    public final boolean o1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.n1
    public final void p1(KeyEvent keyEvent) {
        this.w.invoke();
    }

    public final void r1(boolean z) {
        if (z) {
            this.M = null;
        } else {
            this.L = null;
        }
        i1(z);
    }

    @Override // defpackage.lu9
    public final void w0() {
        r1(true);
    }
}
