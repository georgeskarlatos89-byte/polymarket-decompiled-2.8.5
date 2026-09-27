package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum kff implements x4a {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);

    private static z4a internalValueMap = new ci5(22);
    private final int value;

    kff(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
