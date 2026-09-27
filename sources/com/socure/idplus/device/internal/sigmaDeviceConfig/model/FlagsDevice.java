package com.socure.idplus.device.internal.sigmaDeviceConfig.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsDevice;", "", "enableFullPrecisionLocation", "", "enableSilentNetworkAuth", "(ZZ)V", "getEnableFullPrecisionLocation", "()Z", "getEnableSilentNetworkAuth", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FlagsDevice {

    @SerializedName("enableFullPrecisionLocation")
    private final boolean enableFullPrecisionLocation;

    @SerializedName("enableSilentNetworkAuth")
    private final boolean enableSilentNetworkAuth;

    public /* synthetic */ FlagsDevice(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ FlagsDevice copy$default(FlagsDevice flagsDevice, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = flagsDevice.enableFullPrecisionLocation;
        }
        if ((i & 2) != 0) {
            z2 = flagsDevice.enableSilentNetworkAuth;
        }
        return flagsDevice.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableFullPrecisionLocation() {
        return this.enableFullPrecisionLocation;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableSilentNetworkAuth() {
        return this.enableSilentNetworkAuth;
    }

    public final FlagsDevice copy(boolean enableFullPrecisionLocation, boolean enableSilentNetworkAuth) {
        return new FlagsDevice(enableFullPrecisionLocation, enableSilentNetworkAuth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlagsDevice)) {
            return false;
        }
        FlagsDevice flagsDevice = (FlagsDevice) other;
        if (this.enableFullPrecisionLocation == flagsDevice.enableFullPrecisionLocation && this.enableSilentNetworkAuth == flagsDevice.enableSilentNetworkAuth) {
            return true;
        }
        return false;
    }

    public final boolean getEnableFullPrecisionLocation() {
        return this.enableFullPrecisionLocation;
    }

    public final boolean getEnableSilentNetworkAuth() {
        return this.enableSilentNetworkAuth;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableSilentNetworkAuth) + (Boolean.hashCode(this.enableFullPrecisionLocation) * 31);
    }

    public String toString() {
        return "FlagsDevice(enableFullPrecisionLocation=" + this.enableFullPrecisionLocation + ", enableSilentNetworkAuth=" + this.enableSilentNetworkAuth + ")";
    }

    public FlagsDevice(boolean z, boolean z2) {
        this.enableFullPrecisionLocation = z;
        this.enableSilentNetworkAuth = z2;
    }

    public FlagsDevice() {
        this(false, false, 3, null);
    }
}
