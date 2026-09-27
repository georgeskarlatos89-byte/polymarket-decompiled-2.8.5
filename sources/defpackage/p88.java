package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class p88 implements c88 {
    public final int a;
    public final w57 b;
    public final long c;
    public final long d;

    public p88(int i, int i2, w57 w57Var) {
        this.a = i;
        this.b = w57Var;
        this.c = i * 1000000;
        this.d = i2 * 1000000;
    }

    @Override // defpackage.c88
    public final float c(float f, float f2, long j, float f3) {
        long j2;
        long j3 = j - this.d;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 == 0) {
            return f3;
        }
        return (d(f, f2, j2, f3) - d(f, f2, j2 - 1000000, f3)) * 1000.0f;
    }

    @Override // defpackage.c88
    public final float d(float f, float f2, long j, float f3) {
        float f4;
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        if (this.a == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) j2) / ((float) j3);
        }
        float a = this.b.a(f4);
        return (f2 * a) + ((1.0f - a) * f);
    }

    @Override // defpackage.c88
    public final long e(float f, float f2, float f3) {
        return this.d + this.c;
    }
}
