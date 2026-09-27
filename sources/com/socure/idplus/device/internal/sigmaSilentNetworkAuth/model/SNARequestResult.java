package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/SNARequestResult;", "", "status", "", "message", "", "(ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SNARequestResult {
    private final String message;
    private final int status;

    public SNARequestResult(int i, String str) {
        this.status = i;
        this.message = str;
    }

    public static /* synthetic */ SNARequestResult copy$default(SNARequestResult sNARequestResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sNARequestResult.status;
        }
        if ((i2 & 2) != 0) {
            str = sNARequestResult.message;
        }
        return sNARequestResult.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final SNARequestResult copy(int status, String message) {
        return new SNARequestResult(status, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNARequestResult)) {
            return false;
        }
        SNARequestResult sNARequestResult = (SNARequestResult) other;
        if (this.status == sNARequestResult.status && Intrinsics.areEqual(this.message, sNARequestResult.message)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.status) * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "SNARequestResult(status=" + this.status + ", message=" + this.message + ")";
    }
}
