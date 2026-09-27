package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class fva {
    private static final /* synthetic */ fva[] $VALUES;
    public static final fva ARRAY;
    public static final fva BOOLEAN;
    public static final fva NULL;
    public static final fva NUMBER;
    public static final fva OBJECT;
    public static final fva STRING;

    /* JADX WARN: Type inference failed for: r0v0, types: [fva, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [fva, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fva, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [fva, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [fva, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [fva, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NULL", 0);
        NULL = r0;
        ?? r1 = new Enum("BOOLEAN", 1);
        BOOLEAN = r1;
        ?? r2 = new Enum("NUMBER", 2);
        NUMBER = r2;
        ?? r3 = new Enum("STRING", 3);
        STRING = r3;
        ?? r4 = new Enum("ARRAY", 4);
        ARRAY = r4;
        ?? r5 = new Enum("OBJECT", 5);
        OBJECT = r5;
        $VALUES = new fva[]{r0, r1, r2, r3, r4, r5};
    }

    public static fva valueOf(String str) {
        return (fva) Enum.valueOf(fva.class, str);
    }

    public static fva[] values() {
        return (fva[]) $VALUES.clone();
    }
}
