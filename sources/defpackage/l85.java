package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class l85 extends p8c {
    public ofc m;

    @Override // defpackage.p8c, defpackage.olb
    public final void g() {
        super.g();
        ofc ofcVar = this.m;
        if (ofcVar != null) {
            muh muhVar = (muh) ofcVar.f;
            if (muhVar != null) {
                ica icaVar = jca.C0;
                muhVar.e(null);
            }
            ofcVar.f = null;
            if (((muh) ofcVar.e) == null) {
                ofcVar.e = coc.c((xw1) ofcVar.c, null, null, new g1(ofcVar, null, 25), 3);
            }
        }
    }

    @Override // defpackage.p8c, defpackage.olb
    public final void h() {
        super.h();
        ofc ofcVar = this.m;
        if (ofcVar != null) {
            if (((muh) ofcVar.f) == null) {
                xw1 xw1Var = (xw1) ofcVar.c;
                mv6 mv6Var = mv6.a;
                ofcVar.f = coc.c(xw1Var, qyb.b.e, null, new w(ofcVar, null, 11), 2);
                return;
            }
            dmk.n("Cancel call cannot happen without a maybeRun");
        }
    }

    public final Unit o(q55 q55Var) {
        k85 k85Var;
        int i;
        if (q55Var instanceof k85) {
            k85Var = (k85) q55Var;
            int i2 = k85Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k85Var.m = i2 - Integer.MIN_VALUE;
                Object obj = k85Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = k85Var.m;
                if (i != 0 || i == 1) {
                    ResultKt.a(obj);
                    return Unit.INSTANCE;
                }
                dmk.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        k85Var = new k85(this, q55Var);
        Object obj2 = k85Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = k85Var.m;
        if (i != 0) {
        }
        ResultKt.a(obj2);
        return Unit.INSTANCE;
    }
}
