package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class h36 {
    private static final /* synthetic */ h36[] $VALUES;
    public static final h36 DIAGNOSTIC_INIT;
    public static final h36 DIAGNOSTIC_STATS;
    public static final h36 EVENT;
    public static final h36 FLUSH;
    public static final h36 FLUSH_USERS;
    public static final h36 SHUTDOWN;
    public static final h36 SYNC;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h36] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h36] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h36] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, h36] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, h36] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, h36] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, h36] */
    static {
        ?? r0 = new Enum("EVENT", 0);
        EVENT = r0;
        ?? r1 = new Enum("FLUSH", 1);
        FLUSH = r1;
        ?? r2 = new Enum("FLUSH_USERS", 2);
        FLUSH_USERS = r2;
        ?? r3 = new Enum("DIAGNOSTIC_INIT", 3);
        DIAGNOSTIC_INIT = r3;
        ?? r4 = new Enum("DIAGNOSTIC_STATS", 4);
        DIAGNOSTIC_STATS = r4;
        ?? r5 = new Enum("SYNC", 5);
        SYNC = r5;
        ?? r6 = new Enum("SHUTDOWN", 6);
        SHUTDOWN = r6;
        $VALUES = new h36[]{r0, r1, r2, r3, r4, r5, r6};
    }

    public static h36 valueOf(String str) {
        return (h36) Enum.valueOf(h36.class, str);
    }

    public static h36[] values() {
        return (h36[]) $VALUES.clone();
    }
}
