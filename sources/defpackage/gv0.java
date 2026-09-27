package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gv0 implements dfd {
    public static final gv0 a = new Object();
    public static final gy7 b = gy7.c("networkType");
    public static final gy7 c = gy7.c("mobileSubtype");

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        p2d p2dVar = (p2d) obj;
        efd efdVar = (efd) obj2;
        efdVar.add(b, ((mx0) p2dVar).a);
        efdVar.add(c, ((mx0) p2dVar).b);
    }
}
