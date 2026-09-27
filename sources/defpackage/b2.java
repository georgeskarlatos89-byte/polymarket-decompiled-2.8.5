package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b2 {
    public static final b2 c;
    public static final b2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (v2.d) {
            d = null;
            c = null;
        } else {
            d = new b2(null, false);
            c = new b2(null, true);
        }
    }

    public b2(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
