package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ResponseWrapper;", "", "status", "", ApiConstant.KEY_DATA, "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "<init>", "(Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;)V", "getStatus", "()Ljava/lang/String;", "getData", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class ResponseWrapper {
    public static final int $stable = 8;
    private final ModuleDataResponse data;
    private final String status;

    public ResponseWrapper(String str, ModuleDataResponse moduleDataResponse) {
        str.getClass();
        moduleDataResponse.getClass();
        this.status = str;
        this.data = moduleDataResponse;
    }

    public static /* synthetic */ ResponseWrapper copy$default(ResponseWrapper responseWrapper, String str, ModuleDataResponse moduleDataResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responseWrapper.status;
        }
        if ((i & 2) != 0) {
            moduleDataResponse = responseWrapper.data;
        }
        return responseWrapper.copy(str, moduleDataResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final ModuleDataResponse getData() {
        return this.data;
    }

    public final ResponseWrapper copy(String status, ModuleDataResponse data) {
        status.getClass();
        data.getClass();
        return new ResponseWrapper(status, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResponseWrapper)) {
            return false;
        }
        ResponseWrapper responseWrapper = (ResponseWrapper) other;
        if (Intrinsics.areEqual(this.status, responseWrapper.status) && Intrinsics.areEqual(this.data, responseWrapper.data)) {
            return true;
        }
        return false;
    }

    public final ModuleDataResponse getData() {
        return this.data;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.status.hashCode() * 31);
    }

    public String toString() {
        return "ResponseWrapper(status=" + this.status + ", data=" + this.data + ")";
    }
}
