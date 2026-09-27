package com.google.android.libraries.places.internal;

import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import defpackage.zh4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbgc implements zzbsc {
    static final zzbsc zza = new zzbgc();

    private zzbgc() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 99) {
            return true;
        }
        switch (i) {
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
                return true;
            default:
                return false;
        }
    }
}
