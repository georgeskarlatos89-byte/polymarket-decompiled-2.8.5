package com.socure.docv.capturesdk.common.analytics.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010$\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jc\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R2\u0010\u0004\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012¨\u00060"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Capabilities;", "", "frameRate", "Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "facingMode", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "width", "aspectRatio", "Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;", "deviceId", "height", "<init>", "(Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;Ljava/util/ArrayList;Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;)V", "getFrameRate", "()Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;", "setFrameRate", "(Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxInt;)V", "getFacingMode", "()Ljava/util/ArrayList;", "setFacingMode", "(Ljava/util/ArrayList;)V", "getWidth", "setWidth", "getAspectRatio", "()Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;", "setAspectRatio", "(Lcom/socure/docv/capturesdk/common/analytics/model/MinMaxDouble;)V", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getHeight", "setHeight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Capabilities {
    public static final int $stable = 8;
    private MinMaxDouble aspectRatio;
    private String deviceId;
    private ArrayList<String> facingMode;
    private MinMaxInt frameRate;
    private MinMaxInt height;
    private MinMaxInt width;

    public /* synthetic */ Capabilities(MinMaxInt minMaxInt, ArrayList arrayList, MinMaxInt minMaxInt2, MinMaxDouble minMaxDouble, String str, MinMaxInt minMaxInt3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : minMaxInt, (i & 2) != 0 ? null : arrayList, minMaxInt2, (i & 8) != 0 ? null : minMaxDouble, (i & 16) != 0 ? null : str, minMaxInt3);
    }

    public static /* synthetic */ Capabilities copy$default(Capabilities capabilities, MinMaxInt minMaxInt, ArrayList arrayList, MinMaxInt minMaxInt2, MinMaxDouble minMaxDouble, String str, MinMaxInt minMaxInt3, int i, Object obj) {
        if ((i & 1) != 0) {
            minMaxInt = capabilities.frameRate;
        }
        if ((i & 2) != 0) {
            arrayList = capabilities.facingMode;
        }
        if ((i & 4) != 0) {
            minMaxInt2 = capabilities.width;
        }
        if ((i & 8) != 0) {
            minMaxDouble = capabilities.aspectRatio;
        }
        if ((i & 16) != 0) {
            str = capabilities.deviceId;
        }
        if ((i & 32) != 0) {
            minMaxInt3 = capabilities.height;
        }
        String str2 = str;
        MinMaxInt minMaxInt4 = minMaxInt3;
        return capabilities.copy(minMaxInt, arrayList, minMaxInt2, minMaxDouble, str2, minMaxInt4);
    }

    /* renamed from: component1, reason: from getter */
    public final MinMaxInt getFrameRate() {
        return this.frameRate;
    }

    public final ArrayList<String> component2() {
        return this.facingMode;
    }

    /* renamed from: component3, reason: from getter */
    public final MinMaxInt getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final MinMaxDouble getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final MinMaxInt getHeight() {
        return this.height;
    }

    public final Capabilities copy(MinMaxInt frameRate, ArrayList<String> facingMode, MinMaxInt width, MinMaxDouble aspectRatio, String deviceId, MinMaxInt height) {
        width.getClass();
        height.getClass();
        return new Capabilities(frameRate, facingMode, width, aspectRatio, deviceId, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Capabilities)) {
            return false;
        }
        Capabilities capabilities = (Capabilities) other;
        if (Intrinsics.areEqual(this.frameRate, capabilities.frameRate) && Intrinsics.areEqual(this.facingMode, capabilities.facingMode) && Intrinsics.areEqual(this.width, capabilities.width) && Intrinsics.areEqual(this.aspectRatio, capabilities.aspectRatio) && Intrinsics.areEqual(this.deviceId, capabilities.deviceId) && Intrinsics.areEqual(this.height, capabilities.height)) {
            return true;
        }
        return false;
    }

    public final MinMaxDouble getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final ArrayList<String> getFacingMode() {
        return this.facingMode;
    }

    public final MinMaxInt getFrameRate() {
        return this.frameRate;
    }

    public final MinMaxInt getHeight() {
        return this.height;
    }

    public final MinMaxInt getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        MinMaxInt minMaxInt = this.frameRate;
        int i = 0;
        if (minMaxInt == null) {
            hashCode = 0;
        } else {
            hashCode = minMaxInt.hashCode();
        }
        int i2 = hashCode * 31;
        ArrayList<String> arrayList = this.facingMode;
        if (arrayList == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = arrayList.hashCode();
        }
        int hashCode4 = (this.width.hashCode() + ((i2 + hashCode2) * 31)) * 31;
        MinMaxDouble minMaxDouble = this.aspectRatio;
        if (minMaxDouble == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = minMaxDouble.hashCode();
        }
        int i3 = (hashCode4 + hashCode3) * 31;
        String str = this.deviceId;
        if (str != null) {
            i = str.hashCode();
        }
        return this.height.hashCode() + ((i3 + i) * 31);
    }

    public final void setAspectRatio(MinMaxDouble minMaxDouble) {
        this.aspectRatio = minMaxDouble;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setFacingMode(ArrayList<String> arrayList) {
        this.facingMode = arrayList;
    }

    public final void setFrameRate(MinMaxInt minMaxInt) {
        this.frameRate = minMaxInt;
    }

    public final void setHeight(MinMaxInt minMaxInt) {
        minMaxInt.getClass();
        this.height = minMaxInt;
    }

    public final void setWidth(MinMaxInt minMaxInt) {
        minMaxInt.getClass();
        this.width = minMaxInt;
    }

    public String toString() {
        return "Capabilities(frameRate=" + this.frameRate + ", facingMode=" + this.facingMode + ", width=" + this.width + ", aspectRatio=" + this.aspectRatio + ", deviceId=" + this.deviceId + ", height=" + this.height + ")";
    }

    public Capabilities(MinMaxInt minMaxInt, ArrayList<String> arrayList, MinMaxInt minMaxInt2, MinMaxDouble minMaxDouble, String str, MinMaxInt minMaxInt3) {
        minMaxInt2.getClass();
        minMaxInt3.getClass();
        this.frameRate = minMaxInt;
        this.facingMode = arrayList;
        this.width = minMaxInt2;
        this.aspectRatio = minMaxDouble;
        this.deviceId = str;
        this.height = minMaxInt3;
    }
}
