package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class joi implements pmi {
    public final vf6 a;
    public final yf6 b;
    public final os7 c;

    public joi(vf6 vf6Var, yf6 yf6Var, os7 os7Var) {
        this.a = vf6Var;
        this.b = yf6Var;
        this.c = os7Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:10|11|12|13|14|(4:16|17|18|(2:23|(1:30)(2:25|(1:27)(1:29)))(2:20|21))|34) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (defpackage.lvn.c(r5, r0) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r2 = r9;
        r9 = r10;
        r10 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.jvm.internal.Ref$b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009f -> B:11:0x002d). Please report as a decompilation issue!!! */
    @Override // defpackage.pmi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(omi omiVar, q55 q55Var) {
        ioi ioiVar;
        int i;
        Ref.b bVar;
        omi omiVar2;
        Object m882constructorimpl;
        Throwable m883exceptionOrNullimpl;
        Ref.b bVar2;
        vf6 vf6Var;
        if (q55Var instanceof ioi) {
            ioiVar = (ioi) q55Var;
            int i2 = ioiVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ioiVar.o = i2 - Integer.MIN_VALUE;
                Object obj = ioiVar.m;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ioiVar.o;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            bVar = ioiVar.l;
                            omiVar2 = ioiVar.k;
                            ResultKt.a(obj);
                            Ref.b bVar3 = bVar;
                            omiVar = omiVar2;
                            bVar3.a--;
                            bVar2 = bVar3;
                            Result.Companion companion = Result.INSTANCE;
                            vf6Var = this.a;
                            ioiVar.k = omiVar;
                            ioiVar.l = bVar2;
                            ioiVar.o = 1;
                            if (vf6Var.a(omiVar, ioiVar) != u85Var) {
                                omiVar2 = omiVar;
                                bVar = bVar2;
                                m882constructorimpl = Result.m882constructorimpl(Unit.INSTANCE);
                                m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
                                if (m883exceptionOrNullimpl == null) {
                                    return Unit.INSTANCE;
                                }
                                if (bVar.a != 0) {
                                    if (!this.b.a(m883exceptionOrNullimpl)) {
                                        long a = this.c.a(bVar.a);
                                        ioiVar.k = omiVar2;
                                        ioiVar.l = bVar;
                                        ioiVar.o = 2;
                                    } else {
                                        throw m883exceptionOrNullimpl;
                                    }
                                } else {
                                    throw m883exceptionOrNullimpl;
                                }
                            }
                            return u85Var;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = ioiVar.l;
                    omiVar2 = ioiVar.k;
                    try {
                        ResultKt.a(obj);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th2));
                        m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
                        if (m883exceptionOrNullimpl == null) {
                        }
                    }
                    m882constructorimpl = Result.m882constructorimpl(Unit.INSTANCE);
                    m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
                    if (m883exceptionOrNullimpl == null) {
                    }
                } else {
                    ResultKt.a(obj);
                    ?? obj2 = new Object();
                    obj2.a = 3;
                    bVar2 = obj2;
                    Result.Companion companion3 = Result.INSTANCE;
                    vf6Var = this.a;
                    ioiVar.k = omiVar;
                    ioiVar.l = bVar2;
                    ioiVar.o = 1;
                    if (vf6Var.a(omiVar, ioiVar) != u85Var) {
                    }
                    return u85Var;
                }
            }
        }
        ioiVar = new ioi(this, q55Var);
        Object obj3 = ioiVar.m;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ioiVar.o;
        if (i == 0) {
        }
    }

    @Override // defpackage.pmi
    public final boolean isSupported() {
        this.a.isSupported();
        return false;
    }
}
