package com.socure.docv.capturesdk.feature.scanner.data;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.common.utils.ExtractedImageData;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.provider.interfaces.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\"\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010+R(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R(\u0010/\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/socure/docv/capturesdk/feature/scanner/data/VideoSource;", "Lcom/socure/docv/capturesdk/core/provider/interfaces/c;", "Lcom/socure/docv/capturesdk/feature/scanner/data/VideoManager;", "videoManager", "", "", "cropViewCoordinates", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "scanType", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "", "previewListener", "Lkotlin/Function2;", "Lcom/socure/docv/capturesdk/common/utils/ExtractedImageData;", "listener", "<init>", "(Lcom/socure/docv/capturesdk/feature/scanner/data/VideoManager;Ljava/util/List;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "startGeneratingFrame", "()V", "stopGeneratingFrame", "", "enable", "toggleAnalysisMode", "(Z)V", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "captureType", "", "currentCount", "Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;", "viewDimensions", "Lcom/socure/docv/capturesdk/core/provider/interfaces/a;", "captureListener", "takePicture", "(Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;ILcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;Lcom/socure/docv/capturesdk/core/provider/interfaces/a;)V", "updateViewDimensions", "(Lcom/socure/docv/capturesdk/feature/scanner/data/ViewDimensions;)V", "freeze", "Lcom/socure/docv/capturesdk/feature/scanner/data/VideoManager;", "Ljava/util/List;", "getCropViewCoordinates", "()Ljava/util/List;", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "getFrameListener", "()Lkotlin/jvm/functions/Function2;", "frameListener", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VideoSource implements c {
    public static final int $stable = 8;
    private final List<List<Double>> cropViewCoordinates;
    private final Function2<ExtractedImageData, ExtractedImageData, Unit> listener;
    private final Function1<Bitmap, Unit> previewListener;
    private final ScanType scanType;
    private final VideoManager videoManager;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSource(VideoManager videoManager, List<List<Double>> list, ScanType scanType, Function1<? super Bitmap, Unit> function1, Function2<? super ExtractedImageData, ? super ExtractedImageData, Unit> function2) {
        videoManager.getClass();
        list.getClass();
        scanType.getClass();
        function1.getClass();
        function2.getClass();
        this.videoManager = videoManager;
        this.cropViewCoordinates = list;
        this.scanType = scanType;
        this.previewListener = function1;
        this.listener = function2;
    }

    public List<List<Double>> getCropViewCoordinates() {
        return this.cropViewCoordinates;
    }

    public Function2<ExtractedImageData, ExtractedImageData, Unit> getFrameListener() {
        return this.listener;
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.c
    public void takePicture(CaptureType captureType, int currentCount, ViewDimensions viewDimensions, com.socure.docv.capturesdk.core.provider.interfaces.a captureListener) {
        captureType.getClass();
        viewDimensions.getClass();
        captureListener.getClass();
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.c
    public void updateViewDimensions(ViewDimensions viewDimensions) {
        viewDimensions.getClass();
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.c
    public void freeze() {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.c
    public void startGeneratingFrame() {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.c
    public void stopGeneratingFrame() {
    }

    @Override // com.socure.docv.capturesdk.core.provider.interfaces.c
    public void toggleAnalysisMode(boolean enable) {
    }
}
