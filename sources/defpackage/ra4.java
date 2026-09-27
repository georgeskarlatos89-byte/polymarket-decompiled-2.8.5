package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra4 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ ra4(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa A[SYNTHETIC] */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        m9a m9aVar;
        int f;
        boolean z;
        jnf jnfVar;
        switch (this.a) {
            case 0:
                ArrayList arrayList = ((qr9) obj).a;
                int size = arrayList.size();
                yon.c(size, "initialCapacity");
                Object[] objArr = new Object[size];
                jnf jnfVar2 = jnf.c;
                Collections.sort(arrayList, xsc.c);
                Iterator it = arrayList.iterator();
                if (it instanceof m9a) {
                    m9aVar = (m9a) it;
                } else {
                    m9aVar = new m9a(it);
                }
                int i = 0;
                while (m9aVar.hasNext()) {
                    jnf jnfVar3 = (jnf) m9aVar.next();
                    while (m9aVar.hasNext()) {
                        if (!m9aVar.b) {
                            m9aVar.c = m9aVar.a.next();
                            m9aVar.b = true;
                        }
                        jnf jnfVar4 = (jnf) m9aVar.c;
                        bl5 bl5Var = jnfVar3.a;
                        bl5 bl5Var2 = jnfVar3.b;
                        bl5 bl5Var3 = jnfVar4.b;
                        bl5 bl5Var4 = jnfVar4.a;
                        if (bl5Var.a(bl5Var3) <= 0 && bl5Var4.a(bl5Var2) <= 0) {
                            int a = bl5Var.a(bl5Var4);
                            bl5 bl5Var5 = jnfVar4.b;
                            int a2 = bl5Var2.a(bl5Var5);
                            if (a >= 0 && a2 <= 0) {
                                jnfVar = jnfVar3;
                            } else if (a <= 0 && a2 >= 0) {
                                jnfVar = jnfVar4;
                            } else {
                                if (a >= 0) {
                                    bl5Var4 = bl5Var;
                                }
                                if (a2 <= 0) {
                                    bl5Var5 = bl5Var2;
                                }
                                if (bl5Var4.a(bl5Var5) <= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                brn.j(z, "intersection is undefined for disconnected ranges %s and %s", jnfVar3, jnfVar4);
                                jnfVar = new jnf(bl5Var4, bl5Var5);
                            }
                            brn.j(jnfVar.a.equals(jnfVar.b), "Overlapping ranges not permitted but found %s overlapping %s", jnfVar3, jnfVar4);
                            jnf jnfVar5 = (jnf) m9aVar.next();
                            int a3 = bl5Var.a(jnfVar5.a);
                            int a4 = bl5Var2.a(jnfVar5.b);
                            if (a3 > 0 || a4 < 0) {
                                if (a3 < 0 || a4 > 0) {
                                    if (a3 > 0) {
                                        bl5Var = jnfVar5.a;
                                    }
                                    if (a4 < 0) {
                                        jnfVar3 = jnfVar5;
                                    }
                                    jnfVar5 = new jnf(bl5Var, jnfVar3.b);
                                }
                                jnfVar3 = jnfVar5;
                            }
                        }
                        jnfVar3.getClass();
                        int i2 = i + 1;
                        f = wq9.f(objArr.length, i2);
                        if (f <= objArr.length) {
                            objArr = Arrays.copyOf(objArr, f);
                        }
                        objArr[i] = jnfVar3;
                        i = i2;
                    }
                    jnfVar3.getClass();
                    int i22 = i + 1;
                    f = wq9.f(objArr.length, i22);
                    if (f <= objArr.length) {
                    }
                    objArr[i] = jnfVar3;
                    i = i22;
                }
                wwf j = jr9.j(i, objArr);
                if (j.isEmpty()) {
                    return rr9.b;
                }
                if (j.d == 1 && ((jnf) dwm.h(j)).equals(jnf.c)) {
                    return rr9.c;
                }
                return new rr9(j);
            case 1:
                return ((dr9) obj).g();
            case 2:
                return ((sr9) obj).h();
            default:
                return new ArrayList();
        }
    }
}
