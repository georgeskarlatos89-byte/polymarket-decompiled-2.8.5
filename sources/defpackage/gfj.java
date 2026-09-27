package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gfj {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public esi r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(gfj gfjVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gfjVar != null) {
            if (!this.c && gfjVar.c) {
                this.b = gfjVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = gfjVar.h;
            }
            if (this.i == -1) {
                this.i = gfjVar.i;
            }
            if (this.a == null && (str = gfjVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = gfjVar.f;
            }
            if (this.g == -1) {
                this.g = gfjVar.g;
            }
            if (this.n == -1) {
                this.n = gfjVar.n;
            }
            if (this.o == null && (alignment2 = gfjVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = gfjVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = gfjVar.q;
            }
            if (this.j == -1) {
                this.j = gfjVar.j;
                this.k = gfjVar.k;
            }
            if (this.r == null) {
                this.r = gfjVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = gfjVar.s;
            }
            if (this.t == null) {
                this.t = gfjVar.t;
            }
            if (this.u == null) {
                this.u = gfjVar.u;
            }
            if (!this.e && gfjVar.e) {
                this.d = gfjVar.d;
                this.e = true;
            }
            if (this.m == -1 && (i = gfjVar.m) != -1) {
                this.m = i;
            }
        }
    }
}
