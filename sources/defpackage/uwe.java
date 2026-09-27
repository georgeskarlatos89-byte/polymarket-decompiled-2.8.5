package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum uwe {
    STAR(1),
    POLYGON(2);

    private final int value;

    uwe(int i) {
        this.value = i;
    }

    public static uwe a(int i) {
        for (uwe uweVar : values()) {
            if (uweVar.value == i) {
                return uweVar;
            }
        }
        return null;
    }
}
