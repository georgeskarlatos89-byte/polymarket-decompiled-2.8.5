package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzawq implements zzbsc {
    static final zzbsc zza = new zzawq();

    private zzawq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzawr zzawrVar;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                zzawrVar = null;
                            } else {
                                zzawrVar = zzawr.VARIANT_COMPACT_INTERNAL;
                            }
                        } else {
                            zzawrVar = zzawr.VARIANT_FULL_ADVANCED;
                        }
                    } else {
                        zzawrVar = zzawr.VARIANT_COMPACT_ADVANCED;
                    }
                } else {
                    zzawrVar = zzawr.VARIANT_FULL;
                }
            } else {
                zzawrVar = zzawr.VARIANT_COMPACT;
            }
        } else {
            zzawrVar = zzawr.VARIANT_UNDEFINED;
        }
        if (zzawrVar != null) {
            return true;
        }
        return false;
    }
}
