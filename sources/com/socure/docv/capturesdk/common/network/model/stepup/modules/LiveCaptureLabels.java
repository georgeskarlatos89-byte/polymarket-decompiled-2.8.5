package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureLabels;", "", "cameraLoading", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraLoading;", "cameraCapture", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraCapture;", "cameraImagePreview", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraImagePreview;", "<init>", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraLoading;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraCapture;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraImagePreview;)V", "getCameraLoading", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraLoading;", "getCameraCapture", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraCapture;", "getCameraImagePreview", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/LiveCaptureCameraImagePreview;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class LiveCaptureLabels {
    public static final int $stable = 0;
    private final LiveCaptureCameraCapture cameraCapture;
    private final LiveCaptureCameraImagePreview cameraImagePreview;
    private final LiveCaptureCameraLoading cameraLoading;

    public /* synthetic */ LiveCaptureLabels(LiveCaptureCameraLoading liveCaptureCameraLoading, LiveCaptureCameraCapture liveCaptureCameraCapture, LiveCaptureCameraImagePreview liveCaptureCameraImagePreview, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : liveCaptureCameraLoading, (i & 2) != 0 ? null : liveCaptureCameraCapture, (i & 4) != 0 ? null : liveCaptureCameraImagePreview);
    }

    public static /* synthetic */ LiveCaptureLabels copy$default(LiveCaptureLabels liveCaptureLabels, LiveCaptureCameraLoading liveCaptureCameraLoading, LiveCaptureCameraCapture liveCaptureCameraCapture, LiveCaptureCameraImagePreview liveCaptureCameraImagePreview, int i, Object obj) {
        if ((i & 1) != 0) {
            liveCaptureCameraLoading = liveCaptureLabels.cameraLoading;
        }
        if ((i & 2) != 0) {
            liveCaptureCameraCapture = liveCaptureLabels.cameraCapture;
        }
        if ((i & 4) != 0) {
            liveCaptureCameraImagePreview = liveCaptureLabels.cameraImagePreview;
        }
        return liveCaptureLabels.copy(liveCaptureCameraLoading, liveCaptureCameraCapture, liveCaptureCameraImagePreview);
    }

    /* renamed from: component1, reason: from getter */
    public final LiveCaptureCameraLoading getCameraLoading() {
        return this.cameraLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final LiveCaptureCameraCapture getCameraCapture() {
        return this.cameraCapture;
    }

    /* renamed from: component3, reason: from getter */
    public final LiveCaptureCameraImagePreview getCameraImagePreview() {
        return this.cameraImagePreview;
    }

    public final LiveCaptureLabels copy(LiveCaptureCameraLoading cameraLoading, LiveCaptureCameraCapture cameraCapture, LiveCaptureCameraImagePreview cameraImagePreview) {
        return new LiveCaptureLabels(cameraLoading, cameraCapture, cameraImagePreview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCaptureLabels)) {
            return false;
        }
        LiveCaptureLabels liveCaptureLabels = (LiveCaptureLabels) other;
        if (Intrinsics.areEqual(this.cameraLoading, liveCaptureLabels.cameraLoading) && Intrinsics.areEqual(this.cameraCapture, liveCaptureLabels.cameraCapture) && Intrinsics.areEqual(this.cameraImagePreview, liveCaptureLabels.cameraImagePreview)) {
            return true;
        }
        return false;
    }

    public final LiveCaptureCameraCapture getCameraCapture() {
        return this.cameraCapture;
    }

    public final LiveCaptureCameraImagePreview getCameraImagePreview() {
        return this.cameraImagePreview;
    }

    public final LiveCaptureCameraLoading getCameraLoading() {
        return this.cameraLoading;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        LiveCaptureCameraLoading liveCaptureCameraLoading = this.cameraLoading;
        int i = 0;
        if (liveCaptureCameraLoading == null) {
            hashCode = 0;
        } else {
            hashCode = liveCaptureCameraLoading.hashCode();
        }
        int i2 = hashCode * 31;
        LiveCaptureCameraCapture liveCaptureCameraCapture = this.cameraCapture;
        if (liveCaptureCameraCapture == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = liveCaptureCameraCapture.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        LiveCaptureCameraImagePreview liveCaptureCameraImagePreview = this.cameraImagePreview;
        if (liveCaptureCameraImagePreview != null) {
            i = liveCaptureCameraImagePreview.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "LiveCaptureLabels(cameraLoading=" + this.cameraLoading + ", cameraCapture=" + this.cameraCapture + ", cameraImagePreview=" + this.cameraImagePreview + ")";
    }

    public LiveCaptureLabels(LiveCaptureCameraLoading liveCaptureCameraLoading, LiveCaptureCameraCapture liveCaptureCameraCapture, LiveCaptureCameraImagePreview liveCaptureCameraImagePreview) {
        this.cameraLoading = liveCaptureCameraLoading;
        this.cameraCapture = liveCaptureCameraCapture;
        this.cameraImagePreview = liveCaptureCameraImagePreview;
    }

    public LiveCaptureLabels() {
        this(null, null, null, 7, null);
    }
}
