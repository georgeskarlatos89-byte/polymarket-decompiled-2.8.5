package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class wy9 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ wy9[] $VALUES;
    public static final wy9 Focused;
    public static final wy9 UnfocusedEmpty;
    public static final wy9 UnfocusedNotEmpty;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, wy9] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, wy9] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, wy9] */
    static {
        ?? r0 = new Enum("Focused", 0);
        Focused = r0;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        UnfocusedEmpty = r1;
        ?? r2 = new Enum("UnfocusedNotEmpty", 2);
        UnfocusedNotEmpty = r2;
        wy9[] wy9VarArr = {r0, r1, r2};
        $VALUES = wy9VarArr;
        $ENTRIES = new wg7(wy9VarArr);
    }

    public static wy9 valueOf(String str) {
        return (wy9) Enum.valueOf(wy9.class, str);
    }

    public static wy9[] values() {
        return (wy9[]) $VALUES.clone();
    }
}
