package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p05 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ p05[] $VALUES;
    public static final o05 Companion;
    public static final p05 Credit;
    public static final p05 Debit;
    public static final p05 Prepaid;
    public static final p05 Unknown;
    private final p63 cardFunding;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [o05, java.lang.Object] */
    static {
        p05 p05Var = new p05("Credit", 0, "CREDIT", p63.Credit);
        Credit = p05Var;
        p05 p05Var2 = new p05("Debit", 1, "DEBIT", p63.Debit);
        Debit = p05Var2;
        p05 p05Var3 = new p05("Prepaid", 2, "PREPAID", p63.Prepaid);
        Prepaid = p05Var3;
        p05 p05Var4 = new p05("Unknown", 3, "UNKNOWN", p63.Unknown);
        Unknown = p05Var4;
        p05[] p05VarArr = {p05Var, p05Var2, p05Var3, p05Var4};
        $VALUES = p05VarArr;
        $ENTRIES = new wg7(p05VarArr);
        Companion = new Object();
    }

    public p05(String str, int i, String str2, p63 p63Var) {
        this.code = str2;
        this.cardFunding = p63Var;
    }

    public static ug7 c() {
        return $ENTRIES;
    }

    public static p05 valueOf(String str) {
        return (p05) Enum.valueOf(p05.class, str);
    }

    public static p05[] values() {
        return (p05[]) $VALUES.clone();
    }

    public final p63 a() {
        return this.cardFunding;
    }

    public final String b() {
        return this.code;
    }
}
