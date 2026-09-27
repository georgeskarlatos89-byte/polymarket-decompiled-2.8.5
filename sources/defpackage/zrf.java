package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zrf {
    public static final zrf e = new zrf(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zrf(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static zrf b(zrf zrfVar, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = zrfVar.a;
        }
        float f4 = zrfVar.b;
        if ((i & 4) != 0) {
            f2 = zrfVar.c;
        }
        if ((i & 8) != 0) {
            f3 = zrfVar.d;
        }
        return new zrf(f, f4, f2, f3);
    }

    public final boolean a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = false;
        if (intBitsToFloat >= this.a) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (intBitsToFloat2 >= this.b) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (intBitsToFloat2 < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long d() {
        float f = this.c - this.a;
        float f2 = this.d - this.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (Float.floatToRawIntBits(this.a) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrf)) {
            return false;
        }
        zrf zrfVar = (zrf) obj;
        if (Float.compare(this.a, zrfVar.a) == 0 && Float.compare(this.b, zrfVar.b) == 0 && Float.compare(this.c, zrfVar.c) == 0 && Float.compare(this.d, zrfVar.d) == 0) {
            return true;
        }
        return false;
    }

    public final long f() {
        return (Float.floatToRawIntBits(this.c) << 32) | (Float.floatToRawIntBits(this.b) & 4294967295L);
    }

    public final zrf g(float f) {
        return new zrf(this.a - f, this.b - f, this.c + f, this.d + f);
    }

    public final zrf h(zrf zrfVar) {
        return new zrf(Math.max(this.a, zrfVar.a), Math.max(this.b, zrfVar.b), Math.min(this.c, zrfVar.c), Math.min(this.d, zrfVar.d));
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final boolean i() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final boolean j(zrf zrfVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.a < zrfVar.c) {
            z = true;
        } else {
            z = false;
        }
        if (zrfVar.a < this.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.b < zrfVar.d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (zrfVar.b < this.d) {
            z4 = true;
        }
        return z6 & z4;
    }

    public final zrf k(float f, float f2) {
        return new zrf(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final zrf l(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new zrf(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + wql.b(this.a) + ", " + wql.b(this.b) + ", " + wql.b(this.c) + ", " + wql.b(this.d) + ')';
    }
}
