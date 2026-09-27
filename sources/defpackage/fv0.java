package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fv0 implements dfd {
    public static final fv0 a = new Object();
    public static final gy7 b = gy7.c("requestTimeMs");
    public static final gy7 c = gy7.c("requestUptimeMs");
    public static final gy7 d = gy7.c("clientInfo");
    public static final gy7 e = gy7.c("logSource");
    public static final gy7 f = gy7.c("logSourceName");
    public static final gy7 g = gy7.c("logEvent");
    public static final gy7 h = gy7.c("qosTier");

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        frb frbVar = (frb) obj;
        efd efdVar = (efd) obj2;
        efdVar.add(b, ((kx0) frbVar).a);
        kx0 kx0Var = (kx0) frbVar;
        efdVar.add(c, kx0Var.b);
        efdVar.add(d, kx0Var.c);
        efdVar.add(e, kx0Var.d);
        efdVar.add(f, kx0Var.e);
        efdVar.add(g, kx0Var.f);
        efdVar.add(h, kx0Var.g);
    }
}
