package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tv6 {
    public final String a;
    public final int b;
    public final int c;

    public tv6(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tv6) {
            tv6 tv6Var = (tv6) obj;
            if (this.a.equals(tv6Var.a) && this.b == tv6Var.b && this.c == tv6Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return ix2.i(this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }
}
