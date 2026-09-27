package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class t51 {
    public static final t51 f = new t51(DesignTokens.SemanticColor.INSTANCE.getContentAccentBrand().getLightPaletteColor(), DesignTokens.PaletteColor.INSTANCE.getBrand50(), null, 0.0f, r51.Pill);
    public final DesignTokens.PaletteColor a;
    public final DesignTokens.PaletteColor b;
    public final DesignTokens.SemanticColor c;
    public final float d;
    public final r51 e;

    public t51(DesignTokens.PaletteColor paletteColor, DesignTokens.PaletteColor paletteColor2, DesignTokens.SemanticColor semanticColor, float f2, r51 r51Var) {
        paletteColor.getClass();
        paletteColor2.getClass();
        r51Var.getClass();
        this.a = paletteColor;
        this.b = paletteColor2;
        this.c = semanticColor;
        this.d = f2;
        this.e = r51Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t51) {
                t51 t51Var = (t51) obj;
                if (!Intrinsics.areEqual(this.a, t51Var.a) || !Intrinsics.areEqual(this.b, t51Var.b) || !Intrinsics.areEqual(this.c, t51Var.c) || !hy6.c(this.d, t51Var.d) || this.e != t51Var.e) {
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
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        DesignTokens.SemanticColor semanticColor = this.c;
        if (semanticColor == null) {
            hashCode = 0;
        } else {
            hashCode = semanticColor.hashCode();
        }
        return this.e.hashCode() + sv6.a((hashCode2 + hashCode) * 31, this.d, 31);
    }

    public final String toString() {
        return "BadgeStyle(textColor=" + this.a + ", backgroundColor=" + this.b + ", borderColor=" + this.c + ", borderWidth=" + hy6.d(this.d) + ", shape=" + this.e + ")";
    }
}
