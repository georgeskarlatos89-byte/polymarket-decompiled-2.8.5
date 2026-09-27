package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class cd8 implements eb8 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ eb8 b;
    public final /* synthetic */ Function2 c;

    public cd8(eb8 eb8Var, Function2 function2) {
        this.b = eb8Var;
        this.c = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r2.emit(r11, r0) != r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r11 == r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        if (r2.emit(r12, r0) == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r1 == r4) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        bd8 bd8Var;
        int i;
        int i2;
        Object invoke;
        ftd ftdVar;
        int i3;
        int i4 = this.a;
        Function2 function2 = this.c;
        eb8 eb8Var = this.b;
        switch (i4) {
            case 0:
                if (continuation instanceof bd8) {
                    bd8Var = (bd8) continuation;
                    int i5 = bd8Var.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bd8Var.l = i5 - Integer.MIN_VALUE;
                        Object obj2 = bd8Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = bd8Var.l;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    ResultKt.a(obj2);
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i6 = bd8Var.o;
                            Object obj3 = bd8Var.n;
                            ResultKt.a(obj2);
                            i2 = i6;
                            obj = obj3;
                            invoke = obj2;
                        } else {
                            ResultKt.a(obj2);
                            bd8Var.n = obj;
                            i2 = 0;
                            bd8Var.o = 0;
                            bd8Var.l = 1;
                            invoke = function2.invoke(obj, bd8Var);
                            break;
                        }
                        if (!((Boolean) invoke).booleanValue()) {
                            bd8Var.n = null;
                            bd8Var.o = i2;
                            bd8Var.l = 2;
                            break;
                        } else {
                            throw new i0(this);
                        }
                    }
                }
                bd8Var = new bd8(this, continuation);
                Object obj22 = bd8Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = bd8Var.l;
                if (i == 0) {
                }
                if (!((Boolean) invoke).booleanValue()) {
                }
            default:
                if (continuation instanceof ftd) {
                    ftdVar = (ftd) continuation;
                    int i7 = ftdVar.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ftdVar.l = i7 - Integer.MIN_VALUE;
                        Object obj4 = ftdVar.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i3 = ftdVar.l;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    ResultKt.a(obj4);
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            eb8Var = ftdVar.m;
                            ResultKt.a(obj4);
                        } else {
                            ResultKt.a(obj4);
                            ftdVar.m = eb8Var;
                            ftdVar.l = 1;
                            obj4 = ((vqd) obj).a(function2, ftdVar);
                            break;
                        }
                        ftdVar.m = null;
                        ftdVar.l = 2;
                        break;
                    }
                }
                ftdVar = new ftd(this, continuation);
                Object obj42 = ftdVar.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i3 = ftdVar.l;
                if (i3 == 0) {
                }
                ftdVar.m = null;
                ftdVar.l = 2;
        }
    }

    public cd8(Function2 function2, eb8 eb8Var) {
        this.c = function2;
        this.b = eb8Var;
    }
}
