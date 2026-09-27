package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzayg implements zzbsc {
    static final zzbsc zza = new zzayg();

    private zzayg() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzayh zzayhVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    zzayhVar = null;
                } else {
                    zzayhVar = zzayh.HORIZONTAL;
                }
            } else {
                zzayhVar = zzayh.VERTICAL;
            }
        } else {
            zzayhVar = zzayh.PLACE_WIDGET_ORIENTATION_UNSPECIFIED;
        }
        if (zzayhVar != null) {
            return true;
        }
        return false;
    }
}
