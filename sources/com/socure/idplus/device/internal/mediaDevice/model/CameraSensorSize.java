package com.socure.idplus.device.internal.mediaDevice.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/socure/idplus/device/internal/mediaDevice/model/CameraSensorSize;", "", "width", "", "height", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getWidth", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/socure/idplus/device/internal/mediaDevice/model/CameraSensorSize;", "equals", "", "other", "hashCode", "", "toString", "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CameraSensorSize {

    @SerializedName("height")
    private final Float height;

    @SerializedName("width")
    private final Float width;

    public CameraSensorSize(Float f, Float f2) {
        this.width = f;
        this.height = f2;
    }

    public static /* synthetic */ CameraSensorSize copy$default(CameraSensorSize cameraSensorSize, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = cameraSensorSize.width;
        }
        if ((i & 2) != 0) {
            f2 = cameraSensorSize.height;
        }
        return cameraSensorSize.copy(f, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final Float getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    public final CameraSensorSize copy(Float width, Float height) {
        return new CameraSensorSize(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraSensorSize)) {
            return false;
        }
        CameraSensorSize cameraSensorSize = (CameraSensorSize) other;
        if (Intrinsics.areEqual(this.width, cameraSensorSize.width) && Intrinsics.areEqual(this.height, cameraSensorSize.height)) {
            return true;
        }
        return false;
    }

    public final Float getHeight() {
        return this.height;
    }

    public final Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        Float f = this.width;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = hashCode * 31;
        Float f2 = this.height;
        if (f2 != null) {
            i = f2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "CameraSensorSize(width=" + this.width + ", height=" + this.height + ")";
    }
}
