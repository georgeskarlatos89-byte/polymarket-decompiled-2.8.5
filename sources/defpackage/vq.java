package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vq implements eb8 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ t85 b;
    public final /* synthetic */ Function2 c;

    public vq(Ref.ObjectRef objectRef, t85 t85Var, Function2 function2) {
        this.a = objectRef;
        this.b = t85Var;
        this.c = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        sq sqVar;
        int i;
        if (continuation instanceof sq) {
            sqVar = (sq) continuation;
            int i2 = sqVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sqVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = sqVar.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = sqVar.n;
                Ref.ObjectRef objectRef = this.a;
                if (i == 0) {
                    if (i == 1) {
                        obj = sqVar.k;
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    jca jcaVar = (jca) objectRef.a;
                    if (jcaVar != null) {
                        jcaVar.e(new cq());
                        sqVar.k = obj;
                        sqVar.n = 1;
                        if (jcaVar.e0(sqVar) == u85Var) {
                            return u85Var;
                        }
                    }
                }
                Object obj3 = obj;
                x85 x85Var = x85.UNDISPATCHED;
                Function2 function2 = this.c;
                t85 t85Var = this.b;
                objectRef.a = coc.c(t85Var, null, x85Var, new qq(function2, obj3, t85Var, null, 1), 1);
                return Unit.INSTANCE;
            }
        }
        sqVar = new sq(this, continuation);
        Object obj22 = sqVar.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = sqVar.n;
        Ref.ObjectRef objectRef2 = this.a;
        if (i == 0) {
        }
        Object obj32 = obj;
        x85 x85Var2 = x85.UNDISPATCHED;
        Function2 function22 = this.c;
        t85 t85Var2 = this.b;
        objectRef2.a = coc.c(t85Var2, null, x85Var2, new qq(function22, obj32, t85Var2, null, 1), 1);
        return Unit.INSTANCE;
    }
}
