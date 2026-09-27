package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum o2d {
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17),
    NONE(-1);

    private static final SparseArray<o2d> valueMap;
    private final int value;

    static {
        o2d o2dVar = MOBILE;
        o2d o2dVar2 = WIFI;
        o2d o2dVar3 = MOBILE_MMS;
        o2d o2dVar4 = MOBILE_SUPL;
        o2d o2dVar5 = MOBILE_DUN;
        o2d o2dVar6 = MOBILE_HIPRI;
        o2d o2dVar7 = WIMAX;
        o2d o2dVar8 = BLUETOOTH;
        o2d o2dVar9 = DUMMY;
        o2d o2dVar10 = ETHERNET;
        o2d o2dVar11 = MOBILE_FOTA;
        o2d o2dVar12 = MOBILE_IMS;
        o2d o2dVar13 = MOBILE_CBS;
        o2d o2dVar14 = WIFI_P2P;
        o2d o2dVar15 = MOBILE_IA;
        o2d o2dVar16 = MOBILE_EMERGENCY;
        o2d o2dVar17 = PROXY;
        o2d o2dVar18 = VPN;
        o2d o2dVar19 = NONE;
        SparseArray<o2d> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, o2dVar);
        sparseArray.put(1, o2dVar2);
        sparseArray.put(2, o2dVar3);
        sparseArray.put(3, o2dVar4);
        sparseArray.put(4, o2dVar5);
        sparseArray.put(5, o2dVar6);
        sparseArray.put(6, o2dVar7);
        sparseArray.put(7, o2dVar8);
        sparseArray.put(8, o2dVar9);
        sparseArray.put(9, o2dVar10);
        sparseArray.put(10, o2dVar11);
        sparseArray.put(11, o2dVar12);
        sparseArray.put(12, o2dVar13);
        sparseArray.put(13, o2dVar14);
        sparseArray.put(14, o2dVar15);
        sparseArray.put(15, o2dVar16);
        sparseArray.put(16, o2dVar17);
        sparseArray.put(17, o2dVar18);
        sparseArray.put(-1, o2dVar19);
    }

    o2d(int i) {
        this.value = i;
    }

    public static o2d a(int i) {
        return valueMap.get(i);
    }

    public final int b() {
        return this.value;
    }
}
