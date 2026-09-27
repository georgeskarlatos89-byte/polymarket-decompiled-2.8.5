package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class rod {
    public final long a;
    public final float b;
    public final float c;

    public rod(float f, float f2, long j) {
        this.a = j;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rod) {
                rod rodVar = (rod) obj;
                if (!ogd.c(this.a, rodVar.a) || Float.compare(this.b, rodVar.b) != 0 || Float.compare(this.c, rodVar.c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sv6.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String h = ogd.h(this.a);
        StringBuilder sb = new StringBuilder("OverlayTransform(position=");
        sb.append(h);
        sb.append(", scale=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        return hdi.r(sb, this.c, ")");
    }
}
