package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g5k {
    public final i88 a;
    public sa0 b;
    public sa0 c;
    public sa0 d;
    public final float e;

    public g5k(i88 i88Var) {
        this.a = i88Var;
        this.e = i88Var.i();
    }

    public final sa0 a(long j, sa0 sa0Var, sa0 sa0Var2) {
        sa0 sa0Var3 = this.c;
        if (sa0Var3 == null) {
            sa0Var3 = sa0Var.c();
            this.c = sa0Var3;
        }
        int b = sa0Var3.b();
        int i = 0;
        while (true) {
            sa0 sa0Var4 = this.c;
            if (i < b) {
                if (sa0Var4 != null) {
                    sa0Var.getClass();
                    sa0Var4.e(this.a.f(sa0Var2.a(i), j), i);
                    i++;
                } else {
                    Intrinsics.i("velocityVector");
                    throw null;
                }
            } else {
                if (sa0Var4 != null) {
                    return sa0Var4;
                }
                Intrinsics.i("velocityVector");
                throw null;
            }
        }
    }
}
