package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tqk {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tqk[] $VALUES;
    public static final tqk DataRange;
    public static final tqk FullRange;
    public static final tqk UnitRange;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tqk] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tqk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tqk] */
    static {
        ?? r0 = new Enum("UnitRange", 0);
        UnitRange = r0;
        ?? r1 = new Enum("FullRange", 1);
        FullRange = r1;
        ?? r2 = new Enum("DataRange", 2);
        DataRange = r2;
        tqk[] tqkVarArr = {r0, r1, r2};
        $VALUES = tqkVarArr;
        $ENTRIES = new wg7(tqkVarArr);
    }

    public static tqk valueOf(String str) {
        return (tqk) Enum.valueOf(tqk.class, str);
    }

    public static tqk[] values() {
        return (tqk[]) $VALUES.clone();
    }
}
