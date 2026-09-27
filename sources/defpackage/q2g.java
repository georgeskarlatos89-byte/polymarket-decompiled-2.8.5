package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q2g {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ q2g[] $VALUES;
    public static final q2g CryptoOnramp;
    public static final q2g PaymentElement;
    public static final q2g StandaloneLink;
    private final String value;

    static {
        q2g q2gVar = new q2g("PaymentElement", 0, "android_payment_element");
        PaymentElement = q2gVar;
        q2g q2gVar2 = new q2g("CryptoOnramp", 1, "android_crypto_onramp");
        CryptoOnramp = q2gVar2;
        q2g q2gVar3 = new q2g("StandaloneLink", 2, "android_link_standalone");
        StandaloneLink = q2gVar3;
        q2g[] q2gVarArr = {q2gVar, q2gVar2, q2gVar3};
        $VALUES = q2gVarArr;
        $ENTRIES = new wg7(q2gVarArr);
    }

    public q2g(String str, int i, String str2) {
        this.value = str2;
    }

    public static q2g valueOf(String str) {
        return (q2g) Enum.valueOf(q2g.class, str);
    }

    public static q2g[] values() {
        return (q2g[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
