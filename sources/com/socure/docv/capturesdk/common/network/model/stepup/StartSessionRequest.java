package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/StartSessionRequest;", "", "deviceSettings", "Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSettingsRequest;", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSettingsRequest;)V", "getDeviceSettings", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSettingsRequest;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class StartSessionRequest {
    public static final int $stable = 8;
    private final DeviceSettingsRequest deviceSettings;

    public StartSessionRequest(DeviceSettingsRequest deviceSettingsRequest) {
        deviceSettingsRequest.getClass();
        this.deviceSettings = deviceSettingsRequest;
    }

    public static /* synthetic */ StartSessionRequest copy$default(StartSessionRequest startSessionRequest, DeviceSettingsRequest deviceSettingsRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceSettingsRequest = startSessionRequest.deviceSettings;
        }
        return startSessionRequest.copy(deviceSettingsRequest);
    }

    /* renamed from: component1, reason: from getter */
    public final DeviceSettingsRequest getDeviceSettings() {
        return this.deviceSettings;
    }

    public final StartSessionRequest copy(DeviceSettingsRequest deviceSettings) {
        deviceSettings.getClass();
        return new StartSessionRequest(deviceSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof StartSessionRequest) && Intrinsics.areEqual(this.deviceSettings, ((StartSessionRequest) other).deviceSettings)) {
            return true;
        }
        return false;
    }

    public final DeviceSettingsRequest getDeviceSettings() {
        return this.deviceSettings;
    }

    public int hashCode() {
        return this.deviceSettings.hashCode();
    }

    public String toString() {
        return "StartSessionRequest(deviceSettings=" + this.deviceSettings + ")";
    }
}
