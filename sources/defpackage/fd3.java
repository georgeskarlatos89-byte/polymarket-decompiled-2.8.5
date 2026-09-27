package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fd3 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fd3[] $VALUES;
    public static final fd3 Reserved;
    public static final fd3 TransactionError;
    public static final fd3 TransactionTimedOutDecoupled;
    public static final fd3 TransactionTimedOutFirstCreq;
    public static final fd3 TransactionTimedOutOther;
    public static final fd3 Unknown;
    public static final fd3 UserSelected;
    private final String code;

    static {
        fd3 fd3Var = new fd3("UserSelected", 0, "01");
        UserSelected = fd3Var;
        fd3 fd3Var2 = new fd3("Reserved", 1, "02");
        Reserved = fd3Var2;
        fd3 fd3Var3 = new fd3("TransactionTimedOutDecoupled", 2, "03");
        TransactionTimedOutDecoupled = fd3Var3;
        fd3 fd3Var4 = new fd3("TransactionTimedOutOther", 3, "04");
        TransactionTimedOutOther = fd3Var4;
        fd3 fd3Var5 = new fd3("TransactionTimedOutFirstCreq", 4, "05");
        TransactionTimedOutFirstCreq = fd3Var5;
        fd3 fd3Var6 = new fd3("TransactionError", 5, "06");
        TransactionError = fd3Var6;
        fd3 fd3Var7 = new fd3("Unknown", 6, "07");
        Unknown = fd3Var7;
        fd3[] fd3VarArr = {fd3Var, fd3Var2, fd3Var3, fd3Var4, fd3Var5, fd3Var6, fd3Var7};
        $VALUES = fd3VarArr;
        $ENTRIES = new wg7(fd3VarArr);
    }

    public fd3(String str, int i, String str2) {
        this.code = str2;
    }

    public static fd3 valueOf(String str) {
        return (fd3) Enum.valueOf(fd3.class, str);
    }

    public static fd3[] values() {
        return (fd3[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
