package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class g6b {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ g6b[] $VALUES;
    public static final g6b DEBUG;
    public static final g6b ERROR;
    public static final g6b INFO;
    public static final g6b NONE;
    public static final g6b WARNING;

    /* JADX WARN: Type inference failed for: r0v0, types: [g6b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g6b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [g6b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [g6b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [g6b, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEBUG", 0);
        DEBUG = r0;
        ?? r1 = new Enum("INFO", 1);
        INFO = r1;
        ?? r2 = new Enum("WARNING", 2);
        WARNING = r2;
        ?? r3 = new Enum("ERROR", 3);
        ERROR = r3;
        ?? r4 = new Enum("NONE", 4);
        NONE = r4;
        g6b[] g6bVarArr = {r0, r1, r2, r3, r4};
        $VALUES = g6bVarArr;
        $ENTRIES = new wg7(g6bVarArr);
    }

    public static g6b valueOf(String str) {
        return (g6b) Enum.valueOf(g6b.class, str);
    }

    public static g6b[] values() {
        return (g6b[]) $VALUES.clone();
    }
}
