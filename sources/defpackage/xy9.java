package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xy9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ xy9[] $VALUES;
    public static final xy9 Focused;
    public static final xy9 UnfocusedEmpty;
    public static final xy9 UnfocusedNotEmpty;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xy9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xy9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xy9] */
    static {
        ?? r0 = new Enum("Focused", 0);
        Focused = r0;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        UnfocusedEmpty = r1;
        ?? r2 = new Enum("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = r2;
        xy9[] xy9VarArr = {r0, r1, r2};
        $VALUES = xy9VarArr;
        $ENTRIES = new wg7(xy9VarArr);
    }

    public static xy9 valueOf(String str) {
        return (xy9) Enum.valueOf(xy9.class, str);
    }

    public static xy9[] values() {
        return (xy9[]) $VALUES.clone();
    }
}
