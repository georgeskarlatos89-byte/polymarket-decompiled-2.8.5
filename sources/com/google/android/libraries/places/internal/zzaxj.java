package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzaxj implements zzbsa {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    OPEN_NOW_STATUS(7);

    private final int zzi;

    zzaxj(int i) {
        this.zzi = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zzi;
    }
}
