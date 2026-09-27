package com.checkout.risk;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/checkout/risk/DeviceDataConfiguration;", "", "Lcom/checkout/risk/FingerprintIntegration;", "fingerprintIntegration", "<init>", "(Lcom/checkout/risk/FingerprintIntegration;)V", "Lcom/checkout/risk/FingerprintIntegration;", "a", "()Lcom/checkout/risk/FingerprintIntegration;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DeviceDataConfiguration {

    @SerializedName("fingerprint_integration")
    private final FingerprintIntegration fingerprintIntegration;

    public DeviceDataConfiguration(FingerprintIntegration fingerprintIntegration) {
        fingerprintIntegration.getClass();
        this.fingerprintIntegration = fingerprintIntegration;
    }

    /* renamed from: a, reason: from getter */
    public final FingerprintIntegration getFingerprintIntegration() {
        return this.fingerprintIntegration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DeviceDataConfiguration) && Intrinsics.areEqual(this.fingerprintIntegration, ((DeviceDataConfiguration) obj).fingerprintIntegration)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.fingerprintIntegration.hashCode();
    }

    public final String toString() {
        return "DeviceDataConfiguration(fingerprintIntegration=" + this.fingerprintIntegration + ')';
    }
}
