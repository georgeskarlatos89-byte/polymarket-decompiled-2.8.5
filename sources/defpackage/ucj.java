package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ucj extends gcj {
    public int G;
    public gcj[] J;
    public ArrayList E = new ArrayList();
    public boolean F = true;
    public boolean H = false;
    public int I = 0;

    @Override // defpackage.gcj
    public final void A() {
        this.x = 0L;
        tcj tcjVar = new tcj(this, 0);
        for (int i = 0; i < this.E.size(); i++) {
            gcj gcjVar = (gcj) this.E.get(i);
            gcjVar.a(tcjVar);
            gcjVar.A();
            long j = gcjVar.x;
            boolean z = this.F;
            long j2 = this.x;
            if (z) {
                this.x = Math.max(j2, j);
            } else {
                gcjVar.z = j2;
                this.x = j2 + j;
            }
        }
    }

    @Override // defpackage.gcj
    public final gcj B(fcj fcjVar) {
        super.B(fcjVar);
        return this;
    }

    @Override // defpackage.gcj
    public final void C(View view) {
        for (int i = 0; i < this.E.size(); i++) {
            ((gcj) this.E.get(i)).C(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.gcj
    public final void D(View view) {
        super.D(view);
        gcj[] Q = Q();
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            Q[i].D(view);
        }
        Arrays.fill(Q, (Object) null);
        this.J = Q;
    }

    @Override // defpackage.gcj
    public final void E() {
        ArrayList arrayList;
        if (this.E.isEmpty()) {
            M();
            m();
            return;
        }
        tcj tcjVar = new tcj();
        tcjVar.b = this;
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((gcj) it.next()).a(tcjVar);
        }
        this.G = this.E.size();
        if (!this.F) {
            int i = 1;
            while (true) {
                int size = this.E.size();
                arrayList = this.E;
                if (i >= size) {
                    break;
                }
                ((gcj) arrayList.get(i - 1)).a(new tcj((gcj) this.E.get(i), 2));
                i++;
            }
            gcj gcjVar = (gcj) arrayList.get(0);
            if (gcjVar != null) {
                gcjVar.E();
                return;
            }
            return;
        }
        Iterator it2 = this.E.iterator();
        while (it2.hasNext()) {
            ((gcj) it2.next()).E();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(long j, long j2) {
        boolean z;
        long j3;
        long j4 = this.x;
        long j5 = 0;
        if (this.i != null) {
            if (j >= 0 || j2 >= 0) {
                if (j > j4 && j2 > j4) {
                    return;
                }
            } else {
                return;
            }
        }
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.r = false;
            y(this, ahh.b, z);
        }
        if (this.F) {
            for (int i = 0; i < this.E.size(); i++) {
                ((gcj) this.E.get(i)).F(j, j2);
            }
        } else {
            int i2 = 1;
            while (true) {
                int size = this.E.size();
                ArrayList arrayList = this.E;
                if (i2 < size) {
                    if (((gcj) arrayList.get(i2)).z > j2) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = arrayList.size();
                    break;
                }
            }
            int i3 = i2 - 1;
            if (j >= j2) {
                while (i3 < this.E.size()) {
                    gcj gcjVar = (gcj) this.E.get(i3);
                    long j6 = gcjVar.z;
                    j3 = j5;
                    long j7 = j - j6;
                    if (j7 < j3) {
                        break;
                    }
                    gcjVar.F(j7, j2 - j6);
                    i3++;
                    j5 = j3;
                }
            } else {
                j3 = 0;
                while (i3 >= 0) {
                    gcj gcjVar2 = (gcj) this.E.get(i3);
                    long j8 = gcjVar2.z;
                    long j9 = j - j8;
                    gcjVar2.F(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i3--;
                    }
                }
            }
            if (this.i == null) {
                if ((j > j4 && j2 <= j4) || (j < 0 && j2 >= j3)) {
                    if (j > j4) {
                        this.r = true;
                    }
                    y(this, ahh.c, z);
                    return;
                }
                return;
            }
            return;
        }
        j3 = j5;
        if (this.i == null) {
        }
    }

    @Override // defpackage.gcj
    public final void G(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j >= 0 && (arrayList = this.E) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gcj) this.E.get(i)).G(j);
            }
        }
    }

    @Override // defpackage.gcj
    public final void H(co8 co8Var) {
        this.v = co8Var;
        this.I |= 8;
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((gcj) this.E.get(i)).H(co8Var);
        }
    }

    @Override // defpackage.gcj
    public final void I(TimeInterpolator timeInterpolator) {
        this.I |= 1;
        ArrayList arrayList = this.E;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((gcj) this.E.get(i)).I(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.gcj
    public final void J(vbj vbjVar) {
        super.J(vbjVar);
        this.I |= 4;
        if (this.E != null) {
            for (int i = 0; i < this.E.size(); i++) {
                ((gcj) this.E.get(i)).J(vbjVar);
            }
        }
    }

    @Override // defpackage.gcj
    public final void K() {
        this.I |= 2;
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((gcj) this.E.get(i)).K();
        }
    }

    @Override // defpackage.gcj
    public final void L(long j) {
        this.b = j;
    }

    @Override // defpackage.gcj
    public final String N(String str) {
        String N = super.N(str);
        for (int i = 0; i < this.E.size(); i++) {
            StringBuilder t = sv6.t(N, "\n");
            t.append(((gcj) this.E.get(i)).N(str.concat("  ")));
            N = t.toString();
        }
        return N;
    }

    public final void O(gcj gcjVar) {
        this.E.add(gcjVar);
        gcjVar.i = this;
        long j = this.c;
        if (j >= 0) {
            gcjVar.G(j);
        }
        if ((this.I & 1) != 0) {
            gcjVar.I(this.d);
        }
        if ((this.I & 2) != 0) {
            gcjVar.K();
        }
        if ((this.I & 4) != 0) {
            gcjVar.J(this.w);
        }
        if ((this.I & 8) != 0) {
            gcjVar.H(this.v);
        }
    }

    public final gcj P(int i) {
        if (i >= 0 && i < this.E.size()) {
            return (gcj) this.E.get(i);
        }
        return null;
    }

    public final gcj[] Q() {
        gcj[] gcjVarArr = this.J;
        this.J = null;
        if (gcjVarArr == null) {
            gcjVarArr = new gcj[this.E.size()];
        }
        return (gcj[]) this.E.toArray(gcjVarArr);
    }

    @Override // defpackage.gcj
    public final void b(View view) {
        for (int i = 0; i < this.E.size(); i++) {
            ((gcj) this.E.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.gcj
    public final void cancel() {
        super.cancel();
        gcj[] Q = Q();
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            Q[i].cancel();
        }
        Arrays.fill(Q, (Object) null);
        this.J = Q;
    }

    @Override // defpackage.gcj
    public final /* bridge */ /* synthetic */ Object clone() {
        return j();
    }

    @Override // defpackage.gcj
    public final void d(wcj wcjVar) {
        View view = wcjVar.b;
        if (w(view)) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                gcj gcjVar = (gcj) it.next();
                if (gcjVar.w(view)) {
                    gcjVar.d(wcjVar);
                    wcjVar.c.add(gcjVar);
                }
            }
        }
    }

    @Override // defpackage.gcj
    public final void f(wcj wcjVar) {
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((gcj) this.E.get(i)).f(wcjVar);
        }
    }

    @Override // defpackage.gcj
    public final void g(wcj wcjVar) {
        View view = wcjVar.b;
        if (w(view)) {
            Iterator it = this.E.iterator();
            while (it.hasNext()) {
                gcj gcjVar = (gcj) it.next();
                if (gcjVar.w(view)) {
                    gcjVar.g(wcjVar);
                    wcjVar.c.add(gcjVar);
                }
            }
        }
    }

    @Override // defpackage.gcj
    public final gcj j() {
        ucj ucjVar = (ucj) super.j();
        ucjVar.E = new ArrayList();
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            gcj j = ((gcj) this.E.get(i)).j();
            ucjVar.E.add(j);
            j.i = ucjVar;
        }
        return ucjVar;
    }

    @Override // defpackage.gcj
    public final void l(ViewGroup viewGroup, a7h a7hVar, a7h a7hVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            gcj gcjVar = (gcj) this.E.get(i);
            if (j > 0 && (this.F || i == 0)) {
                long j2 = gcjVar.b;
                if (j2 > 0) {
                    gcjVar.L(j2 + j);
                } else {
                    gcjVar.L(j);
                }
            }
            gcjVar.l(viewGroup, a7hVar, a7hVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.gcj
    public final void n(ViewGroup viewGroup) {
        super.n(viewGroup);
        gcj[] Q = Q();
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            Q[i].n(viewGroup);
        }
        Arrays.fill(Q, (Object) null);
        this.J = Q;
    }

    @Override // defpackage.gcj
    public final boolean t() {
        for (int i = 0; i < this.E.size(); i++) {
            if (((gcj) this.E.get(i)).t()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gcj
    public final boolean u() {
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            if (!((gcj) this.E.get(i)).u()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.gcj
    public final void z(View view) {
        super.z(view);
        int size = this.E.size();
        for (int i = 0; i < size; i++) {
            ((gcj) this.E.get(i)).z(view);
        }
    }
}
