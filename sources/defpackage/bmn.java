package defpackage;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class bmn {
    public static final void a(Function0 function0, String str, kjc kjcVar, cs1 cs1Var, es1 es1Var, float f, boolean z, pq4 pq4Var, int i) {
        int i2;
        cs1 cs1Var2;
        es1 es1Var2;
        boolean z2;
        float f2;
        int i3;
        int i4;
        int i5;
        function0.getClass();
        str.getClass();
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-101155437);
        if ((i & 14) == 0) {
            if (sr8Var.j(function0)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (sr8Var.h(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (sr8Var.h(kjcVar)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i6 = i2 | 1797120;
        if ((2995931 & i6) == 599186 && sr8Var.F()) {
            sr8Var.Y();
            cs1Var2 = cs1Var;
            es1Var2 = es1Var;
            f2 = f;
            z2 = z;
        } else {
            cs1Var2 = cs1.Dark;
            es1Var2 = es1.Buy;
            int t0 = (int) ((il6) sr8Var.l(as4.h)).t0(100.0f);
            Object[] objArr = {cs1Var2, es1Var2, Integer.valueOf(t0), str};
            sr8Var.f0(-568225417);
            boolean z3 = false;
            for (int i7 = 0; i7 < 4; i7++) {
                z3 |= sr8Var.h(objArr[i7]);
            }
            Object Q = sr8Var.Q();
            uwn uwnVar = oq4.a;
            if (z3 || Q == uwnVar) {
                Q = new azd(cs1Var2, es1Var2, t0, str);
                sr8Var.o0(Q);
            }
            sr8Var.s(false);
            Function1 function1 = (Function1) Q;
            sr8Var.f0(511388516);
            boolean h = sr8Var.h(true) | sr8Var.h(function0);
            Object Q2 = sr8Var.Q();
            if (h || Q2 == uwnVar) {
                Q2 = new bzd(function0, 0);
                sr8Var.o0(Q2);
            }
            sr8Var.s(false);
            r70.a(function1, kjcVar, (Function1) Q2, sr8Var, (i6 >> 3) & 112, 0);
            z2 = true;
            f2 = 100.0f;
        }
        nrf u = sr8Var.u();
        if (u == null) {
            return;
        }
        u.d = new czd(function0, str, kjcVar, cs1Var2, es1Var2, f2, z2, i);
    }

    public static m9c b(String str, Iterable iterable) {
        l9c l9cVar;
        iterable.getClass();
        wah wahVar = new wah();
        Iterator it = iterable.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            l9cVar = l9c.b;
            if (!hasNext) {
                break;
            }
            m9c m9cVar = (m9c) it.next();
            if (m9cVar != l9cVar) {
                if (m9cVar instanceof zb3) {
                    CollectionsKt.p(wahVar, ((zb3) m9cVar).c);
                } else {
                    wahVar.add(m9cVar);
                }
            }
        }
        int i = wahVar.a;
        if (i != 0) {
            if (i != 1) {
                return new zb3(str, (m9c[]) wahVar.toArray(new m9c[0]));
            }
            return (m9c) wahVar.get(0);
        }
        return l9cVar;
    }
}
