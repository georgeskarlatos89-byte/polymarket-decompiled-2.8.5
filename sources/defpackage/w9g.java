package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class w9g {
    public static w9g b;
    public static final x9g c = new x9g(0, false, false, 0, 0);
    public x9g a;

    /* JADX WARN: Type inference failed for: r1v3, types: [w9g, java.lang.Object] */
    public static synchronized w9g a() {
        w9g w9gVar;
        synchronized (w9g.class) {
            w9g w9gVar2 = b;
            w9gVar = w9gVar2;
            if (w9gVar2 == null) {
                ?? obj = new Object();
                b = obj;
                w9gVar = obj;
            }
        }
        return w9gVar;
    }
}
