package com.google.android.libraries.places.internal;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import defpackage.zh4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzagp implements zzbsc {
    static final zzbsc zza = new zzagp();

    private zzagp() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case MlKitException.UNSUPPORTED /* 18 */:
            case zh4.REMOTE_EXCEPTION /* 19 */:
            case 20:
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
            case 31:
            case 32:
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
