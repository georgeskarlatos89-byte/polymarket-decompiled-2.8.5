package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class jl0 {
    public final xk0 d;
    public ceh a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public jl0(m64 m64Var) {
        this.d = new xk0(this, m64Var);
    }

    public final void a(a9b a9bVar, int i) {
        ceh j = a9bVar.j(i);
        xk0 xk0Var = this.d;
        xk0Var.g(j, 1.0f);
        xk0Var.g(a9bVar.j(i), -1.0f);
    }

    public final void b(ceh cehVar, ceh cehVar2, ceh cehVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        xk0 xk0Var = this.d;
        if (!z) {
            xk0Var.g(cehVar, -1.0f);
            xk0Var.g(cehVar2, 1.0f);
            xk0Var.g(cehVar3, 1.0f);
        } else {
            xk0Var.g(cehVar, 1.0f);
            xk0Var.g(cehVar2, -1.0f);
            xk0Var.g(cehVar3, -1.0f);
        }
    }

    public final void c(ceh cehVar, ceh cehVar2, ceh cehVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        xk0 xk0Var = this.d;
        if (!z) {
            xk0Var.g(cehVar, -1.0f);
            xk0Var.g(cehVar2, 1.0f);
            xk0Var.g(cehVar3, -1.0f);
        } else {
            xk0Var.g(cehVar, 1.0f);
            xk0Var.g(cehVar2, -1.0f);
            xk0Var.g(cehVar3, 1.0f);
        }
    }

    public ceh d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.a == null && this.b == 0.0f && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final ceh f(boolean[] zArr, ceh cehVar) {
        beh behVar;
        xk0 xk0Var = this.d;
        int d = xk0Var.d();
        ceh cehVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float f2 = xk0Var.f(i);
            if (f2 < 0.0f) {
                ceh e = xk0Var.e(i);
                if ((zArr == null || !zArr[e.b]) && e != cehVar && (((behVar = e.i) == beh.SLACK || behVar == beh.ERROR) && f2 < f)) {
                    f = f2;
                    cehVar2 = e;
                }
            }
        }
        return cehVar2;
    }

    public final void g(ceh cehVar) {
        ceh cehVar2 = this.a;
        xk0 xk0Var = this.d;
        if (cehVar2 != null) {
            xk0Var.g(cehVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float h = xk0Var.h(cehVar, true) * (-1.0f);
        this.a = cehVar;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = xk0Var.h;
        for (int i2 = 0; i != -1 && i2 < xk0Var.a; i2++) {
            float[] fArr = xk0Var.g;
            fArr[i] = fArr[i] / h;
            i = xk0Var.f[i];
        }
    }

    public final void h(a9b a9bVar, ceh cehVar, boolean z) {
        if (cehVar.f) {
            xk0 xk0Var = this.d;
            float c = xk0Var.c(cehVar);
            this.b = (cehVar.e * c) + this.b;
            xk0Var.h(cehVar, z);
            if (z) {
                cehVar.b(this);
            }
            if (xk0Var.d() == 0) {
                this.e = true;
                a9bVar.b = true;
            }
        }
    }

    public void i(a9b a9bVar, jl0 jl0Var, boolean z) {
        xk0 xk0Var = this.d;
        xk0Var.getClass();
        float c = xk0Var.c(jl0Var.a);
        xk0Var.h(jl0Var.a, z);
        xk0 xk0Var2 = jl0Var.d;
        int d = xk0Var2.d();
        for (int i = 0; i < d; i++) {
            ceh e = xk0Var2.e(i);
            xk0Var.a(e, xk0Var2.c(e) * c, z);
        }
        this.b = (jl0Var.b * c) + this.b;
        if (z) {
            jl0Var.a.b(this);
        }
        if (this.a != null && xk0Var.d() == 0) {
            this.e = true;
            a9bVar.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z;
        if (this.a == null) {
            str = "0";
        } else {
            str = "" + this.a;
        }
        String concat = str.concat(" = ");
        if (this.b != 0.0f) {
            concat = concat + this.b;
            z = true;
        } else {
            z = false;
        }
        xk0 xk0Var = this.d;
        int d = xk0Var.d();
        for (int i = 0; i < d; i++) {
            ceh e = xk0Var.e(i);
            if (e != null) {
                float f = xk0Var.f(i);
                if (f != 0.0f) {
                    String cehVar = e.toString();
                    if (!z) {
                        if (f < 0.0f) {
                            concat = concat.concat("- ");
                            f *= -1.0f;
                        }
                        if (f == 1.0f) {
                            concat = concat.concat(cehVar);
                        } else {
                            concat = concat + f + ApiConstant.SPACE + cehVar;
                        }
                        z = true;
                    } else if (f > 0.0f) {
                        concat = concat.concat(" + ");
                        if (f == 1.0f) {
                        }
                        z = true;
                    } else {
                        concat = concat.concat(" - ");
                        f *= -1.0f;
                        if (f == 1.0f) {
                        }
                        z = true;
                    }
                }
            }
        }
        if (!z) {
            return concat.concat("0.0");
        }
        return concat;
    }
}
