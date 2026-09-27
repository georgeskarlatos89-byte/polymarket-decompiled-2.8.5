package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h9g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ h9g[] $VALUES;
    public static final h9g AUTOMATIC;
    public static final h9g TRUNCATE;
    public static final h9g WRITE_AHEAD_LOGGING;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, h9g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, h9g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, h9g] */
    static {
        ?? r0 = new Enum("AUTOMATIC", 0);
        AUTOMATIC = r0;
        ?? r1 = new Enum("TRUNCATE", 1);
        TRUNCATE = r1;
        ?? r2 = new Enum("WRITE_AHEAD_LOGGING", 2);
        WRITE_AHEAD_LOGGING = r2;
        h9g[] h9gVarArr = {r0, r1, r2};
        $VALUES = h9gVarArr;
        $ENTRIES = new wg7(h9gVarArr);
    }

    public static h9g valueOf(String str) {
        return (h9g) Enum.valueOf(h9g.class, str);
    }

    public static h9g[] values() {
        return (h9g[]) $VALUES.clone();
    }
}
