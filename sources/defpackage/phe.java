package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class phe {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ phe[] $VALUES;
    public static final phe None;
    public static final phe SheetBottomBuy;
    public static final phe SheetTopWallet;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, phe] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, phe] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, phe] */
    static {
        ?? r0 = new Enum("SheetTopWallet", 0);
        SheetTopWallet = r0;
        ?? r1 = new Enum("SheetBottomBuy", 1);
        SheetBottomBuy = r1;
        ?? r2 = new Enum("None", 2);
        None = r2;
        phe[] pheVarArr = {r0, r1, r2};
        $VALUES = pheVarArr;
        $ENTRIES = new wg7(pheVarArr);
    }

    public static phe valueOf(String str) {
        return (phe) Enum.valueOf(phe.class, str);
    }

    public static phe[] values() {
        return (phe[]) $VALUES.clone();
    }
}
