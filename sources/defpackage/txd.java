package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class txd extends kyd {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public txd(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txd)) {
            return false;
        }
        txd txdVar = (txd) obj;
        if (Float.compare(this.c, txdVar.c) == 0 && Float.compare(this.d, txdVar.d) == 0 && Float.compare(this.e, txdVar.e) == 0 && Float.compare(this.f, txdVar.f) == 0 && Float.compare(this.g, txdVar.g) == 0 && Float.compare(this.h, txdVar.h) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + sv6.a(sv6.a(sv6.a(sv6.a(Float.hashCode(this.c) * 31, this.d, 31), this.e, 31), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return ix2.m(sb, this.h, ')');
    }
}
