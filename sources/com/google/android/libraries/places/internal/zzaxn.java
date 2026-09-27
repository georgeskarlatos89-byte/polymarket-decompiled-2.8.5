package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzaxn implements zzbsa {
    UNDEFINED(0),
    SEARCH_BY_TEXT_REQUEST(1),
    SEARCH_NEARBY_REQUEST(2);

    private final int zzd;

    zzaxn(int i) {
        this.zzd = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zzd;
    }
}
