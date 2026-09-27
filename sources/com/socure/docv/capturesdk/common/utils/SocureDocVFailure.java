package com.socure.docv.capturesdk.common.utils;

import com.socure.docv.capturesdk.api.SocureDocVError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/SocureDocVFailure;", "Lcom/socure/docv/capturesdk/common/utils/SocureResult;", "error", "Lcom/socure/docv/capturesdk/api/SocureDocVError;", "deviceSessionToken", "", "<init>", "(Lcom/socure/docv/capturesdk/api/SocureDocVError;Ljava/lang/String;)V", "getError", "()Lcom/socure/docv/capturesdk/api/SocureDocVError;", "getDeviceSessionToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SocureDocVFailure implements SocureResult {
    public static final int $stable = 0;
    private final String deviceSessionToken;
    private final SocureDocVError error;

    public SocureDocVFailure(SocureDocVError socureDocVError, String str) {
        socureDocVError.getClass();
        this.error = socureDocVError;
        this.deviceSessionToken = str;
    }

    public static /* synthetic */ SocureDocVFailure copy$default(SocureDocVFailure socureDocVFailure, SocureDocVError socureDocVError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            socureDocVError = socureDocVFailure.error;
        }
        if ((i & 2) != 0) {
            str = socureDocVFailure.deviceSessionToken;
        }
        return socureDocVFailure.copy(socureDocVError, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SocureDocVError getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeviceSessionToken() {
        return this.deviceSessionToken;
    }

    public final SocureDocVFailure copy(SocureDocVError error, String deviceSessionToken) {
        error.getClass();
        return new SocureDocVFailure(error, deviceSessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocureDocVFailure)) {
            return false;
        }
        SocureDocVFailure socureDocVFailure = (SocureDocVFailure) other;
        if (this.error == socureDocVFailure.error && Intrinsics.areEqual(this.deviceSessionToken, socureDocVFailure.deviceSessionToken)) {
            return true;
        }
        return false;
    }

    @Override // com.socure.docv.capturesdk.common.utils.SocureResult
    public String getDeviceSessionToken() {
        return this.deviceSessionToken;
    }

    public final SocureDocVError getError() {
        return this.error;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.error.hashCode() * 31;
        String str = this.deviceSessionToken;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "SocureDocVFailure(error=" + this.error + ", deviceSessionToken=" + this.deviceSessionToken + ")";
    }
}
