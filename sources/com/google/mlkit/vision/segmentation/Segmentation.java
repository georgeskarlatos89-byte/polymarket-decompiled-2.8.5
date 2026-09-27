package com.google.mlkit.vision.segmentation;

import com.google.mlkit.vision.segmentation.internal.SegmenterImpl;
import com.google.mlkit.vision.segmentation.selfie.SelfieSegmenterOptions;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class Segmentation {
    private Segmentation() {
    }

    public static Segmenter getClient(SelfieSegmenterOptions selfieSegmenterOptions) {
        return SegmenterImpl.newInstance(selfieSegmenterOptions);
    }
}
