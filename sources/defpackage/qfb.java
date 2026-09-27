package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qfb {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ qfb[] $VALUES;
    public static final qfb LinkCardBrand;
    public static final qfb LinkPaymentMethod;
    public static final qfb Passthrough;
    private final String value;

    static {
        qfb qfbVar = new qfb("Passthrough", 0, "PASSTHROUGH");
        Passthrough = qfbVar;
        qfb qfbVar2 = new qfb("LinkPaymentMethod", 1, "LINK_PAYMENT_METHOD");
        LinkPaymentMethod = qfbVar2;
        qfb qfbVar3 = new qfb("LinkCardBrand", 2, "LINK_CARD_BRAND");
        LinkCardBrand = qfbVar3;
        qfb[] qfbVarArr = {qfbVar, qfbVar2, qfbVar3};
        $VALUES = qfbVarArr;
        $ENTRIES = new wg7(qfbVarArr);
    }

    public qfb(String str, int i, String str2) {
        this.value = str2;
    }

    public static ug7 a() {
        return $ENTRIES;
    }

    public static qfb valueOf(String str) {
        return (qfb) Enum.valueOf(qfb.class, str);
    }

    public static qfb[] values() {
        return (qfb[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
