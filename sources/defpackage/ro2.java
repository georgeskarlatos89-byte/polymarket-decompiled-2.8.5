package defpackage;

import com.polymarket.designtokens.DesignTokens;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ro2 {
    public final boolean a;
    public final float b;

    public ro2(boolean z, int i) {
        z = (i & 1) != 0 ? false : z;
        float e = ufh.e(DesignTokens.Size.eightXL);
        this.a = z;
        this.b = e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ro2) {
                ro2 ro2Var = (ro2) obj;
                if (this.a != ro2Var.a || !hy6.c(this.b, ro2Var.b) || Float.compare(2.0f, 2.0f) != 0 || Float.compare(24.0f, 24.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(24.0f) + sv6.a(sv6.a(Boolean.hashCode(this.a) * 31, this.b, 31), 2.0f, 31);
    }

    public final String toString() {
        return "CUITabControlEdgeFades(enabled=" + this.a + ", width=" + hy6.d(this.b) + ", leftThreshold=2.0, rightThreshold=24.0)";
    }
}
