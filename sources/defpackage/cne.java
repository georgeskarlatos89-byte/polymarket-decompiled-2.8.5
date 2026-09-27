package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class cne {
    public int a;
    public int b;
    public long c = 0;
    public long d = dne.b;
    public long e = 0;

    public abstract int b0(kn knVar);

    public int e0() {
        return (int) (this.c & 4294967295L);
    }

    public int f0() {
        return (int) (this.c >> 32);
    }

    public final void g0() {
        this.a = lnf.e((int) (this.c >> 32), rz4.k(this.d), rz4.i(this.d));
        this.b = lnf.e((int) (this.c & 4294967295L), rz4.j(this.d), rz4.h(this.d));
        int i = this.a;
        long j = this.c;
        this.e = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public Object o() {
        return null;
    }

    public void o0(long j, float f, i09 i09Var) {
        v0(j, f, null);
    }

    public abstract void v0(long j, float f, Function1 function1);

    public final void w0(long j) {
        if (!n1a.b(this.c, j)) {
            this.c = j;
            g0();
        }
    }

    public final void x0(long j) {
        if (!rz4.c(this.d, j)) {
            this.d = j;
            g0();
        }
    }
}
