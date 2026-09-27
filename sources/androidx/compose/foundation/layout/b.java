package androidx.compose.foundation.layout;

import defpackage.fd1;
import defpackage.gd1;
import defpackage.gdn;
import defpackage.hd1;
import defpackage.jn;
import defpackage.kjc;
import defpackage.oek;
import defpackage.vt6;
import defpackage.wz9;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class b {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;

    static {
        vt6 vt6Var = vt6.Horizontal;
        a = new FillElement(vt6Var, 1.0f, "fillMaxWidth");
        vt6 vt6Var2 = vt6.Vertical;
        b = new FillElement(vt6Var2, 1.0f, "fillMaxHeight");
        vt6 vt6Var3 = vt6.Both;
        c = new FillElement(vt6Var3, 1.0f, "fillMaxSize");
        fd1 fd1Var = gdn.p;
        d = new d(vt6Var, false, new oek(fd1Var, 3), fd1Var, "wrapContentWidth");
        fd1 fd1Var2 = gdn.o;
        e = new d(vt6Var, false, new oek(fd1Var2, 3), fd1Var2, "wrapContentWidth");
        gd1 gd1Var = gdn.m;
        f = new d(vt6Var2, false, new oek(gd1Var, 4), gd1Var, "wrapContentHeight");
        gd1 gd1Var2 = gdn.l;
        g = new d(vt6Var2, false, new oek(gd1Var2, 4), gd1Var2, "wrapContentHeight");
        hd1 hd1Var = gdn.g;
        h = new d(vt6Var3, false, new oek(hd1Var, 5), hd1Var, "wrapContentSize");
        hd1 hd1Var2 = gdn.c;
        i = new d(vt6Var3, false, new oek(hd1Var2, 5), hd1Var2, "wrapContentSize");
    }

    public static final kjc a(float f2, float f3, kjc kjcVar) {
        return kjcVar.e(new c(f2, f3));
    }

    public static kjc b(kjc kjcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(f2, f3, kjcVar);
    }

    public static final kjc c(kjc kjcVar, float f2) {
        FillElement fillElement;
        if (f2 == 1.0f) {
            fillElement = b;
        } else {
            fillElement = new FillElement(vt6.Vertical, f2, "fillMaxHeight");
        }
        return kjcVar.e(fillElement);
    }

    public static final kjc d(kjc kjcVar, float f2) {
        FillElement fillElement;
        if (f2 == 1.0f) {
            fillElement = a;
        } else {
            fillElement = new FillElement(vt6.Horizontal, f2, "fillMaxWidth");
        }
        return kjcVar.e(fillElement);
    }

    public static final kjc e(kjc kjcVar, float f2) {
        return kjcVar.e(new a(0.0f, f2, 0.0f, f2, true, wz9.a, 5));
    }

    public static final kjc f(float f2, float f3, kjc kjcVar) {
        return kjcVar.e(new a(0.0f, f2, 0.0f, f3, true, wz9.a, 5));
    }

    public static kjc g(kjc kjcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(f2, f3, kjcVar);
    }

    public static final kjc h(kjc kjcVar, float f2) {
        return kjcVar.e(new a(0.0f, f2, 0.0f, f2, false, wz9.a, 5));
    }

    public static final kjc i(kjc kjcVar, float f2) {
        return kjcVar.e(new a(f2, f2, f2, f2, false, wz9.a));
    }

    public static final kjc j(float f2, float f3, kjc kjcVar) {
        return kjcVar.e(new a(f2, f3, f2, f3, false, wz9.a));
    }

    public static kjc k(kjc kjcVar, float f2, float f3, float f4, float f5, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        if ((i2 & 1) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f2;
        }
        if ((i2 & 2) != 0) {
            f7 = Float.NaN;
        } else {
            f7 = f3;
        }
        if ((i2 & 4) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f4;
        }
        if ((i2 & 8) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f5;
        }
        return kjcVar.e(new a(f6, f7, f8, f9, false, wz9.a));
    }

    public static final kjc l(kjc kjcVar, float f2) {
        return kjcVar.e(new a(f2, 0.0f, f2, 0.0f, false, wz9.a, 10));
    }

    public static final kjc m(kjc kjcVar, float f2) {
        return kjcVar.e(new a(f2, f2, f2, f2, true, wz9.a));
    }

    public static final kjc n(float f2, float f3, kjc kjcVar) {
        return kjcVar.e(new a(f2, f3, f2, f3, true, wz9.a));
    }

    public static final kjc o(kjc kjcVar, float f2, float f3, float f4, float f5) {
        return kjcVar.e(new a(f2, f3, f4, f5, true, wz9.a));
    }

    public static kjc p(kjc kjcVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) != 0) {
            f5 = Float.NaN;
        }
        return o(kjcVar, f2, f3, f4, f5);
    }

    public static final kjc q(kjc kjcVar, float f2) {
        return kjcVar.e(new a(f2, 0.0f, f2, 0.0f, true, wz9.a, 10));
    }

    public static final kjc r(float f2, float f3, kjc kjcVar) {
        return kjcVar.e(new a(f2, 0.0f, f3, 0.0f, true, wz9.a, 10));
    }

    public static kjc s(kjc kjcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return r(f2, f3, kjcVar);
    }

    public static final kjc t(kjc kjcVar, gd1 gd1Var, boolean z) {
        d dVar;
        if (Intrinsics.areEqual(gd1Var, gdn.m) && !z) {
            dVar = f;
        } else if (Intrinsics.areEqual(gd1Var, gdn.l) && !z) {
            dVar = g;
        } else {
            dVar = new d(vt6.Vertical, z, new oek(gd1Var, 4), gd1Var, "wrapContentHeight");
        }
        return kjcVar.e(dVar);
    }

    public static kjc u(kjc kjcVar, int i2) {
        return t(kjcVar, gdn.m, false);
    }

    public static final kjc v(kjc kjcVar, jn jnVar, boolean z) {
        d dVar;
        if (Intrinsics.areEqual(jnVar, gdn.g) && !z) {
            dVar = h;
        } else if (Intrinsics.areEqual(jnVar, gdn.c) && !z) {
            dVar = i;
        } else {
            dVar = new d(vt6.Both, z, new oek(jnVar, 5), jnVar, "wrapContentSize");
        }
        return kjcVar.e(dVar);
    }

    public static kjc w(kjc kjcVar, hd1 hd1Var, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            hd1Var = gdn.g;
        }
        if ((i2 & 2) != 0) {
            z = false;
        } else {
            z = true;
        }
        return v(kjcVar, hd1Var, z);
    }

    public static final kjc x(kjc kjcVar, fd1 fd1Var, boolean z) {
        d dVar;
        if (Intrinsics.areEqual(fd1Var, gdn.p) && !z) {
            dVar = d;
        } else if (Intrinsics.areEqual(fd1Var, gdn.o) && !z) {
            dVar = e;
        } else {
            dVar = new d(vt6.Horizontal, z, new oek(fd1Var, 3), fd1Var, "wrapContentWidth");
        }
        return kjcVar.e(dVar);
    }

    public static kjc y(kjc kjcVar, int i2) {
        boolean z;
        fd1 fd1Var = gdn.p;
        if ((i2 & 2) != 0) {
            z = false;
        } else {
            z = true;
        }
        return x(kjcVar, fd1Var, z);
    }
}
