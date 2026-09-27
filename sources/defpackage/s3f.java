package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public enum s3f {
    FILL_START(0),
    FILL_CENTER(1),
    FILL_END(2),
    FIT_START(3),
    FIT_CENTER(4),
    FIT_END(5);

    private final int mId;

    s3f(int i) {
        this.mId = i;
    }

    public static s3f a(int i) {
        for (s3f s3fVar : values()) {
            if (s3fVar.mId == i) {
                return s3fVar;
            }
        }
        dmk.v(ace.f(i, "Unknown scale type id "));
        return null;
    }

    public final int b() {
        return this.mId;
    }
}
