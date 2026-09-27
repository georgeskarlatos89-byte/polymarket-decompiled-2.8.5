package com.checkout.components.core.network.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.n1e;
import defpackage.o1e;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/checkout/components/core/network/model/response/PaymentAction$Redirect", "Ln1e;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class PaymentAction$Redirect extends n1e {
    public final String a;

    public PaymentAction$Redirect(String str) {
        this.a = str;
        o1e.Redirect.getClass();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentAction$Redirect) || !Intrinsics.areEqual(this.a, ((PaymentAction$Redirect) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sv6.n("Redirect(url=", this.a, ")");
    }
}
