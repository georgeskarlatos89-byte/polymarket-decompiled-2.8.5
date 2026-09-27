package com.checkout.risk;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/checkout/risk/PersistFingerprintDataRequest;", "", "", "fpRequestId", "integrationType", "cardToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getFpRequestId", "()Ljava/lang/String;", "getIntegrationType", "getCardToken", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PersistFingerprintDataRequest {

    @SerializedName("card_token")
    private final String cardToken;

    @SerializedName("fp_request_id")
    private final String fpRequestId;

    @SerializedName("integration_type")
    private final String integrationType;

    public PersistFingerprintDataRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.fpRequestId = str;
        this.integrationType = str2;
        this.cardToken = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistFingerprintDataRequest)) {
            return false;
        }
        PersistFingerprintDataRequest persistFingerprintDataRequest = (PersistFingerprintDataRequest) obj;
        if (Intrinsics.areEqual(this.fpRequestId, persistFingerprintDataRequest.fpRequestId) && Intrinsics.areEqual(this.integrationType, persistFingerprintDataRequest.integrationType) && Intrinsics.areEqual(this.cardToken, persistFingerprintDataRequest.cardToken)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e = hdi.e(this.fpRequestId.hashCode() * 31, 31, this.integrationType);
        String str = this.cardToken;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistFingerprintDataRequest(fpRequestId=");
        sb.append(this.fpRequestId);
        sb.append(", integrationType=");
        sb.append(this.integrationType);
        sb.append(", cardToken=");
        return m51.m(sb, this.cardToken, ')');
    }
}
