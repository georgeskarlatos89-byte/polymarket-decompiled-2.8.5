package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzayb implements zzbsc {
    static final zzbsc zza = new zzayb();

    private zzayb() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzayc zzaycVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    zzaycVar = null;
                } else {
                    zzaycVar = zzayc.POSITION_BOTTOM;
                }
            } else {
                zzaycVar = zzayc.POSITION_TOP;
            }
        } else {
            zzaycVar = zzayc.POSITION_UNDEFINED;
        }
        if (zzaycVar != null) {
            return true;
        }
        return false;
    }
}
