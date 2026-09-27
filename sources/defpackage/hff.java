package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum hff implements x4a {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);

    private static z4a internalValueMap = new vh5(22);
    private final int value;

    hff(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
