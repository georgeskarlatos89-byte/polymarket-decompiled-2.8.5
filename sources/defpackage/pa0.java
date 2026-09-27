package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pa0 extends sa0 {
    public float a;
    public float b;

    public pa0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sa0
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.sa0
    public final int b() {
        return 2;
    }

    @Override // defpackage.sa0
    public final sa0 c() {
        return new pa0(0.0f, 0.0f);
    }

    @Override // defpackage.sa0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.sa0
    public final void e(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pa0) {
            pa0 pa0Var = (pa0) obj;
            if (pa0Var.a == this.a && pa0Var.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
