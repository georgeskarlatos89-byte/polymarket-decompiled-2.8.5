package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class qtd {
    public w30 a;
    public boolean b;
    public kb4 c;
    public float d = 1.0f;
    public owa e = owa.Ltr;

    public qtd() {
        new b6c(this, 4);
    }

    public static /* synthetic */ void h(qtd qtdVar, y07 y07Var, long j, of1 of1Var, int i) {
        if ((i & 4) != 0) {
            of1Var = null;
        }
        qtdVar.g(y07Var, j, 1.0f, of1Var);
    }

    public boolean d(float f) {
        return false;
    }

    public boolean e(kb4 kb4Var) {
        return false;
    }

    public final void g(y07 y07Var, long j, float f, kb4 kb4Var) {
        if (this.d != f) {
            if (!d(f)) {
                w30 w30Var = this.a;
                if (f == 1.0f) {
                    if (w30Var != null) {
                        w30Var.c(f);
                    }
                    this.b = false;
                } else {
                    if (w30Var == null) {
                        w30Var = mcn.a();
                        this.a = w30Var;
                    }
                    w30Var.c(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!Intrinsics.areEqual(this.c, kb4Var)) {
            if (!e(kb4Var)) {
                w30 w30Var2 = this.a;
                if (kb4Var == null) {
                    if (w30Var2 != null) {
                        w30Var2.f(null);
                    }
                    this.b = false;
                } else {
                    if (w30Var2 == null) {
                        w30Var2 = mcn.a();
                        this.a = w30Var2;
                    }
                    w30Var2.f(kb4Var);
                    this.b = true;
                }
            }
            this.c = kb4Var;
        }
        owa layoutDirection = y07Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (y07Var.d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (y07Var.d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((jw8) y07Var.y0().a).w(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        float intBitsToFloat4 = Float.intBitsToFloat(i2);
                        zrf b = vtn.b(0L, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        t23 t = y07Var.y0().t();
                        w30 w30Var3 = this.a;
                        if (w30Var3 == null) {
                            w30Var3 = mcn.a();
                            this.a = w30Var3;
                        }
                        try {
                            t.l(b, w30Var3);
                            j(y07Var);
                            t.k();
                        } catch (Throwable th) {
                            t.k();
                            throw th;
                        }
                    } else {
                        j(y07Var);
                    }
                }
            } catch (Throwable th2) {
                ((jw8) y07Var.y0().a).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th2;
            }
        }
        ((jw8) y07Var.y0().a).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(y07 y07Var);

    public void f(owa owaVar) {
    }
}
