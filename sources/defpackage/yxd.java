package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yxd extends kyd {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public yxd(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxd)) {
            return false;
        }
        yxd yxdVar = (yxd) obj;
        if (Float.compare(this.c, yxdVar.c) == 0 && Float.compare(this.d, yxdVar.d) == 0 && Float.compare(this.e, yxdVar.e) == 0 && Float.compare(this.f, yxdVar.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + sv6.a(sv6.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return ix2.m(sb, this.f, ')');
    }
}
