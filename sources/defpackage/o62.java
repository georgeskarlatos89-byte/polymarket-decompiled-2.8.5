package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class o62 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ o62[] $VALUES;
    public static final o62 Down;
    public static final o62 Left;
    public static final o62 Right;
    public static final o62 Up;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o62] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o62] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, o62] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, o62] */
    static {
        ?? r0 = new Enum("Left", 0);
        Left = r0;
        ?? r1 = new Enum("Right", 1);
        Right = r1;
        ?? r2 = new Enum("Down", 2);
        Down = r2;
        ?? r3 = new Enum("Up", 3);
        Up = r3;
        o62[] o62VarArr = {r0, r1, r2, r3};
        $VALUES = o62VarArr;
        $ENTRIES = new wg7(o62VarArr);
    }

    public static o62 valueOf(String str) {
        return (o62) Enum.valueOf(o62.class, str);
    }

    public static o62[] values() {
        return (o62[]) $VALUES.clone();
    }
}
