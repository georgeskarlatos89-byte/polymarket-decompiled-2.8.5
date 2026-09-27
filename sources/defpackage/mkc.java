package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class mkc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mkc[] $VALUES;
    public static final mkc APRIL;
    public static final mkc AUGUST;
    public static final hkc Companion;
    public static final mkc DECEMBER;
    public static final mkc FEBRUARY;
    public static final mkc JANUARY;
    public static final mkc JULY;
    public static final mkc JUNE;
    public static final mkc MARCH;
    public static final mkc MAY;
    public static final mkc NOVEMBER;
    public static final mkc OCTOBER;
    public static final mkc SEPTEMBER;
    private final int value;

    /* JADX WARN: Type inference failed for: r0v2, types: [hkc, java.lang.Object] */
    static {
        mkc mkcVar = new mkc("JANUARY", 0, 0);
        JANUARY = mkcVar;
        mkc mkcVar2 = new mkc("FEBRUARY", 1, 1);
        FEBRUARY = mkcVar2;
        mkc mkcVar3 = new mkc("MARCH", 2, 2);
        MARCH = mkcVar3;
        mkc mkcVar4 = new mkc("APRIL", 3, 3);
        APRIL = mkcVar4;
        mkc mkcVar5 = new mkc("MAY", 4, 4);
        MAY = mkcVar5;
        mkc mkcVar6 = new mkc("JUNE", 5, 5);
        JUNE = mkcVar6;
        mkc mkcVar7 = new mkc("JULY", 6, 6);
        JULY = mkcVar7;
        mkc mkcVar8 = new mkc("AUGUST", 7, 7);
        AUGUST = mkcVar8;
        mkc mkcVar9 = new mkc("SEPTEMBER", 8, 8);
        SEPTEMBER = mkcVar9;
        mkc mkcVar10 = new mkc("OCTOBER", 9, 9);
        OCTOBER = mkcVar10;
        mkc mkcVar11 = new mkc("NOVEMBER", 10, 10);
        NOVEMBER = mkcVar11;
        mkc mkcVar12 = new mkc("DECEMBER", 11, 11);
        DECEMBER = mkcVar12;
        mkc[] mkcVarArr = {mkcVar, mkcVar2, mkcVar3, mkcVar4, mkcVar5, mkcVar6, mkcVar7, mkcVar8, mkcVar9, mkcVar10, mkcVar11, mkcVar12};
        $VALUES = mkcVarArr;
        $ENTRIES = new wg7(mkcVarArr);
        Companion = new Object();
    }

    public mkc(String str, int i, int i2) {
        this.value = i2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static mkc valueOf(String str) {
        return (mkc) Enum.valueOf(mkc.class, str);
    }

    public static mkc[] values() {
        return (mkc[]) $VALUES.clone();
    }

    public final int b() {
        return this.value;
    }
}
