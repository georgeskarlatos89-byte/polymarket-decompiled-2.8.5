package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum dk0 {
    ARM32(0),
    ARM64(1),
    X86(2),
    X86_64(3),
    RISCV64(4),
    NONE(5);

    private final int value;

    dk0(int i) {
        this.value = i;
    }

    public static dk0 a(int i) {
        for (dk0 dk0Var : values()) {
            if (dk0Var.value == i) {
                return dk0Var;
            }
        }
        return NONE;
    }
}
