package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzayh implements zzbsa {
    PLACE_WIDGET_ORIENTATION_UNSPECIFIED(0),
    VERTICAL(1),
    HORIZONTAL(2);

    private final int zzd;

    zzayh(int i) {
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
