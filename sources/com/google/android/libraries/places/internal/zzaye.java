package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaye implements zzbsc {
    static final zzbsc zza = new zzaye();

    private zzaye() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzayf zzayfVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        zzayfVar = null;
                    } else {
                        zzayfVar = zzayf.LARGE;
                    }
                } else {
                    zzayfVar = zzayf.MEDIUM;
                }
            } else {
                zzayfVar = zzayf.SMALL;
            }
        } else {
            zzayfVar = zzayf.PLACE_WIDGET_MEDIA_SIZE_UNSPECIFIED;
        }
        if (zzayfVar != null) {
            return true;
        }
        return false;
    }
}
