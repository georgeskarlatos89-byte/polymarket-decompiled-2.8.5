package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum mdf implements x4a {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);

    private static z4a internalValueMap = new qf5(21);
    private final int value;

    mdf(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
