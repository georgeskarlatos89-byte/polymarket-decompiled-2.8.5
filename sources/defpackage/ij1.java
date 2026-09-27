package defpackage;

import android.view.View;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ij1 implements gj1, qhd {
    public final /* synthetic */ int a = 3;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;

    public ij1(gb0 gb0Var, long j) {
        String str = gb0Var.b;
        hj1 hj1Var = new hj1(4, (byte) 0);
        hj1Var.d = str;
        hj1Var.b = -1;
        hj1Var.c = -1;
        this.f = hj1Var;
        this.b = nxi.f(j);
        this.c = nxi.e(j);
        this.d = -1;
        this.e = -1;
        int f = nxi.f(j);
        int e = nxi.e(j);
        if (f >= 0 && f <= str.length()) {
            if (e >= 0 && e <= str.length()) {
                if (f <= e) {
                    return;
                }
                dmk.v(woa.l(f, e, "Do not set reversed range: ", " > "));
                throw null;
            }
            omf.e(str.length(), ace.o(e, "end (", ") offset is outside of text region "));
            throw null;
        }
        omf.e(str.length(), ace.o(f, "start (", ") offset is outside of text region "));
        throw null;
    }

    public void a(int i, int i2) {
        long a = h8m.a(i, i2);
        ((hj1) this.f).C(i, i2, "");
        long b = gzn.b(h8m.a(this.b, this.c), a);
        h(nxi.f(b));
        g(nxi.e(b));
        int i3 = this.d;
        if (i3 != -1) {
            long b2 = gzn.b(h8m.a(i3, this.e), a);
            if (nxi.c(b2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = nxi.f(b2);
                this.e = nxi.e(b2);
            }
        }
    }

    public char b(int i) {
        hj1 hj1Var = (hj1) this.f;
        gg1 gg1Var = (gg1) hj1Var.e;
        if (gg1Var == null) {
            return ((String) hj1Var.d).charAt(i);
        }
        if (i < hj1Var.b) {
            return ((String) hj1Var.d).charAt(i);
        }
        int f = gg1Var.b - gg1Var.f();
        int i2 = hj1Var.b;
        if (i < f + i2) {
            int i3 = i - i2;
            int i4 = gg1Var.c;
            char[] cArr = (char[]) gg1Var.e;
            if (i3 < i4) {
                return cArr[i3];
            }
            return cArr[(i3 - i4) + gg1Var.d];
        }
        return ((String) hj1Var.d).charAt(i - ((f - hj1Var.c) + i2));
    }

    public nxi c() {
        int i = this.d;
        if (i != -1) {
            return new nxi(h8m.a(i, this.e));
        }
        return null;
    }

    public void d(int i, int i2, String str) {
        hj1 hj1Var = (hj1) this.f;
        if (i >= 0 && i <= hj1Var.n()) {
            if (i2 >= 0 && i2 <= hj1Var.n()) {
                if (i <= i2) {
                    hj1Var.C(i, i2, str);
                    h(str.length() + i);
                    g(str.length() + i);
                    this.d = -1;
                    this.e = -1;
                    return;
                }
                dmk.v(woa.l(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            omf.e(hj1Var.n(), ace.o(i2, "end (", ") offset is outside of text region "));
            return;
        }
        omf.e(hj1Var.n(), ace.o(i, "start (", ") offset is outside of text region "));
    }

    public void e(int i, int i2) {
        hj1 hj1Var = (hj1) this.f;
        if (i >= 0 && i <= hj1Var.n()) {
            if (i2 >= 0 && i2 <= hj1Var.n()) {
                if (i < i2) {
                    this.d = i;
                    this.e = i2;
                    return;
                } else {
                    dmk.v(woa.l(i, i2, "Do not set reversed or empty range: ", " > "));
                    return;
                }
            }
            omf.e(hj1Var.n(), ace.o(i2, "end (", ") offset is outside of text region "));
            return;
        }
        omf.e(hj1Var.n(), ace.o(i, "start (", ") offset is outside of text region "));
    }

    public void f(int i, int i2) {
        hj1 hj1Var = (hj1) this.f;
        if (i >= 0 && i <= hj1Var.n()) {
            if (i2 >= 0 && i2 <= hj1Var.n()) {
                if (i <= i2) {
                    h(i);
                    g(i2);
                    return;
                } else {
                    dmk.v(woa.l(i, i2, "Do not set reversed range: ", " > "));
                    return;
                }
            }
            omf.e(hj1Var.n(), ace.o(i2, "end (", ") offset is outside of text region "));
            return;
        }
        omf.e(hj1Var.n(), ace.o(i, "start (", ") offset is outside of text region "));
    }

    public void g(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lw9.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void h(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lw9.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    @Override // defpackage.gj1
    public int j() {
        svd svdVar = (svd) this.f;
        int i = this.c;
        if (i == 8) {
            return svdVar.t();
        }
        if (i == 16) {
            return svdVar.z();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int t = svdVar.t();
            this.e = t;
            return (t & 240) >> 4;
        }
        return this.e & 15;
    }

    @Override // defpackage.qhd
    public vlk onApplyWindowInsets(View view, vlk vlkVar) {
        View view2 = (View) this.f;
        fz9 i = vlkVar.a.i(519);
        int i2 = this.b;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + i.a, this.d + i.b, this.e + i.c, view2.getPaddingBottom());
        return vlkVar;
    }

    @Override // defpackage.gj1
    public int p() {
        return -1;
    }

    @Override // defpackage.gj1
    public int t() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((hj1) this.f).toString();
            default:
                return super.toString();
        }
    }

    public ij1(int i, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bArr;
    }

    public ij1(View view, int i, int i2, int i3, int i4) {
        this.b = i;
        this.f = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public ij1(nmc nmcVar) {
        svd svdVar = nmcVar.c;
        this.f = svdVar;
        svdVar.F(12);
        this.c = svdVar.x() & 255;
        this.b = svdVar.x();
    }
}
