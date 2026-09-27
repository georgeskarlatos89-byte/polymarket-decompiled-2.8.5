package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import defpackage.woa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003Jb\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u00020\fHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00066"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "", "pitch", "", "yaw", "roll", "faceWidth", "", "faceHeight", "faceRatio", "", "displayText", "", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)V", "getPitch", "()Ljava/lang/Double;", "setPitch", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getYaw", "setYaw", "getRoll", "setRoll", "getFaceWidth", "()Ljava/lang/Integer;", "setFaceWidth", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getFaceHeight", "setFaceHeight", "getFaceRatio", "()Ljava/lang/Float;", "setFaceRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDisplayText", "()Ljava/lang/String;", "setDisplayText", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;)Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "equals", "", "other", "hashCode", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class SelfieMetrics {
    public static final int $stable = 8;
    private String displayText;
    private Integer faceHeight;
    private Float faceRatio;
    private Integer faceWidth;
    private Double pitch;
    private Double roll;
    private Double yaw;

    public /* synthetic */ SelfieMetrics(Double d, Double d2, Double d3, Integer num, Integer num2, Float f, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : str);
    }

    public static /* synthetic */ SelfieMetrics copy$default(SelfieMetrics selfieMetrics, Double d, Double d2, Double d3, Integer num, Integer num2, Float f, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = selfieMetrics.pitch;
        }
        if ((i & 2) != 0) {
            d2 = selfieMetrics.yaw;
        }
        if ((i & 4) != 0) {
            d3 = selfieMetrics.roll;
        }
        if ((i & 8) != 0) {
            num = selfieMetrics.faceWidth;
        }
        if ((i & 16) != 0) {
            num2 = selfieMetrics.faceHeight;
        }
        if ((i & 32) != 0) {
            f = selfieMetrics.faceRatio;
        }
        if ((i & 64) != 0) {
            str = selfieMetrics.displayText;
        }
        Float f2 = f;
        String str2 = str;
        Integer num3 = num2;
        Double d4 = d3;
        return selfieMetrics.copy(d, d2, d4, num, num3, f2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Double getPitch() {
        return this.pitch;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getYaw() {
        return this.yaw;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getRoll() {
        return this.roll;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getFaceWidth() {
        return this.faceWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getFaceHeight() {
        return this.faceHeight;
    }

    /* renamed from: component6, reason: from getter */
    public final Float getFaceRatio() {
        return this.faceRatio;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDisplayText() {
        return this.displayText;
    }

    public final SelfieMetrics copy(Double pitch, Double yaw, Double roll, Integer faceWidth, Integer faceHeight, Float faceRatio, String displayText) {
        return new SelfieMetrics(pitch, yaw, roll, faceWidth, faceHeight, faceRatio, displayText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfieMetrics)) {
            return false;
        }
        SelfieMetrics selfieMetrics = (SelfieMetrics) other;
        if (Intrinsics.areEqual(this.pitch, selfieMetrics.pitch) && Intrinsics.areEqual(this.yaw, selfieMetrics.yaw) && Intrinsics.areEqual(this.roll, selfieMetrics.roll) && Intrinsics.areEqual(this.faceWidth, selfieMetrics.faceWidth) && Intrinsics.areEqual(this.faceHeight, selfieMetrics.faceHeight) && Intrinsics.areEqual(this.faceRatio, selfieMetrics.faceRatio) && Intrinsics.areEqual(this.displayText, selfieMetrics.displayText)) {
            return true;
        }
        return false;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final Integer getFaceHeight() {
        return this.faceHeight;
    }

    public final Float getFaceRatio() {
        return this.faceRatio;
    }

    public final Integer getFaceWidth() {
        return this.faceWidth;
    }

    public final Double getPitch() {
        return this.pitch;
    }

    public final Double getRoll() {
        return this.roll;
    }

    public final Double getYaw() {
        return this.yaw;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        Double d = this.pitch;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = hashCode * 31;
        Double d2 = this.yaw;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d3 = this.roll;
        if (d3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num = this.faceWidth;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num2 = this.faceHeight;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Float f = this.faceRatio;
        if (f == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str = this.displayText;
        if (str != null) {
            i = str.hashCode();
        }
        return i7 + i;
    }

    public final void setDisplayText(String str) {
        this.displayText = str;
    }

    public final void setFaceHeight(Integer num) {
        this.faceHeight = num;
    }

    public final void setFaceRatio(Float f) {
        this.faceRatio = f;
    }

    public final void setFaceWidth(Integer num) {
        this.faceWidth = num;
    }

    public final void setPitch(Double d) {
        this.pitch = d;
    }

    public final void setRoll(Double d) {
        this.roll = d;
    }

    public final void setYaw(Double d) {
        this.yaw = d;
    }

    public String toString() {
        Double d = this.pitch;
        Double d2 = this.yaw;
        Double d3 = this.roll;
        Integer num = this.faceWidth;
        Integer num2 = this.faceHeight;
        Float f = this.faceRatio;
        String str = this.displayText;
        StringBuilder sb = new StringBuilder("SelfieMetrics(pitch=");
        sb.append(d);
        sb.append(", yaw=");
        sb.append(d2);
        sb.append(", roll=");
        sb.append(d3);
        sb.append(", faceWidth=");
        sb.append(num);
        sb.append(", faceHeight=");
        sb.append(num2);
        sb.append(", faceRatio=");
        sb.append(f);
        sb.append(", displayText=");
        return woa.r(sb, str, ")");
    }

    public SelfieMetrics(Double d, Double d2, Double d3, Integer num, Integer num2, Float f, String str) {
        this.pitch = d;
        this.yaw = d2;
        this.roll = d3;
        this.faceWidth = num;
        this.faceHeight = num2;
        this.faceRatio = f;
        this.displayText = str;
    }

    public SelfieMetrics() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
