package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class e3e {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ e3e[] $VALUES;
    public static final e3e AutomaticTaxBillingAddress;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e3e] */
    static {
        ?? r0 = new Enum("AutomaticTaxBillingAddress", 0);
        AutomaticTaxBillingAddress = r0;
        e3e[] e3eVarArr = {r0};
        $VALUES = e3eVarArr;
        $ENTRIES = new wg7(e3eVarArr);
    }

    public static e3e valueOf(String str) {
        return (e3e) Enum.valueOf(e3e.class, str);
    }

    public static e3e[] values() {
        return (e3e[]) $VALUES.clone();
    }
}
