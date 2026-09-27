package com.socure.docv.capturesdk.core.processor.model;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.api.b;
import com.socure.docv.capturesdk.common.analytics.model.a;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013¨\u00061"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/Output;", "", "finalBitmap", "Landroid/graphics/Bitmap;", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "captureMetadata", "Lcom/socure/docv/capturesdk/core/processor/model/CaptureMetadata;", "finalStatus", "", "metrics", "", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "debugBitmap", "<init>", "(Landroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;Lcom/socure/docv/capturesdk/core/processor/model/CaptureMetadata;ZLjava/util/List;Landroid/graphics/Bitmap;)V", "getFinalBitmap", "()Landroid/graphics/Bitmap;", "setFinalBitmap", "(Landroid/graphics/Bitmap;)V", "getCaptureType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "setCaptureType", "(Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;)V", "getCaptureMetadata", "()Lcom/socure/docv/capturesdk/core/processor/model/CaptureMetadata;", "setCaptureMetadata", "(Lcom/socure/docv/capturesdk/core/processor/model/CaptureMetadata;)V", "getFinalStatus", "()Z", "setFinalStatus", "(Z)V", "getMetrics", "()Ljava/util/List;", "getDebugBitmap", "setDebugBitmap", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Output {
    public static final int $stable = 8;
    private CaptureMetadata captureMetadata;
    private CaptureType captureType;
    private Bitmap debugBitmap;
    private Bitmap finalBitmap;
    private boolean finalStatus;
    private final List<DetectionMetric> metrics;

    public /* synthetic */ Output(Bitmap bitmap, CaptureType captureType, CaptureMetadata captureMetadata, boolean z, List list, Bitmap bitmap2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, captureType, (i & 4) != 0 ? null : captureMetadata, (i & 8) != 0 ? false : z, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? null : bitmap2);
    }

    public static /* synthetic */ Output copy$default(Output output, Bitmap bitmap, CaptureType captureType, CaptureMetadata captureMetadata, boolean z, List list, Bitmap bitmap2, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = output.finalBitmap;
        }
        if ((i & 2) != 0) {
            captureType = output.captureType;
        }
        if ((i & 4) != 0) {
            captureMetadata = output.captureMetadata;
        }
        if ((i & 8) != 0) {
            z = output.finalStatus;
        }
        if ((i & 16) != 0) {
            list = output.metrics;
        }
        if ((i & 32) != 0) {
            bitmap2 = output.debugBitmap;
        }
        List list2 = list;
        Bitmap bitmap3 = bitmap2;
        return output.copy(bitmap, captureType, captureMetadata, z, list2, bitmap3);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getFinalBitmap() {
        return this.finalBitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final CaptureType getCaptureType() {
        return this.captureType;
    }

    /* renamed from: component3, reason: from getter */
    public final CaptureMetadata getCaptureMetadata() {
        return this.captureMetadata;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFinalStatus() {
        return this.finalStatus;
    }

    public final List<DetectionMetric> component5() {
        return this.metrics;
    }

    /* renamed from: component6, reason: from getter */
    public final Bitmap getDebugBitmap() {
        return this.debugBitmap;
    }

    public final Output copy(Bitmap finalBitmap, CaptureType captureType, CaptureMetadata captureMetadata, boolean finalStatus, List<DetectionMetric> metrics, Bitmap debugBitmap) {
        finalBitmap.getClass();
        captureType.getClass();
        metrics.getClass();
        return new Output(finalBitmap, captureType, captureMetadata, finalStatus, metrics, debugBitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Output)) {
            return false;
        }
        Output output = (Output) other;
        if (Intrinsics.areEqual(this.finalBitmap, output.finalBitmap) && this.captureType == output.captureType && Intrinsics.areEqual(this.captureMetadata, output.captureMetadata) && this.finalStatus == output.finalStatus && Intrinsics.areEqual(this.metrics, output.metrics) && Intrinsics.areEqual(this.debugBitmap, output.debugBitmap)) {
            return true;
        }
        return false;
    }

    public final CaptureMetadata getCaptureMetadata() {
        return this.captureMetadata;
    }

    public final CaptureType getCaptureType() {
        return this.captureType;
    }

    public final Bitmap getDebugBitmap() {
        return this.debugBitmap;
    }

    public final Bitmap getFinalBitmap() {
        return this.finalBitmap;
    }

    public final boolean getFinalStatus() {
        return this.finalStatus;
    }

    public final List<DetectionMetric> getMetrics() {
        return this.metrics;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.captureType.hashCode() + (this.finalBitmap.hashCode() * 31)) * 31;
        CaptureMetadata captureMetadata = this.captureMetadata;
        int i = 0;
        if (captureMetadata == null) {
            hashCode = 0;
        } else {
            hashCode = captureMetadata.hashCode();
        }
        int a = a.a(this.metrics, b.a(this.finalStatus, (hashCode2 + hashCode) * 31, 31), 31);
        Bitmap bitmap = this.debugBitmap;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return a + i;
    }

    public final void setCaptureMetadata(CaptureMetadata captureMetadata) {
        this.captureMetadata = captureMetadata;
    }

    public final void setCaptureType(CaptureType captureType) {
        captureType.getClass();
        this.captureType = captureType;
    }

    public final void setDebugBitmap(Bitmap bitmap) {
        this.debugBitmap = bitmap;
    }

    public final void setFinalBitmap(Bitmap bitmap) {
        bitmap.getClass();
        this.finalBitmap = bitmap;
    }

    public final void setFinalStatus(boolean z) {
        this.finalStatus = z;
    }

    public String toString() {
        return "Output(finalBitmap=" + this.finalBitmap + ", captureType=" + this.captureType + ", captureMetadata=" + this.captureMetadata + ", finalStatus=" + this.finalStatus + ", metrics=" + this.metrics + ", debugBitmap=" + this.debugBitmap + ")";
    }

    public Output(Bitmap bitmap, CaptureType captureType, CaptureMetadata captureMetadata, boolean z, List<DetectionMetric> list, Bitmap bitmap2) {
        bitmap.getClass();
        captureType.getClass();
        list.getClass();
        this.finalBitmap = bitmap;
        this.captureType = captureType;
        this.captureMetadata = captureMetadata;
        this.finalStatus = z;
        this.metrics = list;
        this.debugBitmap = bitmap2;
    }
}
