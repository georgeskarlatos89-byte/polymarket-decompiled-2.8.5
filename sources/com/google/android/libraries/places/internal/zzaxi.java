package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaxi implements zzbsc {
    static final zzbsc zza = new zzaxi();

    private zzaxi() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzaxj zzaxjVar;
        switch (i) {
            case 0:
                zzaxjVar = zzaxj.CONTENT_UNDEFINED;
                break;
            case 1:
                zzaxjVar = zzaxj.PHOTO;
                break;
            case 2:
                zzaxjVar = zzaxj.ADDRESS;
                break;
            case 3:
                zzaxjVar = zzaxj.RATING;
                break;
            case 4:
                zzaxjVar = zzaxj.TYPE;
                break;
            case 5:
                zzaxjVar = zzaxj.PRICE;
                break;
            case 6:
                zzaxjVar = zzaxj.ACCESSIBILITY;
                break;
            case 7:
                zzaxjVar = zzaxj.OPEN_NOW_STATUS;
                break;
            default:
                zzaxjVar = null;
                break;
        }
        if (zzaxjVar != null) {
            return true;
        }
        return false;
    }
}
