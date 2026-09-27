package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class qy4 {
    private static final /* synthetic */ qy4[] $VALUES;
    public static final qy4 BOOLEAN_TYPE;
    public static final qy4 COLOR_DRAWABLE_TYPE;
    public static final qy4 COLOR_TYPE;
    public static final qy4 DIMENSION_TYPE;
    public static final qy4 FLOAT_TYPE;
    public static final qy4 INT_TYPE;
    public static final qy4 REFERENCE_TYPE;
    public static final qy4 STRING_TYPE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, qy4] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, qy4] */
    static {
        ?? r0 = new Enum("INT_TYPE", 0);
        INT_TYPE = r0;
        ?? r1 = new Enum("FLOAT_TYPE", 1);
        FLOAT_TYPE = r1;
        ?? r2 = new Enum("COLOR_TYPE", 2);
        COLOR_TYPE = r2;
        ?? r3 = new Enum("COLOR_DRAWABLE_TYPE", 3);
        COLOR_DRAWABLE_TYPE = r3;
        ?? r4 = new Enum("STRING_TYPE", 4);
        STRING_TYPE = r4;
        ?? r5 = new Enum("BOOLEAN_TYPE", 5);
        BOOLEAN_TYPE = r5;
        ?? r6 = new Enum("DIMENSION_TYPE", 6);
        DIMENSION_TYPE = r6;
        ?? r7 = new Enum("REFERENCE_TYPE", 7);
        REFERENCE_TYPE = r7;
        $VALUES = new qy4[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public static qy4 valueOf(String str) {
        return (qy4) Enum.valueOf(qy4.class, str);
    }

    public static qy4[] values() {
        return (qy4[]) $VALUES.clone();
    }
}
