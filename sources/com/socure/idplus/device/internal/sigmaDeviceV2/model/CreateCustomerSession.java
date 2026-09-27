package com.socure.idplus.device.internal.sigmaDeviceV2.model;

import com.google.gson.annotations.SerializedName;
import defpackage.sv6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/CreateCustomerSession;", "", "customerSessionId", "", "(Ljava/lang/String;)V", "getCustomerSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CreateCustomerSession {

    @SerializedName("customerSessionId")
    private final String customerSessionId;

    public CreateCustomerSession(String str) {
        str.getClass();
        this.customerSessionId = str;
    }

    public static /* synthetic */ CreateCustomerSession copy$default(CreateCustomerSession createCustomerSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCustomerSession.customerSessionId;
        }
        return createCustomerSession.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    public final CreateCustomerSession copy(String customerSessionId) {
        customerSessionId.getClass();
        return new CreateCustomerSession(customerSessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof CreateCustomerSession) && Intrinsics.areEqual(this.customerSessionId, ((CreateCustomerSession) other).customerSessionId)) {
            return true;
        }
        return false;
    }

    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    public int hashCode() {
        return this.customerSessionId.hashCode();
    }

    public String toString() {
        return sv6.n("CreateCustomerSession(customerSessionId=", this.customerSessionId, ")");
    }
}
