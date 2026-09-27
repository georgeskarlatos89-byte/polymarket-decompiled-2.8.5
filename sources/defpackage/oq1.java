package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oq1 {
    public final ArrayList a;

    public oq1(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayList();
                return;
            case 2:
                this.a = new ArrayList(32);
                return;
            case 3:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    public void a() {
        this.a.add(sxd.c);
    }

    public void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new txd(f, f2, f3, f4, f5, f6));
    }

    public void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new byd(f, f2, f3, f4, f5, f6));
    }

    public synchronized n3g d(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            o3g o3gVar = (o3g) this.a.get(i);
            if (o3gVar.a.isAssignableFrom(cls)) {
                return o3gVar.b;
            }
        }
        return null;
    }

    public void e(float f) {
        this.a.add(new uxd(f));
    }

    public void f(float f) {
        this.a.add(new cyd(f));
    }

    public void g(float f, float f2) {
        this.a.add(new vxd(f, f2));
    }

    public void h(float f, float f2) {
        this.a.add(new dyd(f, f2));
    }

    public void i(float f, float f2) {
        this.a.add(new wxd(f, f2));
    }

    public void j(float f, float f2, float f3, float f4) {
        this.a.add(new yxd(f, f2, f3, f4));
    }

    public void k(float f, float f2, float f3, float f4) {
        this.a.add(new gyd(f, f2, f3, f4));
    }

    public void l(float f) {
        this.a.add(new jyd(f));
    }

    public void m(float f) {
        this.a.add(new iyd(f));
    }
}
