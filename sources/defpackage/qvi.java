package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qvi {
    public static final qvi c = new qvi(1.0f, 0.0f);
    public final float a;
    public final float b;

    public qvi(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvi)) {
            return false;
        }
        qvi qviVar = (qvi) obj;
        if (this.a == qviVar.a && this.b == qviVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return ix2.m(sb, this.b, ')');
    }
}
