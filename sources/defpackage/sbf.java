package defpackage;

import com.polymarket.usviewmodels.PromotionsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sbf implements ubf {
    public final PromotionsViewModel.ProgressPresentation a;

    public sbf(PromotionsViewModel.ProgressPresentation progressPresentation) {
        progressPresentation.getClass();
        this.a = progressPresentation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sbf) && Intrinsics.areEqual(this.a, ((sbf) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Progress(presentation=" + this.a + ")";
    }
}
