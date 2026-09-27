package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class u7g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ u7g[] $VALUES;
    public static final u7g None;
    public static final u7g SparkGraph;
    public static final u7g Streak;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, u7g] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, u7g] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, u7g] */
    static {
        ?? r0 = new Enum("None", 0);
        None = r0;
        ?? r1 = new Enum("SparkGraph", 1);
        SparkGraph = r1;
        ?? r2 = new Enum("Streak", 2);
        Streak = r2;
        u7g[] u7gVarArr = {r0, r1, r2};
        $VALUES = u7gVarArr;
        $ENTRIES = new wg7(u7gVarArr);
    }

    public static u7g valueOf(String str) {
        return (u7g) Enum.valueOf(u7g.class, str);
    }

    public static u7g[] values() {
        return (u7g[]) $VALUES.clone();
    }
}
