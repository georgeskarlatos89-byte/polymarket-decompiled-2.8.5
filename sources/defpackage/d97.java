package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d97 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ d97[] $VALUES;
    public static final d97 CUSTOMER_OBJECT;
    public static final d97 USER_ACTION;
    private final String backendValue;

    static {
        d97 d97Var = new d97("USER_ACTION", 0, "user_action");
        USER_ACTION = d97Var;
        d97 d97Var2 = new d97("CUSTOMER_OBJECT", 1, "customer_object");
        CUSTOMER_OBJECT = d97Var2;
        d97[] d97VarArr = {d97Var, d97Var2};
        $VALUES = d97VarArr;
        $ENTRIES = new wg7(d97VarArr);
    }

    public d97(String str, int i, String str2) {
        this.backendValue = str2;
    }

    public static d97 valueOf(String str) {
        return (d97) Enum.valueOf(d97.class, str);
    }

    public static d97[] values() {
        return (d97[]) $VALUES.clone();
    }

    public final String a() {
        return this.backendValue;
    }
}
