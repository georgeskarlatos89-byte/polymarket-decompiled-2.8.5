package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zz1 extends f02 {
    public final DesignTokens.PaletteColor a;

    public zz1(DesignTokens.PaletteColor paletteColor) {
        paletteColor.getClass();
        this.a = paletteColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zz1) && Intrinsics.areEqual(this.a, ((zz1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Palette(palette=" + this.a + ")";
    }
}
