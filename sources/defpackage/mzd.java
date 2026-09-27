package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class mzd {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ mzd[] $VALUES;
    public static final mzd DAY;
    public static final mzd MONTH;
    public static final mzd WEEK;
    public static final mzd YEAR;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, mzd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, mzd] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, mzd] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, mzd] */
    static {
        ?? r0 = new Enum("DAY", 0);
        DAY = r0;
        ?? r1 = new Enum("WEEK", 1);
        WEEK = r1;
        ?? r2 = new Enum("MONTH", 2);
        MONTH = r2;
        ?? r3 = new Enum("YEAR", 3);
        YEAR = r3;
        mzd[] mzdVarArr = {r0, r1, r2, r3};
        $VALUES = mzdVarArr;
        $ENTRIES = new wg7(mzdVarArr);
    }

    public static mzd valueOf(String str) {
        return (mzd) Enum.valueOf(mzd.class, str);
    }

    public static mzd[] values() {
        return (mzd[]) $VALUES.clone();
    }
}
