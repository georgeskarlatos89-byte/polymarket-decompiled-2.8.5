package com.socure.idplus.device.internal.sigmaSilentNetworkAuth.model;

import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaSilentNetworkAuth/model/StartSNAResponse;", "", "snaRequestId", "", "snaUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getSnaRequestId", "()Ljava/lang/String;", "getSnaUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StartSNAResponse {
    private final String snaRequestId;
    private final String snaUrl;

    public StartSNAResponse(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.snaRequestId = str;
        this.snaUrl = str2;
    }

    public static /* synthetic */ StartSNAResponse copy$default(StartSNAResponse startSNAResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startSNAResponse.snaRequestId;
        }
        if ((i & 2) != 0) {
            str2 = startSNAResponse.snaUrl;
        }
        return startSNAResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSnaRequestId() {
        return this.snaRequestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSnaUrl() {
        return this.snaUrl;
    }

    public final StartSNAResponse copy(String snaRequestId, String snaUrl) {
        snaRequestId.getClass();
        snaUrl.getClass();
        return new StartSNAResponse(snaRequestId, snaUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartSNAResponse)) {
            return false;
        }
        StartSNAResponse startSNAResponse = (StartSNAResponse) other;
        if (Intrinsics.areEqual(this.snaRequestId, startSNAResponse.snaRequestId) && Intrinsics.areEqual(this.snaUrl, startSNAResponse.snaUrl)) {
            return true;
        }
        return false;
    }

    public final String getSnaRequestId() {
        return this.snaRequestId;
    }

    public final String getSnaUrl() {
        return this.snaUrl;
    }

    public int hashCode() {
        return this.snaUrl.hashCode() + (this.snaRequestId.hashCode() * 31);
    }

    public String toString() {
        return hdi.p("StartSNAResponse(snaRequestId=", this.snaRequestId, ", snaUrl=", this.snaUrl, ")");
    }
}
