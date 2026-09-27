package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sh {
    public final boolean a;
    public final float b;
    public final float c;

    public sh(float f, float f2, boolean z) {
        this.a = z;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sh) {
                sh shVar = (sh) obj;
                if (this.a != shVar.a || Float.compare(this.b, shVar.b) != 0 || Float.compare(this.c, shVar.c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sv6.a(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvancedRenderState(isValid=");
        sb.append(this.a);
        sb.append(", chartWidth=");
        sb.append(this.b);
        sb.append(", chartHeight=");
        return hdi.r(sb, this.c, ")");
    }
}
