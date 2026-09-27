package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tt4 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ tt4[] $VALUES;
    public static final tt4 Blank;
    public static final tt4 None;
    public static final tt4 OffSession;
    public static final tt4 OnSession;
    private final String code;

    static {
        tt4 tt4Var = new tt4("OnSession", 0, "on_session");
        OnSession = tt4Var;
        tt4 tt4Var2 = new tt4("OffSession", 1, "off_session");
        OffSession = tt4Var2;
        tt4 tt4Var3 = new tt4("Blank", 2, "");
        Blank = tt4Var3;
        tt4 tt4Var4 = new tt4("None", 3, "none");
        None = tt4Var4;
        tt4[] tt4VarArr = {tt4Var, tt4Var2, tt4Var3, tt4Var4};
        $VALUES = tt4VarArr;
        $ENTRIES = new wg7(tt4VarArr);
    }

    public tt4(String str, int i, String str2) {
        this.code = str2;
    }

    public static tt4 valueOf(String str) {
        return (tt4) Enum.valueOf(tt4.class, str);
    }

    public static tt4[] values() {
        return (tt4[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
