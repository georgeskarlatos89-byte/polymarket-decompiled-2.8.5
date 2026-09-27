package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum gff implements x4a {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    private static z4a internalValueMap = new Object();
    private final int value;

    gff(int i) {
        this.value = i;
    }

    @Override // defpackage.x4a
    public final int a() {
        return this.value;
    }
}
