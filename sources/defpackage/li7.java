package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum li7 {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final li7[] FOR_BITS;
    private final int bits;

    static {
        li7 li7Var = L;
        li7 li7Var2 = M;
        li7 li7Var3 = Q;
        FOR_BITS = new li7[]{li7Var2, li7Var, H, li7Var3};
    }

    li7(int i) {
        this.bits = i;
    }

    public final int a() {
        return this.bits;
    }
}
