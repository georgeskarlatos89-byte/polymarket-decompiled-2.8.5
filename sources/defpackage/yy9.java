package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yy9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ yy9[] $VALUES;
    public static final yy9 Focused;
    public static final yy9 UnfocusedEmpty;
    public static final yy9 UnfocusedNotEmpty;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, yy9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yy9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, yy9] */
    static {
        ?? r0 = new Enum("Focused", 0);
        Focused = r0;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        UnfocusedEmpty = r1;
        ?? r2 = new Enum("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = r2;
        yy9[] yy9VarArr = {r0, r1, r2};
        $VALUES = yy9VarArr;
        $ENTRIES = new wg7(yy9VarArr);
    }

    public static yy9 valueOf(String str) {
        return (yy9) Enum.valueOf(yy9.class, str);
    }

    public static yy9[] values() {
        return (yy9[]) $VALUES.clone();
    }
}
