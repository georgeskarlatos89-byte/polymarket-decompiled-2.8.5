package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lkc {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lkc[] $VALUES;
    public static final lkc APRIL;
    public static final lkc AUGUST;
    public static final lkc DECEMBER;
    public static final lkc FEBRUARY;
    public static final lkc JANUARY;
    public static final lkc JULY;
    public static final lkc JUNE;
    public static final lkc MARCH;
    public static final lkc MAY;
    public static final lkc NOVEMBER;
    public static final lkc OCTOBER;
    public static final lkc SEPTEMBER;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, lkc] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, lkc] */
    static {
        ?? r0 = new Enum("JANUARY", 0);
        JANUARY = r0;
        ?? r1 = new Enum("FEBRUARY", 1);
        FEBRUARY = r1;
        ?? r2 = new Enum("MARCH", 2);
        MARCH = r2;
        ?? r3 = new Enum("APRIL", 3);
        APRIL = r3;
        ?? r4 = new Enum("MAY", 4);
        MAY = r4;
        ?? r5 = new Enum("JUNE", 5);
        JUNE = r5;
        ?? r6 = new Enum("JULY", 6);
        JULY = r6;
        ?? r7 = new Enum("AUGUST", 7);
        AUGUST = r7;
        ?? r8 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r8;
        ?? r9 = new Enum("OCTOBER", 9);
        OCTOBER = r9;
        ?? r10 = new Enum("NOVEMBER", 10);
        NOVEMBER = r10;
        ?? r11 = new Enum("DECEMBER", 11);
        DECEMBER = r11;
        lkc[] lkcVarArr = {r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        $VALUES = lkcVarArr;
        $ENTRIES = new wg7(lkcVarArr);
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static lkc valueOf(String str) {
        return (lkc) Enum.valueOf(lkc.class, str);
    }

    public static lkc[] values() {
        return (lkc[]) $VALUES.clone();
    }
}
