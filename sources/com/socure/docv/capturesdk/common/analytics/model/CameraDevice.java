package com.socure.docv.capturesdk.common.analytics.model;

import defpackage.k84;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003JA\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006("}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/CameraDevice;", "", "settings", "Lcom/socure/docv/capturesdk/common/analytics/model/Settings;", "capabilities", "Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;", "label", "", "deviceId", "modelID", "<init>", "(Lcom/socure/docv/capturesdk/common/analytics/model/Settings;Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSettings", "()Lcom/socure/docv/capturesdk/common/analytics/model/Settings;", "setSettings", "(Lcom/socure/docv/capturesdk/common/analytics/model/Settings;)V", "getCapabilities", "()Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;", "setCapabilities", "(Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;)V", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getModelID", "setModelID", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CameraDevice {
    public static final int $stable = 8;
    private Capabilities capabilities;
    private String deviceId;
    private String label;
    private String modelID;
    private Settings settings;

    public /* synthetic */ CameraDevice(Settings settings, Capabilities capabilities, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : settings, capabilities, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ CameraDevice copy$default(CameraDevice cameraDevice, Settings settings, Capabilities capabilities, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            settings = cameraDevice.settings;
        }
        if ((i & 2) != 0) {
            capabilities = cameraDevice.capabilities;
        }
        if ((i & 4) != 0) {
            str = cameraDevice.label;
        }
        if ((i & 8) != 0) {
            str2 = cameraDevice.deviceId;
        }
        if ((i & 16) != 0) {
            str3 = cameraDevice.modelID;
        }
        String str4 = str3;
        String str5 = str;
        return cameraDevice.copy(settings, capabilities, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    /* renamed from: component2, reason: from getter */
    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getModelID() {
        return this.modelID;
    }

    public final CameraDevice copy(Settings settings, Capabilities capabilities, String label, String deviceId, String modelID) {
        capabilities.getClass();
        label.getClass();
        return new CameraDevice(settings, capabilities, label, deviceId, modelID);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraDevice)) {
            return false;
        }
        CameraDevice cameraDevice = (CameraDevice) other;
        if (Intrinsics.areEqual(this.settings, cameraDevice.settings) && Intrinsics.areEqual(this.capabilities, cameraDevice.capabilities) && Intrinsics.areEqual(this.label, cameraDevice.label) && Intrinsics.areEqual(this.deviceId, cameraDevice.deviceId) && Intrinsics.areEqual(this.modelID, cameraDevice.modelID)) {
            return true;
        }
        return false;
    }

    public final Capabilities getCapabilities() {
        return this.capabilities;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getModelID() {
        return this.modelID;
    }

    public final Settings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Settings settings = this.settings;
        int i = 0;
        if (settings == null) {
            hashCode = 0;
        } else {
            hashCode = settings.hashCode();
        }
        int a = com.socure.docv.capturesdk.api.a.a(this.label, (this.capabilities.hashCode() + (hashCode * 31)) * 31, 31);
        String str = this.deviceId;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (a + hashCode2) * 31;
        String str2 = this.modelID;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final void setCapabilities(Capabilities capabilities) {
        capabilities.getClass();
        this.capabilities = capabilities;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setLabel(String str) {
        str.getClass();
        this.label = str;
    }

    public final void setModelID(String str) {
        this.modelID = str;
    }

    public final void setSettings(Settings settings) {
        this.settings = settings;
    }

    public String toString() {
        Settings settings = this.settings;
        Capabilities capabilities = this.capabilities;
        String str = this.label;
        String str2 = this.deviceId;
        String str3 = this.modelID;
        StringBuilder sb = new StringBuilder("CameraDevice(settings=");
        sb.append(settings);
        sb.append(", capabilities=");
        sb.append(capabilities);
        sb.append(", label=");
        k84.q(sb, str, ", deviceId=", str2, ", modelID=");
        return woa.r(sb, str3, ")");
    }

    public CameraDevice(Settings settings, Capabilities capabilities, String str, String str2, String str3) {
        capabilities.getClass();
        str.getClass();
        this.settings = settings;
        this.capabilities = capabilities;
        this.label = str;
        this.deviceId = str2;
        this.modelID = str3;
    }
}
