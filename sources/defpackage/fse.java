package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class fse {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fse[] $VALUES;
    public static final ese Companion;
    public static final fse FEW;
    public static final fse MANY;
    public static final fse ONE;
    public static final fse OTHER;
    public static final fse TWO;
    public static final fse ZERO;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, fse] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ese, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, fse] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, fse] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, fse] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, fse] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, fse] */
    static {
        ?? r0 = new Enum("ZERO", 0);
        ZERO = r0;
        ?? r1 = new Enum("ONE", 1);
        ONE = r1;
        ?? r2 = new Enum("TWO", 2);
        TWO = r2;
        ?? r3 = new Enum("FEW", 3);
        FEW = r3;
        ?? r4 = new Enum("MANY", 4);
        MANY = r4;
        ?? r5 = new Enum("OTHER", 5);
        OTHER = r5;
        fse[] fseVarArr = {r0, r1, r2, r3, r4, r5};
        $VALUES = fseVarArr;
        $ENTRIES = new wg7(fseVarArr);
        Companion = new Object();
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static fse valueOf(String str) {
        return (fse) Enum.valueOf(fse.class, str);
    }

    public static fse[] values() {
        return (fse[]) $VALUES.clone();
    }
}
