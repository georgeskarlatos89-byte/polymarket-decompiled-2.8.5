package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pe8 implements eb8 {
    public final /* synthetic */ eb8 a;
    public final /* synthetic */ j9g b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public pe8(eb8 eb8Var, j9g j9gVar, boolean z, Function1 function1) {
        this.a = eb8Var;
        this.b = j9gVar;
        this.c = z;
        this.d = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        oe8 oe8Var;
        int i;
        eb8 eb8Var;
        if (continuation instanceof oe8) {
            oe8Var = (oe8) continuation;
            int i2 = oe8Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oe8Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = oe8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = oe8Var.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eb8Var = oe8Var.m;
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    eb8 eb8Var2 = this.a;
                    oe8Var.m = eb8Var2;
                    oe8Var.l = 1;
                    obj2 = vtn.f(this.b, true, this.c, this.d, oe8Var);
                    if (obj2 != u85Var) {
                        eb8Var = eb8Var2;
                    }
                    return u85Var;
                }
                oe8Var.m = null;
                oe8Var.l = 2;
            }
        }
        oe8Var = new oe8(this, continuation);
        Object obj22 = oe8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = oe8Var.l;
        if (i == 0) {
        }
        oe8Var.m = null;
        oe8Var.l = 2;
    }
}
