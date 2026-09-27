package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fug {
    public final jjc a;
    public final boolean b;
    public final LayoutNode c;
    public final ytg d;
    public fug e;
    public final int f;

    public fug(jjc jjcVar, boolean z, LayoutNode layoutNode, ytg ytgVar) {
        this.a = jjcVar;
        this.b = z;
        this.c = layoutNode;
        this.d = ytgVar;
        this.f = layoutNode.b;
    }

    public static /* synthetic */ List j(int i, fug fugVar) {
        boolean z;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = !fugVar.b;
        } else {
            z = false;
        }
        if ((i & 2) == 0) {
            z2 = true;
        }
        return fugVar.i(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [jjc] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [jjc] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [zqc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [zqc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final zrf a(x8d x8dVar) {
        vj6 vj6Var;
        fug l = l();
        if (l == null) {
            return zrf.e;
        }
        jjc jjcVar = l.c.G.f;
        x8d x8dVar2 = null;
        if ((jjcVar.d & 8) != 0) {
            loop0: while (jjcVar != null) {
                if ((jjcVar.c & 8) != 0) {
                    vj6Var = jjcVar;
                    ?? r5 = 0;
                    while (vj6Var != 0) {
                        if (vj6Var instanceof dug) {
                            if (vj6Var.f()) {
                                break loop0;
                            }
                        } else if ((vj6Var.c & 8) != 0 && (vj6Var instanceof vj6)) {
                            jjc jjcVar2 = vj6Var.p;
                            int i = 0;
                            vj6Var = vj6Var;
                            r5 = r5;
                            while (jjcVar2 != null) {
                                if ((jjcVar2.c & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        vj6Var = jjcVar2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new zqc(new jjc[16]);
                                        }
                                        if (vj6Var != 0) {
                                            r5.b(vj6Var);
                                            vj6Var = 0;
                                        }
                                        r5.b(jjcVar2);
                                    }
                                }
                                jjcVar2 = jjcVar2.f;
                                vj6Var = vj6Var;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        vj6Var = nj6.c(r5);
                    }
                }
                if ((jjcVar.d & 8) == 0) {
                    break;
                }
                jjcVar = jjcVar.f;
            }
        }
        vj6Var = 0;
        dug dugVar = (dug) vj6Var;
        if (dugVar != null) {
            x8dVar2 = nj6.e(dugVar, 8);
        }
        if (x8dVar2 == null) {
            return l.a(x8dVar);
        }
        return x8dVar2.y(x8dVar, true);
    }

    public final fug b(u8g u8gVar, Function1 function1) {
        int i;
        ytg ytgVar = new ytg();
        ytgVar.c = false;
        ytgVar.d = false;
        function1.invoke(ytgVar);
        eug eugVar = new eug(function1);
        int i2 = this.f;
        if (u8gVar != null) {
            i = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        } else {
            i = 2000000000;
        }
        fug fugVar = new fug(eugVar, false, new LayoutNode(true, i2 + i), ytgVar);
        fugVar.e = this;
        return fugVar;
    }

    public final void c(LayoutNode layoutNode, ArrayList arrayList) {
        zqc I = layoutNode.I();
        Object[] objArr = I.a;
        int i = I.c;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.S() && !layoutNode2.Q) {
                if (layoutNode2.G.c(8)) {
                    arrayList.add(mok.d(layoutNode2, this.b));
                } else {
                    c(layoutNode2, arrayList);
                }
            }
        }
    }

    public final x8d d() {
        if (n()) {
            fug l = l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        dug f = f();
        if (f != null) {
            return nj6.e(f, 8);
        }
        return this.c.G.c;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        r(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            fug fugVar = (fug) arrayList.get(size2);
            if (fugVar.o()) {
                arrayList2.add(fugVar);
            } else if (!fugVar.d.d) {
                fugVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dug f() {
        jjc jjcVar;
        boolean z;
        boolean z2 = this.d.c;
        Object obj = null;
        LayoutNode layoutNode = this.c;
        if (z2) {
            jjc jjcVar2 = layoutNode.G.f;
            if ((jjcVar2.d & 8) != 0) {
                jjcVar = null;
                while (jjcVar2 != null) {
                    if ((jjcVar2.c & 8) != 0) {
                        jjc jjcVar3 = jjcVar2;
                        zqc zqcVar = null;
                        while (jjcVar3 != null) {
                            if (jjcVar3 instanceof dug) {
                                dug dugVar = (dug) jjcVar3;
                                if (dugVar.f()) {
                                    if (dugVar.N0()) {
                                        return dugVar;
                                    }
                                    if (jjcVar == null) {
                                        jjcVar = dugVar;
                                    }
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z && (jjcVar3.c & 8) != 0 && (jjcVar3 instanceof vj6)) {
                                int i = 0;
                                for (jjc jjcVar4 = ((vj6) jjcVar3).p; jjcVar4 != null; jjcVar4 = jjcVar4.f) {
                                    if ((jjcVar4.c & 8) != 0) {
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
                    if ((jjcVar2.d & 8) == 0) {
                        break;
                    }
                    jjcVar2 = jjcVar2.f;
                }
                obj = jjcVar;
            }
            return (dug) obj;
        }
        jjc jjcVar5 = layoutNode.G.f;
        if ((jjcVar5.d & 8) != 0) {
            loop3: while (jjcVar5 != null) {
                if ((jjcVar5.c & 8) != 0) {
                    jjcVar = jjcVar5;
                    zqc zqcVar2 = null;
                    while (jjcVar != null) {
                        if (jjcVar instanceof dug) {
                            if (((dug) jjcVar).f()) {
                                obj = jjcVar;
                            }
                        } else if ((jjcVar.c & 8) != 0 && (jjcVar instanceof vj6)) {
                            int i2 = 0;
                            for (jjc jjcVar6 = ((vj6) jjcVar).p; jjcVar6 != null; jjcVar6 = jjcVar6.f) {
                                if ((jjcVar6.c & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        jjcVar = jjcVar6;
                                    } else {
                                        if (zqcVar2 == null) {
                                            zqcVar2 = new zqc(new jjc[16]);
                                        }
                                        if (jjcVar != null) {
                                            zqcVar2.b(jjcVar);
                                            jjcVar = null;
                                        }
                                        zqcVar2.b(jjcVar6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        jjcVar = nj6.c(zqcVar2);
                    }
                }
                if ((jjcVar5.d & 8) == 0) {
                    break;
                }
                jjcVar5 = jjcVar5.f;
            }
        }
        return (dug) obj;
    }

    public final zrf g() {
        x8d d = d();
        if (d != null) {
            if (!d.k1().n) {
                d = null;
            }
            if (d != null) {
                return i3n.c(d).y(d, true);
            }
        }
        return zrf.e;
    }

    public final zrf h() {
        x8d d = d();
        if (d != null) {
            if (!d.k1().n) {
                d = null;
            }
            if (d != null) {
                return i3n.b(d, true);
            }
        }
        return zrf.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.d) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (o()) {
            ArrayList arrayList2 = new ArrayList();
            e(arrayList, arrayList2);
            return arrayList2;
        }
        return r(arrayList, z2);
    }

    public final ytg k() {
        boolean o = o();
        ytg ytgVar = this.d;
        if (o) {
            ytg b = ytgVar.b();
            q(new ArrayList(), b);
            return b;
        }
        return ytgVar;
    }

    public final fug l() {
        LayoutNode layoutNode;
        fug fugVar = this.e;
        if (fugVar != null) {
            return fugVar;
        }
        LayoutNode layoutNode2 = this.c;
        boolean z = this.b;
        if (z) {
            layoutNode = layoutNode2.D();
            while (layoutNode != null) {
                ytg F = layoutNode.F();
                if (F != null && F.c) {
                    break;
                }
                layoutNode = layoutNode.D();
            }
        }
        layoutNode = null;
        if (layoutNode == null) {
            LayoutNode D = layoutNode2.D();
            while (true) {
                if (D != null) {
                    if (D.G.c(8)) {
                        layoutNode = D;
                        break;
                    }
                    D = D.D();
                } else {
                    layoutNode = null;
                    break;
                }
            }
        }
        if (layoutNode == null) {
            return null;
        }
        return mok.d(layoutNode, z);
    }

    public final zrf m() {
        boolean z;
        mj6 f = f();
        if (f == null) {
            return this.c.G.c.G1();
        }
        jjc jjcVar = ((jjc) f).a;
        if (cjj.e(this.d, xtg.b) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!jjcVar.a.n) {
            return zrf.e;
        }
        if (!z) {
            x8d e = nj6.e(jjcVar, 8);
            return i3n.c(e).y(e, true);
        }
        return nj6.e(jjcVar, 8).G1();
    }

    public final boolean n() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.b && this.d.c) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (!n() && j(4, this).isEmpty()) {
            LayoutNode D = this.c.D();
            while (true) {
                if (D != null) {
                    ytg F = D.F();
                    if (F != null && F.c) {
                        break;
                    }
                    D = D.D();
                } else {
                    D = null;
                    break;
                }
            }
            if (D == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void q(ArrayList arrayList, ytg ytgVar) {
        if (!this.d.d) {
            r(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                fug fugVar = (fug) arrayList.get(size2);
                if (!fugVar.o()) {
                    ytgVar.d(fugVar.d);
                    fugVar.q(arrayList, ytgVar);
                }
            }
        }
    }

    public final List r(ArrayList arrayList, boolean z) {
        String str;
        if (n()) {
            return CollectionsKt.emptyList();
        }
        c(this.c, arrayList);
        if (z) {
            oug ougVar = kug.z;
            ytg ytgVar = this.d;
            u8g u8gVar = (u8g) cjj.e(ytgVar, ougVar);
            if (u8gVar != null && ytgVar.c && !arrayList.isEmpty()) {
                arrayList.add(b(u8gVar, new b6c(u8gVar, 9)));
            }
            oug ougVar2 = kug.a;
            if (ytgVar.a.b(ougVar2) && !arrayList.isEmpty() && ytgVar.c) {
                List list = (List) cjj.e(ytgVar, ougVar2);
                if (list != null) {
                    str = (String) CollectionsKt.firstOrNull(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, b(null, new vh4(str, 1)));
                }
            }
        }
        return arrayList;
    }
}
