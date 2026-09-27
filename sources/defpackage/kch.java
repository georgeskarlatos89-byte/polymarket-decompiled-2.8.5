package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class kch {
    public pch a;
    public long b;
    public boolean c;
    public int d;

    public kch(long j, pch pchVar) {
        int i;
        int numberOfTrailingZeros;
        this.a = pchVar;
        this.b = j;
        h6h h6hVar = qch.a;
        if (j != 0) {
            pch d = d();
            long j2 = d.c;
            long[] jArr = d.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.b;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.a;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (qch.c) {
                i = qch.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(kch kchVar) {
        qch.b.G(kchVar);
    }

    public final void a() {
        synchronized (qch.c) {
            b();
            p();
        }
    }

    public void b() {
        qch.d = qch.d.b(g());
    }

    public abstract void c();

    public pch d() {
        return this.a;
    }

    public abstract Function1 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract Function1 i();

    public final kch j() {
        bm9 bm9Var = qch.b;
        kch kchVar = (kch) bm9Var.n();
        bm9Var.G(this);
        return kchVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(hxh hxhVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            qch.t(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(pch pchVar) {
        this.a = pchVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract kch u(Function1 function1);
}
