package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class ojl {
    public static final vl4 a = new vl4(new lm4(20), false, -301581598);

    public static kch a() {
        return (kch) qch.b.n();
    }

    public static kch c(kch kchVar) {
        if (kchVar instanceof edj) {
            edj edjVar = (edj) kchVar;
            if (edjVar.t == tkm.b()) {
                edjVar.r = null;
                return kchVar;
            }
        }
        if (kchVar instanceof fdj) {
            fdj fdjVar = (fdj) kchVar;
            if (fdjVar.i == tkm.b()) {
                fdjVar.h = null;
                return kchVar;
            }
        }
        kch e = qch.e(kchVar, null, false);
        e.j();
        return e;
    }

    public static Object d(xm xmVar, Function0 function0) {
        oqc oqcVar;
        kch edjVar;
        kch kchVar = (kch) qch.b.n();
        if (kchVar instanceof edj) {
            edj edjVar2 = (edj) kchVar;
            if (edjVar2.t == tkm.b()) {
                Function1 function1 = edjVar2.r;
                Function1 function12 = edjVar2.s;
                try {
                    ((edj) kchVar).r = qch.i(xmVar, function1, true);
                    ((edj) kchVar).s = function12;
                    return function0.invoke();
                } finally {
                    edjVar2.r = function1;
                    edjVar2.s = function12;
                }
            }
        }
        if (kchVar != null && !(kchVar instanceof oqc)) {
            edjVar = kchVar.u(xmVar);
        } else {
            if (kchVar instanceof oqc) {
                oqcVar = (oqc) kchVar;
            } else {
                oqcVar = null;
            }
            edjVar = new edj(oqcVar, xmVar, null, true, false);
        }
        try {
            kch j = edjVar.j();
            try {
                Object invoke = function0.invoke();
                kch.q(j);
                edjVar.c();
                return invoke;
            } catch (Throwable th) {
                kch.q(j);
                throw th;
            }
        } catch (Throwable th2) {
            edjVar.c();
            throw th2;
        }
    }

    public static void e(kch kchVar, kch kchVar2, Function1 function1) {
        if (kchVar == kchVar2) {
            if (kchVar instanceof edj) {
                ((edj) kchVar).r = function1;
                return;
            } else if (kchVar instanceof fdj) {
                ((fdj) kchVar).h = function1;
                return;
            } else {
                f05.g(kchVar, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        kchVar2.getClass();
        kch.q(kchVar);
        kchVar2.c();
    }

    public abstract float b(Object obj);

    public abstract void f(Object obj, float f);
}
