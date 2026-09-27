package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sq5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ sq5[] $VALUES;
    public static final sq5 BOOLEAN;
    public static final sq5 DOUBLE;
    public static final sq5 FLOAT;
    public static final sq5 INT;
    public static final sq5 LIST;
    public static final sq5 LONG;
    public static final sq5 MAP;
    public static final sq5 STRING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, sq5] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, sq5] */
    static {
        ?? r0 = new Enum("STRING", 0);
        STRING = r0;
        ?? r1 = new Enum("LONG", 1);
        LONG = r1;
        ?? r2 = new Enum("INT", 2);
        INT = r2;
        ?? r3 = new Enum("DOUBLE", 3);
        DOUBLE = r3;
        ?? r4 = new Enum("FLOAT", 4);
        FLOAT = r4;
        ?? r5 = new Enum("BOOLEAN", 5);
        BOOLEAN = r5;
        ?? r6 = new Enum("MAP", 6);
        MAP = r6;
        ?? r7 = new Enum("LIST", 7);
        LIST = r7;
        sq5[] sq5VarArr = {r0, r1, r2, r3, r4, r5, r6, r7};
        $VALUES = sq5VarArr;
        $ENTRIES = new wg7(sq5VarArr);
    }

    public static sq5 valueOf(String str) {
        return (sq5) Enum.valueOf(sq5.class, str);
    }

    public static sq5[] values() {
        return (sq5[]) $VALUES.clone();
    }
}
