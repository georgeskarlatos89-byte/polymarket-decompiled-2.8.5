package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bzf {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ bzf[] $VALUES;
    public static final bzf LAUNCH_INITIAL_REFRESH;
    public static final bzf SKIP_INITIAL_REFRESH;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, bzf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, bzf] */
    static {
        ?? r0 = new Enum("LAUNCH_INITIAL_REFRESH", 0);
        LAUNCH_INITIAL_REFRESH = r0;
        ?? r1 = new Enum("SKIP_INITIAL_REFRESH", 1);
        SKIP_INITIAL_REFRESH = r1;
        bzf[] bzfVarArr = {r0, r1};
        $VALUES = bzfVarArr;
        $ENTRIES = new wg7(bzfVarArr);
    }

    public static bzf valueOf(String str) {
        return (bzf) Enum.valueOf(bzf.class, str);
    }

    public static bzf[] values() {
        return (bzf[]) $VALUES.clone();
    }
}
