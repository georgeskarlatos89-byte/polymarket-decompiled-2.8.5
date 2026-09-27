package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzawr implements zzbsa {
    VARIANT_UNDEFINED(0),
    VARIANT_COMPACT(1),
    VARIANT_FULL(2),
    VARIANT_COMPACT_ADVANCED(3),
    VARIANT_FULL_ADVANCED(4),
    VARIANT_COMPACT_INTERNAL(5);

    private final int zzg;

    zzawr(int i) {
        this.zzg = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zzg;
    }
}
