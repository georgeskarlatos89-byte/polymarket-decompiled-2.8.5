package com.socure.idplus.device.internal.sigmaDeviceConfig.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Device;", "", "host", "", "flags", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsDevice;", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsDevice;)V", "getFlags", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsDevice;", "setFlags", "(Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsDevice;)V", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Device {

    @SerializedName("flags")
    private FlagsDevice flags;

    @SerializedName("host")
    private String host;

    public /* synthetic */ Device(String str, FlagsDevice flagsDevice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new FlagsDevice(false, false, 3, null) : flagsDevice);
    }

    public static /* synthetic */ Device copy$default(Device device, String str, FlagsDevice flagsDevice, int i, Object obj) {
        if ((i & 1) != 0) {
            str = device.host;
        }
        if ((i & 2) != 0) {
            flagsDevice = device.flags;
        }
        return device.copy(str, flagsDevice);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: component2, reason: from getter */
    public final FlagsDevice getFlags() {
        return this.flags;
    }

    public final Device copy(String host, FlagsDevice flags) {
        host.getClass();
        flags.getClass();
        return new Device(host, flags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Device)) {
            return false;
        }
        Device device = (Device) other;
        if (Intrinsics.areEqual(this.host, device.host) && Intrinsics.areEqual(this.flags, device.flags)) {
            return true;
        }
        return false;
    }

    public final FlagsDevice getFlags() {
        return this.flags;
    }

    public final String getHost() {
        return this.host;
    }

    public int hashCode() {
        return this.flags.hashCode() + (this.host.hashCode() * 31);
    }

    public final void setFlags(FlagsDevice flagsDevice) {
        flagsDevice.getClass();
        this.flags = flagsDevice;
    }

    public final void setHost(String str) {
        str.getClass();
        this.host = str;
    }

    public String toString() {
        return "Device(host=" + this.host + ", flags=" + this.flags + ")";
    }

    public Device(String str, FlagsDevice flagsDevice) {
        str.getClass();
        flagsDevice.getClass();
        this.host = str;
        this.flags = flagsDevice;
    }
}
