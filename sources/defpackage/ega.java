package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class ega {
    private static final /* synthetic */ ega[] $VALUES;
    public static final ega BEGIN_ARRAY;
    public static final ega BEGIN_OBJECT;
    public static final ega BOOLEAN;
    public static final ega END_ARRAY;
    public static final ega END_DOCUMENT;
    public static final ega END_OBJECT;
    public static final ega NAME;
    public static final ega NULL;
    public static final ega NUMBER;
    public static final ega STRING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, ega] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, ega] */
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
        $VALUES = new ega[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9};
    }

    public static ega valueOf(String str) {
        return (ega) Enum.valueOf(ega.class, str);
    }

    public static ega[] values() {
        return (ega[]) $VALUES.clone();
    }
}
