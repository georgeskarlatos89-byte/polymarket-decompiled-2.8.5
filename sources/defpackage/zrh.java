package defpackage;

import com.polymarket.designtokens.DesignTokens;
import com.polymarket.designtokens.Icon;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zrh implements ash {
    public final Icon a;
    public final DesignTokens.SemanticColor b;

    public zrh(Icon icon, DesignTokens.SemanticColor semanticColor) {
        icon.getClass();
        semanticColor.getClass();
        this.a = icon;
        this.b = semanticColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrh)) {
            return false;
        }
        zrh zrhVar = (zrh) obj;
        if (this.a == zrhVar.a && Intrinsics.areEqual(this.b, zrhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TintedIcon(icon=" + this.a + ", color=" + this.b + ")";
    }
}
