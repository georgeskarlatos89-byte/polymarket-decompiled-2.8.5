package com.socure.docv.capturesdk.common.analytics.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ>\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "", "region", "", "faceDetected", "", "confidence", "", "rotatingAngle", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Float;)V", "getRegion", "()Ljava/lang/String;", "setRegion", "(Ljava/lang/String;)V", "getFaceDetected", "()Ljava/lang/Boolean;", "setFaceDetected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getConfidence", "()Ljava/lang/Double;", "setConfidence", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRotatingAngle", "()Ljava/lang/Float;", "setRotatingAngle", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Float;)Lcom/socure/docv/capturesdk/common/analytics/model/Face;", "equals", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Face {
    public static final int $stable = 8;
    private Double confidence;
    private Boolean faceDetected;
    private String region;
    private Float rotatingAngle;

    public /* synthetic */ Face(String str, Boolean bool, Double d, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : f);
    }

    public static /* synthetic */ Face copy$default(Face face, String str, Boolean bool, Double d, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = face.region;
        }
        if ((i & 2) != 0) {
            bool = face.faceDetected;
        }
        if ((i & 4) != 0) {
            d = face.confidence;
        }
        if ((i & 8) != 0) {
            f = face.rotatingAngle;
        }
        return face.copy(str, bool, d, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getFaceDetected() {
        return this.faceDetected;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getConfidence() {
        return this.confidence;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getRotatingAngle() {
        return this.rotatingAngle;
    }

    public final Face copy(String region, Boolean faceDetected, Double confidence, Float rotatingAngle) {
        return new Face(region, faceDetected, confidence, rotatingAngle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Face)) {
            return false;
        }
        Face face = (Face) other;
        if (Intrinsics.areEqual(this.region, face.region) && Intrinsics.areEqual(this.faceDetected, face.faceDetected) && Intrinsics.areEqual(this.confidence, face.confidence) && Intrinsics.areEqual(this.rotatingAngle, face.rotatingAngle)) {
            return true;
        }
        return false;
    }

    public final Double getConfidence() {
        return this.confidence;
    }

    public final Boolean getFaceDetected() {
        return this.faceDetected;
    }

    public final String getRegion() {
        return this.region;
    }

    public final Float getRotatingAngle() {
        return this.rotatingAngle;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.region;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.faceDetected;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Double d = this.confidence;
        if (d == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Float f = this.rotatingAngle;
        if (f != null) {
            i = f.hashCode();
        }
        return i4 + i;
    }

    public final void setConfidence(Double d) {
        this.confidence = d;
    }

    public final void setFaceDetected(Boolean bool) {
        this.faceDetected = bool;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setRotatingAngle(Float f) {
        this.rotatingAngle = f;
    }

    public String toString() {
        return "Face(region=" + this.region + ", faceDetected=" + this.faceDetected + ", confidence=" + this.confidence + ", rotatingAngle=" + this.rotatingAngle + ")";
    }

    public Face(String str, Boolean bool, Double d, Float f) {
        this.region = str;
        this.faceDetected = bool;
        this.confidence = d;
        this.rotatingAngle = f;
    }

    public Face() {
        this(null, null, null, null, 15, null);
    }
}
