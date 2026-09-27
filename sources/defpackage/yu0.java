package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yu0 implements dfd {
    public static final yu0 a = new Object();
    public static final gy7 b = gy7.c("sdkVersion");
    public static final gy7 c = gy7.c(ConstantsKt.KEY_MODEL);
    public static final gy7 d = gy7.c("hardware");
    public static final gy7 e = gy7.c("device");
    public static final gy7 f = gy7.c("product");
    public static final gy7 g = gy7.c("osBuild");
    public static final gy7 h = gy7.c("manufacturer");
    public static final gy7 i = gy7.c("fingerprint");
    public static final gy7 j = gy7.c("locale");
    public static final gy7 k = gy7.c("country");
    public static final gy7 l = gy7.c("mccMnc");
    public static final gy7 m = gy7.c("applicationBuild");

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        bx bxVar = (bx) obj;
        efd efdVar = (efd) obj2;
        efdVar.add(b, ((dw0) bxVar).a);
        dw0 dw0Var = (dw0) bxVar;
        efdVar.add(c, dw0Var.b);
        efdVar.add(d, dw0Var.c);
        efdVar.add(e, dw0Var.d);
        efdVar.add(f, dw0Var.e);
        efdVar.add(g, dw0Var.f);
        efdVar.add(h, dw0Var.g);
        efdVar.add(i, dw0Var.h);
        efdVar.add(j, dw0Var.i);
        efdVar.add(k, dw0Var.j);
        efdVar.add(l, dw0Var.k);
        efdVar.add(m, dw0Var.l);
    }
}
