package com.socure.docv.capturesdk.core.processor.model;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.analytics.model.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006#"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/LicenseProcessingData;", "", "paddedSquaredBitmap", "Landroid/graphics/Bitmap;", "paddedScaledDownBitmap", "iddModelOutputRaw", "Lkotlin/Pair;", "", "modelOutputList", "", "", "originalBitmap", "<init>", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lkotlin/Pair;Ljava/util/List;Landroid/graphics/Bitmap;)V", "getPaddedSquaredBitmap", "()Landroid/graphics/Bitmap;", "getPaddedScaledDownBitmap", "getIddModelOutputRaw", "()Lkotlin/Pair;", "getModelOutputList", "()Ljava/util/List;", "getOriginalBitmap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LicenseProcessingData {
    public static final int $stable = 8;
    private final Pair<float[], float[]> iddModelOutputRaw;
    private final List<Float> modelOutputList;
    private final Bitmap originalBitmap;
    private final Bitmap paddedScaledDownBitmap;
    private final Bitmap paddedSquaredBitmap;

    public LicenseProcessingData(Bitmap bitmap, Bitmap bitmap2, Pair<float[], float[]> pair, List<Float> list, Bitmap bitmap3) {
        bitmap.getClass();
        bitmap2.getClass();
        list.getClass();
        bitmap3.getClass();
        this.paddedSquaredBitmap = bitmap;
        this.paddedScaledDownBitmap = bitmap2;
        this.iddModelOutputRaw = pair;
        this.modelOutputList = list;
        this.originalBitmap = bitmap3;
    }

    public static /* synthetic */ LicenseProcessingData copy$default(LicenseProcessingData licenseProcessingData, Bitmap bitmap, Bitmap bitmap2, Pair pair, List list, Bitmap bitmap3, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = licenseProcessingData.paddedSquaredBitmap;
        }
        if ((i & 2) != 0) {
            bitmap2 = licenseProcessingData.paddedScaledDownBitmap;
        }
        if ((i & 4) != 0) {
            pair = licenseProcessingData.iddModelOutputRaw;
        }
        if ((i & 8) != 0) {
            list = licenseProcessingData.modelOutputList;
        }
        if ((i & 16) != 0) {
            bitmap3 = licenseProcessingData.originalBitmap;
        }
        Bitmap bitmap4 = bitmap3;
        Pair pair2 = pair;
        return licenseProcessingData.copy(bitmap, bitmap2, pair2, list, bitmap4);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getPaddedSquaredBitmap() {
        return this.paddedSquaredBitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final Bitmap getPaddedScaledDownBitmap() {
        return this.paddedScaledDownBitmap;
    }

    public final Pair<float[], float[]> component3() {
        return this.iddModelOutputRaw;
    }

    public final List<Float> component4() {
        return this.modelOutputList;
    }

    /* renamed from: component5, reason: from getter */
    public final Bitmap getOriginalBitmap() {
        return this.originalBitmap;
    }

    public final LicenseProcessingData copy(Bitmap paddedSquaredBitmap, Bitmap paddedScaledDownBitmap, Pair<float[], float[]> iddModelOutputRaw, List<Float> modelOutputList, Bitmap originalBitmap) {
        paddedSquaredBitmap.getClass();
        paddedScaledDownBitmap.getClass();
        modelOutputList.getClass();
        originalBitmap.getClass();
        return new LicenseProcessingData(paddedSquaredBitmap, paddedScaledDownBitmap, iddModelOutputRaw, modelOutputList, originalBitmap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LicenseProcessingData)) {
            return false;
        }
        LicenseProcessingData licenseProcessingData = (LicenseProcessingData) other;
        if (Intrinsics.areEqual(this.paddedSquaredBitmap, licenseProcessingData.paddedSquaredBitmap) && Intrinsics.areEqual(this.paddedScaledDownBitmap, licenseProcessingData.paddedScaledDownBitmap) && Intrinsics.areEqual(this.iddModelOutputRaw, licenseProcessingData.iddModelOutputRaw) && Intrinsics.areEqual(this.modelOutputList, licenseProcessingData.modelOutputList) && Intrinsics.areEqual(this.originalBitmap, licenseProcessingData.originalBitmap)) {
            return true;
        }
        return false;
    }

    public final Pair<float[], float[]> getIddModelOutputRaw() {
        return this.iddModelOutputRaw;
    }

    public final List<Float> getModelOutputList() {
        return this.modelOutputList;
    }

    public final Bitmap getOriginalBitmap() {
        return this.originalBitmap;
    }

    public final Bitmap getPaddedScaledDownBitmap() {
        return this.paddedScaledDownBitmap;
    }

    public final Bitmap getPaddedSquaredBitmap() {
        return this.paddedSquaredBitmap;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.paddedScaledDownBitmap.hashCode() + (this.paddedSquaredBitmap.hashCode() * 31)) * 31;
        Pair<float[], float[]> pair = this.iddModelOutputRaw;
        if (pair == null) {
            hashCode = 0;
        } else {
            hashCode = pair.hashCode();
        }
        return this.originalBitmap.hashCode() + a.a(this.modelOutputList, (hashCode2 + hashCode) * 31, 31);
    }

    public String toString() {
        return "LicenseProcessingData(paddedSquaredBitmap=" + this.paddedSquaredBitmap + ", paddedScaledDownBitmap=" + this.paddedScaledDownBitmap + ", iddModelOutputRaw=" + this.iddModelOutputRaw + ", modelOutputList=" + this.modelOutputList + ", originalBitmap=" + this.originalBitmap + ")";
    }
}
