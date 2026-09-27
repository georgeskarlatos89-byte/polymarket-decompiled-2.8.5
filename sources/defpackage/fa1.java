package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class fa1 implements rr7 {
    public final m8j a;
    public final int b;
    public final int[] c;
    public final el8[] d;
    public final long[] e;
    public int f;

    public fa1(m8j m8jVar, int[] iArr) {
        boolean z;
        el8[] el8VarArr;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.f(z);
        m8jVar.getClass();
        this.a = m8jVar;
        int length = iArr.length;
        this.b = length;
        this.d = new el8[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            el8VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            el8VarArr[i2] = m8jVar.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(el8VarArr, new tp(2));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = m8jVar.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // defpackage.rr7
    public final boolean a(int i, long j) {
        if (this.e[i] > j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.rr7
    public final el8 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.rr7
    public final int e(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fa1 fa1Var = (fa1) obj;
            if (this.a.equals(fa1Var.a) && Arrays.equals(this.c, fa1Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rr7
    public final boolean g(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.b && !a; i2++) {
            if (i2 != i && !a(i2, elapsedRealtime)) {
                a = true;
            } else {
                a = false;
            }
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = u1k.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.rr7
    public final int k(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.rr7
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.rr7
    public final m8j m() {
        return this.a;
    }

    @Override // defpackage.rr7
    public int p(long j, List list) {
        return list.size();
    }

    @Override // defpackage.rr7
    public final int q() {
        return this.c[b()];
    }

    @Override // defpackage.rr7
    public final el8 r() {
        return this.d[b()];
    }

    @Override // defpackage.rr7
    public void f() {
    }

    @Override // defpackage.rr7
    public void o() {
    }

    @Override // defpackage.rr7
    public void h(float f) {
    }

    @Override // defpackage.rr7
    public final void n(boolean z) {
    }
}
