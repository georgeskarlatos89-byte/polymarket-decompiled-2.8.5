package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.mlkit.vision.barcode.common.Barcode;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u91 implements Cloneable {
    public int a;
    public boolean h;
    public boolean l;
    public Resources.Theme m;
    public boolean n;
    public boolean p;
    public ju6 b = ju6.d;
    public h6f c = h6f.NORMAL;
    public boolean d = true;
    public int e = -1;
    public int f = -1;
    public rma g = gd7.b;
    public ild i = new ild();
    public xt2 j = new b7h();
    public Class k = Object.class;
    public boolean o = true;

    public static boolean f(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public u91 a(u91 u91Var) {
        if (this.n) {
            return b().a(u91Var);
        }
        int i = u91Var.a;
        if (f(u91Var.a, 1048576)) {
            this.p = u91Var.p;
        }
        if (f(u91Var.a, 4)) {
            this.b = u91Var.b;
        }
        if (f(u91Var.a, 8)) {
            this.c = u91Var.c;
        }
        if (f(u91Var.a, 16)) {
            this.a &= -33;
        }
        if (f(u91Var.a, 32)) {
            this.a &= -17;
        }
        if (f(u91Var.a, 64)) {
            this.a &= -129;
        }
        if (f(u91Var.a, 128)) {
            this.a &= -65;
        }
        if (f(u91Var.a, 256)) {
            this.d = u91Var.d;
        }
        if (f(u91Var.a, Barcode.FORMAT_UPC_A)) {
            this.f = u91Var.f;
            this.e = u91Var.e;
        }
        if (f(u91Var.a, Barcode.FORMAT_UPC_E)) {
            this.g = u91Var.g;
        }
        if (f(u91Var.a, 4096)) {
            this.k = u91Var.k;
        }
        if (f(u91Var.a, 8192)) {
            this.a &= -16385;
        }
        if (f(u91Var.a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.a &= -8193;
        }
        if (f(u91Var.a, 32768)) {
            this.m = u91Var.m;
        }
        if (f(u91Var.a, 131072)) {
            this.h = u91Var.h;
        }
        if (f(u91Var.a, 2048)) {
            this.j.putAll(u91Var.j);
            this.o = u91Var.o;
        }
        this.a |= u91Var.a;
        this.i.b.g(u91Var.i.b);
        k();
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [b7h, xt2, fl0] */
    public u91 b() {
        try {
            u91 u91Var = (u91) super.clone();
            ild ildVar = new ild();
            u91Var.i = ildVar;
            ildVar.b.g(this.i.b);
            ?? b7hVar = new b7h();
            u91Var.j = b7hVar;
            b7hVar.putAll(this.j);
            u91Var.l = false;
            u91Var.n = false;
            return u91Var;
        } catch (CloneNotSupportedException e) {
            qp7.n(e);
            return null;
        }
    }

    public final u91 c(Class cls) {
        if (this.n) {
            return b().c(cls);
        }
        this.k = cls;
        this.a |= 4096;
        k();
        return this;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return b();
    }

    public final u91 d(ju6 ju6Var) {
        if (this.n) {
            return b().d(ju6Var);
        }
        this.b = ju6Var;
        this.a |= 4;
        k();
        return this;
    }

    public final boolean e(u91 u91Var) {
        u91Var.getClass();
        if (Float.compare(1.0f, 1.0f) == 0 && this.d == u91Var.d && this.e == u91Var.e && this.f == u91Var.f && this.h == u91Var.h && this.b.equals(u91Var.b) && this.c == u91Var.c && this.i.equals(u91Var.i) && this.j.equals(u91Var.j) && this.k.equals(u91Var.k) && this.g.equals(u91Var.g) && o1k.c(this.m, u91Var.m)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u91) {
            return e((u91) obj);
        }
        return false;
    }

    public final u91 g(by6 by6Var, jf1 jf1Var) {
        if (this.n) {
            return b().g(by6Var, jf1Var);
        }
        l(by6.g, by6Var);
        return q(jf1Var, false);
    }

    public final u91 h(int i, int i2) {
        if (this.n) {
            return b().h(i, i2);
        }
        this.f = i;
        this.e = i2;
        this.a |= Barcode.FORMAT_UPC_A;
        k();
        return this;
    }

    public int hashCode() {
        return o1k.j(o1k.j(o1k.j(o1k.j(o1k.j(o1k.j(o1k.j(o1k.i(0, o1k.i(0, o1k.i(1, o1k.i(this.h ? 1 : 0, o1k.i(this.f, o1k.i(this.e, o1k.i(this.d ? 1 : 0, o1k.j(o1k.i(0, o1k.j(o1k.i(0, o1k.j(o1k.i(0, o1k.i(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.b), this.c), this.i), this.j), this.k), this.g), this.m);
    }

    public final u91 i(h6f h6fVar) {
        if (this.n) {
            return b().i(h6fVar);
        }
        zqn.c(h6fVar, "Argument must not be null");
        this.c = h6fVar;
        this.a |= 8;
        k();
        return this;
    }

    public final u91 j(cld cldVar) {
        if (this.n) {
            return b().j(cldVar);
        }
        this.i.b.remove(cldVar);
        k();
        return this;
    }

    public final void k() {
        if (!this.l) {
            return;
        }
        dmk.n("You cannot modify locked T, consider clone()");
    }

    public final u91 l(cld cldVar, Object obj) {
        if (this.n) {
            return b().l(cldVar, obj);
        }
        zqn.b(cldVar);
        this.i.b.put(cldVar, obj);
        k();
        return this;
    }

    public final u91 m(rma rmaVar) {
        if (this.n) {
            return b().m(rmaVar);
        }
        this.g = rmaVar;
        this.a |= Barcode.FORMAT_UPC_E;
        k();
        return this;
    }

    public final u91 n() {
        if (this.n) {
            return b().n();
        }
        this.d = false;
        this.a |= 256;
        k();
        return this;
    }

    public final u91 o(Resources.Theme theme) {
        if (this.n) {
            return b().o(theme);
        }
        this.m = theme;
        int i = this.a;
        if (theme != null) {
            this.a = i | 32768;
            return l(m3g.b, theme);
        }
        this.a = (-32769) & i;
        return j(m3g.b);
    }

    public final u91 p(r24 r24Var) {
        by6 by6Var = by6.c;
        if (this.n) {
            return b().p(r24Var);
        }
        l(by6.g, by6Var);
        return q(r24Var, true);
    }

    public final u91 q(mbj mbjVar, boolean z) {
        if (this.n) {
            return b().q(mbjVar, z);
        }
        l17 l17Var = new l17(mbjVar, z);
        r(Bitmap.class, mbjVar, z);
        r(Drawable.class, l17Var, z);
        r(BitmapDrawable.class, l17Var, z);
        r(jv8.class, new lv8(mbjVar), z);
        k();
        return this;
    }

    public final u91 r(Class cls, mbj mbjVar, boolean z) {
        if (this.n) {
            return b().r(cls, mbjVar, z);
        }
        this.j.put(cls, mbjVar);
        int i = this.a;
        this.a = 67584 | i;
        this.o = false;
        if (z) {
            this.a = i | 198656;
            this.h = true;
        }
        k();
        return this;
    }

    public final u91 s() {
        if (this.n) {
            return b().s();
        }
        this.p = true;
        this.a |= 1048576;
        k();
        return this;
    }
}
