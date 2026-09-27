package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class nc8 implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow b;
    public final /* synthetic */ Function3 c;

    public /* synthetic */ nc8(Flow flow, Function3 function3, int i) {
        this.a = i;
        this.b = flow;
        this.c = function3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:28|(6:(2:30|(10:32|33|34|(1:(1:(1:(5:39|40|41|42|43)(2:48|49))(2:50|51))(2:52|53))(2:65|66)|54|56|57|(3:59|42|43)|60|61))|56|57|(0)|60|61)|73|33|34|(0)(0)|54) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r1.invoke(r13, r12, r0) == r14) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r12 == r14) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bb, code lost:
    
        if (r2.collect(r13, r0) == r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ab, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r12 = new defpackage.o0j(r12);
        r0.n = null;
        r0.o = r12;
        r0.p = r3;
        r0.l = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f6, code lost:
    
        if (defpackage.qc8.a(r12, r1, r12, r0) != r14) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        throw r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        mc8 mc8Var;
        u85 u85Var;
        int i;
        ncg ncgVar;
        ncg ncgVar2;
        Throwable th;
        rc8 rc8Var;
        int i2;
        Throwable th2;
        int i3 = this.a;
        Function3 function3 = this.c;
        Flow flow = this.b;
        int i4 = 0;
        switch (i3) {
            case 0:
                try {
                    if (continuation instanceof mc8) {
                        mc8Var = (mc8) continuation;
                        int i5 = mc8Var.l;
                        if ((i5 & Integer.MIN_VALUE) != 0) {
                            mc8Var.l = i5 - Integer.MIN_VALUE;
                            Object obj = mc8Var.k;
                            u85Var = u85.COROUTINE_SUSPENDED;
                            i = mc8Var.l;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i == 3) {
                                            ncgVar2 = (ncg) mc8Var.o;
                                            try {
                                                ResultKt.a(obj);
                                                ncgVar2.releaseIntercepted();
                                                return Unit.INSTANCE;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                ncgVar2.releaseIntercepted();
                                                throw th;
                                            }
                                        }
                                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    Throwable th4 = (Throwable) mc8Var.o;
                                    ResultKt.a(obj);
                                    throw th4;
                                }
                                i4 = mc8Var.p;
                                eb8Var = mc8Var.n;
                                ResultKt.a(obj);
                            } else {
                                ResultKt.a(obj);
                                mc8Var.n = eb8Var;
                                mc8Var.p = 0;
                                mc8Var.l = 1;
                                break;
                            }
                            ncgVar = new ncg(eb8Var, mc8Var.getContext());
                            mc8Var.n = null;
                            mc8Var.o = ncgVar;
                            mc8Var.p = i4;
                            mc8Var.l = 3;
                            if (function3.invoke(ncgVar, null, mc8Var) != u85Var) {
                                ncgVar2 = ncgVar;
                                ncgVar2.releaseIntercepted();
                                return Unit.INSTANCE;
                            }
                            return u85Var;
                        }
                    }
                    mc8Var.n = null;
                    mc8Var.o = ncgVar;
                    mc8Var.p = i4;
                    mc8Var.l = 3;
                    if (function3.invoke(ncgVar, null, mc8Var) != u85Var) {
                    }
                    return u85Var;
                } catch (Throwable th5) {
                    ncgVar2 = ncgVar;
                    th = th5;
                    ncgVar2.releaseIntercepted();
                    throw th;
                }
                mc8Var = new mc8(this, continuation);
                Object obj2 = mc8Var.k;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = mc8Var.l;
                if (i == 0) {
                }
                ncgVar = new ncg(eb8Var, mc8Var.getContext());
            default:
                if (continuation instanceof rc8) {
                    rc8Var = (rc8) continuation;
                    int i6 = rc8Var.l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        rc8Var.l = i6 - Integer.MIN_VALUE;
                        Object obj3 = rc8Var.k;
                        Object obj4 = u85.COROUTINE_SUSPENDED;
                        i2 = rc8Var.l;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    ResultKt.a(obj3);
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = rc8Var.o;
                            eb8Var = rc8Var.n;
                            ResultKt.a(obj3);
                        } else {
                            ResultKt.a(obj3);
                            rc8Var.n = eb8Var;
                            rc8Var.o = 0;
                            rc8Var.l = 1;
                            obj3 = vc8.a(flow, eb8Var, rc8Var);
                            break;
                        }
                        th2 = (Throwable) obj3;
                        if (th2 != null) {
                            rc8Var.n = null;
                            rc8Var.o = i4;
                            rc8Var.l = 2;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                rc8Var = new rc8(this, continuation);
                Object obj32 = rc8Var.k;
                Object obj42 = u85.COROUTINE_SUSPENDED;
                i2 = rc8Var.l;
                if (i2 == 0) {
                }
                th2 = (Throwable) obj32;
                if (th2 != null) {
                }
                return Unit.INSTANCE;
        }
    }
}
