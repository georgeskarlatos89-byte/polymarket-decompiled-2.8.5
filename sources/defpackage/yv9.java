package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class yv9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yv9[] $VALUES;
    public static final yv9 ActiveByQuery;
    public static final yv9 ActiveBySearch;
    public static final yv9 Inactive;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yv9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yv9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yv9] */
    static {
        ?? r0 = new Enum("ActiveByQuery", 0);
        ActiveByQuery = r0;
        ?? r1 = new Enum("ActiveBySearch", 1);
        ActiveBySearch = r1;
        ?? r2 = new Enum("Inactive", 2);
        Inactive = r2;
        yv9[] yv9VarArr = {r0, r1, r2};
        $VALUES = yv9VarArr;
        $ENTRIES = new wg7(yv9VarArr);
    }

    public static yv9 valueOf(String str) {
        return (yv9) Enum.valueOf(yv9.class, str);
    }

    public static yv9[] values() {
        return (yv9[]) $VALUES.clone();
    }
}
