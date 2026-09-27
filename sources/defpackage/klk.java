package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class klk extends slk {
    public final WindowInsets c;
    public fz9[] d;
    public fz9 e;
    public vlk f;
    public fz9 g;
    public int h;
    public uv6 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public klk(vlk vlkVar, WindowInsets windowInsets) {
        super(vlkVar);
        this.e = null;
        this.l = new Rect[10];
        this.m = new Rect[10];
        this.c = windowInsets;
    }

    private uv6 C(View view) {
        Display display;
        int i;
        int i2;
        int i3;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return uv6.a(point.x, point.y, 0, 0, 0, 0, true);
        }
        int i4 = 0;
        pag a = hxn.a(display, 0);
        pag a2 = hxn.a(display, 1);
        pag a3 = hxn.a(display, 2);
        pag a4 = hxn.a(display, 3);
        int i5 = point.x;
        int i6 = point.y;
        if (a != null) {
            i = a.b;
        } else {
            i = 0;
        }
        if (a2 != null) {
            i2 = a2.b;
        } else {
            i2 = 0;
        }
        if (a3 != null) {
            i3 = a3.b;
        } else {
            i3 = 0;
        }
        if (a4 != null) {
            i4 = a4.b;
        }
        return uv6.a(i5, i6, i, i2, i3, i4, false);
    }

    private static List<Rect> D(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[y6n.k(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        if (rectArr3 == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(rectArr3);
    }

    private Rect[] E(fz9 fz9Var) {
        ArrayList arrayList = new ArrayList();
        int i = fz9Var.a;
        int i2 = fz9Var.d;
        int i3 = fz9Var.c;
        int i4 = fz9Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, fz9Var.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private fz9 F(int i, boolean z) {
        fz9 fz9Var = fz9.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                fz9Var = fz9.a(fz9Var, G(i2, z));
            }
        }
        return fz9Var;
    }

    private fz9 H() {
        vlk vlkVar = this.f;
        if (vlkVar != null) {
            return vlkVar.a.l();
        }
        return fz9.e;
    }

    private fz9 I(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public static boolean K(int i, int i2) {
        if ((i & 6) == (i2 & 6)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.slk
    public void A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.slk
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public fz9 G(int i, boolean z) {
        int i2;
        nv6 h;
        fz9 fz9Var = fz9.e;
        if (i != 1) {
            fz9 fz9Var2 = null;
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    vlk vlkVar = this.f;
                                    if (vlkVar != null) {
                                        h = vlkVar.a.h();
                                    } else {
                                        h = h();
                                    }
                                    if (h != null) {
                                        DisplayCutout displayCutout = h.a;
                                        return fz9.c(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                    }
                                }
                            } else {
                                return o();
                            }
                        } else {
                            return k();
                        }
                    } else {
                        return m();
                    }
                } else {
                    fz9[] fz9VarArr = this.d;
                    if (fz9VarArr != null) {
                        fz9Var2 = fz9VarArr[y6n.k(8)];
                    }
                    if (fz9Var2 != null) {
                        return fz9Var2;
                    }
                    fz9 n = n();
                    fz9 H = H();
                    int i3 = n.d;
                    if (i3 > H.d) {
                        return fz9.c(0, 0, 0, i3);
                    }
                    fz9 fz9Var3 = this.g;
                    if (fz9Var3 != null && !fz9Var3.equals(fz9Var) && (i2 = this.g.d) > H.d) {
                        return fz9.c(0, 0, 0, i2);
                    }
                }
            } else {
                if (z) {
                    fz9 H2 = H();
                    fz9 l = l();
                    return fz9.c(Math.max(H2.a, l.a), 0, Math.max(H2.c, l.c), Math.max(H2.d, l.d));
                }
                if ((this.h & 2) == 0) {
                    fz9 n2 = n();
                    vlk vlkVar2 = this.f;
                    if (vlkVar2 != null) {
                        fz9Var2 = vlkVar2.a.l();
                    }
                    int i4 = n2.d;
                    if (fz9Var2 != null) {
                        i4 = Math.min(i4, fz9Var2.d);
                    }
                    return fz9.c(n2.a, 0, n2.c, i4);
                }
            }
        } else {
            if (z) {
                return fz9.c(0, Math.max(H().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return fz9.c(0, n().b, 0, 0);
            }
        }
        return fz9Var;
    }

    public boolean J(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !G(i, false).equals(fz9.e);
    }

    @Override // defpackage.slk
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        fz9 I = I(view);
        if (I == null) {
            I = fz9.e;
        }
        x(I);
    }

    @Override // defpackage.slk
    public void e(vlk vlkVar) {
        vlkVar.a.y(this.f);
        fz9 fz9Var = this.g;
        slk slkVar = vlkVar.a;
        slkVar.x(fz9Var);
        slkVar.z(this.h);
        slkVar.v(this.i);
        slkVar.A(this.l);
        slkVar.B(this.m);
    }

    @Override // defpackage.slk
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        klk klkVar = (klk) obj;
        if (!Objects.equals(this.g, klkVar.g) || !K(this.h, klkVar.h)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.slk
    public List<Rect> f(int i) {
        return D(this.l, i);
    }

    @Override // defpackage.slk
    public List<Rect> g(int i) {
        return D(this.m, i);
    }

    @Override // defpackage.slk
    public fz9 i(int i) {
        return F(i, false);
    }

    @Override // defpackage.slk
    public fz9 j(int i) {
        return F(i, true);
    }

    @Override // defpackage.slk
    public final fz9 n() {
        fz9 fz9Var = this.e;
        if (fz9Var == null) {
            WindowInsets windowInsets = this.c;
            fz9 c = fz9.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.e = c;
            return c;
        }
        return fz9Var;
    }

    @Override // defpackage.slk
    public void p(View view) {
        this.i = C(view);
    }

    @Override // defpackage.slk
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int k = y6n.k(i);
            this.l[k] = E(i(i));
            if (i != 8) {
                this.m[k] = E(j(i));
            }
        }
    }

    @Override // defpackage.slk
    public vlk r(int i, int i2, int i3, int i4) {
        jlk flkVar;
        vlk h = vlk.h(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            flkVar = new ilk(h);
        } else if (i5 >= 35) {
            flkVar = new hlk(h);
        } else if (i5 >= 34) {
            flkVar = new glk(h);
        } else {
            flkVar = new flk(h);
        }
        flkVar.e(vlk.e(n(), i, i2, i3, i4));
        flkVar.d(vlk.e(l(), i, i2, i3, i4));
        return flkVar.b();
    }

    @Override // defpackage.slk
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.slk
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !J(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.slk
    public void v(uv6 uv6Var) {
        this.i = uv6Var;
    }

    @Override // defpackage.slk
    public void w(fz9[] fz9VarArr) {
        this.d = fz9VarArr;
    }

    @Override // defpackage.slk
    public void x(fz9 fz9Var) {
        this.g = fz9Var;
    }

    @Override // defpackage.slk
    public void y(vlk vlkVar) {
        this.f = vlkVar;
    }

    @Override // defpackage.slk
    public void z(int i) {
        this.h = i;
    }

    public klk(vlk vlkVar, klk klkVar) {
        this(vlkVar, new WindowInsets(klkVar.c));
    }
}
