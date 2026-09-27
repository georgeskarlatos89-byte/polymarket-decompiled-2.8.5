package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class nd9 extends jjc implements qse {
    public epc o;
    public hd9 p;

    @Override // defpackage.jjc
    public final void V0() {
        e1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [c4a, java.lang.Object, hd9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c1(q55 q55Var) {
        kd9 kd9Var;
        int i;
        hd9 hd9Var;
        if (q55Var instanceof kd9) {
            kd9Var = (kd9) q55Var;
            int i2 = kd9Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kd9Var.n = i2 - Integer.MIN_VALUE;
                Object obj = kd9Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = kd9Var.n;
                if (i == 0) {
                    if (i == 1) {
                        hd9Var = kd9Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (this.p == null) {
                        ?? obj2 = new Object();
                        epc epcVar = this.o;
                        kd9Var.k = obj2;
                        kd9Var.n = 1;
                        if (((fpc) epcVar).a(obj2, kd9Var) == u85Var) {
                            return u85Var;
                        }
                        hd9Var = obj2;
                    }
                    return Unit.INSTANCE;
                }
                this.p = hd9Var;
                return Unit.INSTANCE;
            }
        }
        kd9Var = new kd9(this, q55Var);
        Object obj3 = kd9Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = kd9Var.n;
        if (i == 0) {
        }
        this.p = hd9Var;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d1(q55 q55Var) {
        ld9 ld9Var;
        int i;
        if (q55Var instanceof ld9) {
            ld9Var = (ld9) q55Var;
            int i2 = ld9Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ld9Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ld9Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ld9Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    hd9 hd9Var = this.p;
                    if (hd9Var != null) {
                        id9 id9Var = new id9(hd9Var);
                        epc epcVar = this.o;
                        ld9Var.m = 1;
                        if (((fpc) epcVar).a(id9Var, ld9Var) == u85Var) {
                            return u85Var;
                        }
                    }
                    return Unit.INSTANCE;
                }
                this.p = null;
                return Unit.INSTANCE;
            }
        }
        ld9Var = new ld9(this, q55Var);
        Object obj2 = ld9Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ld9Var.m;
        if (i == 0) {
        }
        this.p = null;
        return Unit.INSTANCE;
    }

    public final void e1() {
        hd9 hd9Var = this.p;
        if (hd9Var != null) {
            ((fpc) this.o).b(new id9(hd9Var));
            this.p = null;
        }
    }

    @Override // defpackage.qse
    public final void f0() {
        e1();
    }

    @Override // defpackage.qse
    public final void o(gse gseVar, hse hseVar, long j) {
        if (hseVar == hse.Main) {
            int i = gseVar.f;
            if (i == 4) {
                coc.c(Q0(), null, null, new md9(this, null, 0), 3);
            } else if (i == 5) {
                coc.c(Q0(), null, null, new md9(this, null, 1), 3);
            }
        }
    }
}
