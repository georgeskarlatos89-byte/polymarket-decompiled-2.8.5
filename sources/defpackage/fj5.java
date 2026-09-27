package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fj5 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ fj5[] $VALUES;
    public static final fj5 CustomerAdapter;
    public static final fj5 CustomerSession;
    private final String analyticsValue;

    static {
        fj5 fj5Var = new fj5("CustomerAdapter", 0, "customer_adapter");
        CustomerAdapter = fj5Var;
        fj5 fj5Var2 = new fj5("CustomerSession", 1, "customer_session");
        CustomerSession = fj5Var2;
        fj5[] fj5VarArr = {fj5Var, fj5Var2};
        $VALUES = fj5VarArr;
        $ENTRIES = new wg7(fj5VarArr);
    }

    public fj5(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static fj5 valueOf(String str) {
        return (fj5) Enum.valueOf(fj5.class, str);
    }

    public static fj5[] values() {
        return (fj5[]) $VALUES.clone();
    }
}
