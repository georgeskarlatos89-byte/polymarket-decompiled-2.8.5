package com.socure.idplus.device.internal.mediaDevice.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/CameraResolution;", "", "width", "", "height", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/socure/idplus/device/internal/mediaDevice/model/CameraResolution;", "equals", "", "other", "hashCode", "toString", "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CameraResolution {

    @SerializedName("height")
    private final Integer height;

    @SerializedName("width")
    private final Integer width;

    public CameraResolution(Integer num, Integer num2) {
        this.width = num;
        this.height = num2;
    }

    public static /* synthetic */ CameraResolution copy$default(CameraResolution cameraResolution, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = cameraResolution.width;
        }
        if ((i & 2) != 0) {
            num2 = cameraResolution.height;
        }
        return cameraResolution.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    public final CameraResolution copy(Integer width, Integer height) {
        return new CameraResolution(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraResolution)) {
            return false;
        }
        CameraResolution cameraResolution = (CameraResolution) other;
        if (Intrinsics.areEqual(this.width, cameraResolution.width) && Intrinsics.areEqual(this.height, cameraResolution.height)) {
            return true;
        }
        return false;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.width;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "CameraResolution(width=" + this.width + ", height=" + this.height + ")";
    }
}
