package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum eyb {
    DEFAULT(19),
    PAYPAL(10),
    EBAY(11),
    BRAINTREE(12),
    SIMILITY(17),
    VENMO(18);

    private int version;

    eyb(int i) {
        this.version = i;
    }

    public final int a() {
        return this.version;
    }
}
