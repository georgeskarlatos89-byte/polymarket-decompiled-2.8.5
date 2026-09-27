package com.socure.docv.capturesdk.feature.scanner.data;

import com.socure.docv.capturesdk.common.network.model.stepup.c;
import defpackage.m51;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBoxConstraintData;", "", "dimensionRatio", "", "guidingBoxBgId", "", "width", "matchConstraintPercentWidth", "", "guidingBoxBgCapturingId", "guidingBoxBgCapturedId", "<init>", "(Ljava/lang/String;IILjava/lang/Float;II)V", "getDimensionRatio", "()Ljava/lang/String;", "getGuidingBoxBgId", "()I", "getWidth", "getMatchConstraintPercentWidth", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getGuidingBoxBgCapturingId", "getGuidingBoxBgCapturedId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;IILjava/lang/Float;II)Lcom/socure/docv/capturesdk/feature/scanner/data/GuidingBoxConstraintData;", "equals", "", "other", "hashCode", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GuidingBoxConstraintData {
    public static final int $stable = 0;
    private final String dimensionRatio;
    private final int guidingBoxBgCapturedId;
    private final int guidingBoxBgCapturingId;
    private final int guidingBoxBgId;
    private final Float matchConstraintPercentWidth;
    private final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ GuidingBoxConstraintData(String str, int i, int i2, Float f, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, r4, r5, r6);
        int i6;
        int i7;
        Float f2 = (i5 & 8) != 0 ? null : f;
        if ((i5 & 16) != 0) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        if ((i5 & 32) != 0) {
            i7 = 0;
        } else {
            i7 = i4;
        }
    }

    public static /* synthetic */ GuidingBoxConstraintData copy$default(GuidingBoxConstraintData guidingBoxConstraintData, String str, int i, int i2, Float f, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = guidingBoxConstraintData.dimensionRatio;
        }
        if ((i5 & 2) != 0) {
            i = guidingBoxConstraintData.guidingBoxBgId;
        }
        if ((i5 & 4) != 0) {
            i2 = guidingBoxConstraintData.width;
        }
        if ((i5 & 8) != 0) {
            f = guidingBoxConstraintData.matchConstraintPercentWidth;
        }
        if ((i5 & 16) != 0) {
            i3 = guidingBoxConstraintData.guidingBoxBgCapturingId;
        }
        if ((i5 & 32) != 0) {
            i4 = guidingBoxConstraintData.guidingBoxBgCapturedId;
        }
        int i6 = i3;
        int i7 = i4;
        return guidingBoxConstraintData.copy(str, i, i2, f, i6, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDimensionRatio() {
        return this.dimensionRatio;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGuidingBoxBgId() {
        return this.guidingBoxBgId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getMatchConstraintPercentWidth() {
        return this.matchConstraintPercentWidth;
    }

    /* renamed from: component5, reason: from getter */
    public final int getGuidingBoxBgCapturingId() {
        return this.guidingBoxBgCapturingId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getGuidingBoxBgCapturedId() {
        return this.guidingBoxBgCapturedId;
    }

    public final GuidingBoxConstraintData copy(String dimensionRatio, int guidingBoxBgId, int width, Float matchConstraintPercentWidth, int guidingBoxBgCapturingId, int guidingBoxBgCapturedId) {
        dimensionRatio.getClass();
        return new GuidingBoxConstraintData(dimensionRatio, guidingBoxBgId, width, matchConstraintPercentWidth, guidingBoxBgCapturingId, guidingBoxBgCapturedId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuidingBoxConstraintData)) {
            return false;
        }
        GuidingBoxConstraintData guidingBoxConstraintData = (GuidingBoxConstraintData) other;
        if (Intrinsics.areEqual(this.dimensionRatio, guidingBoxConstraintData.dimensionRatio) && this.guidingBoxBgId == guidingBoxConstraintData.guidingBoxBgId && this.width == guidingBoxConstraintData.width && Intrinsics.areEqual(this.matchConstraintPercentWidth, guidingBoxConstraintData.matchConstraintPercentWidth) && this.guidingBoxBgCapturingId == guidingBoxConstraintData.guidingBoxBgCapturingId && this.guidingBoxBgCapturedId == guidingBoxConstraintData.guidingBoxBgCapturedId) {
            return true;
        }
        return false;
    }

    public final String getDimensionRatio() {
        return this.dimensionRatio;
    }

    public final int getGuidingBoxBgCapturedId() {
        return this.guidingBoxBgCapturedId;
    }

    public final int getGuidingBoxBgCapturingId() {
        return this.guidingBoxBgCapturingId;
    }

    public final int getGuidingBoxBgId() {
        return this.guidingBoxBgId;
    }

    public final Float getMatchConstraintPercentWidth() {
        return this.matchConstraintPercentWidth;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        int a = c.a(this.width, c.a(this.guidingBoxBgId, this.dimensionRatio.hashCode() * 31, 31), 31);
        Float f = this.matchConstraintPercentWidth;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return Integer.hashCode(this.guidingBoxBgCapturedId) + c.a(this.guidingBoxBgCapturingId, (a + hashCode) * 31, 31);
    }

    public String toString() {
        String str = this.dimensionRatio;
        int i = this.guidingBoxBgId;
        int i2 = this.width;
        Float f = this.matchConstraintPercentWidth;
        int i3 = this.guidingBoxBgCapturingId;
        int i4 = this.guidingBoxBgCapturedId;
        StringBuilder q = m51.q("GuidingBoxConstraintData(dimensionRatio=", str, ", guidingBoxBgId=", i, ", width=");
        q.append(i2);
        q.append(", matchConstraintPercentWidth=");
        q.append(f);
        q.append(", guidingBoxBgCapturingId=");
        q.append(i3);
        q.append(", guidingBoxBgCapturedId=");
        q.append(i4);
        q.append(")");
        return q.toString();
    }

    public GuidingBoxConstraintData(String str, int i, int i2, Float f, int i3, int i4) {
        str.getClass();
        this.dimensionRatio = str;
        this.guidingBoxBgId = i;
        this.width = i2;
        this.matchConstraintPercentWidth = f;
        this.guidingBoxBgCapturingId = i3;
        this.guidingBoxBgCapturedId = i4;
    }
}
