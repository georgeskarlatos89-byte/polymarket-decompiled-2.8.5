package com.google.android.libraries.places.internal;

import com.google.mlkit.vision.common.InputImage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzawi implements zzbsc {
    static final zzbsc zza = new zzawi();

    private zzawi() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return true;
        }
        switch (i) {
            case 33:
            case 34:
            case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
            case 36:
                return true;
            default:
                return false;
        }
    }
}
