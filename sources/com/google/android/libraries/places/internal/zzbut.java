package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzbut implements zzbsa {
    WIDGET_TYPE_UNSPECIFIED(0),
    PLACE_DETAILS(1),
    PLACE_LIST(2),
    PLACE_AUTOCOMPLETE(3),
    ELEVATION(4),
    ADVANCED_PLACE_DETAILS(6),
    ADVANCED_PLACE_SEARCH(7),
    ADVANCED_PLACE_LIST(8),
    INTERNAL_PLACE_DETAILS(5),
    INTERNAL_PLACE_DETAILS_EMBED(9),
    INTERNAL_PLACE_DETAILS_MAP2D(10),
    UNRECOGNIZED(-1);

    private final int zzm;

    zzbut(int i) {
        this.zzm = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        if (this == UNRECOGNIZED) {
            return zzbsh.zza();
        }
        return this.zzm;
    }
}
