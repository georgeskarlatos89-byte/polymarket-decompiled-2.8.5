package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ay6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ay6[] $VALUES;
    public static final ay6 Cancel;
    public static final ay6 Drag;
    public static final ay6 Timeout;
    public static final ay6 Up;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ay6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ay6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ay6] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ay6] */
    static {
        ?? r0 = new Enum("Up", 0);
        Up = r0;
        ?? r1 = new Enum("Drag", 1);
        Drag = r1;
        ?? r2 = new Enum("Timeout", 2);
        Timeout = r2;
        ?? r3 = new Enum("Cancel", 3);
        Cancel = r3;
        ay6[] ay6VarArr = {r0, r1, r2, r3};
        $VALUES = ay6VarArr;
        $ENTRIES = new wg7(ay6VarArr);
    }

    public static ay6 valueOf(String str) {
        return (ay6) Enum.valueOf(ay6.class, str);
    }

    public static ay6[] values() {
        return (ay6[]) $VALUES.clone();
    }
}
