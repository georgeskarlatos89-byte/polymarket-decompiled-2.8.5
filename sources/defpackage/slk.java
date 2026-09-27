package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class slk {
    public static final vlk b;
    public final vlk a;

    static {
        jlk flkVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            flkVar = new ilk();
        } else if (i >= 35) {
            flkVar = new hlk();
        } else if (i >= 34) {
            flkVar = new glk();
        } else {
            flkVar = new flk();
        }
        b = flkVar.b().a.a().a.b().a.c();
    }

    public slk(vlk vlkVar) {
        this.a = vlkVar;
    }

    public vlk a() {
        return this.a;
    }

    public vlk b() {
        return this.a;
    }

    public vlk c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slk)) {
            return false;
        }
        slk slkVar = (slk) obj;
        if (t() == slkVar.t() && s() == slkVar.s() && Objects.equals(n(), slkVar.n()) && Objects.equals(l(), slkVar.l()) && Objects.equals(h(), slkVar.h())) {
            return true;
        }
        return false;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public nv6 h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public fz9 i(int i) {
        return fz9.e;
    }

    public fz9 j(int i) {
        if ((i & 8) == 0) {
            return fz9.e;
        }
        dmk.v("Unable to query the maximum insets for IME");
        return null;
    }

    public fz9 k() {
        return n();
    }

    public fz9 l() {
        return fz9.e;
    }

    public fz9 m() {
        return n();
    }

    public fz9 n() {
        return fz9.e;
    }

    public fz9 o() {
        return n();
    }

    public vlk r(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(vlk vlkVar) {
    }

    public void p(View view) {
    }

    public void v(uv6 uv6Var) {
    }

    public void w(fz9[] fz9VarArr) {
    }

    public void x(fz9 fz9Var) {
    }

    public void y(vlk vlkVar) {
    }

    public void z(int i) {
    }
}
