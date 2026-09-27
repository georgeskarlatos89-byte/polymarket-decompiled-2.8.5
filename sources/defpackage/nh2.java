package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class nh2 {
    public static final nh2 e;
    public final DesignTokens.SemanticColor a;
    public final DesignTokens.SemanticColor b;
    public final DesignTokens.SemanticColor c;
    public final DesignTokens.SemanticColor d;

    static {
        DesignTokens.SemanticColor.Companion companion = DesignTokens.SemanticColor.INSTANCE;
        e = new nh2(companion.custom("#0D000000", "#1AFFFFFF"), companion.custom("#14000000", "#1FFFFFFF"), companion.getContentPrimary(), companion.getContentSecondary());
    }

    public nh2(DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2, DesignTokens.SemanticColor semanticColor3, DesignTokens.SemanticColor semanticColor4) {
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh2)) {
            return false;
        }
        nh2 nh2Var = (nh2) obj;
        if (Intrinsics.areEqual(this.a, nh2Var.a) && Intrinsics.areEqual(this.b, nh2Var.b) && Intrinsics.areEqual(this.c, nh2Var.c) && Intrinsics.areEqual(this.d, nh2Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CUIPillToggleTheme(containerBackground=" + this.a + ", indicatorFill=" + this.b + ", selectedTextColor=" + this.c + ", unselectedTextColor=" + this.d + ")";
    }
}
