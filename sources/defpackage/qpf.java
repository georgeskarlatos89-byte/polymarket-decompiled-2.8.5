package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qpf {
    public final vy5 a;
    public final s1e b;

    public qpf(vy5 vy5Var, s1e s1eVar) {
        vy5Var.getClass();
        s1eVar.getClass();
        this.a = vy5Var;
        this.b = s1eVar;
    }

    public static void b(qpf qpfVar, aj7 aj7Var, s6i s6iVar, Map map, int i) {
        if ((i & 2) != 0) {
            s6iVar = null;
        }
        if ((i & 4) != 0) {
            map = zc7.a;
            map.getClass();
        }
        qpfVar.a(aj7Var, s6iVar, map);
    }

    public final void a(aj7 aj7Var, s6i s6iVar, Map map) {
        Map o;
        aj7Var.getClass();
        map.getClass();
        if (s6iVar == null) {
            o = zc7.a;
            o.getClass();
        } else {
            o = m67.o(s6iVar);
        }
        this.a.a(this.b.b(aj7Var, d1c.j(o, map)));
    }
}
