package defpackage;

import com.polymarket.data.EPaymentSelection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class oaj {
    public final List a;
    public final EPaymentSelection b;

    public oaj(List list, EPaymentSelection ePaymentSelection) {
        list.getClass();
        this.a = list;
        this.b = ePaymentSelection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaj)) {
            return false;
        }
        oaj oajVar = (oaj) obj;
        if (Intrinsics.areEqual(this.a, oajVar.a) && Intrinsics.areEqual(this.b, oajVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        EPaymentSelection ePaymentSelection = this.b;
        if (ePaymentSelection == null) {
            hashCode = 0;
        } else {
            hashCode = ePaymentSelection.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "TransactionSuccessPayload(transactions=" + this.a + ", paymentSelection=" + this.b + ")";
    }
}
