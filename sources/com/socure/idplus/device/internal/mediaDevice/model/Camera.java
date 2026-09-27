package com.socure.idplus.device.internal.mediaDevice.model;

import com.google.gson.annotations.SerializedName;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003Jt\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/Camera;", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", "position", "Lcom/socure/idplus/device/internal/mediaDevice/model/CameraPosition;", "type", "Lcom/socure/idplus/device/internal/mediaDevice/model/CameraType;", "resolution", "Lcom/socure/idplus/device/internal/mediaDevice/model/CameraResolution;", "frameRate", "", "focalLength", "", "", "sensorSize", "Lcom/socure/idplus/device/internal/mediaDevice/model/CameraSensorSize;", "associatedPhysicalCameraIds", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraPosition;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraType;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraResolution;Ljava/lang/Double;Ljava/util/List;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraSensorSize;Ljava/util/List;)V", "getAssociatedPhysicalCameraIds", "()Ljava/util/List;", "getFocalLength", "getFrameRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getId", "()Ljava/lang/String;", "getPosition", "()Lcom/socure/idplus/device/internal/mediaDevice/model/CameraPosition;", "getResolution", "()Lcom/socure/idplus/device/internal/mediaDevice/model/CameraResolution;", "getSensorSize", "()Lcom/socure/idplus/device/internal/mediaDevice/model/CameraSensorSize;", "getType", "()Lcom/socure/idplus/device/internal/mediaDevice/model/CameraType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraPosition;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraType;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraResolution;Ljava/lang/Double;Ljava/util/List;Lcom/socure/idplus/device/internal/mediaDevice/model/CameraSensorSize;Ljava/util/List;)Lcom/socure/idplus/device/internal/mediaDevice/model/Camera;", "equals", "", "other", "hashCode", "", "toString", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Camera {

    @SerializedName("associatedPhysicalCameraIds")
    private final List<String> associatedPhysicalCameraIds;

    @SerializedName("focalLength")
    private final List<Float> focalLength;

    @SerializedName("frameRate")
    private final Double frameRate;

    @SerializedName(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
    private final String id;

    @SerializedName("position")
    private final CameraPosition position;

    @SerializedName("resolution")
    private final CameraResolution resolution;

    @SerializedName("sensorSize")
    private final CameraSensorSize sensorSize;

    @SerializedName("type")
    private final CameraType type;

    public Camera(String str, CameraPosition cameraPosition, CameraType cameraType, CameraResolution cameraResolution, Double d, List<Float> list, CameraSensorSize cameraSensorSize, List<String> list2) {
        str.getClass();
        cameraPosition.getClass();
        cameraType.getClass();
        this.id = str;
        this.position = cameraPosition;
        this.type = cameraType;
        this.resolution = cameraResolution;
        this.frameRate = d;
        this.focalLength = list;
        this.sensorSize = cameraSensorSize;
        this.associatedPhysicalCameraIds = list2;
    }

    public static /* synthetic */ Camera copy$default(Camera camera, String str, CameraPosition cameraPosition, CameraType cameraType, CameraResolution cameraResolution, Double d, List list, CameraSensorSize cameraSensorSize, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = camera.id;
        }
        if ((i & 2) != 0) {
            cameraPosition = camera.position;
        }
        if ((i & 4) != 0) {
            cameraType = camera.type;
        }
        if ((i & 8) != 0) {
            cameraResolution = camera.resolution;
        }
        if ((i & 16) != 0) {
            d = camera.frameRate;
        }
        if ((i & 32) != 0) {
            list = camera.focalLength;
        }
        if ((i & 64) != 0) {
            cameraSensorSize = camera.sensorSize;
        }
        if ((i & 128) != 0) {
            list2 = camera.associatedPhysicalCameraIds;
        }
        CameraSensorSize cameraSensorSize2 = cameraSensorSize;
        List list3 = list2;
        Double d2 = d;
        List list4 = list;
        return camera.copy(str, cameraPosition, cameraType, cameraResolution, d2, list4, cameraSensorSize2, list3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final CameraPosition getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final CameraType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final CameraResolution getResolution() {
        return this.resolution;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getFrameRate() {
        return this.frameRate;
    }

    public final List<Float> component6() {
        return this.focalLength;
    }

    /* renamed from: component7, reason: from getter */
    public final CameraSensorSize getSensorSize() {
        return this.sensorSize;
    }

    public final List<String> component8() {
        return this.associatedPhysicalCameraIds;
    }

    public final Camera copy(String id, CameraPosition position, CameraType type, CameraResolution resolution, Double frameRate, List<Float> focalLength, CameraSensorSize sensorSize, List<String> associatedPhysicalCameraIds) {
        id.getClass();
        position.getClass();
        type.getClass();
        return new Camera(id, position, type, resolution, frameRate, focalLength, sensorSize, associatedPhysicalCameraIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Camera)) {
            return false;
        }
        Camera camera = (Camera) other;
        if (Intrinsics.areEqual(this.id, camera.id) && this.position == camera.position && this.type == camera.type && Intrinsics.areEqual(this.resolution, camera.resolution) && Intrinsics.areEqual(this.frameRate, camera.frameRate) && Intrinsics.areEqual(this.focalLength, camera.focalLength) && Intrinsics.areEqual(this.sensorSize, camera.sensorSize) && Intrinsics.areEqual(this.associatedPhysicalCameraIds, camera.associatedPhysicalCameraIds)) {
            return true;
        }
        return false;
    }

    public final List<String> getAssociatedPhysicalCameraIds() {
        return this.associatedPhysicalCameraIds;
    }

    public final List<Float> getFocalLength() {
        return this.focalLength;
    }

    public final Double getFrameRate() {
        return this.frameRate;
    }

    public final String getId() {
        return this.id;
    }

    public final CameraPosition getPosition() {
        return this.position;
    }

    public final CameraResolution getResolution() {
        return this.resolution;
    }

    public final CameraSensorSize getSensorSize() {
        return this.sensorSize;
    }

    public final CameraType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.type.hashCode() + ((this.position.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
        CameraResolution cameraResolution = this.resolution;
        int i = 0;
        if (cameraResolution == null) {
            hashCode = 0;
        } else {
            hashCode = cameraResolution.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        Double d = this.frameRate;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<Float> list = this.focalLength;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        CameraSensorSize cameraSensorSize = this.sensorSize;
        if (cameraSensorSize == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cameraSensorSize.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List<String> list2 = this.associatedPhysicalCameraIds;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "Camera(id=" + this.id + ", position=" + this.position + ", type=" + this.type + ", resolution=" + this.resolution + ", frameRate=" + this.frameRate + ", focalLength=" + this.focalLength + ", sensorSize=" + this.sensorSize + ", associatedPhysicalCameraIds=" + this.associatedPhysicalCameraIds + ")";
    }
}
