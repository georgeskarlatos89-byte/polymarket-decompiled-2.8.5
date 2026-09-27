package com.socure.idplus.device.internal.sigmaDeviceConfig.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/Network;", "", "flags", "Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsNetwork;", "host", "", "(Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsNetwork;Ljava/lang/String;)V", "getFlags", "()Lcom/socure/idplus/device/internal/sigmaDeviceConfig/model/FlagsNetwork;", "getHost", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Network {

    @SerializedName("flags")
    private final FlagsNetwork flags;

    @SerializedName("host")
    private final String host;

    public Network(FlagsNetwork flagsNetwork, String str) {
        flagsNetwork.getClass();
        str.getClass();
        this.flags = flagsNetwork;
        this.host = str;
    }

    public static /* synthetic */ Network copy$default(Network network, FlagsNetwork flagsNetwork, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            flagsNetwork = network.flags;
        }
        if ((i & 2) != 0) {
            str = network.host;
        }
        return network.copy(flagsNetwork, str);
    }

    /* renamed from: component1, reason: from getter */
    public final FlagsNetwork getFlags() {
        return this.flags;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    public final Network copy(FlagsNetwork flags, String host) {
        flags.getClass();
        host.getClass();
        return new Network(flags, host);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Network)) {
            return false;
        }
        Network network = (Network) other;
        if (Intrinsics.areEqual(this.flags, network.flags) && Intrinsics.areEqual(this.host, network.host)) {
            return true;
        }
        return false;
    }

    public final FlagsNetwork getFlags() {
        return this.flags;
    }

    public final String getHost() {
        return this.host;
    }

    public int hashCode() {
        return this.host.hashCode() + (this.flags.hashCode() * 31);
    }

    public String toString() {
        return "Network(flags=" + this.flags + ", host=" + this.host + ")";
    }
}
