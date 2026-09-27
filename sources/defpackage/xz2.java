package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xz2 {
    private static final /* synthetic */ xz2[] $VALUES;
    public static final xz2 INACTIVE;
    public static final xz2 LOCKED_FOCUSED;
    public static final xz2 LOCKED_NOT_FOCUSED;
    public static final xz2 PASSIVE_FOCUSED;
    public static final xz2 PASSIVE_NOT_FOCUSED;
    public static final xz2 SCANNING;
    public static final xz2 UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v0, types: [xz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [xz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [xz2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [xz2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        UNKNOWN = r0;
        ?? r1 = new Enum("INACTIVE", 1);
        INACTIVE = r1;
        ?? r2 = new Enum("SCANNING", 2);
        SCANNING = r2;
        ?? r3 = new Enum("PASSIVE_FOCUSED", 3);
        PASSIVE_FOCUSED = r3;
        ?? r4 = new Enum("PASSIVE_NOT_FOCUSED", 4);
        PASSIVE_NOT_FOCUSED = r4;
        ?? r5 = new Enum("LOCKED_FOCUSED", 5);
        LOCKED_FOCUSED = r5;
        ?? r6 = new Enum("LOCKED_NOT_FOCUSED", 6);
        LOCKED_NOT_FOCUSED = r6;
        $VALUES = new xz2[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static xz2 valueOf(String str) {
        return (xz2) Enum.valueOf(xz2.class, str);
    }

    public static xz2[] values() {
        return (xz2[]) $VALUES.clone();
    }
}
