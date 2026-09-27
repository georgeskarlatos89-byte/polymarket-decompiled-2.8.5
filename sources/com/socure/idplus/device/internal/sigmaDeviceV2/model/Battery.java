package com.socure.idplus.device.internal.sigmaDeviceV2.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/Battery;", "", "batteryState", "", "batteryLevel", "", "(Ljava/lang/String;Ljava/lang/Double;)V", "getBatteryLevel", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getBatteryState", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Double;)Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/Battery;", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Battery {

    @SerializedName("batteryLevel")
    private final Double batteryLevel;

    @SerializedName("batteryState")
    private final String batteryState;

    public Battery(String str, Double d) {
        str.getClass();
        this.batteryState = str;
        this.batteryLevel = d;
    }

    public static /* synthetic */ Battery copy$default(Battery battery, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = battery.batteryState;
        }
        if ((i & 2) != 0) {
            d = battery.batteryLevel;
        }
        return battery.copy(str, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBatteryState() {
        return this.batteryState;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final Battery copy(String batteryState, Double batteryLevel) {
        batteryState.getClass();
        return new Battery(batteryState, batteryLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Battery)) {
            return false;
        }
        Battery battery = (Battery) other;
        if (Intrinsics.areEqual(this.batteryState, battery.batteryState) && Intrinsics.areEqual(this.batteryLevel, battery.batteryLevel)) {
            return true;
        }
        return false;
    }

    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getBatteryState() {
        return this.batteryState;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.batteryState.hashCode() * 31;
        Double d = this.batteryLevel;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "Battery(batteryState=" + this.batteryState + ", batteryLevel=" + this.batteryLevel + ")";
    }

    public /* synthetic */ Battery(String str, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : d);
    }
}
