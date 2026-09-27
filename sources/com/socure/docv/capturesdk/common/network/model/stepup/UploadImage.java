package com.socure.docv.capturesdk.common.network.model.stepup;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.MultiframeImage;
import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00105\"\u0004\b:\u00107¨\u0006;"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "", "<init>", "()V", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "getScanType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "setScanType", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;)V", "captureType", "Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "getCaptureType", "()Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;", "setCaptureType", "(Lcom/socure/docv/capturesdk/core/pipeline/model/CaptureType;)V", "documentBody", "Lokhttp3/MultipartBody$Part;", "getDocumentBody", "()Lokhttp3/MultipartBody$Part;", "setDocumentBody", "(Lokhttp3/MultipartBody$Part;)V", "metricsData", "getMetricsData", "setMetricsData", "extractedData", "Lcom/socure/docv/capturesdk/common/network/model/stepup/ExtractedStepUpData;", "getExtractedData", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/ExtractedStepUpData;", "setExtractedData", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/ExtractedStepUpData;)V", "image", "", "getImage", "()[B", "setImage", "([B)V", "dimension", "Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "getDimension", "()Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;", "setDimension", "(Lcom/socure/docv/capturesdk/feature/scanner/data/Dimension;)V", "selfieMetrics", "Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "getSelfieMetrics", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;", "setSelfieMetrics", "(Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieMetrics;)V", "multiframeImages", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MultiframeImage;", "getMultiframeImages", "()Ljava/util/List;", "setMultiframeImages", "(Ljava/util/List;)V", "multiframeParts", "getMultiframeParts", "setMultiframeParts", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadImage {
    public static final int $stable = 8;
    public CaptureType captureType;
    public Dimension dimension;
    private MultipartBody.Part documentBody;
    private ExtractedStepUpData extractedData;
    public byte[] image;
    private MultipartBody.Part metricsData;
    private List<MultiframeImage> multiframeImages;
    private List<MultipartBody.Part> multiframeParts;
    public ScanType scanType;
    private SelfieMetrics selfieMetrics;

    public final CaptureType getCaptureType() {
        CaptureType captureType = this.captureType;
        if (captureType != null) {
            return captureType;
        }
        Intrinsics.i("captureType");
        throw null;
    }

    public final Dimension getDimension() {
        Dimension dimension = this.dimension;
        if (dimension != null) {
            return dimension;
        }
        Intrinsics.i("dimension");
        throw null;
    }

    public final MultipartBody.Part getDocumentBody() {
        return this.documentBody;
    }

    public final ExtractedStepUpData getExtractedData() {
        return this.extractedData;
    }

    public final byte[] getImage() {
        byte[] bArr = this.image;
        if (bArr != null) {
            return bArr;
        }
        Intrinsics.i("image");
        throw null;
    }

    public final MultipartBody.Part getMetricsData() {
        return this.metricsData;
    }

    public final List<MultiframeImage> getMultiframeImages() {
        return this.multiframeImages;
    }

    public final List<MultipartBody.Part> getMultiframeParts() {
        return this.multiframeParts;
    }

    public final ScanType getScanType() {
        ScanType scanType = this.scanType;
        if (scanType != null) {
            return scanType;
        }
        Intrinsics.i("scanType");
        throw null;
    }

    public final SelfieMetrics getSelfieMetrics() {
        return this.selfieMetrics;
    }

    public final void setCaptureType(CaptureType captureType) {
        captureType.getClass();
        this.captureType = captureType;
    }

    public final void setDimension(Dimension dimension) {
        dimension.getClass();
        this.dimension = dimension;
    }

    public final void setDocumentBody(MultipartBody.Part part) {
        this.documentBody = part;
    }

    public final void setExtractedData(ExtractedStepUpData extractedStepUpData) {
        this.extractedData = extractedStepUpData;
    }

    public final void setImage(byte[] bArr) {
        bArr.getClass();
        this.image = bArr;
    }

    public final void setMetricsData(MultipartBody.Part part) {
        this.metricsData = part;
    }

    public final void setMultiframeImages(List<MultiframeImage> list) {
        this.multiframeImages = list;
    }

    public final void setMultiframeParts(List<MultipartBody.Part> list) {
        this.multiframeParts = list;
    }

    public final void setScanType(ScanType scanType) {
        scanType.getClass();
        this.scanType = scanType;
    }

    public final void setSelfieMetrics(SelfieMetrics selfieMetrics) {
        this.selfieMetrics = selfieMetrics;
    }
}
