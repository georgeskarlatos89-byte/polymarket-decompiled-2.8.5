package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class dq8 extends d7h {
    public dq8(tw5 tw5Var, dq8 dq8Var, pv2 pv2Var, boolean z) {
        super(tw5Var, dq8Var, vvn.c, ald.g, pv2Var, peh.H0);
        this.m = true;
        this.u = z;
        this.v = false;
    }

    @Override // defpackage.cq8, defpackage.v8c
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.cq8, defpackage.aq8
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.d7h, defpackage.cq8
    public final cq8 l1(ec0 ec0Var, pv2 pv2Var, tw5 tw5Var, aq8 aq8Var, csc cscVar, peh pehVar) {
        tw5Var.getClass();
        pv2Var.getClass();
        ec0Var.getClass();
        return new dq8(tw5Var, (dq8) aq8Var, pv2Var, this.u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cq8
    public final cq8 m1(bq8 bq8Var) {
        csc cscVar;
        dq8 dq8Var = (dq8) super.m1(bq8Var);
        if (dq8Var == null) {
            return null;
        }
        List x = dq8Var.x();
        x.getClass();
        List list = x;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ita type = ((d4k) ((t3k) it.next())).getType();
                type.getClass();
                if (nql.c(type) != null) {
                    List x2 = dq8Var.x();
                    x2.getClass();
                    List list2 = x2;
                    ArrayList arrayList = new ArrayList(CollectionsKt.w(list2));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ita type2 = ((d4k) ((t3k) it2.next())).getType();
                        type2.getClass();
                        arrayList.add(nql.c(type2));
                    }
                    int size = dq8Var.x().size() - arrayList.size();
                    boolean z = true;
                    if (size == 0) {
                        List x3 = dq8Var.x();
                        x3.getClass();
                        ArrayList U0 = CollectionsKt.U0(arrayList, x3);
                        if (!U0.isEmpty()) {
                            Iterator it3 = U0.iterator();
                            while (it3.hasNext()) {
                                Pair pair = (Pair) it3.next();
                                if (!Intrinsics.areEqual((csc) pair.first, ((uw5) ((t3k) pair.second)).getName())) {
                                }
                            }
                            return dq8Var;
                        }
                        return dq8Var;
                    }
                    List x4 = dq8Var.x();
                    x4.getClass();
                    List<t3k> list3 = x4;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list3));
                    for (t3k t3kVar : list3) {
                        csc name = ((uw5) t3kVar).getName();
                        name.getClass();
                        int i = ((v3k) t3kVar).f;
                        int i2 = i - size;
                        if (i2 >= 0 && (cscVar = (csc) arrayList.get(i2)) != null) {
                            name = cscVar;
                        }
                        arrayList2.add(t3kVar.u(dq8Var, name, i));
                    }
                    bq8 p1 = dq8Var.p1(fij.b);
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (((csc) it4.next()) == null) {
                                break;
                            }
                        }
                    }
                    z = false;
                    p1.v = Boolean.valueOf(z);
                    p1.g = arrayList2;
                    p1.e = dq8Var.u1();
                    cq8 m1 = super.m1(p1);
                    m1.getClass();
                    return m1;
                }
            }
            return dq8Var;
        }
        return dq8Var;
    }

    @Override // defpackage.cq8, defpackage.aq8
    public final boolean r() {
        return false;
    }
}
