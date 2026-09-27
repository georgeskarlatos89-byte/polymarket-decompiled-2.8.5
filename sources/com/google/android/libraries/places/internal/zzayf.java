package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzayf implements zzbsa {
    PLACE_WIDGET_MEDIA_SIZE_UNSPECIFIED(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int zze;

    zzayf(int i) {
        this.zze = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zze;
    }
}
