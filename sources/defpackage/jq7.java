package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jq7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ jq7[] $VALUES;
    public static final jq7 IGNORE;
    public static final jq7 RESPECT_ALL;
    public static final jq7 RESPECT_PERFORMANCE;

    /* JADX WARN: Type inference failed for: r0v0, types: [jq7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [jq7, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [jq7, java.lang.Enum] */
    static {
        ?? r0 = new Enum("IGNORE", 0);
        IGNORE = r0;
        ?? r1 = new Enum("RESPECT_PERFORMANCE", 1);
        RESPECT_PERFORMANCE = r1;
        ?? r2 = new Enum("RESPECT_ALL", 2);
        RESPECT_ALL = r2;
        jq7[] jq7VarArr = {r0, r1, r2};
        $VALUES = jq7VarArr;
        $ENTRIES = new wg7(jq7VarArr);
    }

    public static jq7 valueOf(String str) {
        return (jq7) Enum.valueOf(jq7.class, str);
    }

    public static jq7[] values() {
        return (jq7[]) $VALUES.clone();
    }
}
