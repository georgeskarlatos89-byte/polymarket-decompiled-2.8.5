package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s22 {
    public final DesignTokens.SemanticColor a;
    public final Integer b;

    public s22(DesignTokens.SemanticColor semanticColor, Integer num) {
        this.a = semanticColor;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s22) {
                s22 s22Var = (s22) obj;
                if (!Intrinsics.areEqual(this.a, s22Var.a) || !Intrinsics.areEqual(this.b, s22Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        DesignTokens.SemanticColor semanticColor = this.a;
        if (semanticColor == null) {
            hashCode = 0;
        } else {
            hashCode = semanticColor.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "ItemAccent(color=" + this.a + ", badgeCount=" + this.b + ")";
    }
}
