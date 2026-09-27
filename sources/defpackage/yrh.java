package defpackage;

import com.polymarket.android.R;
import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yrh implements ash {
    public final DesignTokens.SemanticColor a;

    public yrh(DesignTokens.SemanticColor semanticColor) {
        semanticColor.getClass();
        this.a = semanticColor;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof yrh) || !Intrinsics.areEqual(this.a, ((yrh) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(R.drawable.ic_hidden) * 31);
    }

    public final String toString() {
        return "TintedDrawable(drawable=2131231153, color=" + this.a + ")";
    }
}
