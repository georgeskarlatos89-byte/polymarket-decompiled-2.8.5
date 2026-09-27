package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class by8 {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ by8[] $VALUES;
    public static final by8 CompleteImmediatePurchase;
    public static final by8 Default;
    private final String code;

    static {
        by8 by8Var = new by8("Default", 0, "DEFAULT");
        Default = by8Var;
        by8 by8Var2 = new by8("CompleteImmediatePurchase", 1, "COMPLETE_IMMEDIATE_PURCHASE");
        CompleteImmediatePurchase = by8Var2;
        by8[] by8VarArr = {by8Var, by8Var2};
        $VALUES = by8VarArr;
        $ENTRIES = new wg7(by8VarArr);
    }

    public by8(String str, int i, String str2) {
        this.code = str2;
    }

    public static by8 valueOf(String str) {
        return (by8) Enum.valueOf(by8.class, str);
    }

    public static by8[] values() {
        return (by8[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
