package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class qa0 extends sa0 {
    public float a;
    public float b;
    public float c;

    public qa0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.sa0
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.sa0
    public final int b() {
        return 3;
    }

    @Override // defpackage.sa0
    public final sa0 c() {
        return new qa0(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.sa0
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.sa0
    public final void e(float f, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qa0) {
            qa0 qa0Var = (qa0) obj;
            if (qa0Var.a == this.a && qa0Var.b == this.b && qa0Var.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sv6.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
