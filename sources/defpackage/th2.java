package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class th2 extends njn {
    public final DesignTokens.PaletteColor a;
    public final DesignTokens.PaletteColor b;

    public th2(DesignTokens.PaletteColor paletteColor, DesignTokens.PaletteColor paletteColor2) {
        paletteColor.getClass();
        this.a = paletteColor;
        this.b = paletteColor2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof th2) {
                th2 th2Var = (th2) obj;
                if (!Intrinsics.areEqual(this.a, th2Var.a) || !Intrinsics.areEqual(this.b, th2Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Custom(backgroundColor=" + this.a + ", foregroundColor=" + this.b + ")";
    }
}
