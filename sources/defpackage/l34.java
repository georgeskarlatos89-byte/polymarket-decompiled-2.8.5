package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l34 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ l34[] $VALUES;
    public static final l34 HideAll;
    public static final l34 MonthDayOnly;
    public static final l34 ShowAll;
    public static final l34 YearOnly;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, l34] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, l34] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, l34] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, l34] */
    static {
        ?? r0 = new Enum("ShowAll", 0);
        ShowAll = r0;
        ?? r1 = new Enum("HideAll", 1);
        HideAll = r1;
        ?? r2 = new Enum("YearOnly", 2);
        YearOnly = r2;
        ?? r3 = new Enum("MonthDayOnly", 3);
        MonthDayOnly = r3;
        l34[] l34VarArr = {r0, r1, r2, r3};
        $VALUES = l34VarArr;
        $ENTRIES = new wg7(l34VarArr);
    }

    public static l34 valueOf(String str) {
        return (l34) Enum.valueOf(l34.class, str);
    }

    public static l34[] values() {
        return (l34[]) $VALUES.clone();
    }
}
