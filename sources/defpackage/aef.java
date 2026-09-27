package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum aef implements x4a {
    TRUE(0),
    FALSE(1),
    NULL(2);

    private static z4a internalValueMap = new t55(22);
    private final int value;

    aef(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
