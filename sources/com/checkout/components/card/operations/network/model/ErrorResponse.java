package com.checkout.components.card.operations.network.model;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ix2;
import defpackage.m51;
import defpackage.mda;
import defpackage.zca;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "", "", "requestId", "errorType", "", "errorCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "a", "Ljava/lang/String;", "getRequestId", "()Ljava/lang/String;", "getRequestId$annotations", "()V", "b", "getErrorType", "getErrorType$annotations", "c", "Ljava/util/List;", "getErrorCodes", "()Ljava/util/List;", "getErrorCodes$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class ErrorResponse {

    /* renamed from: a, reason: from kotlin metadata */
    public final String requestId;

    /* renamed from: b, reason: from kotlin metadata */
    public final String errorType;

    /* renamed from: c, reason: from kotlin metadata */
    public final List errorCodes;

    public ErrorResponse(@zca(name = "request_id") String str, @zca(name = "error_type") String str2, @zca(name = "error_codes") List<String> list) {
        this.requestId = str;
        this.errorType = str2;
        this.errorCodes = list;
    }

    public final ErrorResponse copy(@zca(name = "request_id") String requestId, @zca(name = "error_type") String errorType, @zca(name = "error_codes") List<String> errorCodes) {
        return new ErrorResponse(requestId, errorType, errorCodes);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        if (Intrinsics.areEqual(this.requestId, errorResponse.requestId) && Intrinsics.areEqual(this.errorType, errorResponse.errorType) && Intrinsics.areEqual(this.errorCodes, errorResponse.errorCodes)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.requestId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.errorType;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.errorCodes;
        if (list != null) {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        return ix2.q(m51.r("ErrorResponse(requestId=", this.requestId, ", errorType=", this.errorType, ", errorCodes="), this.errorCodes, ")");
    }

    @zca(name = "error_codes")
    public static /* synthetic */ void getErrorCodes$annotations() {
    }

    @zca(name = "error_type")
    public static /* synthetic */ void getErrorType$annotations() {
    }

    @zca(name = "request_id")
    public static /* synthetic */ void getRequestId$annotations() {
    }
}
