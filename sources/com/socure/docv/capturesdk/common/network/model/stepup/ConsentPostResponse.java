package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentPostResponse;", "", ApiConstant.KEY_DATA, "Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentData;", "status", "", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentData;Ljava/lang/String;)V", "getData", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentData;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ConsentPostResponse {
    public static final int $stable = 0;
    private final ConsentData data;
    private final String status;

    public ConsentPostResponse(ConsentData consentData, String str) {
        consentData.getClass();
        str.getClass();
        this.data = consentData;
        this.status = str;
    }

    public static /* synthetic */ ConsentPostResponse copy$default(ConsentPostResponse consentPostResponse, ConsentData consentData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            consentData = consentPostResponse.data;
        }
        if ((i & 2) != 0) {
            str = consentPostResponse.status;
        }
        return consentPostResponse.copy(consentData, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ConsentData getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final ConsentPostResponse copy(ConsentData data, String status) {
        data.getClass();
        status.getClass();
        return new ConsentPostResponse(data, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentPostResponse)) {
            return false;
        }
        ConsentPostResponse consentPostResponse = (ConsentPostResponse) other;
        if (Intrinsics.areEqual(this.data, consentPostResponse.data) && Intrinsics.areEqual(this.status, consentPostResponse.status)) {
            return true;
        }
        return false;
    }

    public final ConsentData getData() {
        return this.data;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.data.hashCode() * 31);
    }

    public String toString() {
        return "ConsentPostResponse(data=" + this.data + ", status=" + this.status + ")";
    }
}
