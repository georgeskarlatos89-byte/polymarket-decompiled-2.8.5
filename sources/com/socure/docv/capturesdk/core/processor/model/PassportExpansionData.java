package com.socure.docv.capturesdk.core.processor.model;

import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/PassportExpansionData;", "", "paddedSquaredBitmapRes", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "paddedScaledDownBitmapRes", "processedBitmapRes", "originalBitmapRes", "cropViewDimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "<init>", "(Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;)V", "getPaddedSquaredBitmapRes", "()Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "getPaddedScaledDownBitmapRes", "getProcessedBitmapRes", "getOriginalBitmapRes", "getCropViewDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PassportExpansionData {
    public static final int $stable = 8;
    private final ViewDimensions cropViewDimension;
    private final Dimension originalBitmapRes;
    private final Dimension paddedScaledDownBitmapRes;
    private final Dimension paddedSquaredBitmapRes;
    private final Dimension processedBitmapRes;

    public PassportExpansionData(Dimension dimension, Dimension dimension2, Dimension dimension3, Dimension dimension4, ViewDimensions viewDimensions) {
        dimension.getClass();
        dimension2.getClass();
        dimension3.getClass();
        dimension4.getClass();
        viewDimensions.getClass();
        this.paddedSquaredBitmapRes = dimension;
        this.paddedScaledDownBitmapRes = dimension2;
        this.processedBitmapRes = dimension3;
        this.originalBitmapRes = dimension4;
        this.cropViewDimension = viewDimensions;
    }

    public static /* synthetic */ PassportExpansionData copy$default(PassportExpansionData passportExpansionData, Dimension dimension, Dimension dimension2, Dimension dimension3, Dimension dimension4, ViewDimensions viewDimensions, int i, Object obj) {
        if ((i & 1) != 0) {
            dimension = passportExpansionData.paddedSquaredBitmapRes;
        }
        if ((i & 2) != 0) {
            dimension2 = passportExpansionData.paddedScaledDownBitmapRes;
        }
        if ((i & 4) != 0) {
            dimension3 = passportExpansionData.processedBitmapRes;
        }
        if ((i & 8) != 0) {
            dimension4 = passportExpansionData.originalBitmapRes;
        }
        if ((i & 16) != 0) {
            viewDimensions = passportExpansionData.cropViewDimension;
        }
        ViewDimensions viewDimensions2 = viewDimensions;
        Dimension dimension5 = dimension3;
        return passportExpansionData.copy(dimension, dimension2, dimension5, dimension4, viewDimensions2);
    }

    /* renamed from: component1, reason: from getter */
    public final Dimension getPaddedSquaredBitmapRes() {
        return this.paddedSquaredBitmapRes;
    }

    /* renamed from: component2, reason: from getter */
    public final Dimension getPaddedScaledDownBitmapRes() {
        return this.paddedScaledDownBitmapRes;
    }

    /* renamed from: component3, reason: from getter */
    public final Dimension getProcessedBitmapRes() {
        return this.processedBitmapRes;
    }

    /* renamed from: component4, reason: from getter */
    public final Dimension getOriginalBitmapRes() {
        return this.originalBitmapRes;
    }

    /* renamed from: component5, reason: from getter */
    public final ViewDimensions getCropViewDimension() {
        return this.cropViewDimension;
    }

    public final PassportExpansionData copy(Dimension paddedSquaredBitmapRes, Dimension paddedScaledDownBitmapRes, Dimension processedBitmapRes, Dimension originalBitmapRes, ViewDimensions cropViewDimension) {
        paddedSquaredBitmapRes.getClass();
        paddedScaledDownBitmapRes.getClass();
        processedBitmapRes.getClass();
        originalBitmapRes.getClass();
        cropViewDimension.getClass();
        return new PassportExpansionData(paddedSquaredBitmapRes, paddedScaledDownBitmapRes, processedBitmapRes, originalBitmapRes, cropViewDimension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportExpansionData)) {
            return false;
        }
        PassportExpansionData passportExpansionData = (PassportExpansionData) other;
        if (Intrinsics.areEqual(this.paddedSquaredBitmapRes, passportExpansionData.paddedSquaredBitmapRes) && Intrinsics.areEqual(this.paddedScaledDownBitmapRes, passportExpansionData.paddedScaledDownBitmapRes) && Intrinsics.areEqual(this.processedBitmapRes, passportExpansionData.processedBitmapRes) && Intrinsics.areEqual(this.originalBitmapRes, passportExpansionData.originalBitmapRes) && Intrinsics.areEqual(this.cropViewDimension, passportExpansionData.cropViewDimension)) {
            return true;
        }
        return false;
    }

    public final ViewDimensions getCropViewDimension() {
        return this.cropViewDimension;
    }

    public final Dimension getOriginalBitmapRes() {
        return this.originalBitmapRes;
    }

    public final Dimension getPaddedScaledDownBitmapRes() {
        return this.paddedScaledDownBitmapRes;
    }

    public final Dimension getPaddedSquaredBitmapRes() {
        return this.paddedSquaredBitmapRes;
    }

    public final Dimension getProcessedBitmapRes() {
        return this.processedBitmapRes;
    }

    public int hashCode() {
        return this.cropViewDimension.hashCode() + ((this.originalBitmapRes.hashCode() + ((this.processedBitmapRes.hashCode() + ((this.paddedScaledDownBitmapRes.hashCode() + (this.paddedSquaredBitmapRes.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "PassportExpansionData(paddedSquaredBitmapRes=" + this.paddedSquaredBitmapRes + ", paddedScaledDownBitmapRes=" + this.paddedScaledDownBitmapRes + ", processedBitmapRes=" + this.processedBitmapRes + ", originalBitmapRes=" + this.originalBitmapRes + ", cropViewDimension=" + this.cropViewDimension + ")";
    }
}
