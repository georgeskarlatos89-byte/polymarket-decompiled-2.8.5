package com.google.mlkit.vision.documentscanner;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class GmsDocumentScanning {
    private GmsDocumentScanning() {
    }

    public static GmsDocumentScanner getClient(GmsDocumentScannerOptions gmsDocumentScannerOptions) {
        return new com.google.mlkit.vision.documentscanner.internal.zzb(gmsDocumentScannerOptions);
    }
}
