package defpackage;

import com.checkout.components.ui.model.CardScheme;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sm5 {
    public final String a;
    public final CardScheme b;

    public sm5(String str, CardScheme cardScheme) {
        this.a = str;
        this.b = cardScheme;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sm5) {
                sm5 sm5Var = (sm5) obj;
                if (!Intrinsics.areEqual(this.a, sm5Var.a) || this.b != sm5Var.b) {
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
        return "CvvValidationRequest(cvv=" + this.a + ", cardScheme=" + this.b + ")";
    }
}
