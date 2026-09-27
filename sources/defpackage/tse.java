package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tse {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tse[] $VALUES;
    public static final tse Dispatching;
    public static final tse NotDispatching;
    public static final tse Unknown;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, tse] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, tse] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, tse] */
    static {
        ?? r0 = new Enum("Unknown", 0);
        Unknown = r0;
        ?? r1 = new Enum("Dispatching", 1);
        Dispatching = r1;
        ?? r2 = new Enum("NotDispatching", 2);
        NotDispatching = r2;
        tse[] tseVarArr = {r0, r1, r2};
        $VALUES = tseVarArr;
        $ENTRIES = new wg7(tseVarArr);
    }

    public static tse valueOf(String str) {
        return (tse) Enum.valueOf(tse.class, str);
    }

    public static tse[] values() {
        return (tse[]) $VALUES.clone();
    }
}
