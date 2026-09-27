package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class jp2 {
    public final DesignTokens.SemanticColor a;
    public final DesignTokens.SemanticColor b;
    public final DesignTokens.SemanticColor c;
    public final DesignTokens.SemanticColor d;

    public jp2(DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, DesignTokens.SemanticColor semanticColor3, DesignTokens.SemanticColor semanticColor4) {
        semanticColor.getClass();
        semanticColor2.getClass();
        semanticColor3.getClass();
        semanticColor4.getClass();
        this.a = semanticColor;
        this.b = semanticColor2;
        this.c = semanticColor3;
        this.d = semanticColor4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jp2) {
                jp2 jp2Var = (jp2) obj;
                if (!Intrinsics.areEqual(this.a, jp2Var.a) || !Intrinsics.areEqual(this.b, jp2Var.b) || !Intrinsics.areEqual(this.c, jp2Var.c) || !Intrinsics.areEqual(this.d, jp2Var.d) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961;
    }

    public final String toString() {
        return "CUITabControlTheme(indicatorFill=" + this.a + ", fadeBackground=" + this.b + ", selectedTextColor=" + this.c + ", unselectedTextColor=" + this.d + ", containerFill=null, iconBackgroundFill=null)";
    }
}
