package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ul0 implements i88 {
    public float a;
    public float b;

    public ul0(int i) {
        switch (i) {
            case 4:
                return;
            default:
                this.a = Math.max(1.0E-7f, Math.abs(0.1f));
                this.b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                return;
        }
    }

    public y78 a(float f) {
        double b = b(f);
        double d = z78.a;
        double d2 = d - 1.0d;
        return new y78(f, (float) (Math.exp((d / d2) * b) * this.a * this.b), (long) (Math.exp(b / d2) * 1000.0d));
    }

    public double b(float f) {
        float[] fArr = p20.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    @Override // defpackage.i88
    public float f(float f, long j) {
        return f * ((float) Math.exp((((float) (j / 1000000)) / 1000.0f) * this.b));
    }

    @Override // defpackage.i88
    public float g(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((float) (j / 1000000))) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // defpackage.i88
    public float i() {
        return this.a;
    }

    @Override // defpackage.i88
    public long m(float f) {
        return ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b) * 1000000;
    }

    @Override // defpackage.i88
    public float n(float f, float f2) {
        if (Math.abs(f2) <= this.a) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }
}
