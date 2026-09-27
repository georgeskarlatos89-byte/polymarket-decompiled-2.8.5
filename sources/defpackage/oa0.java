package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class oa0 extends sa0 {
    public float a;

    public oa0(float f) {
        this.a = f;
    }

    @Override // defpackage.sa0
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.sa0
    public final int b() {
        return 1;
    }

    @Override // defpackage.sa0
    public final sa0 c() {
        return new oa0(0.0f);
    }

    @Override // defpackage.sa0
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.sa0
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof oa0) && ((oa0) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
