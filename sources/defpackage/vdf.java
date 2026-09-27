package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum vdf implements x4a {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);

    private static z4a internalValueMap = new ci5(21);
    private final int value;

    vdf(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
