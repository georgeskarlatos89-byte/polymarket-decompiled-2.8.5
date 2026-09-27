package com.socure.docv.capturesdk.core.external.ml.model;

import android.graphics.Bitmap;
import defpackage.ix2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/core/external/ml/model/CropData;", "", "bitmap", "Landroid/graphics/Bitmap;", "edgeData", "Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeModel;", "brightEnough", "", "<init>", "(Landroid/graphics/Bitmap;Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeModel;Z)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getEdgeData", "()Lcom/socure/docv/capturesdk/core/external/ml/model/EdgeModel;", "getBrightEnough", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CropData {
    public static final int $stable = 8;
    private final Bitmap bitmap;
    private final boolean brightEnough;
    private final EdgeModel edgeData;

    public CropData(Bitmap bitmap, EdgeModel edgeModel, boolean z) {
        bitmap.getClass();
        edgeModel.getClass();
        this.bitmap = bitmap;
        this.edgeData = edgeModel;
        this.brightEnough = z;
    }

    public static /* synthetic */ CropData copy$default(CropData cropData, Bitmap bitmap, EdgeModel edgeModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = cropData.bitmap;
        }
        if ((i & 2) != 0) {
            edgeModel = cropData.edgeData;
        }
        if ((i & 4) != 0) {
            z = cropData.brightEnough;
        }
        return cropData.copy(bitmap, edgeModel, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final EdgeModel getEdgeData() {
        return this.edgeData;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBrightEnough() {
        return this.brightEnough;
    }

    public final CropData copy(Bitmap bitmap, EdgeModel edgeData, boolean brightEnough) {
        bitmap.getClass();
        edgeData.getClass();
        return new CropData(bitmap, edgeData, brightEnough);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CropData)) {
            return false;
        }
        CropData cropData = (CropData) other;
        if (Intrinsics.areEqual(this.bitmap, cropData.bitmap) && Intrinsics.areEqual(this.edgeData, cropData.edgeData) && this.brightEnough == cropData.brightEnough) {
            return true;
        }
        return false;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final boolean getBrightEnough() {
        return this.brightEnough;
    }

    public final EdgeModel getEdgeData() {
        return this.edgeData;
    }

    public int hashCode() {
        return Boolean.hashCode(this.brightEnough) + ((this.edgeData.hashCode() + (this.bitmap.hashCode() * 31)) * 31);
    }

    public String toString() {
        Bitmap bitmap = this.bitmap;
        EdgeModel edgeModel = this.edgeData;
        boolean z = this.brightEnough;
        StringBuilder sb = new StringBuilder("CropData(bitmap=");
        sb.append(bitmap);
        sb.append(", edgeData=");
        sb.append(edgeModel);
        sb.append(", brightEnough=");
        return ix2.r(sb, z, ")");
    }
}
