package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class xua {
    private static final /* synthetic */ xua[] $VALUES;
    public static final xua DEBUG;
    public static final xua ERROR;
    public static final xua INFO;
    public static final xua NONE;
    public static final xua WARN;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, xua] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, xua] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, xua] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, xua] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, xua] */
    static {
        ?? r0 = new Enum("DEBUG", 0);
        DEBUG = r0;
        ?? r1 = new Enum("INFO", 1);
        INFO = r1;
        ?? r2 = new Enum("WARN", 2);
        WARN = r2;
        ?? r3 = new Enum("ERROR", 3);
        ERROR = r3;
        ?? r4 = new Enum("NONE", 4);
        NONE = r4;
        $VALUES = new xua[]{r0, r1, r2, r3, r4};
    }

    public static xua valueOf(String str) {
        return (xua) Enum.valueOf(xua.class, str);
    }

    public static xua[] values() {
        return (xua[]) $VALUES.clone();
    }
}
