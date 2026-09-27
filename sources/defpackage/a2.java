package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class a2 {
    public static final a2 c;
    public static final a2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (u2.GENERATE_CANCELLATION_CAUSES) {
            d = null;
            c = null;
        } else {
            d = new a2(null, false);
            c = new a2(null, true);
        }
    }

    public a2(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
