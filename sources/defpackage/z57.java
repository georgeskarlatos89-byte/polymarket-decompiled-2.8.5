package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class z57 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ z57[] $VALUES;
    public static final z57 Bottom;
    public static final z57 Left;
    public static final z57 Right;
    public static final z57 Top;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z57] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z57] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, z57] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, z57] */
    static {
        ?? r0 = new Enum("Top", 0);
        Top = r0;
        ?? r1 = new Enum("Bottom", 1);
        Bottom = r1;
        ?? r2 = new Enum("Left", 2);
        Left = r2;
        ?? r3 = new Enum("Right", 3);
        Right = r3;
        z57[] z57VarArr = {r0, r1, r2, r3};
        $VALUES = z57VarArr;
        $ENTRIES = new wg7(z57VarArr);
    }

    public static z57 valueOf(String str) {
        return (z57) Enum.valueOf(z57.class, str);
    }

    public static z57[] values() {
        return (z57[]) $VALUES.clone();
    }
}
