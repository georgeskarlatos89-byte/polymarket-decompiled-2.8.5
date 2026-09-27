package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaxo implements zzbsc {
    static final zzbsc zza = new zzaxo();

    private zzaxo() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzaxp zzaxpVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    zzaxpVar = null;
                } else {
                    zzaxpVar = zzaxp.ADVANCED_SEARCH;
                }
            } else {
                zzaxpVar = zzaxp.SEARCH;
            }
        } else {
            zzaxpVar = zzaxp.UNSPECIFIED;
        }
        if (zzaxpVar != null) {
            return true;
        }
        return false;
    }
}
