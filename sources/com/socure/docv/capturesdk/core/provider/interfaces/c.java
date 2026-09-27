package com.socure.docv.capturesdk.core.provider.interfaces;

import com.socure.docv.capturesdk.core.pipeline.model.CaptureType;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public interface c {
    void freeze();

    void startGeneratingFrame();

    void stopGeneratingFrame();

    void takePicture(CaptureType captureType, int i, ViewDimensions viewDimensions, a aVar);

    void toggleAnalysisMode(boolean z);

    void updateViewDimensions(ViewDimensions viewDimensions);
}
