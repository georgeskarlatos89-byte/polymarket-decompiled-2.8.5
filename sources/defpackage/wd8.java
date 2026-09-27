package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class wd8 implements eb8 {
    public final /* synthetic */ eb8 a;
    public final /* synthetic */ Function2 b;

    public wd8(eb8 eb8Var, Function2 function2) {
        this.a = eb8Var;
        this.b = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r7.emit(r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        vd8 vd8Var;
        int i;
        int i2;
        Object obj2;
        eb8 eb8Var;
        if (continuation instanceof vd8) {
            vd8Var = (vd8) continuation;
            int i3 = vd8Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vd8Var.l = i3 - Integer.MIN_VALUE;
                Object obj3 = vd8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = vd8Var.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj3);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = vd8Var.p;
                    eb8Var = vd8Var.o;
                    obj2 = vd8Var.n;
                    ResultKt.a(obj3);
                } else {
                    ResultKt.a(obj3);
                    vd8Var.n = obj;
                    eb8 eb8Var2 = this.a;
                    vd8Var.o = eb8Var2;
                    vd8Var.p = 0;
                    vd8Var.l = 1;
                    if (this.b.invoke(obj, vd8Var) != u85Var) {
                        i2 = 0;
                        obj2 = obj;
                        eb8Var = eb8Var2;
                    }
                    return u85Var;
                }
                vd8Var.n = null;
                vd8Var.o = null;
                vd8Var.p = i2;
                vd8Var.l = 2;
            }
        }
        vd8Var = new vd8(this, continuation);
        Object obj32 = vd8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = vd8Var.l;
        if (i == 0) {
        }
        vd8Var.n = null;
        vd8Var.o = null;
        vd8Var.p = i2;
        vd8Var.l = 2;
    }
}
