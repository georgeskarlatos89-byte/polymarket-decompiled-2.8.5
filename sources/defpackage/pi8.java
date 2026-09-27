package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pi8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ pi8[] $VALUES;
    public static final pi8 Bold;
    public static final pi8 ExtraBold;
    public static final pi8 Light;
    public static final pi8 Medium;
    public static final pi8 Normal;
    public static final pi8 SemiBold;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, pi8] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, pi8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, pi8] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, pi8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, pi8] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, pi8] */
    static {
        ?? r0 = new Enum("Light", 0);
        Light = r0;
        ?? r1 = new Enum("Normal", 1);
        Normal = r1;
        ?? r2 = new Enum("Medium", 2);
        Medium = r2;
        ?? r3 = new Enum("SemiBold", 3);
        SemiBold = r3;
        ?? r4 = new Enum("Bold", 4);
        Bold = r4;
        ?? r5 = new Enum("ExtraBold", 5);
        ExtraBold = r5;
        pi8[] pi8VarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = pi8VarArr;
        $ENTRIES = new wg7(pi8VarArr);
    }

    public static pi8 valueOf(String str) {
        return (pi8) Enum.valueOf(pi8.class, str);
    }

    public static pi8[] values() {
        return (pi8[]) $VALUES.clone();
    }
}
