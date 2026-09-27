package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hg3 implements eb8 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ t85 b;
    public final /* synthetic */ jg3 c;
    public final /* synthetic */ eb8 d;

    public hg3(Ref.ObjectRef objectRef, t85 t85Var, jg3 jg3Var, eb8 eb8Var) {
        this.a = objectRef;
        this.b = t85Var;
        this.c = jg3Var;
        this.d = eb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        gg3 gg3Var;
        int i;
        if (continuation instanceof gg3) {
            gg3Var = (gg3) continuation;
            int i2 = gg3Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gg3Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = gg3Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = gg3Var.n;
                Ref.ObjectRef objectRef = this.a;
                if (i == 0) {
                    if (i == 1) {
                        obj = gg3Var.k;
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    jca jcaVar = (jca) objectRef.a;
                    if (jcaVar != null) {
                        jcaVar.e(new r14());
                        gg3Var.k = obj;
                        gg3Var.n = 1;
                        if (jcaVar.e0(gg3Var) == u85Var) {
                            return u85Var;
                        }
                    }
                }
                Object obj3 = obj;
                objectRef.a = coc.c(this.b, null, x85.UNDISPATCHED, new bw2(this.c, this.d, obj3, (Continuation) null, 5), 1);
                return Unit.INSTANCE;
            }
        }
        gg3Var = new gg3(this, continuation);
        Object obj22 = gg3Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = gg3Var.n;
        Ref.ObjectRef objectRef2 = this.a;
        if (i == 0) {
        }
        Object obj32 = obj;
        objectRef2.a = coc.c(this.b, null, x85.UNDISPATCHED, new bw2(this.c, this.d, obj32, (Continuation) null, 5), 1);
        return Unit.INSTANCE;
    }
}
