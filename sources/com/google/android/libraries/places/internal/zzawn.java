package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzawn implements zzbsa {
    CONTENT_UNDEFINED(0),
    PHOTO(1),
    ADDRESS(2),
    RATING(3),
    TYPE(4),
    PRICE(5),
    ACCESSIBILITY(6),
    MAPS_LINK(7),
    DIRECTIONS_LINK(8),
    OPEN_NOW_STATUS(9),
    SUMMARY(10),
    OPENING_HOURS(11),
    WEBSITE(12),
    PHONE_NUMBER(13),
    TYPE_SPECIFIC_HIGHLIGHTS(14),
    REVIEWS(15),
    PLUS_CODE(16),
    FEATURES(17),
    GENERATIVE_SUMMARY(18),
    POPULAR_TIMES(19);

    private final int zzu;

    zzawn(int i) {
        this.zzu = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzu);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zzu;
    }
}
