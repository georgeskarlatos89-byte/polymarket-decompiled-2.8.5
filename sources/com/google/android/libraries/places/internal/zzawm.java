package com.google.android.libraries.places.internal;

import com.google.mlkit.common.MlKitException;
import defpackage.zh4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzawm implements zzbsc {
    static final zzbsc zza = new zzawm();

    private zzawm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzawn zzawnVar;
        switch (i) {
            case 0:
                zzawnVar = zzawn.CONTENT_UNDEFINED;
                break;
            case 1:
                zzawnVar = zzawn.PHOTO;
                break;
            case 2:
                zzawnVar = zzawn.ADDRESS;
                break;
            case 3:
                zzawnVar = zzawn.RATING;
                break;
            case 4:
                zzawnVar = zzawn.TYPE;
                break;
            case 5:
                zzawnVar = zzawn.PRICE;
                break;
            case 6:
                zzawnVar = zzawn.ACCESSIBILITY;
                break;
            case 7:
                zzawnVar = zzawn.MAPS_LINK;
                break;
            case 8:
                zzawnVar = zzawn.DIRECTIONS_LINK;
                break;
            case 9:
                zzawnVar = zzawn.OPEN_NOW_STATUS;
                break;
            case 10:
                zzawnVar = zzawn.SUMMARY;
                break;
            case 11:
                zzawnVar = zzawn.OPENING_HOURS;
                break;
            case 12:
                zzawnVar = zzawn.WEBSITE;
                break;
            case 13:
                zzawnVar = zzawn.PHONE_NUMBER;
                break;
            case 14:
                zzawnVar = zzawn.TYPE_SPECIFIC_HIGHLIGHTS;
                break;
            case 15:
                zzawnVar = zzawn.REVIEWS;
                break;
            case 16:
                zzawnVar = zzawn.PLUS_CODE;
                break;
            case 17:
                zzawnVar = zzawn.FEATURES;
                break;
            case MlKitException.UNSUPPORTED /* 18 */:
                zzawnVar = zzawn.GENERATIVE_SUMMARY;
                break;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                zzawnVar = zzawn.POPULAR_TIMES;
                break;
            default:
                zzawnVar = null;
                break;
        }
        if (zzawnVar != null) {
            return true;
        }
        return false;
    }
}
