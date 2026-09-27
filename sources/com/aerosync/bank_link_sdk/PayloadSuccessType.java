package com.aerosync.bank_link_sdk;

import defpackage.hdi;
import defpackage.m51;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/aerosync/bank_link_sdk/PayloadSuccessType;", "", "user_id", "", "user_password", "ClientName", "FILoginAcctId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientName", "()Ljava/lang/String;", "getFILoginAcctId", "getUser_id", "getUser_password", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "bank-link-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PayloadSuccessType {
    private final String ClientName;
    private final String FILoginAcctId;
    private final String user_id;
    private final String user_password;

    public PayloadSuccessType(String str, String str2, String str3, String str4) {
        woa.A(str, str2, str3, str4);
        this.user_id = str;
        this.user_password = str2;
        this.ClientName = str3;
        this.FILoginAcctId = str4;
    }

    public static /* synthetic */ PayloadSuccessType copy$default(PayloadSuccessType payloadSuccessType, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payloadSuccessType.user_id;
        }
        if ((i & 2) != 0) {
            str2 = payloadSuccessType.user_password;
        }
        if ((i & 4) != 0) {
            str3 = payloadSuccessType.ClientName;
        }
        if ((i & 8) != 0) {
            str4 = payloadSuccessType.FILoginAcctId;
        }
        return payloadSuccessType.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUser_password() {
        return this.user_password;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientName() {
        return this.ClientName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFILoginAcctId() {
        return this.FILoginAcctId;
    }

    public final PayloadSuccessType copy(String user_id, String user_password, String ClientName, String FILoginAcctId) {
        user_id.getClass();
        user_password.getClass();
        ClientName.getClass();
        FILoginAcctId.getClass();
        return new PayloadSuccessType(user_id, user_password, ClientName, FILoginAcctId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadSuccessType)) {
            return false;
        }
        PayloadSuccessType payloadSuccessType = (PayloadSuccessType) other;
        if (Intrinsics.areEqual(this.user_id, payloadSuccessType.user_id) && Intrinsics.areEqual(this.user_password, payloadSuccessType.user_password) && Intrinsics.areEqual(this.ClientName, payloadSuccessType.ClientName) && Intrinsics.areEqual(this.FILoginAcctId, payloadSuccessType.FILoginAcctId)) {
            return true;
        }
        return false;
    }

    public final String getClientName() {
        return this.ClientName;
    }

    public final String getFILoginAcctId() {
        return this.FILoginAcctId;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getUser_password() {
        return this.user_password;
    }

    public int hashCode() {
        return this.FILoginAcctId.hashCode() + hdi.e(hdi.e(this.user_id.hashCode() * 31, 31, this.user_password), 31, this.ClientName);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PayloadSuccessType(user_id=");
        sb.append(this.user_id);
        sb.append(", user_password=");
        sb.append(this.user_password);
        sb.append(", ClientName=");
        sb.append(this.ClientName);
        sb.append(", FILoginAcctId=");
        return m51.m(sb, this.FILoginAcctId, ')');
    }
}
