package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum udf implements x4a {
    RETURNS_CONSTANT(0),
    CALLS(1),
    RETURNS_NOT_NULL(2);

    private static z4a internalValueMap = new vh5(21);
    private final int value;

    udf(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
