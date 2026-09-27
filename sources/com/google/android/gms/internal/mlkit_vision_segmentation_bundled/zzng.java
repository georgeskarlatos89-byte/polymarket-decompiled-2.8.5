package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzng implements zzca {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);

    private final int zzl;

    zzng(int i) {
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzca
    public final int zza() {
        return this.zzl;
    }
}
