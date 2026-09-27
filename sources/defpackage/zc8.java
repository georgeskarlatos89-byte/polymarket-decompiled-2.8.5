package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class zc8 implements eb8 {
    public final /* synthetic */ Ref.a a;
    public final /* synthetic */ eb8 b;
    public final /* synthetic */ Function2 c;

    public zc8(Ref.a aVar, eb8 eb8Var, Function2 function2) {
        this.a = aVar;
        this.b = eb8Var;
        this.c = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r4.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (r4.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        yc8 yc8Var;
        int i;
        if (continuation instanceof yc8) {
            yc8Var = (yc8) continuation;
            int i2 = yc8Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yc8Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = yc8Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = yc8Var.n;
                eb8 eb8Var = this.b;
                Ref.a aVar = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ResultKt.a(obj2);
                                return Unit.INSTANCE;
                            }
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = yc8Var.k;
                        ResultKt.a(obj2);
                        if (!((Boolean) obj2).booleanValue()) {
                            aVar.a = true;
                            yc8Var.k = null;
                            yc8Var.n = 3;
                        } else {
                            return Unit.INSTANCE;
                        }
                    } else {
                        ResultKt.a(obj2);
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.a(obj2);
                    if (aVar.a) {
                        yc8Var.k = null;
                        yc8Var.n = 1;
                    } else {
                        yc8Var.k = obj;
                        yc8Var.n = 2;
                        obj2 = this.c.invoke(obj, yc8Var);
                    }
                    return u85Var;
                }
            }
        }
        yc8Var = new yc8(this, continuation);
        Object obj22 = yc8Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = yc8Var.n;
        eb8 eb8Var2 = this.b;
        Ref.a aVar2 = this.a;
        if (i == 0) {
        }
    }
}
