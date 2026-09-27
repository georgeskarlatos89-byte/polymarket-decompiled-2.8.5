package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public enum x3k {
    NIL(false, false),
    BOOLEAN(false, false),
    INTEGER(true, false),
    FLOAT(true, false),
    STRING(false, true),
    BINARY(false, true),
    ARRAY(false, false),
    MAP(false, false),
    EXTENSION(false, false);

    private final boolean numberType;
    private final boolean rawType;

    x3k(boolean z, boolean z2) {
        this.numberType = z;
        this.rawType = z2;
    }

    public final boolean a() {
        return this.rawType;
    }
}
