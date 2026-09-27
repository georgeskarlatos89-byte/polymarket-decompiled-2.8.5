package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class lq6 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ lq6[] $VALUES;
    public static final lq6 MARKET_OR_REGION_RESTRICTION;
    public static final lq6 PERMISSION;
    public static final lq6 PLATFORM_VERSION;
    public static final lq6 UNAVAILABLE;
    private final String code;

    static {
        lq6 lq6Var = new lq6("MARKET_OR_REGION_RESTRICTION", 0, "RE01");
        MARKET_OR_REGION_RESTRICTION = lq6Var;
        lq6 lq6Var2 = new lq6("PLATFORM_VERSION", 1, "RE02");
        PLATFORM_VERSION = lq6Var2;
        lq6 lq6Var3 = new lq6("PERMISSION", 2, "RE03");
        PERMISSION = lq6Var3;
        lq6 lq6Var4 = new lq6("UNAVAILABLE", 3, "RE04");
        UNAVAILABLE = lq6Var4;
        lq6[] lq6VarArr = {lq6Var, lq6Var2, lq6Var3, lq6Var4};
        $VALUES = lq6VarArr;
        $ENTRIES = new wg7(lq6VarArr);
    }

    public lq6(String str, int i, String str2) {
        this.code = str2;
    }

    public static lq6 valueOf(String str) {
        return (lq6) Enum.valueOf(lq6.class, str);
    }

    public static lq6[] values() {
        return (lq6[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.code;
    }
}
