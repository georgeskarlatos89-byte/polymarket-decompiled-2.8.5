package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class y13 {
    private static final /* synthetic */ y13[] $VALUES;
    public static final y13 INITIALIZED;
    public static final y13 INITIALIZING;
    public static final y13 INITIALIZING_ERROR;
    public static final y13 SHUTDOWN;
    public static final y13 UNINITIALIZED;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, y13] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, y13] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, y13] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, y13] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, y13] */
    static {
        ?? r0 = new Enum("UNINITIALIZED", 0);
        UNINITIALIZED = r0;
        ?? r1 = new Enum("INITIALIZING", 1);
        INITIALIZING = r1;
        ?? r2 = new Enum("INITIALIZING_ERROR", 2);
        INITIALIZING_ERROR = r2;
        ?? r3 = new Enum("INITIALIZED", 3);
        INITIALIZED = r3;
        ?? r4 = new Enum("SHUTDOWN", 4);
        SHUTDOWN = r4;
        $VALUES = new y13[]{r0, r1, r2, r3, r4};
    }

    public static y13 valueOf(String str) {
        return (y13) Enum.valueOf(y13.class, str);
    }

    public static y13[] values() {
        return (y13[]) $VALUES.clone();
    }
}
