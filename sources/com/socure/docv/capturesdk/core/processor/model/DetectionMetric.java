package com.socure.docv.capturesdk.core.processor.model;

import android.graphics.Bitmap;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.b;
import com.socure.docv.capturesdk.common.analytics.model.a;
import com.socure.docv.capturesdk.common.network.model.stepup.SelfieMetrics;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import defpackage.sv6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010>\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0084\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020\u00052\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020JHÖ\u0001J\t\u0010K\u001a\u00020LHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006M"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "", "detectionType", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "checkPassed", "", "outputMeasure", "", "error", "", "regionList", "", "", "expansionPercentage", "modelInputImage", "Landroid/graphics/Bitmap;", "detectionCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "selfieMetrics", "Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "processedBitmapDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "<init>", "(Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;ZLjava/lang/Double;Ljava/lang/Throwable;Ljava/util/List;FLandroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;)V", "getDetectionType", "()Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "getCheckPassed", "()Z", "setCheckPassed", "(Z)V", "getOutputMeasure", "()Ljava/lang/Double;", "setOutputMeasure", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getError", "()Ljava/lang/Throwable;", "setError", "(Ljava/lang/Throwable;)V", "getRegionList", "()Ljava/util/List;", "getExpansionPercentage", "()F", "getModelInputImage", "()Landroid/graphics/Bitmap;", "setModelInputImage", "(Landroid/graphics/Bitmap;)V", "getDetectionCallback", "()Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "setDetectionCallback", "(Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;)V", "getSelfieMetrics", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "setSelfieMetrics", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;)V", "getProcessedBitmapDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "setProcessedBitmapDimension", "(Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;ZLjava/lang/Double;Ljava/lang/Throwable;Ljava/util/List;FLandroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;)Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DetectionMetric {
    public static final int $stable = 8;
    private boolean checkPassed;
    private DetectionCallback detectionCallback;
    private final DetectionType detectionType;
    private Throwable error;
    private final float expansionPercentage;
    private Bitmap modelInputImage;
    private Double outputMeasure;
    private Dimension processedBitmapDimension;
    private final List<Float> regionList;
    private SelfieMetrics selfieMetrics;

    public /* synthetic */ DetectionMetric(DetectionType detectionType, boolean z, Double d, Throwable th, List list, float f, Bitmap bitmap, DetectionCallback detectionCallback, SelfieMetrics selfieMetrics, Dimension dimension, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(detectionType, z, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : th, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? null : bitmap, (i & 128) != 0 ? null : detectionCallback, (i & 256) != 0 ? null : selfieMetrics, (i & Barcode.FORMAT_UPC_A) != 0 ? null : dimension);
    }

    public static /* synthetic */ DetectionMetric copy$default(DetectionMetric detectionMetric, DetectionType detectionType, boolean z, Double d, Throwable th, List list, float f, Bitmap bitmap, DetectionCallback detectionCallback, SelfieMetrics selfieMetrics, Dimension dimension, int i, Object obj) {
        if ((i & 1) != 0) {
            detectionType = detectionMetric.detectionType;
        }
        if ((i & 2) != 0) {
            z = detectionMetric.checkPassed;
        }
        if ((i & 4) != 0) {
            d = detectionMetric.outputMeasure;
        }
        if ((i & 8) != 0) {
            th = detectionMetric.error;
        }
        if ((i & 16) != 0) {
            list = detectionMetric.regionList;
        }
        if ((i & 32) != 0) {
            f = detectionMetric.expansionPercentage;
        }
        if ((i & 64) != 0) {
            bitmap = detectionMetric.modelInputImage;
        }
        if ((i & 128) != 0) {
            detectionCallback = detectionMetric.detectionCallback;
        }
        if ((i & 256) != 0) {
            selfieMetrics = detectionMetric.selfieMetrics;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            dimension = detectionMetric.processedBitmapDimension;
        }
        SelfieMetrics selfieMetrics2 = selfieMetrics;
        Dimension dimension2 = dimension;
        Bitmap bitmap2 = bitmap;
        DetectionCallback detectionCallback2 = detectionCallback;
        List list2 = list;
        float f2 = f;
        return detectionMetric.copy(detectionType, z, d, th, list2, f2, bitmap2, detectionCallback2, selfieMetrics2, dimension2);
    }

    /* renamed from: component1, reason: from getter */
    public final DetectionType getDetectionType() {
        return this.detectionType;
    }

    /* renamed from: component10, reason: from getter */
    public final Dimension getProcessedBitmapDimension() {
        return this.processedBitmapDimension;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCheckPassed() {
        return this.checkPassed;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getOutputMeasure() {
        return this.outputMeasure;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final List<Float> component5() {
        return this.regionList;
    }

    /* renamed from: component6, reason: from getter */
    public final float getExpansionPercentage() {
        return this.expansionPercentage;
    }

    /* renamed from: component7, reason: from getter */
    public final Bitmap getModelInputImage() {
        return this.modelInputImage;
    }

    /* renamed from: component8, reason: from getter */
    public final DetectionCallback getDetectionCallback() {
        return this.detectionCallback;
    }

    /* renamed from: component9, reason: from getter */
    public final SelfieMetrics getSelfieMetrics() {
        return this.selfieMetrics;
    }

    public final DetectionMetric copy(DetectionType detectionType, boolean checkPassed, Double outputMeasure, Throwable error, List<Float> regionList, float expansionPercentage, Bitmap modelInputImage, DetectionCallback detectionCallback, SelfieMetrics selfieMetrics, Dimension processedBitmapDimension) {
        detectionType.getClass();
        regionList.getClass();
        return new DetectionMetric(detectionType, checkPassed, outputMeasure, error, regionList, expansionPercentage, modelInputImage, detectionCallback, selfieMetrics, processedBitmapDimension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetectionMetric)) {
            return false;
        }
        DetectionMetric detectionMetric = (DetectionMetric) other;
        if (this.detectionType == detectionMetric.detectionType && this.checkPassed == detectionMetric.checkPassed && Intrinsics.areEqual(this.outputMeasure, detectionMetric.outputMeasure) && Intrinsics.areEqual(this.error, detectionMetric.error) && Intrinsics.areEqual(this.regionList, detectionMetric.regionList) && Float.compare(this.expansionPercentage, detectionMetric.expansionPercentage) == 0 && Intrinsics.areEqual(this.modelInputImage, detectionMetric.modelInputImage) && this.detectionCallback == detectionMetric.detectionCallback && Intrinsics.areEqual(this.selfieMetrics, detectionMetric.selfieMetrics) && Intrinsics.areEqual(this.processedBitmapDimension, detectionMetric.processedBitmapDimension)) {
            return true;
        }
        return false;
    }

    public final boolean getCheckPassed() {
        return this.checkPassed;
    }

    public final DetectionCallback getDetectionCallback() {
        return this.detectionCallback;
    }

    public final DetectionType getDetectionType() {
        return this.detectionType;
    }

    public final Throwable getError() {
        return this.error;
    }

    public final float getExpansionPercentage() {
        return this.expansionPercentage;
    }

    public final Bitmap getModelInputImage() {
        return this.modelInputImage;
    }

    public final Double getOutputMeasure() {
        return this.outputMeasure;
    }

    public final Dimension getProcessedBitmapDimension() {
        return this.processedBitmapDimension;
    }

    public final List<Float> getRegionList() {
        return this.regionList;
    }

    public final SelfieMetrics getSelfieMetrics() {
        return this.selfieMetrics;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int a = b.a(this.checkPassed, this.detectionType.hashCode() * 31, 31);
        Double d = this.outputMeasure;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Throwable th = this.error;
        if (th == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = th.hashCode();
        }
        int a2 = sv6.a(a.a(this.regionList, (i2 + hashCode2) * 31, 31), this.expansionPercentage, 31);
        Bitmap bitmap = this.modelInputImage;
        if (bitmap == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bitmap.hashCode();
        }
        int i3 = (a2 + hashCode3) * 31;
        DetectionCallback detectionCallback = this.detectionCallback;
        if (detectionCallback == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = detectionCallback.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        SelfieMetrics selfieMetrics = this.selfieMetrics;
        if (selfieMetrics == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = selfieMetrics.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Dimension dimension = this.processedBitmapDimension;
        if (dimension != null) {
            i = dimension.hashCode();
        }
        return i5 + i;
    }

    public final void setCheckPassed(boolean z) {
        this.checkPassed = z;
    }

    public final void setDetectionCallback(DetectionCallback detectionCallback) {
        this.detectionCallback = detectionCallback;
    }

    public final void setError(Throwable th) {
        this.error = th;
    }

    public final void setModelInputImage(Bitmap bitmap) {
        this.modelInputImage = bitmap;
    }

    public final void setOutputMeasure(Double d) {
        this.outputMeasure = d;
    }

    public final void setProcessedBitmapDimension(Dimension dimension) {
        this.processedBitmapDimension = dimension;
    }

    public final void setSelfieMetrics(SelfieMetrics selfieMetrics) {
        this.selfieMetrics = selfieMetrics;
    }

    public String toString() {
        return "DetectionMetric(detectionType=" + this.detectionType + ", checkPassed=" + this.checkPassed + ", outputMeasure=" + this.outputMeasure + ", error=" + this.error + ", regionList=" + this.regionList + ", expansionPercentage=" + this.expansionPercentage + ", modelInputImage=" + this.modelInputImage + ", detectionCallback=" + this.detectionCallback + ", selfieMetrics=" + this.selfieMetrics + ", processedBitmapDimension=" + this.processedBitmapDimension + ")";
    }

    public DetectionMetric(DetectionType detectionType, boolean z, Double d, Throwable th, List<Float> list, float f, Bitmap bitmap, DetectionCallback detectionCallback, SelfieMetrics selfieMetrics, Dimension dimension) {
        detectionType.getClass();
        list.getClass();
        this.detectionType = detectionType;
        this.checkPassed = z;
        this.outputMeasure = d;
        this.error = th;
        this.regionList = list;
        this.expansionPercentage = f;
        this.modelInputImage = bitmap;
        this.detectionCallback = detectionCallback;
        this.selfieMetrics = selfieMetrics;
        this.processedBitmapDimension = dimension;
    }
}
