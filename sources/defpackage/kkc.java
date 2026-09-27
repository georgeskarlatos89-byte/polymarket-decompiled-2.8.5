package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class kkc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kkc[] $VALUES;
    public static final kkc APRIL;
    public static final kkc AUGUST;
    public static final gkc Companion;
    public static final kkc DECEMBER;
    public static final kkc FEBRUARY;
    public static final kkc JANUARY;
    public static final kkc JULY;
    public static final kkc JUNE;
    public static final kkc MARCH;
    public static final kkc MAY;
    public static final kkc NOVEMBER;
    public static final kkc OCTOBER;
    public static final kkc SEPTEMBER;
    private final String value;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, gkc] */
    static {
        kkc kkcVar = new kkc("JANUARY", 0, "Jan");
        JANUARY = kkcVar;
        kkc kkcVar2 = new kkc("FEBRUARY", 1, "Feb");
        FEBRUARY = kkcVar2;
        kkc kkcVar3 = new kkc("MARCH", 2, "Mar");
        MARCH = kkcVar3;
        kkc kkcVar4 = new kkc("APRIL", 3, "Apr");
        APRIL = kkcVar4;
        kkc kkcVar5 = new kkc("MAY", 4, "May");
        MAY = kkcVar5;
        kkc kkcVar6 = new kkc("JUNE", 5, "Jun");
        JUNE = kkcVar6;
        kkc kkcVar7 = new kkc("JULY", 6, "Jul");
        JULY = kkcVar7;
        kkc kkcVar8 = new kkc("AUGUST", 7, "Aug");
        AUGUST = kkcVar8;
        kkc kkcVar9 = new kkc("SEPTEMBER", 8, "Sep");
        SEPTEMBER = kkcVar9;
        kkc kkcVar10 = new kkc("OCTOBER", 9, "Oct");
        OCTOBER = kkcVar10;
        kkc kkcVar11 = new kkc("NOVEMBER", 10, "Nov");
        NOVEMBER = kkcVar11;
        kkc kkcVar12 = new kkc("DECEMBER", 11, "Dec");
        DECEMBER = kkcVar12;
        kkc[] kkcVarArr = {kkcVar, kkcVar2, kkcVar3, kkcVar4, kkcVar5, kkcVar6, kkcVar7, kkcVar8, kkcVar9, kkcVar10, kkcVar11, kkcVar12};
        $VALUES = kkcVarArr;
        $ENTRIES = new wg7(kkcVarArr);
        Companion = new Object();
    }

    public kkc(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static kkc valueOf(String str) {
        return (kkc) Enum.valueOf(kkc.class, str);
    }

    public static kkc[] values() {
        return (kkc[]) $VALUES.clone();
    }
}
