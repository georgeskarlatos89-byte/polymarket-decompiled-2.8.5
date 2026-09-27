package com.socure.docv.capturesdk.core.external.ml.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.socure.core.Mat;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003Jn\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#¨\u00069"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeModel;", "", "edgeDetectedAllSides", "", "edgeDetectedThreeSides", "regionWiseLines", "Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeReferenceLines;", "subRegionInfo", "Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;", "croppedImage", "Lorg/socure/core/Mat;", "intersectionPoints", "", "", "debugImage", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeReferenceLines;Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;Lorg/socure/core/Mat;Ljava/util/List;Lorg/socure/core/Mat;)V", "getEdgeDetectedAllSides", "()Ljava/lang/Boolean;", "setEdgeDetectedAllSides", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getEdgeDetectedThreeSides", "setEdgeDetectedThreeSides", "getRegionWiseLines", "()Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeReferenceLines;", "setRegionWiseLines", "(Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeReferenceLines;)V", "getSubRegionInfo", "()Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;", "setSubRegionInfo", "(Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;)V", "getCroppedImage", "()Lorg/socure/core/Mat;", "setCroppedImage", "(Lorg/socure/core/Mat;)V", "getIntersectionPoints", "()Ljava/util/List;", "setIntersectionPoints", "(Ljava/util/List;)V", "getDebugImage", "setDebugImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeReferenceLines;Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeSubRegionInfo;Lorg/socure/core/Mat;Ljava/util/List;Lorg/socure/core/Mat;)Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeModel;", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EdgeModel {
    public static final int $stable = 8;
    private Mat croppedImage;
    private Mat debugImage;
    private Boolean edgeDetectedAllSides;
    private Boolean edgeDetectedThreeSides;
    private List<List<Double>> intersectionPoints;
    private EdgeReferenceLines regionWiseLines;
    private EdgeSubRegionInfo subRegionInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EdgeModel(Boolean bool, Boolean bool2, EdgeReferenceLines edgeReferenceLines, EdgeSubRegionInfo edgeSubRegionInfo, Mat mat, List list, Mat mat2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, edgeReferenceLines, edgeSubRegionInfo, mat, list, r8);
        Mat mat3;
        if ((i & 64) != 0) {
            mat3 = null;
        } else {
            mat3 = mat2;
        }
    }

    public static /* synthetic */ EdgeModel copy$default(EdgeModel edgeModel, Boolean bool, Boolean bool2, EdgeReferenceLines edgeReferenceLines, EdgeSubRegionInfo edgeSubRegionInfo, Mat mat, List list, Mat mat2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = edgeModel.edgeDetectedAllSides;
        }
        if ((i & 2) != 0) {
            bool2 = edgeModel.edgeDetectedThreeSides;
        }
        if ((i & 4) != 0) {
            edgeReferenceLines = edgeModel.regionWiseLines;
        }
        if ((i & 8) != 0) {
            edgeSubRegionInfo = edgeModel.subRegionInfo;
        }
        if ((i & 16) != 0) {
            mat = edgeModel.croppedImage;
        }
        if ((i & 32) != 0) {
            list = edgeModel.intersectionPoints;
        }
        if ((i & 64) != 0) {
            mat2 = edgeModel.debugImage;
        }
        List list2 = list;
        Mat mat3 = mat2;
        Mat mat4 = mat;
        EdgeReferenceLines edgeReferenceLines2 = edgeReferenceLines;
        return edgeModel.copy(bool, bool2, edgeReferenceLines2, edgeSubRegionInfo, mat4, list2, mat3);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEdgeDetectedAllSides() {
        return this.edgeDetectedAllSides;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getEdgeDetectedThreeSides() {
        return this.edgeDetectedThreeSides;
    }

    /* renamed from: component3, reason: from getter */
    public final EdgeReferenceLines getRegionWiseLines() {
        return this.regionWiseLines;
    }

    /* renamed from: component4, reason: from getter */
    public final EdgeSubRegionInfo getSubRegionInfo() {
        return this.subRegionInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final Mat getCroppedImage() {
        return this.croppedImage;
    }

    public final List<List<Double>> component6() {
        return this.intersectionPoints;
    }

    /* renamed from: component7, reason: from getter */
    public final Mat getDebugImage() {
        return this.debugImage;
    }

    public final EdgeModel copy(Boolean edgeDetectedAllSides, Boolean edgeDetectedThreeSides, EdgeReferenceLines regionWiseLines, EdgeSubRegionInfo subRegionInfo, Mat croppedImage, List<List<Double>> intersectionPoints, Mat debugImage) {
        return new EdgeModel(edgeDetectedAllSides, edgeDetectedThreeSides, regionWiseLines, subRegionInfo, croppedImage, intersectionPoints, debugImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdgeModel)) {
            return false;
        }
        EdgeModel edgeModel = (EdgeModel) other;
        if (Intrinsics.areEqual(this.edgeDetectedAllSides, edgeModel.edgeDetectedAllSides) && Intrinsics.areEqual(this.edgeDetectedThreeSides, edgeModel.edgeDetectedThreeSides) && Intrinsics.areEqual(this.regionWiseLines, edgeModel.regionWiseLines) && Intrinsics.areEqual(this.subRegionInfo, edgeModel.subRegionInfo) && Intrinsics.areEqual(this.croppedImage, edgeModel.croppedImage) && Intrinsics.areEqual(this.intersectionPoints, edgeModel.intersectionPoints) && Intrinsics.areEqual(this.debugImage, edgeModel.debugImage)) {
            return true;
        }
        return false;
    }

    public final Mat getCroppedImage() {
        return this.croppedImage;
    }

    public final Mat getDebugImage() {
        return this.debugImage;
    }

    public final Boolean getEdgeDetectedAllSides() {
        return this.edgeDetectedAllSides;
    }

    public final Boolean getEdgeDetectedThreeSides() {
        return this.edgeDetectedThreeSides;
    }

    public final List<List<Double>> getIntersectionPoints() {
        return this.intersectionPoints;
    }

    public final EdgeReferenceLines getRegionWiseLines() {
        return this.regionWiseLines;
    }

    public final EdgeSubRegionInfo getSubRegionInfo() {
        return this.subRegionInfo;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        Boolean bool = this.edgeDetectedAllSides;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool2 = this.edgeDetectedThreeSides;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        EdgeReferenceLines edgeReferenceLines = this.regionWiseLines;
        if (edgeReferenceLines == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = edgeReferenceLines.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        EdgeSubRegionInfo edgeSubRegionInfo = this.subRegionInfo;
        if (edgeSubRegionInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = edgeSubRegionInfo.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Mat mat = this.croppedImage;
        if (mat == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = mat.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<List<Double>> list = this.intersectionPoints;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Mat mat2 = this.debugImage;
        if (mat2 != null) {
            i = mat2.hashCode();
        }
        return i7 + i;
    }

    public final void setCroppedImage(Mat mat) {
        this.croppedImage = mat;
    }

    public final void setDebugImage(Mat mat) {
        this.debugImage = mat;
    }

    public final void setEdgeDetectedAllSides(Boolean bool) {
        this.edgeDetectedAllSides = bool;
    }

    public final void setEdgeDetectedThreeSides(Boolean bool) {
        this.edgeDetectedThreeSides = bool;
    }

    public final void setIntersectionPoints(List<List<Double>> list) {
        this.intersectionPoints = list;
    }

    public final void setRegionWiseLines(EdgeReferenceLines edgeReferenceLines) {
        this.regionWiseLines = edgeReferenceLines;
    }

    public final void setSubRegionInfo(EdgeSubRegionInfo edgeSubRegionInfo) {
        this.subRegionInfo = edgeSubRegionInfo;
    }

    public String toString() {
        return "EdgeModel(edgeDetectedAllSides=" + this.edgeDetectedAllSides + ", edgeDetectedThreeSides=" + this.edgeDetectedThreeSides + ", regionWiseLines=" + this.regionWiseLines + ", subRegionInfo=" + this.subRegionInfo + ", croppedImage=" + this.croppedImage + ", intersectionPoints=" + this.intersectionPoints + ", debugImage=" + this.debugImage + ")";
    }

    public EdgeModel(Boolean bool, Boolean bool2, EdgeReferenceLines edgeReferenceLines, EdgeSubRegionInfo edgeSubRegionInfo, Mat mat, List<List<Double>> list, Mat mat2) {
        this.edgeDetectedAllSides = bool;
        this.edgeDetectedThreeSides = bool2;
        this.regionWiseLines = edgeReferenceLines;
        this.subRegionInfo = edgeSubRegionInfo;
        this.croppedImage = mat;
        this.intersectionPoints = list;
        this.debugImage = mat2;
    }
}
