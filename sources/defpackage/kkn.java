package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class kkn {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, cw2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [c3g, java.lang.Object] */
    public static gw2 a(ew2 ew2Var) {
        ?? obj = new Object();
        obj.c = new Object();
        gw2 gw2Var = new gw2(obj);
        obj.b = gw2Var;
        obj.a = ew2Var.getClass();
        try {
            Object j = ew2Var.j(obj);
            if (j != null) {
                obj.a = j;
                return gw2Var;
            }
            return gw2Var;
        } catch (Exception e) {
            gw2Var.a(e);
            return gw2Var;
        }
    }
}
