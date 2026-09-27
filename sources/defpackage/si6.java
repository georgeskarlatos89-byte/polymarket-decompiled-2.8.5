package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class si6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ si6[] $VALUES;
    public static final si6 Client;
    public static final si6 None;
    public static final si6 Server;
    private final String value;

    static {
        si6 si6Var = new si6("Client", 0, "client");
        Client = si6Var;
        si6 si6Var2 = new si6("Server", 1, "server");
        Server = si6Var2;
        si6 si6Var3 = new si6("None", 2, "none");
        None = si6Var3;
        si6[] si6VarArr = {si6Var, si6Var2, si6Var3};
        $VALUES = si6VarArr;
        $ENTRIES = new wg7(si6VarArr);
    }

    public si6(String str, int i, String str2) {
        this.value = str2;
    }

    public static si6 valueOf(String str) {
        return (si6) Enum.valueOf(si6.class, str);
    }

    public static si6[] values() {
        return (si6[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
