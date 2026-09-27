package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ni7 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ ni7[] $VALUES;
    public static final ni7 Acs;
    public static final mi7 Companion;
    public static final ni7 DirectoryServer;
    public static final ni7 ThreeDsSdk;
    public static final ni7 ThreeDsServer;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mi7] */
    static {
        ni7 ni7Var = new ni7("ThreeDsSdk", 0, "C");
        ThreeDsSdk = ni7Var;
        ni7 ni7Var2 = new ni7("ThreeDsServer", 1, "S");
        ThreeDsServer = ni7Var2;
        ni7 ni7Var3 = new ni7("DirectoryServer", 2, "D");
        DirectoryServer = ni7Var3;
        ni7 ni7Var4 = new ni7("Acs", 3, "A");
        Acs = ni7Var4;
        ni7[] ni7VarArr = {ni7Var, ni7Var2, ni7Var3, ni7Var4};
        $VALUES = ni7VarArr;
        $ENTRIES = new wg7(ni7VarArr);
        Companion = new Object();
    }

    public ni7(String str, int i, String str2) {
        this.code = str2;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static ni7 valueOf(String str) {
        return (ni7) Enum.valueOf(ni7.class, str);
    }

    public static ni7[] values() {
        return (ni7[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
