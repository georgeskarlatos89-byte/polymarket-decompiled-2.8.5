package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class av0 implements dfd {
    public static final av0 a = new Object();
    public static final gy7 b = gy7.c("clientType");
    public static final gy7 c = gy7.c("androidClientInfo");

    @Override // defpackage.nd7
    public final void encode(Object obj, Object obj2) {
        j64 j64Var = (j64) obj;
        efd efdVar = (efd) obj2;
        efdVar.add(b, ((mw0) j64Var).a);
        efdVar.add(c, ((mw0) j64Var).b);
    }
}
