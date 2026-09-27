package com.socure.docv.capturesdk.core.processor.model;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/ProcessOutput;", "Lcom/socure/docv/capturesdk/core/processor/model/IResult;", "metric", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "bitmap", "Landroid/graphics/Bitmap;", "debugBitmap", "<init>", "(Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V", "getMetric", "()Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "getBitmap", "()Landroid/graphics/Bitmap;", "getDebugBitmap", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProcessOutput implements IResult {
    public static final int $stable = 8;
    private final Bitmap bitmap;
    private final Bitmap debugBitmap;
    private final DetectionMetric metric;

    public /* synthetic */ ProcessOutput(DetectionMetric detectionMetric, Bitmap bitmap, Bitmap bitmap2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(detectionMetric, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? null : bitmap2);
    }

    public static /* synthetic */ ProcessOutput copy$default(ProcessOutput processOutput, DetectionMetric detectionMetric, Bitmap bitmap, Bitmap bitmap2, int i, Object obj) {
        if ((i & 1) != 0) {
            detectionMetric = processOutput.metric;
        }
        if ((i & 2) != 0) {
            bitmap = processOutput.bitmap;
        }
        if ((i & 4) != 0) {
            bitmap2 = processOutput.debugBitmap;
        }
        return processOutput.copy(detectionMetric, bitmap, bitmap2);
    }

    /* renamed from: component1, reason: from getter */
    public final DetectionMetric getMetric() {
        return this.metric;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getDebugBitmap() {
        return this.debugBitmap;
    }

    public final ProcessOutput copy(DetectionMetric metric, Bitmap bitmap, Bitmap debugBitmap) {
        metric.getClass();
        return new ProcessOutput(metric, bitmap, debugBitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessOutput)) {
            return false;
        }
        ProcessOutput processOutput = (ProcessOutput) other;
        if (Intrinsics.areEqual(this.metric, processOutput.metric) && Intrinsics.areEqual(this.bitmap, processOutput.bitmap) && Intrinsics.areEqual(this.debugBitmap, processOutput.debugBitmap)) {
            return true;
        }
        return false;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Bitmap getDebugBitmap() {
        return this.debugBitmap;
    }

    @Override // com.socure.docv.capturesdk.core.processor.model.IResult
    public DetectionMetric getMetric() {
        return this.metric;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.metric.hashCode() * 31;
        Bitmap bitmap = this.bitmap;
        int i = 0;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Bitmap bitmap2 = this.debugBitmap;
        if (bitmap2 != null) {
            i = bitmap2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "ProcessOutput(metric=" + this.metric + ", bitmap=" + this.bitmap + ", debugBitmap=" + this.debugBitmap + ")";
    }

    public ProcessOutput(DetectionMetric detectionMetric, Bitmap bitmap, Bitmap bitmap2) {
        detectionMetric.getClass();
        this.metric = detectionMetric;
        this.bitmap = bitmap;
        this.debugBitmap = bitmap2;
    }
}
