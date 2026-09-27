package defpackage;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface ws4 {
    static void j(wpc wpcVar, ws4 ws4Var, ws4 ws4Var2, ow0 ow0Var) {
        if (Objects.equals(ow0Var, no9.z0)) {
            y2g y2gVar = (y2g) ws4Var2.a(ow0Var, null);
            y2g y2gVar2 = (y2g) ws4Var.a(ow0Var, null);
            vs4 f = ws4Var2.f(ow0Var);
            if (y2gVar == null) {
                y2gVar = y2gVar2;
            } else if (y2gVar2 != null) {
                dm0 dm0Var = y2gVar2.a;
                z2g z2gVar = y2gVar2.b;
                dm0 dm0Var2 = y2gVar.a;
                if (dm0Var2 != null) {
                    dm0Var = dm0Var2;
                }
                z2g z2gVar2 = y2gVar.b;
                if (z2gVar2 != null) {
                    z2gVar = z2gVar2;
                }
                y2gVar = new y2g(dm0Var, z2gVar);
            }
            wpcVar.t(ow0Var, f, y2gVar);
            return;
        }
        wpcVar.t(ow0Var, ws4Var2.f(ow0Var), ws4Var2.h(ow0Var));
    }

    static lld o(ws4 ws4Var, ws4 ws4Var2) {
        wpc p;
        if (ws4Var == null && ws4Var2 == null) {
            return lld.c;
        }
        if (ws4Var2 != null) {
            p = wpc.s(ws4Var2);
        } else {
            p = wpc.p();
        }
        if (ws4Var != null) {
            Iterator it = ws4Var.b().iterator();
            while (it.hasNext()) {
                j(p, ws4Var2, ws4Var, (ow0) it.next());
            }
        }
        return lld.g(p);
    }

    Object a(ow0 ow0Var, Object obj);

    Set b();

    Set c(ow0 ow0Var);

    void d(vt0 vt0Var);

    boolean e(ow0 ow0Var);

    vs4 f(ow0 ow0Var);

    Object h(ow0 ow0Var);

    Object i(ow0 ow0Var, vs4 vs4Var);
}
