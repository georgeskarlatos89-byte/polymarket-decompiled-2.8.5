package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class by4 implements xrb {
    public static final by4 b;
    public urb a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, by4] */
    static {
        ?? obj = new Object();
        obj.a = urb.INFO;
        b = obj;
    }

    @Override // defpackage.xrb
    public final void a(String str) {
        str.getClass();
        d(urb.WARN, str);
    }

    @Override // defpackage.xrb
    public final void b(String str) {
        d(urb.DEBUG, str);
    }

    @Override // defpackage.xrb
    public final void c(String str) {
        d(urb.ERROR, str);
    }

    public final void d(urb urbVar, String str) {
        if (this.a.compareTo(urbVar) <= 0) {
            System.out.println((Object) str);
        }
    }
}
