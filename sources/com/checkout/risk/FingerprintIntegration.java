package com.checkout.risk;

import com.google.gson.annotations.SerializedName;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/risk/FingerprintIntegration;", "", "", "enabled", "", "publicKey", "<init>", "(ZLjava/lang/String;)V", "Z", "a", "()Z", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FingerprintIntegration {

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("public_key")
    private final String publicKey;

    public FingerprintIntegration(boolean z, String str) {
        this.enabled = z;
        this.publicKey = str;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: b, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FingerprintIntegration)) {
            return false;
        }
        FingerprintIntegration fingerprintIntegration = (FingerprintIntegration) obj;
        if (this.enabled == fingerprintIntegration.enabled && Intrinsics.areEqual(this.publicKey, fingerprintIntegration.publicKey)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.publicKey;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FingerprintIntegration(enabled=");
        sb.append(this.enabled);
        sb.append(", publicKey=");
        return m51.m(sb, this.publicKey, ')');
    }
}
