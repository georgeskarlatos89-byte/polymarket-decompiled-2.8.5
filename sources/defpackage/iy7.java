package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class iy7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ iy7[] $VALUES;
    public static final iy7 ERROR;
    public static final iy7 NORMAL;
    public static final iy7 WARNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, iy7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, iy7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, iy7] */
    static {
        ?? r0 = new Enum("NORMAL", 0);
        NORMAL = r0;
        ?? r1 = new Enum("ERROR", 1);
        ERROR = r1;
        ?? r2 = new Enum("WARNING", 2);
        WARNING = r2;
        iy7[] iy7VarArr = {r0, r1, r2};
        $VALUES = iy7VarArr;
        $ENTRIES = new wg7(iy7VarArr);
    }

    public static iy7 valueOf(String str) {
        return (iy7) Enum.valueOf(iy7.class, str);
    }

    public static iy7[] values() {
        return (iy7[]) $VALUES.clone();
    }
}
