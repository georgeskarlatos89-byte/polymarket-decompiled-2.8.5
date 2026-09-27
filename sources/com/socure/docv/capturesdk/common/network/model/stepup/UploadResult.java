package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "", "error", "", "errorCode", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "setErrorCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadResult;", "equals", "", "other", "hashCode", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class UploadResult {
    public static final int $stable = 8;
    private String error;
    private Integer errorCode;

    public UploadResult(String str, Integer num) {
        this.error = str;
        this.errorCode = num;
    }

    public static /* synthetic */ UploadResult copy$default(UploadResult uploadResult, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadResult.error;
        }
        if ((i & 2) != 0) {
            num = uploadResult.errorCode;
        }
        return uploadResult.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final UploadResult copy(String error, Integer errorCode) {
        return new UploadResult(error, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadResult)) {
            return false;
        }
        UploadResult uploadResult = (UploadResult) other;
        if (Intrinsics.areEqual(this.error, uploadResult.error) && Intrinsics.areEqual(this.errorCode, uploadResult.errorCode)) {
            return true;
        }
        return false;
    }

    public final String getError() {
        return this.error;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        int hashCode;
        String str = this.error;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.errorCode;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public String toString() {
        return "UploadResult(error=" + this.error + ", errorCode=" + this.errorCode + ")";
    }
}
