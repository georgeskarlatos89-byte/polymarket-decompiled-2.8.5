package com.google.mlkit.vision.segmentation;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import defpackage.lid;
import defpackage.m6b;
import defpackage.xgc;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface Segmenter extends Detector<SegmentationMask> {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @lid(m6b.ON_DESTROY)
    void close();

    Task<SegmentationMask> process(InputImage inputImage);

    Task<SegmentationMask> process(xgc xgcVar);
}
