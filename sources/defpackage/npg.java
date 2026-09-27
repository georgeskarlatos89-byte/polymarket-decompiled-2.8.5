package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class npg {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ npg[] $VALUES;
    public static final npg Left;
    public static final npg Middle;
    public static final npg Right;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, npg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, npg] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, npg] */
    static {
        ?? r0 = new Enum("Left", 0);
        Left = r0;
        ?? r1 = new Enum("Middle", 1);
        Middle = r1;
        ?? r2 = new Enum("Right", 2);
        Right = r2;
        npg[] npgVarArr = {r0, r1, r2};
        $VALUES = npgVarArr;
        $ENTRIES = new wg7(npgVarArr);
    }

    public static npg valueOf(String str) {
        return (npg) Enum.valueOf(npg.class, str);
    }

    public static npg[] values() {
        return (npg[]) $VALUES.clone();
    }
}
