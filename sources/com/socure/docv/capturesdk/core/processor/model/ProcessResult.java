package com.socure.docv.capturesdk.core.processor.model;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.analytics.model.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/ProcessResult;", "", "outputBitmap", "Landroid/graphics/Bitmap;", "modelList", "", "", "modelProcessedBitmap", "modelProcessedRawData", "Lkotlin/Pair;", "", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/Pair;)V", "getOutputBitmap", "()Landroid/graphics/Bitmap;", "getModelList", "()Ljava/util/List;", "getModelProcessedBitmap", "getModelProcessedRawData", "()Lkotlin/Pair;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProcessResult {
    public static final int $stable = 8;
    private final List<Float> modelList;
    private final Bitmap modelProcessedBitmap;
    private final Pair<float[], float[]> modelProcessedRawData;
    private final Bitmap outputBitmap;

    public ProcessResult(Bitmap bitmap, List<Float> list, Bitmap bitmap2, Pair<float[], float[]> pair) {
        bitmap.getClass();
        list.getClass();
        bitmap2.getClass();
        this.outputBitmap = bitmap;
        this.modelList = list;
        this.modelProcessedBitmap = bitmap2;
        this.modelProcessedRawData = pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProcessResult copy$default(ProcessResult processResult, Bitmap bitmap, List list, Bitmap bitmap2, Pair pair, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = processResult.outputBitmap;
        }
        if ((i & 2) != 0) {
            list = processResult.modelList;
        }
        if ((i & 4) != 0) {
            bitmap2 = processResult.modelProcessedBitmap;
        }
        if ((i & 8) != 0) {
            pair = processResult.modelProcessedRawData;
        }
        return processResult.copy(bitmap, list, bitmap2, pair);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getOutputBitmap() {
        return this.outputBitmap;
    }

    public final List<Float> component2() {
        return this.modelList;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getModelProcessedBitmap() {
        return this.modelProcessedBitmap;
    }

    public final Pair<float[], float[]> component4() {
        return this.modelProcessedRawData;
    }

    public final ProcessResult copy(Bitmap outputBitmap, List<Float> modelList, Bitmap modelProcessedBitmap, Pair<float[], float[]> modelProcessedRawData) {
        outputBitmap.getClass();
        modelList.getClass();
        modelProcessedBitmap.getClass();
        return new ProcessResult(outputBitmap, modelList, modelProcessedBitmap, modelProcessedRawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessResult)) {
            return false;
        }
        ProcessResult processResult = (ProcessResult) other;
        if (Intrinsics.areEqual(this.outputBitmap, processResult.outputBitmap) && Intrinsics.areEqual(this.modelList, processResult.modelList) && Intrinsics.areEqual(this.modelProcessedBitmap, processResult.modelProcessedBitmap) && Intrinsics.areEqual(this.modelProcessedRawData, processResult.modelProcessedRawData)) {
            return true;
        }
        return false;
    }

    public final List<Float> getModelList() {
        return this.modelList;
    }

    public final Bitmap getModelProcessedBitmap() {
        return this.modelProcessedBitmap;
    }

    public final Pair<float[], float[]> getModelProcessedRawData() {
        return this.modelProcessedRawData;
    }

    public final Bitmap getOutputBitmap() {
        return this.outputBitmap;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.modelProcessedBitmap.hashCode() + a.a(this.modelList, this.outputBitmap.hashCode() * 31, 31)) * 31;
        Pair<float[], float[]> pair = this.modelProcessedRawData;
        if (pair == null) {
            hashCode = 0;
        } else {
            hashCode = pair.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "ProcessResult(outputBitmap=" + this.outputBitmap + ", modelList=" + this.modelList + ", modelProcessedBitmap=" + this.modelProcessedBitmap + ", modelProcessedRawData=" + this.modelProcessedRawData + ")";
    }
}
