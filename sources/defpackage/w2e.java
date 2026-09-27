package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class w2e {
    public final y5i a;

    public w2e(y5i y5iVar) {
        this.a = y5iVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof w2e) || !Intrinsics.areEqual(this.a, ((w2e) obj).a) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(null, null)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 1742810335;
    }

    public final String toString() {
        return "PaymentElementCallbacks(createIntentCallback=" + this.a + ", createIntentWithConfirmationTokenCallback=null, confirmCustomPaymentMethodCallback=null, externalPaymentMethodConfirmHandler=null, analyticEventCallback=null, rowSelectionCallback=null, preparePaymentMethodHandler=null, createCardPresentSetupIntentCallback=null)";
    }
}
