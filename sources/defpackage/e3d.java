package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class e3d extends ty4 {
    static {
        dm0.j("NetworkMeteredCtrlr");
    }

    @Override // defpackage.ty4
    public final int a() {
        return 7;
    }

    @Override // defpackage.ty4
    public final boolean b(xok xokVar) {
        if (xokVar.j.a == v3d.METERED) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ty4
    public final boolean c(Object obj) {
        q3d q3dVar = (q3d) obj;
        q3dVar.getClass();
        if (q3dVar.a && q3dVar.c) {
            return false;
        }
        return true;
    }
}
