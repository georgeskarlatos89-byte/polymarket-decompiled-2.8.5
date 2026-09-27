package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class tkl {
    public static final vl4 a = new vl4(new on4(4), false, -2146107503);

    public static final cpf a(nqc nqcVar) {
        return new cpf(nqcVar, null);
    }

    public static final epf b(sqc sqcVar) {
        return new epf(sqcVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r4 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pxn c(Flow flow, int i) {
        te3.f0.getClass();
        int i2 = se3.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (flow instanceof bg3) {
            bg3 bg3Var = (bg3) flow;
            BufferOverflow bufferOverflow = bg3Var.c;
            Flow i4 = bg3Var.i();
            if (i4 != null) {
                int i5 = bg3Var.b;
                if (i5 != -3 && i5 != -2 && i5 != 0) {
                    i3 = i5;
                } else if (bufferOverflow != BufferOverflow.SUSPEND) {
                    if (i == 0) {
                        i3 = 1;
                    }
                    i3 = 0;
                }
                return new pxn(i3, bg3Var.a, bufferOverflow, i4);
            }
        }
        return new pxn(i3, g.a, BufferOverflow.SUSPEND, flow);
    }

    public static final cpf d(Flow flow, t85 t85Var, q4h q4hVar, int i) {
        x85 x85Var;
        pxn c = c(flow, i);
        k3h a2 = ozm.a(i, c.a, (BufferOverflow) c.c);
        CoroutineContext coroutineContext = (CoroutineContext) c.d;
        Flow flow2 = (Flow) c.b;
        q4h.a.getClass();
        if (Intrinsics.areEqual(q4hVar, p4h.b)) {
            x85Var = x85.DEFAULT;
        } else {
            x85Var = x85.UNDISPATCHED;
        }
        return new cpf(a2, coc.b(t85Var, coroutineContext, x85Var, new dz(q4hVar, flow2, a2, ozm.a, (Continuation) null, 24)));
    }

    public static cpf e(Flow flow, w74 w74Var) {
        return d(flow, w74Var, p4h.b, 0);
    }

    public static final epf f(Flow flow, t85 t85Var, q4h q4hVar, Object obj) {
        x85 x85Var;
        pxn c = c(flow, 1);
        uwh a2 = n0n.a(obj);
        CoroutineContext coroutineContext = (CoroutineContext) c.d;
        Flow flow2 = (Flow) c.b;
        q4h.a.getClass();
        if (Intrinsics.areEqual(q4hVar, p4h.b)) {
            x85Var = x85.DEFAULT;
        } else {
            x85Var = x85.UNDISPATCHED;
        }
        return new epf(a2, coc.b(t85Var, coroutineContext, x85Var, new dz(q4hVar, flow2, a2, obj, (Continuation) null, 24)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v2, types: [tca, jj4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Flow flow, t85 t85Var, q55 q55Var) {
        sd8 sd8Var;
        int i;
        if (q55Var instanceof sd8) {
            sd8 sd8Var2 = (sd8) q55Var;
            int i2 = sd8Var2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sd8Var2.l = i2 - Integer.MIN_VALUE;
                sd8Var = sd8Var2;
                Object obj = sd8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = sd8Var.l;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    pxn c = c(flow, 1);
                    jca jcaVar = (jca) t85Var.getCoroutineContext().get(jca.C0);
                    ?? tcaVar = new tca(true);
                    tcaVar.Q(jcaVar);
                    coc.c(t85Var, (CoroutineContext) c.d, null, new rd8((Flow) c.b, tcaVar, null), 2);
                    sd8Var.l = 1;
                    obj = tcaVar.t(sd8Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                Object obj2 = ((Result) obj).a;
                ResultKt.a(obj2);
                return obj2;
            }
        }
        sd8Var = new q55(q55Var);
        Object obj3 = sd8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = sd8Var.l;
        if (i == 0) {
        }
        Object obj22 = ((Result) obj3).a;
        ResultKt.a(obj22);
        return obj22;
    }
}
