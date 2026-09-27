package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class x5n {
    public static final Object a = new Object();
    public static volatile lym b;
    public static volatile lym c;

    public static final void a(final duh duhVar, final kjc kjcVar, o4b o4bVar, final mqd mqdVar, final float f, final jk0 jk0Var, x78 x78Var, boolean z, apd apdVar, final Function1 function1, pq4 pq4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        final o4b o4bVar2;
        final x78 x78Var2;
        final apd apdVar2;
        o4b o4bVar3;
        x78 x78Var3;
        int i5;
        boolean z3;
        mqd mqdVar2;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-578931208);
        if (sr8Var.h(duhVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sr8Var.h(kjcVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 373317760;
        if (sr8Var.j(function1)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        final boolean z4 = true;
        if ((306783379 & i7) == 306783378 && (i4 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (sr8Var.V(i7 & 1, z2)) {
            sr8Var.a0();
            int i8 = i & 1;
            Object obj = oq4.a;
            if (i8 != 0 && !sr8Var.D()) {
                sr8Var.Y();
                i5 = i7 & (-1908409217);
                o4bVar3 = o4bVar;
                x78Var3 = x78Var;
                z4 = z;
                apdVar2 = apdVar;
            } else {
                Object[] objArr = new Object[0];
                zcg zcgVar = o4b.x;
                boolean f2 = sr8Var.f(0) | sr8Var.f(0);
                Object Q = sr8Var.Q();
                if (f2 || Q == obj) {
                    Q = new mma(8);
                    sr8Var.o0(Q);
                }
                o4bVar3 = (o4b) jun.e(objArr, zcgVar, (Function0) Q, sr8Var, 0);
                rw5 a2 = ohh.a(sr8Var);
                boolean h = sr8Var.h(a2);
                Object Q2 = sr8Var.Q();
                if (h || Q2 == obj) {
                    Q2 = new z36(a2);
                    sr8Var.o0(Q2);
                }
                x78Var3 = (z36) Q2;
                i5 = i7 & (-1908409217);
                apdVar2 = cpd.a(sr8Var);
            }
            sr8Var.t();
            xmd xmdVar = xmd.Vertical;
            x78 x78Var4 = x78Var3;
            float mo9getSpacingD9Ej5fM = jk0Var.mo9getSpacingD9Ej5fM();
            int i9 = (i5 & 14) | 432;
            if ((((i9 & 14) ^ 6) > 4 && sr8Var.h(duhVar)) || (i9 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q3 = sr8Var.Q();
            if (!z3 && Q3 != obj) {
                mqdVar2 = mqdVar;
            } else {
                mqdVar2 = mqdVar;
                Q3 = new m4b(new gm7(mqdVar2, duhVar, jk0Var));
                sr8Var.o0(Q3);
            }
            mqd mqdVar3 = mqdVar2;
            x78Var2 = x78Var4;
            y5n.a(o4bVar3, xmdVar, (m4b) Q3, kjcVar, mqdVar3, x78Var2, z4, apdVar2, f, mo9getSpacingD9Ej5fM, function1, sr8Var, ((i5 << 6) & 7168) | 818110512, (i4 << 3) & 112);
            o4bVar2 = o4bVar3;
        } else {
            sr8Var.Y();
            o4bVar2 = o4bVar;
            x78Var2 = x78Var;
            z4 = z;
            apdVar2 = apdVar;
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new Function2(kjcVar, o4bVar2, mqdVar, f, jk0Var, x78Var2, z4, apdVar2, function1, i) { // from class: t3b
                public final /* synthetic */ kjc b;
                public final /* synthetic */ o4b c;
                public final /* synthetic */ mqd d;
                public final /* synthetic */ float e;
                public final /* synthetic */ jk0 f;
                public final /* synthetic */ x78 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ apd i;
                public final /* synthetic */ Function1 j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int a3 = rtn.a(1772545);
                    x5n.a(duh.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (pq4) obj2, a3);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
