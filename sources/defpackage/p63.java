package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p63 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ p63[] $VALUES;
    public static final o63 Companion;
    public static final p63 Credit;
    public static final p63 Debit;
    public static final p63 Prepaid;
    public static final p63 Unknown;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o63] */
    static {
        p63 p63Var = new p63("Credit", 0, "credit");
        Credit = p63Var;
        p63 p63Var2 = new p63("Debit", 1, "debit");
        Debit = p63Var2;
        p63 p63Var3 = new p63("Prepaid", 2, "prepaid");
        Prepaid = p63Var3;
        p63 p63Var4 = new p63("Unknown", 3, "unknown");
        Unknown = p63Var4;
        p63[] p63VarArr = {p63Var, p63Var2, p63Var3, p63Var4};
        $VALUES = p63VarArr;
        $ENTRIES = new wg7(p63VarArr);
        Companion = new Object();
    }

    public p63(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static p63 valueOf(String str) {
        return (p63) Enum.valueOf(p63.class, str);
    }

    public static p63[] values() {
        return (p63[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
