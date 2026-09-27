package defpackage;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class phn {
    public static final Object a(mj6 mj6Var, Function0 function0, q55 q55Var) {
        Object obj;
        r8d r8dVar;
        if (!((jjc) mj6Var).a.n) {
            return Unit.INSTANCE;
        }
        jjc jjcVar = (jjc) mj6Var;
        if (!jjcVar.a.n) {
            kw9.c("visitAncestors called on an unattached node");
        }
        jjc jjcVar2 = jjcVar.a.e;
        LayoutNode h = nj6.h(mj6Var);
        loop0: while (true) {
            obj = null;
            if (h == null) {
                break;
            }
            if ((h.G.f.d & 524288) != 0) {
                while (jjcVar2 != null) {
                    if ((jjcVar2.c & 524288) != 0) {
                        jjc jjcVar3 = jjcVar2;
                        zqc zqcVar = null;
                        while (jjcVar3 != null) {
                            if (jjcVar3 instanceof zn1) {
                                obj = jjcVar3;
                                break loop0;
                            }
                            if ((jjcVar3.c & 524288) != 0 && (jjcVar3 instanceof vj6)) {
                                int i = 0;
                                for (jjc jjcVar4 = ((vj6) jjcVar3).p; jjcVar4 != null; jjcVar4 = jjcVar4.f) {
                                    if ((jjcVar4.c & 524288) != 0) {
                                        i++;
                                        if (i == 1) {
                                            jjcVar3 = jjcVar4;
                                        } else {
                                            if (zqcVar == null) {
                                                zqcVar = new zqc(new jjc[16]);
                                            }
                                            if (jjcVar3 != null) {
                                                zqcVar.b(jjcVar3);
                                                jjcVar3 = null;
                                            }
                                            zqcVar.b(jjcVar4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            jjcVar3 = nj6.c(zqcVar);
                        }
                    }
                    jjcVar2 = jjcVar2.e;
                }
            }
            h = h.D();
            if (h != null && (r8dVar = h.G) != null) {
                jjcVar2 = r8dVar.e;
            } else {
                jjcVar2 = null;
            }
        }
        zn1 zn1Var = (zn1) obj;
        if (zn1Var == null) {
            return Unit.INSTANCE;
        }
        x8d g = nj6.g(mj6Var);
        Object N = zn1Var.N(g, new bo(4, function0, g), q55Var);
        if (N == u85.COROUTINE_SUSPENDED) {
            return N;
        }
        return Unit.INSTANCE;
    }

    public static final qjh b(ulc ulcVar, vlc vlcVar) {
        switch (wlc.a[vlcVar.ordinal()]) {
            case 1:
                ulcVar.getClass();
                qjh qjhVar = ulc.b;
                qjhVar.getClass();
                return qjhVar;
            case 2:
                ulcVar.getClass();
                qjh qjhVar2 = ulc.c;
                qjhVar2.getClass();
                return qjhVar2;
            case 3:
                ulcVar.getClass();
                qjh qjhVar3 = ulc.d;
                qjhVar3.getClass();
                return qjhVar3;
            case 4:
                ulcVar.getClass();
                qjh qjhVar4 = ulc.e;
                qjhVar4.getClass();
                return qjhVar4;
            case 5:
                ulcVar.getClass();
                qjh qjhVar5 = ulc.f;
                qjhVar5.getClass();
                return qjhVar5;
            case 6:
                ulcVar.getClass();
                qjh qjhVar6 = ulc.g;
                qjhVar6.getClass();
                return qjhVar6;
            default:
                dmk.a();
                return null;
        }
    }

    public static final qjh c(vlc vlcVar, pq4 pq4Var) {
        return b((ulc) ((sr8) pq4Var).l(f5c.a), vlcVar);
    }

    public abstract int d();

    public abstract v1o e(int i);

    public abstract Object f(int i);

    public abstract Object g(v1o v1oVar);
}
