package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzavg implements zzbsc {
    static final zzbsc zza = new zzavg();

    private zzavg() {
    }

    @Override // com.google.android.libraries.places.internal.zzbsc
    public final boolean zza(int i) {
        zzavh zzavhVar;
        switch (i) {
            case 0:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                zzavhVar = zzavh.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                zzavhVar = null;
                break;
        }
        if (zzavhVar != null) {
            return true;
        }
        return false;
    }
}
