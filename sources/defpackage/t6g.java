package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class t6g implements cv2 {
    public final cv2 a;
    public final Function2 b;
    public final xw1 c;

    public t6g(cv2 cv2Var, xw1 xw1Var, Function2 function2) {
        cv2Var.getClass();
        this.a = cv2Var;
        this.b = function2;
        this.c = qsn.i(xw1Var, new lca(xym.h(xw1Var.b)));
    }

    public final Object a(w5g w5gVar, Continuation continuation) {
        if (w5gVar instanceof u5g) {
            return w5gVar;
        }
        if (w5gVar instanceof s5g) {
            return this.b.invoke(((s5g) w5gVar).a, continuation);
        }
        dmk.a();
        return null;
    }

    @Override // defpackage.cv2
    public final Object await(Continuation continuation) {
        return m67.d.G(new bd5(2, this, t6g.class, "map", "map(Lio/getstream/result/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 28), new gq6(this, null, 18), continuation);
    }

    @Override // defpackage.cv2
    public final void cancel() {
        this.a.cancel();
        xym.f(this.c.b);
    }

    @Override // defpackage.cv2
    public final void enqueue(zu2 zu2Var) {
        coc.c(this.c, null, null, new mx7(this, zu2Var, null, 25), 3);
    }

    @Override // defpackage.cv2
    public final w5g execute() {
        return (w5g) whn.b(g.a, new x2a(this, null, 21));
    }

    @Override // defpackage.cv2
    public final void enqueue() {
        enqueue(new f27(26));
    }
}
