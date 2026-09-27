package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum r3f {
    PERFORMANCE(0),
    COMPATIBLE(1);

    private final int mId;

    r3f(int i) {
        this.mId = i;
    }

    public static r3f a(int i) {
        for (r3f r3fVar : values()) {
            if (r3fVar.mId == i) {
                return r3fVar;
            }
        }
        dmk.v(ace.f(i, "Unknown implementation mode id "));
        return null;
    }

    public final int b() {
        return this.mId;
    }
}
