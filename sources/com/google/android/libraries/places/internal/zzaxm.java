package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaxm implements zzbsc {
    static final zzbsc zza = new zzaxm();

    private zzaxm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzaxn zzaxnVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    zzaxnVar = null;
                } else {
                    zzaxnVar = zzaxn.SEARCH_NEARBY_REQUEST;
                }
            } else {
                zzaxnVar = zzaxn.SEARCH_BY_TEXT_REQUEST;
            }
        } else {
            zzaxnVar = zzaxn.UNDEFINED;
        }
        if (zzaxnVar != null) {
            return true;
        }
        return false;
    }
}
