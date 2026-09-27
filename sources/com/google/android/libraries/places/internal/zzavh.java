package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzavh implements zzbsa {
    EV_CONNECTOR_TYPE_UNSPECIFIED(0),
    EV_CONNECTOR_TYPE_OTHER(1),
    EV_CONNECTOR_TYPE_J1772(2),
    EV_CONNECTOR_TYPE_TYPE_2(3),
    EV_CONNECTOR_TYPE_CHADEMO(4),
    EV_CONNECTOR_TYPE_CCS_COMBO_1(5),
    EV_CONNECTOR_TYPE_CCS_COMBO_2(6),
    EV_CONNECTOR_TYPE_TESLA(7),
    EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T(8),
    EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET(9),
    EV_CONNECTOR_TYPE_NACS(10);

    private final int zzl;

    zzavh(int i) {
        this.zzl = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzl);
    }

    @Override // com.google.android.libraries.places.internal.zzbsa
    public final int zza() {
        return this.zzl;
    }
}
