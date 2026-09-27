package defpackage;

import com.polymarket.designtokens.DesignTokens;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class j62 {
    public final String a;
    public final double b;
    public final boolean c;
    public final DesignTokens.SemanticColor d;
    public final boolean e;
    public final boolean f;

    public j62(String str, double d, boolean z, DesignTokens.SemanticColor semanticColor, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = z;
        this.d = semanticColor;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j62)) {
            return false;
        }
        j62 j62Var = (j62) obj;
        if (Intrinsics.areEqual(this.a, j62Var.a) && Double.compare(this.b, j62Var.b) == 0 && this.c == j62Var.c && Intrinsics.areEqual(this.d, j62Var.d) && this.e == j62Var.e && this.f == j62Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = hdi.g(hdi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        DesignTokens.SemanticColor semanticColor = this.d;
        if (semanticColor == null) {
            hashCode = 0;
        } else {
            hashCode = semanticColor.hashCode();
        }
        return Boolean.hashCode(this.f) + hdi.g((g + hashCode) * 31, 31, this.e);
    }

    public final String toString() {
        return "CUIDialPickerNotchValue(label=" + this.a + ", value=" + this.b + ", hasPosition=" + this.c + ", selectedColor=" + this.d + ", isResolved=" + this.e + ", hasSelection=" + this.f + ")";
    }
}
