package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tc6 implements kkg {
    public final /* synthetic */ uc6 a;

    public tc6(uc6 uc6Var) {
        this.a = uc6Var;
    }

    @Override // defpackage.kkg
    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        uc6 uc6Var = this.a;
        float floatValue = ((Number) uc6Var.a.invoke(Float.valueOf(f))).floatValue();
        kvd kvdVar = uc6Var.e;
        boolean z2 = false;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        kvdVar.setValue(Boolean.valueOf(z));
        kvd kvdVar2 = uc6Var.f;
        if (floatValue < 0.0f) {
            z2 = true;
        }
        kvdVar2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
