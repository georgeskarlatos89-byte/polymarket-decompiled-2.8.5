package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class afh {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ afh[] $VALUES;
    public static final zeh Companion;
    public static final afh Shipping;
    public static final afh Sku;
    public static final afh Tax;
    private final String code;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zeh] */
    static {
        afh afhVar = new afh("Sku", 0, "sku");
        Sku = afhVar;
        afh afhVar2 = new afh("Tax", 1, "tax");
        Tax = afhVar2;
        afh afhVar3 = new afh("Shipping", 2, "shipping");
        Shipping = afhVar3;
        afh[] afhVarArr = {afhVar, afhVar2, afhVar3};
        $VALUES = afhVarArr;
        $ENTRIES = new wg7(afhVarArr);
        Companion = new Object();
    }

    public afh(String str, int i, String str2) {
        this.code = str2;
    }

    public static final /* synthetic */ String a(afh afhVar) {
        return afhVar.code;
    }

    public static ug7 b() {
        return $ENTRIES;
    }

    public static afh valueOf(String str) {
        return (afh) Enum.valueOf(afh.class, str);
    }

    public static afh[] values() {
        return (afh[]) $VALUES.clone();
    }
}
