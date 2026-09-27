package com.socure.docv.capturesdk.core.processor.model;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/socure/docv/capturesdk/core/processor/model/SquareCroppedProcessResult;", "", "squareCropRect", "Landroid/graphics/Rect;", "processResult", "Lcom/socure/docv/capturesdk/core/processor/model/ProcessResult;", "<init>", "(Landroid/graphics/Rect;Lcom/socure/docv/capturesdk/core/processor/model/ProcessResult;)V", "getSquareCropRect", "()Landroid/graphics/Rect;", "getProcessResult", "()Lcom/socure/docv/capturesdk/core/processor/model/ProcessResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SquareCroppedProcessResult {
    public static final int $stable = 8;
    private final ProcessResult processResult;
    private final Rect squareCropRect;

    public SquareCroppedProcessResult(Rect rect, ProcessResult processResult) {
        rect.getClass();
        processResult.getClass();
        this.squareCropRect = rect;
        this.processResult = processResult;
    }

    public static /* synthetic */ SquareCroppedProcessResult copy$default(SquareCroppedProcessResult squareCroppedProcessResult, Rect rect, ProcessResult processResult, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = squareCroppedProcessResult.squareCropRect;
        }
        if ((i & 2) != 0) {
            processResult = squareCroppedProcessResult.processResult;
        }
        return squareCroppedProcessResult.copy(rect, processResult);
    }

    /* renamed from: component1, reason: from getter */
    public final Rect getSquareCropRect() {
        return this.squareCropRect;
    }

    /* renamed from: component2, reason: from getter */
    public final ProcessResult getProcessResult() {
        return this.processResult;
    }

    public final SquareCroppedProcessResult copy(Rect squareCropRect, ProcessResult processResult) {
        squareCropRect.getClass();
        processResult.getClass();
        return new SquareCroppedProcessResult(squareCropRect, processResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SquareCroppedProcessResult)) {
            return false;
        }
        SquareCroppedProcessResult squareCroppedProcessResult = (SquareCroppedProcessResult) other;
        if (Intrinsics.areEqual(this.squareCropRect, squareCroppedProcessResult.squareCropRect) && Intrinsics.areEqual(this.processResult, squareCroppedProcessResult.processResult)) {
            return true;
        }
        return false;
    }

    public final ProcessResult getProcessResult() {
        return this.processResult;
    }

    public final Rect getSquareCropRect() {
        return this.squareCropRect;
    }

    public int hashCode() {
        return this.processResult.hashCode() + (this.squareCropRect.hashCode() * 31);
    }

    public String toString() {
        return "SquareCroppedProcessResult(squareCropRect=" + this.squareCropRect + ", processResult=" + this.processResult + ")";
    }
}
