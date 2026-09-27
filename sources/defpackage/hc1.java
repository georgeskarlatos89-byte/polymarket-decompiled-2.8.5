package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hc1 extends ty4 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc1(iz4 iz4Var, int i) {
        super(iz4Var);
        this.b = i;
    }

    @Override // defpackage.ty4
    public final int a() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // defpackage.ty4
    public final boolean b(xok xokVar) {
        switch (this.b) {
            case 0:
                return xokVar.j.b;
            case 1:
                return xokVar.j.d;
            case 2:
                if (xokVar.j.a == v3d.CONNECTED) {
                    return true;
                }
                return false;
            case 3:
                v3d v3dVar = xokVar.j.a;
                if (v3dVar == v3d.UNMETERED || v3dVar == v3d.TEMPORARILY_UNMETERED) {
                    return true;
                }
                return false;
            default:
                return xokVar.j.e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // defpackage.ty4
    public final boolean c(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 2:
                q3d q3dVar = (q3d) obj;
                q3dVar.getClass();
                if (q3dVar.a && q3dVar.b) {
                    return false;
                }
                return true;
            case 3:
                q3d q3dVar2 = (q3d) obj;
                q3dVar2.getClass();
                if (q3dVar2.a && !q3dVar2.c) {
                    return false;
                }
                return true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
        }
    }
}
