package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class sfa {
    private static final /* synthetic */ sfa[] $VALUES;
    public static final sfa BEGIN_ARRAY;
    public static final sfa BEGIN_OBJECT;
    public static final sfa BOOLEAN;
    public static final sfa END_ARRAY;
    public static final sfa END_DOCUMENT;
    public static final sfa END_OBJECT;
    public static final sfa NAME;
    public static final sfa NULL;
    public static final sfa NUMBER;
    public static final sfa STRING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, sfa] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, sfa] */
    static {
        ?? r0 = new Enum("BEGIN_ARRAY", 0);
        BEGIN_ARRAY = r0;
        ?? r1 = new Enum("END_ARRAY", 1);
        END_ARRAY = r1;
        ?? r2 = new Enum("BEGIN_OBJECT", 2);
        BEGIN_OBJECT = r2;
        ?? r3 = new Enum("END_OBJECT", 3);
        END_OBJECT = r3;
        ?? r4 = new Enum("NAME", 4);
        NAME = r4;
        ?? r5 = new Enum("STRING", 5);
        STRING = r5;
        ?? r6 = new Enum("NUMBER", 6);
        NUMBER = r6;
        ?? r7 = new Enum("BOOLEAN", 7);
        BOOLEAN = r7;
        ?? r8 = new Enum("NULL", 8);
        NULL = r8;
        ?? r9 = new Enum("END_DOCUMENT", 9);
        END_DOCUMENT = r9;
        $VALUES = new sfa[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9};
    }

    public static sfa valueOf(String str) {
        return (sfa) Enum.valueOf(sfa.class, str);
    }

    public static sfa[] values() {
        return (sfa[]) $VALUES.clone();
    }
}
