package com.socure.idplus.device;

import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.hdi;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJR\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010\r¨\u0006-"}, d2 = {"Lcom/socure/idplus/device/SigmaDeviceOptions;", "", "", "omitLocationData", "", "advertisingID", "useSocureGov", "configBaseUrl", "customerSessionId", "disableNavigationContextTracking", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Lcom/socure/idplus/device/SigmaDeviceOptions;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getOmitLocationData", "b", "Ljava/lang/String;", "getAdvertisingID", "c", "getUseSocureGov", d.d, "getConfigBaseUrl", "e", "getCustomerSessionId", "setCustomerSessionId", "(Ljava/lang/String;)V", "f", "getDisableNavigationContextTracking", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SigmaDeviceOptions {

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean omitLocationData;

    /* renamed from: b, reason: from kotlin metadata */
    public final String advertisingID;

    /* renamed from: c, reason: from kotlin metadata */
    public final boolean useSocureGov;

    /* renamed from: d, reason: from kotlin metadata */
    public final String configBaseUrl;

    /* renamed from: e, reason: from kotlin metadata */
    public String customerSessionId;

    /* renamed from: f, reason: from kotlin metadata */
    public final boolean disableNavigationContextTracking;

    public /* synthetic */ SigmaDeviceOptions(boolean z, String str, boolean z2, String str2, String str3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3);
    }

    public static /* synthetic */ SigmaDeviceOptions copy$default(SigmaDeviceOptions sigmaDeviceOptions, boolean z, String str, boolean z2, String str2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sigmaDeviceOptions.omitLocationData;
        }
        if ((i & 2) != 0) {
            str = sigmaDeviceOptions.advertisingID;
        }
        if ((i & 4) != 0) {
            z2 = sigmaDeviceOptions.useSocureGov;
        }
        if ((i & 8) != 0) {
            str2 = sigmaDeviceOptions.configBaseUrl;
        }
        if ((i & 16) != 0) {
            str3 = sigmaDeviceOptions.customerSessionId;
        }
        if ((i & 32) != 0) {
            z3 = sigmaDeviceOptions.disableNavigationContextTracking;
        }
        String str4 = str3;
        boolean z4 = z3;
        return sigmaDeviceOptions.copy(z, str, z2, str2, str4, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getOmitLocationData() {
        return this.omitLocationData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdvertisingID() {
        return this.advertisingID;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseSocureGov() {
        return this.useSocureGov;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConfigBaseUrl() {
        return this.configBaseUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisableNavigationContextTracking() {
        return this.disableNavigationContextTracking;
    }

    public final SigmaDeviceOptions copy(boolean omitLocationData, String advertisingID, boolean useSocureGov, String configBaseUrl, String customerSessionId, boolean disableNavigationContextTracking) {
        return new SigmaDeviceOptions(omitLocationData, advertisingID, useSocureGov, configBaseUrl, customerSessionId, disableNavigationContextTracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SigmaDeviceOptions)) {
            return false;
        }
        SigmaDeviceOptions sigmaDeviceOptions = (SigmaDeviceOptions) other;
        if (this.omitLocationData == sigmaDeviceOptions.omitLocationData && Intrinsics.areEqual(this.advertisingID, sigmaDeviceOptions.advertisingID) && this.useSocureGov == sigmaDeviceOptions.useSocureGov && Intrinsics.areEqual(this.configBaseUrl, sigmaDeviceOptions.configBaseUrl) && Intrinsics.areEqual(this.customerSessionId, sigmaDeviceOptions.customerSessionId) && this.disableNavigationContextTracking == sigmaDeviceOptions.disableNavigationContextTracking) {
            return true;
        }
        return false;
    }

    public final String getAdvertisingID() {
        return this.advertisingID;
    }

    public final String getConfigBaseUrl() {
        return this.configBaseUrl;
    }

    public final String getCustomerSessionId() {
        return this.customerSessionId;
    }

    public final boolean getDisableNavigationContextTracking() {
        return this.disableNavigationContextTracking;
    }

    public final boolean getOmitLocationData() {
        return this.omitLocationData;
    }

    public final boolean getUseSocureGov() {
        return this.useSocureGov;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.omitLocationData) * 31;
        String str = this.advertisingID;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g = hdi.g((hashCode3 + hashCode) * 31, 31, this.useSocureGov);
        String str2 = this.configBaseUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (g + hashCode2) * 31;
        String str3 = this.customerSessionId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Boolean.hashCode(this.disableNavigationContextTracking) + ((i2 + i) * 31);
    }

    public final void setCustomerSessionId(String str) {
        this.customerSessionId = str;
    }

    public String toString() {
        boolean z = this.omitLocationData;
        String str = this.advertisingID;
        boolean z2 = this.useSocureGov;
        String str2 = this.configBaseUrl;
        String str3 = this.customerSessionId;
        boolean z3 = this.disableNavigationContextTracking;
        StringBuilder sb = new StringBuilder("SigmaDeviceOptions(omitLocationData=");
        sb.append(z);
        sb.append(", advertisingID=");
        sb.append(str);
        sb.append(", useSocureGov=");
        m51.y(", configBaseUrl=", str2, ", customerSessionId=", sb, z2);
        sb.append(str3);
        sb.append(", disableNavigationContextTracking=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public SigmaDeviceOptions(boolean z, String str, boolean z2, String str2, String str3, boolean z3) {
        this.omitLocationData = z;
        this.advertisingID = str;
        this.useSocureGov = z2;
        this.configBaseUrl = str2;
        this.customerSessionId = str3;
        this.disableNavigationContextTracking = z3;
    }

    public SigmaDeviceOptions() {
        this(false, null, false, null, null, false, 63, null);
    }
}
