package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k68 implements s45 {
    public final float a;

    public k68(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k68) && Float.compare(this.a, ((k68) obj).a) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s45
    public final long h(long j, long j2) {
        float f = this.a;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        int i = thg.a;
        return floatToRawIntBits;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ix2.m(new StringBuilder("FixedScale(value="), this.a, ')');
    }
}
