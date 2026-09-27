package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class o8b implements hi8 {
    public final float a;

    public o8b(float f) {
        this.a = f;
    }

    @Override // defpackage.hi8
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.hi8
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o8b) && Float.compare(this.a, ((o8b) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ix2.m(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
