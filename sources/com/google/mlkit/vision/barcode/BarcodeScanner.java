package com.google.mlkit.vision.barcode;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import defpackage.fld;
import defpackage.gw7;
import defpackage.lid;
import defpackage.m6b;
import defpackage.xgc;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public interface BarcodeScanner extends Detector<List<Barcode>>, fld {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @lid(m6b.ON_DESTROY)
    void close();

    @Override // defpackage.fld
    /* synthetic */ gw7[] getOptionalFeatures();

    Task<List<Barcode>> process(InputImage inputImage);

    Task<List<Barcode>> process(xgc xgcVar);
}
