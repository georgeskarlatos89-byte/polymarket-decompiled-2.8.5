package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cwa {
    private static final /* synthetic */ cwa[] $VALUES;
    public static final cwa IMAGE;
    public static final cwa NULL;
    public static final cwa PRE_COMP;
    public static final cwa SHAPE;
    public static final cwa SOLID;
    public static final cwa TEXT;
    public static final cwa UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, cwa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, cwa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, cwa] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, cwa] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, cwa] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, cwa] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, cwa] */
    static {
        ?? r0 = new Enum("PRE_COMP", 0);
        PRE_COMP = r0;
        ?? r1 = new Enum("SOLID", 1);
        SOLID = r1;
        ?? r2 = new Enum("IMAGE", 2);
        IMAGE = r2;
        ?? r3 = new Enum("NULL", 3);
        NULL = r3;
        ?? r4 = new Enum("SHAPE", 4);
        SHAPE = r4;
        ?? r5 = new Enum("TEXT", 5);
        TEXT = r5;
        ?? r6 = new Enum("UNKNOWN", 6);
        UNKNOWN = r6;
        $VALUES = new cwa[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static cwa valueOf(String str) {
        return (cwa) Enum.valueOf(cwa.class, str);
    }

    public static cwa[] values() {
        return (cwa[]) $VALUES.clone();
    }
}
