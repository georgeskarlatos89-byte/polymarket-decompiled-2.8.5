package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class n33 {
    private static final /* synthetic */ n33[] $VALUES;
    public static final n33 CLOSED;
    public static final n33 GET_SURFACE;
    public static final n33 INITIALIZED;
    public static final n33 OPENED;
    public static final n33 OPENING;
    public static final n33 RELEASED;
    public static final n33 RELEASING;
    public static final n33 UNINITIALIZED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, n33] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, n33] */
    static {
        ?? r0 = new Enum("UNINITIALIZED", 0);
        UNINITIALIZED = r0;
        ?? r1 = new Enum("RELEASED", 1);
        RELEASED = r1;
        ?? r2 = new Enum("INITIALIZED", 2);
        INITIALIZED = r2;
        ?? r3 = new Enum("GET_SURFACE", 3);
        GET_SURFACE = r3;
        ?? r4 = new Enum("RELEASING", 4);
        RELEASING = r4;
        ?? r5 = new Enum("CLOSED", 5);
        CLOSED = r5;
        ?? r6 = new Enum("OPENING", 6);
        OPENING = r6;
        ?? r7 = new Enum("OPENED", 7);
        OPENED = r7;
        $VALUES = new n33[]{r0, r1, r2, r3, r4, r5, r6, r7};
    }

    public static n33 valueOf(String str) {
        return (n33) Enum.valueOf(n33.class, str);
    }

    public static n33[] values() {
        return (n33[]) $VALUES.clone();
    }
}
