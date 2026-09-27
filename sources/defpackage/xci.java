package defpackage;

import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xci implements taj, nnf {
    public final qci a;

    public xci(qci qciVar) {
        this.a = qciVar;
    }

    @Override // defpackage.taj
    public final Object a(saj sajVar, Function2 function2, zei zeiVar) {
        return e(sajVar, function2, zeiVar);
    }

    @Override // defpackage.cxe
    public final Object b(String str, Function1 function1, q55 q55Var) {
        ddi e = this.a.e(str);
        try {
            Object invoke = function1.invoke(e);
            dgn.a(e, null);
            return invoke;
        } finally {
        }
    }

    @Override // defpackage.taj
    public final Object c(zei zeiVar) {
        return Boolean.valueOf(this.a.a.Y0());
    }

    @Override // defpackage.nnf
    public final fcg d() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(saj sajVar, Function2 function2, q55 q55Var) {
        wci wciVar;
        int i;
        xci xciVar;
        sci sciVar;
        if (q55Var instanceof wci) {
            wciVar = (wci) q55Var;
            int i2 = wciVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wciVar.o = i2 - Integer.MIN_VALUE;
                Object obj = wciVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = wciVar.o;
                if (i == 0) {
                    if (i == 1) {
                        sciVar = wciVar.l;
                        xciVar = wciVar.k;
                        try {
                            ResultKt.a(obj);
                        } catch (Throwable th) {
                            th = th;
                            sciVar.Q();
                            if (!sciVar.Y0()) {
                            }
                            throw th;
                        }
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    sci sciVar2 = this.a.a;
                    sciVar2.Y0();
                    int i3 = vci.a[sajVar.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                sciVar2.r();
                            } else {
                                dmk.a();
                                return null;
                            }
                        } else {
                            sciVar2.L();
                        }
                    } else {
                        sciVar2.u0();
                    }
                    try {
                        exe exeVar = new exe(this, 1);
                        wciVar.k = this;
                        wciVar.l = sciVar2;
                        wciVar.o = 1;
                        Object invoke = function2.invoke(exeVar, wciVar);
                        if (invoke == u85Var) {
                            return u85Var;
                        }
                        xciVar = this;
                        sciVar = sciVar2;
                        obj = invoke;
                    } catch (Throwable th2) {
                        th = th2;
                        xciVar = this;
                        sciVar = sciVar2;
                        sciVar.Q();
                        if (!sciVar.Y0()) {
                            xciVar.getClass();
                        }
                        throw th;
                    }
                }
                sciVar.J();
                sciVar.Q();
                if (!sciVar.Y0()) {
                    xciVar.getClass();
                }
                return obj;
            }
        }
        wciVar = new wci(this, q55Var);
        Object obj2 = wciVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wciVar.o;
        if (i == 0) {
        }
        sciVar.J();
        sciVar.Q();
        if (!sciVar.Y0()) {
        }
        return obj2;
    }
}
