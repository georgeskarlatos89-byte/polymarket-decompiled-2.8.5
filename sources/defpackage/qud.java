package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qud {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qud[] $VALUES;
    public static final qud ALL;
    public static final qud NONE;
    public static final qud ONLY_NON_SYNTHESIZED;

    /* JADX WARN: Type inference failed for: r0v0, types: [qud, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [qud, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [qud, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ALL", 0);
        ALL = r0;
        ?? r1 = new Enum("ONLY_NON_SYNTHESIZED", 1);
        ONLY_NON_SYNTHESIZED = r1;
        ?? r2 = new Enum("NONE", 2);
        NONE = r2;
        qud[] qudVarArr = {r0, r1, r2};
        $VALUES = qudVarArr;
        $ENTRIES = new wg7(qudVarArr);
    }

    public static qud valueOf(String str) {
        return (qud) Enum.valueOf(qud.class, str);
    }

    public static qud[] values() {
        return (qud[]) $VALUES.clone();
    }
}
