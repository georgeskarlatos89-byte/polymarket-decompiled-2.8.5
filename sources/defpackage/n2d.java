package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum n2d {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);

    private static final SparseArray<n2d> valueMap;
    private final int value;

    static {
        n2d n2dVar = UNKNOWN_MOBILE_SUBTYPE;
        n2d n2dVar2 = GPRS;
        n2d n2dVar3 = EDGE;
        n2d n2dVar4 = UMTS;
        n2d n2dVar5 = CDMA;
        n2d n2dVar6 = EVDO_0;
        n2d n2dVar7 = EVDO_A;
        n2d n2dVar8 = RTT;
        n2d n2dVar9 = HSDPA;
        n2d n2dVar10 = HSUPA;
        n2d n2dVar11 = HSPA;
        n2d n2dVar12 = IDEN;
        n2d n2dVar13 = EVDO_B;
        n2d n2dVar14 = LTE;
        n2d n2dVar15 = EHRPD;
        n2d n2dVar16 = HSPAP;
        n2d n2dVar17 = GSM;
        n2d n2dVar18 = TD_SCDMA;
        n2d n2dVar19 = IWLAN;
        n2d n2dVar20 = LTE_CA;
        SparseArray<n2d> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, n2dVar);
        sparseArray.put(1, n2dVar2);
        sparseArray.put(2, n2dVar3);
        sparseArray.put(3, n2dVar4);
        sparseArray.put(4, n2dVar5);
        sparseArray.put(5, n2dVar6);
        sparseArray.put(6, n2dVar7);
        sparseArray.put(7, n2dVar8);
        sparseArray.put(8, n2dVar9);
        sparseArray.put(9, n2dVar10);
        sparseArray.put(10, n2dVar11);
        sparseArray.put(11, n2dVar12);
        sparseArray.put(12, n2dVar13);
        sparseArray.put(13, n2dVar14);
        sparseArray.put(14, n2dVar15);
        sparseArray.put(15, n2dVar16);
        sparseArray.put(16, n2dVar17);
        sparseArray.put(17, n2dVar18);
        sparseArray.put(18, n2dVar19);
        sparseArray.put(19, n2dVar20);
    }

    n2d(int i) {
        this.value = i;
    }

    public static n2d a(int i) {
        return valueMap.get(i);
    }

    public final int b() {
        return this.value;
    }
}
