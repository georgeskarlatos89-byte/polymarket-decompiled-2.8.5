package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kvb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ kvb[] $VALUES;
    public static final kvb Immediately;
    public static final kvb OnIterationFinish;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, kvb] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, kvb] */
    static {
        ?? r0 = new Enum("Immediately", 0);
        Immediately = r0;
        ?? r1 = new Enum("OnIterationFinish", 1);
        OnIterationFinish = r1;
        kvb[] kvbVarArr = {r0, r1};
        $VALUES = kvbVarArr;
        $ENTRIES = new wg7(kvbVarArr);
    }

    public static kvb valueOf(String str) {
        return (kvb) Enum.valueOf(kvb.class, str);
    }

    public static kvb[] values() {
        return (kvb[]) $VALUES.clone();
    }
}
