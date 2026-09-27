package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vb8 implements eb8 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ ol b;
    public final /* synthetic */ eb8 c;

    public vb8(Ref.ObjectRef objectRef, ol olVar, eb8 eb8Var) {
        this.a = objectRef;
        this.b = olVar;
        this.c = eb8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r7.c.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ub8 ub8Var;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof ub8) {
            ub8Var = (ub8) continuation;
            int i2 = ub8Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ub8Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = ub8Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ub8Var.n;
                Ref.ObjectRef objectRef2 = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    objectRef = ub8Var.k;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    Object obj3 = objectRef2.a;
                    ub8Var.k = objectRef2;
                    ub8Var.n = 1;
                    obj2 = this.b.invoke(obj3, obj, ub8Var);
                    if (obj2 != u85Var) {
                        objectRef = objectRef2;
                    }
                    return u85Var;
                }
                objectRef.a = obj2;
                Object obj4 = objectRef2.a;
                ub8Var.k = null;
                ub8Var.n = 2;
            }
        }
        ub8Var = new ub8(this, continuation);
        Object obj22 = ub8Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ub8Var.n;
        Ref.ObjectRef objectRef22 = this.a;
        if (i == 0) {
        }
        objectRef.a = obj22;
        Object obj42 = objectRef22.a;
        ub8Var.k = null;
        ub8Var.n = 2;
    }
}
