package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class hyh {
    public final iyh a;
    public final DesignTokens.SemanticColor b;
    public final DesignTokens.SemanticColor c;

    public hyh(iyh iyhVar, DesignTokens.SemanticColor semanticColor, DesignTokens.SemanticColor semanticColor2) {
        semanticColor.getClass();
        semanticColor2.getClass();
        this.a = iyhVar;
        this.b = semanticColor;
        this.c = semanticColor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyh)) {
            return false;
        }
        hyh hyhVar = (hyh) obj;
        if (Intrinsics.areEqual(this.a, hyhVar.a) && Intrinsics.areEqual(this.b, hyhVar.b) && Intrinsics.areEqual(this.c, hyhVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        iyh iyhVar = this.a;
        if (iyhVar == null) {
            hashCode = 0;
        } else {
            hashCode = iyhVar.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        return this.c.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "StatsBannerDrive(ball=" + this.a + ", leftTeamColor=" + this.b + ", rightTeamColor=" + this.c + ")";
    }
}
