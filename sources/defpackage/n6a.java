package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n6a {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ n6a[] $VALUES;
    public static final n6a ARRAY;
    public static final n6a BOOL;
    public static final n6a BOOL_ARRAY;
    public static final n6a BOOL_NULLABLE;
    public static final n6a DOUBLE;
    public static final n6a DOUBLE_ARRAY;
    public static final n6a DOUBLE_NULLABLE;
    public static final n6a ENUM;
    public static final n6a ENUM_NULLABLE;
    public static final n6a FLOAT;
    public static final n6a FLOAT_ARRAY;
    public static final n6a FLOAT_NULLABLE;
    public static final n6a INT;
    public static final n6a INT_ARRAY;
    public static final n6a INT_NULLABLE;
    public static final n6a LIST;
    public static final n6a LONG;
    public static final n6a LONG_ARRAY;
    public static final n6a LONG_NULLABLE;
    public static final n6a STRING;
    public static final n6a STRING_NULLABLE;
    public static final n6a UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, n6a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, n6a] */
    static {
        ?? r1 = new Enum("INT", 0);
        INT = r1;
        ?? r2 = new Enum("INT_NULLABLE", 1);
        INT_NULLABLE = r2;
        ?? r3 = new Enum("BOOL", 2);
        BOOL = r3;
        ?? r4 = new Enum("BOOL_NULLABLE", 3);
        BOOL_NULLABLE = r4;
        ?? r5 = new Enum("DOUBLE", 4);
        DOUBLE = r5;
        ?? r6 = new Enum("DOUBLE_NULLABLE", 5);
        DOUBLE_NULLABLE = r6;
        ?? r7 = new Enum("FLOAT", 6);
        FLOAT = r7;
        ?? r8 = new Enum("FLOAT_NULLABLE", 7);
        FLOAT_NULLABLE = r8;
        ?? r9 = new Enum("LONG", 8);
        LONG = r9;
        ?? r10 = new Enum("LONG_NULLABLE", 9);
        LONG_NULLABLE = r10;
        ?? r11 = new Enum("STRING", 10);
        STRING = r11;
        ?? r12 = new Enum("STRING_NULLABLE", 11);
        STRING_NULLABLE = r12;
        ?? r13 = new Enum("INT_ARRAY", 12);
        INT_ARRAY = r13;
        ?? r14 = new Enum("BOOL_ARRAY", 13);
        BOOL_ARRAY = r14;
        ?? r15 = new Enum("DOUBLE_ARRAY", 14);
        DOUBLE_ARRAY = r15;
        ?? r0 = new Enum("FLOAT_ARRAY", 15);
        FLOAT_ARRAY = r0;
        ?? r16 = new Enum("LONG_ARRAY", 16);
        LONG_ARRAY = r16;
        ?? r02 = new Enum("ARRAY", 17);
        ARRAY = r02;
        ?? r17 = new Enum("LIST", 18);
        LIST = r17;
        ?? r03 = new Enum("ENUM", 19);
        ENUM = r03;
        ?? r18 = new Enum("ENUM_NULLABLE", 20);
        ENUM_NULLABLE = r18;
        ?? r04 = new Enum("UNKNOWN", 21);
        UNKNOWN = r04;
        n6a[] n6aVarArr = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r16, r02, r17, r03, r18, r04};
        $VALUES = n6aVarArr;
        $ENTRIES = new wg7(n6aVarArr);
    }

    public static n6a valueOf(String str) {
        return (n6a) Enum.valueOf(n6a.class, str);
    }

    public static n6a[] values() {
        return (n6a[]) $VALUES.clone();
    }
}
