package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class edh {
    public static final Object a = new Object();

    public static final boolean a(dxh dxhVar, int i, r4 r4Var, boolean z) {
        boolean z2;
        synchronized (a) {
            try {
                int i2 = dxhVar.d;
                if (i2 == i) {
                    dxhVar.c = r4Var;
                    z2 = true;
                    if (z) {
                        dxhVar.e++;
                    }
                    dxhVar.d = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final dxh b(ddh ddhVar) {
        dxh dxhVar = ddhVar.a;
        dxhVar.getClass();
        return (dxh) qch.s(dxhVar, ddhVar);
    }

    public static final int c(ddh ddhVar) {
        dxh dxhVar = ddhVar.a;
        dxhVar.getClass();
        return ((dxh) qch.f(dxhVar)).e;
    }

    public static final boolean d(ddh ddhVar, Function1 function1) {
        int i;
        r4 r4Var;
        Object invoke;
        kch h;
        boolean a2;
        do {
            synchronized (a) {
                dxh dxhVar = ddhVar.a;
                dxhVar.getClass();
                dxh dxhVar2 = (dxh) qch.f(dxhVar);
                i = dxhVar2.d;
                r4Var = dxhVar2.c;
            }
            r4Var.getClass();
            wke d = r4Var.d();
            invoke = function1.invoke(d);
            r4 c = d.c();
            if (Intrinsics.areEqual(c, r4Var)) {
                break;
            }
            dxh dxhVar3 = ddhVar.a;
            dxhVar3.getClass();
            synchronized (qch.c) {
                h = qch.h();
                a2 = a((dxh) qch.w(dxhVar3, ddhVar, h), i, c, true);
            }
            qch.l(h, ddhVar);
        } while (!a2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final void e(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
    }
}
