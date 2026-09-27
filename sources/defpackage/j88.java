package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class j88 extends toa {
    @Override // defpackage.g91
    public final Object g(soa soaVar, float f) {
        return Float.valueOf(n(soaVar, f));
    }

    public final float m() {
        return n(b(), d());
    }

    public final float n(soa soaVar, float f) {
        float f2;
        Object obj = soaVar.b;
        Object obj2 = soaVar.b;
        if (obj != null && soaVar.c != null) {
            x4 x4Var = this.e;
            if (x4Var != null) {
                f2 = f;
                Float f3 = (Float) x4Var.P0(soaVar.g, soaVar.h.floatValue(), (Float) obj2, (Float) soaVar.c, f2, e(), this.d);
                if (f3 != null) {
                    return f3.floatValue();
                }
            } else {
                f2 = f;
            }
            float f4 = soaVar.i;
            if (f4 == -3987645.8f) {
                f4 = ((Float) obj2).floatValue();
                soaVar.i = f4;
            }
            float f5 = soaVar.j;
            if (f5 == -3987645.8f) {
                f5 = ((Float) soaVar.c).floatValue();
                soaVar.j = f5;
            }
            return tgc.f(f4, f5, f2);
        }
        dmk.n("Missing values for keyframe.");
        return 0.0f;
    }
}
