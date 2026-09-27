package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class qnn {
    public static final p8e a(b87 b87Var) {
        r77 r77Var;
        v77 v77Var;
        u77 u77Var;
        w77 w77Var = b87Var.h;
        if (w77Var != null && (v77Var = w77Var.d) != null && (u77Var = v77Var.f) != null) {
            r77Var = u77Var.a;
        } else {
            r77Var = null;
        }
        if (r77Var instanceof q77) {
            q77 q77Var = (q77) r77Var;
            if (q77Var.a) {
                return n8e.a;
            }
            return new m8e(q77Var.d);
        }
        if (!(r77Var instanceof p77) && r77Var != null) {
            dmk.a();
            return null;
        }
        return o8e.a;
    }
}
