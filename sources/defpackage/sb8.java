package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sb8 implements eb8 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ eb8 c;

    public sb8(Ref.ObjectRef objectRef, Function3 function3, eb8 eb8Var) {
        this.a = objectRef;
        this.b = function3;
        this.c = eb8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r7.c.emit(r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        rb8 rb8Var;
        int i;
        Ref.ObjectRef objectRef;
        if (continuation instanceof rb8) {
            rb8Var = (rb8) continuation;
            int i2 = rb8Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rb8Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = rb8Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = rb8Var.n;
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
                    objectRef = rb8Var.k;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    Object obj3 = objectRef2.a;
                    if (obj3 != jtl.a) {
                        rb8Var.k = objectRef2;
                        rb8Var.n = 1;
                        obj = this.b.invoke(obj3, obj, rb8Var);
                    }
                    obj2 = obj;
                    objectRef = objectRef2;
                }
                objectRef.a = obj2;
                Object obj4 = objectRef2.a;
                rb8Var.k = null;
                rb8Var.n = 2;
            }
        }
        rb8Var = new rb8(this, continuation);
        Object obj22 = rb8Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = rb8Var.n;
        Ref.ObjectRef objectRef22 = this.a;
        if (i == 0) {
        }
        objectRef.a = obj22;
        Object obj42 = objectRef22.a;
        rb8Var.k = null;
        rb8Var.n = 2;
    }
}
