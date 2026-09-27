package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class efh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ efh[] $VALUES;
    public static final efh Shipping;
    public static final efh Sku;
    public static final efh Tax;
    private final String code;

    static {
        efh efhVar = new efh("Sku", 0, "sku");
        Sku = efhVar;
        efh efhVar2 = new efh("Tax", 1, "tax");
        Tax = efhVar2;
        efh efhVar3 = new efh("Shipping", 2, "shipping");
        Shipping = efhVar3;
        efh[] efhVarArr = {efhVar, efhVar2, efhVar3};
        $VALUES = efhVarArr;
        $ENTRIES = new wg7(efhVarArr);
    }

    public efh(String str, int i, String str2) {
        this.code = str2;
    }

    public static efh valueOf(String str) {
        return (efh) Enum.valueOf(efh.class, str);
    }

    public static efh[] values() {
        return (efh[]) $VALUES.clone();
    }

    public final String a() {
        return this.code;
    }
}
