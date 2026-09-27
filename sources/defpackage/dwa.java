package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dwa {
    private static final /* synthetic */ dwa[] $VALUES;
    public static final dwa ADD;
    public static final dwa INVERT;
    public static final dwa LUMA;
    public static final dwa LUMA_INVERTED;
    public static final dwa NONE;
    public static final dwa UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dwa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dwa] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, dwa] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, dwa] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, dwa] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, dwa] */
    static {
        ?? r0 = new Enum("NONE", 0);
        NONE = r0;
        ?? r1 = new Enum("ADD", 1);
        ADD = r1;
        ?? r2 = new Enum("INVERT", 2);
        INVERT = r2;
        ?? r3 = new Enum("LUMA", 3);
        LUMA = r3;
        ?? r4 = new Enum("LUMA_INVERTED", 4);
        LUMA_INVERTED = r4;
        ?? r5 = new Enum("UNKNOWN", 5);
        UNKNOWN = r5;
        $VALUES = new dwa[]{r0, r1, r2, r3, r4, r5};
    }

    public static dwa valueOf(String str) {
        return (dwa) Enum.valueOf(dwa.class, str);
    }

    public static dwa[] values() {
        return (dwa[]) $VALUES.clone();
    }
}
