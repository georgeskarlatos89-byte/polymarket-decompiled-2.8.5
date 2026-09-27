package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ev0 implements dfd {
    public static final ev0 a = new Object();
    public static final gy7 b = gy7.c("eventTimeMs");
    public static final gy7 c = gy7.c("eventCode");
    public static final gy7 d = gy7.c("complianceData");
    public static final gy7 e = gy7.c("eventUptimeMs");
    public static final gy7 f = gy7.c("sourceExtension");
    public static final gy7 g = gy7.c("sourceExtensionJsonProto3");
    public static final gy7 h = gy7.c("timezoneOffsetSeconds");
    public static final gy7 i = gy7.c("networkConnectionInfo");

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        arb arbVar = (arb) obj;
        efd efdVar = (efd) obj2;
        efdVar.add(b, ((jx0) arbVar).a);
        jx0 jx0Var = (jx0) arbVar;
        efdVar.add(c, jx0Var.b);
        efdVar.add(d, jx0Var.c);
        efdVar.add(e, jx0Var.d);
        efdVar.add(f, jx0Var.e);
        efdVar.add(g, jx0Var.f);
        efdVar.add(h, jx0Var.g);
        efdVar.add(i, jx0Var.h);
    }
}
