package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzbmm implements zzbsa {
    SECONDARY_HOURS_TYPE_UNSPECIFIED(0),
    DRIVE_THROUGH(1),
    HAPPY_HOUR(2),
    DELIVERY(3),
    TAKEOUT(4),
    KITCHEN(5),
    BREAKFAST(6),
    LUNCH(7),
    DINNER(8),
    BRUNCH(9),
    PICKUP(10),
    ACCESS(11),
    SENIOR_HOURS(12),
    ONLINE_SERVICE_HOURS(13),
    UNRECOGNIZED(-1);

    private final int zzp;

    zzbmm(int i) {
        this.zzp = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzp);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        if (this == UNRECOGNIZED) {
            return zzbsh.zza();
        }
        return this.zzp;
    }
}
