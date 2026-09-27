package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class g8h {
    private static final /* synthetic */ g8h[] $VALUES;
    public static final g8h CLEARED;
    public static final g8h COMPLETE;
    public static final g8h FAILED;
    public static final g8h PENDING;
    public static final g8h RUNNING;
    public static final g8h WAITING_FOR_SIZE;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, g8h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, g8h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, g8h] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, g8h] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, g8h] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, g8h] */
    static {
        ?? r0 = new Enum("PENDING", 0);
        PENDING = r0;
        ?? r1 = new Enum("RUNNING", 1);
        RUNNING = r1;
        ?? r2 = new Enum("WAITING_FOR_SIZE", 2);
        WAITING_FOR_SIZE = r2;
        ?? r3 = new Enum("COMPLETE", 3);
        COMPLETE = r3;
        ?? r4 = new Enum("FAILED", 4);
        FAILED = r4;
        ?? r5 = new Enum("CLEARED", 5);
        CLEARED = r5;
        $VALUES = new g8h[]{r0, r1, r2, r3, r4, r5};
    }

    public static g8h valueOf(String str) {
        return (g8h) Enum.valueOf(g8h.class, str);
    }

    public static g8h[] values() {
        return (g8h[]) $VALUES.clone();
    }
}
