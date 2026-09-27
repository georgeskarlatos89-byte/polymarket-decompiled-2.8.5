package defpackage;

import com.checkout.components.interfaces.error.CheckoutError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gua implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb8 b;
    public final /* synthetic */ r0c c;

    public /* synthetic */ gua(eb8 eb8Var, r0c r0cVar, int i) {
        this.a = i;
        this.b = eb8Var;
        this.c = r0cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r4.emit(r5, r2) == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        jja jjaVar;
        int i;
        Object m882constructorimpl;
        prc prcVar;
        int i2;
        String str;
        qif qifVar;
        int i3;
        int i4;
        Object m882constructorimpl2;
        int i5 = this.a;
        r0c r0cVar = this.c;
        eb8 eb8Var = this.b;
        Object obj2 = null;
        switch (i5) {
            case 0:
                if (continuation instanceof jja) {
                    jjaVar = (jja) continuation;
                    int i6 = jjaVar.l;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jjaVar.l = i6 - Integer.MIN_VALUE;
                        Object obj3 = jjaVar.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = jjaVar.l;
                        if (i == 0) {
                            if (i == 1) {
                                ResultKt.a(obj3);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj3);
                            String str2 = (String) obj;
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                r0cVar.a.getClass();
                                m882constructorimpl = Result.m882constructorimpl(ve5.h(str2));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.INSTANCE;
                                m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
                            }
                            Pair pair = new Pair(str2, new Result(m882constructorimpl));
                            jjaVar.l = 1;
                            if (eb8Var.emit(pair, jjaVar) == u85Var) {
                                return u85Var;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                jjaVar = new jja(this, continuation);
                Object obj32 = jjaVar.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = jjaVar.l;
                if (i == 0) {
                }
                return Unit.INSTANCE;
            case 1:
                if (continuation instanceof prc) {
                    prcVar = (prc) continuation;
                    int i7 = prcVar.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        prcVar.l = i7 - Integer.MIN_VALUE;
                        Object obj4 = prcVar.k;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = prcVar.l;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                ResultKt.a(obj4);
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj4);
                            Pair pair2 = (Pair) obj;
                            String str3 = (String) pair2.first;
                            Object obj5 = ((Result) pair2.second).a;
                            boolean z = obj5 instanceof r5g;
                            if (!z && ((str = (String) obj5) == null || str.length() == 0)) {
                                ((esb) r0cVar.d).c((CheckoutError.Validation) r0cVar.g.getValue(), null);
                            }
                            Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(obj5);
                            if (m883exceptionOrNullimpl != null) {
                                ((esb) r0cVar.d).c((CheckoutError.Validation) r0cVar.g.getValue(), gp7.b(m883exceptionOrNullimpl));
                            }
                            if (!z) {
                                obj2 = obj5;
                            }
                            Pair pair3 = new Pair(str3, obj2);
                            prcVar.l = 1;
                            if (eb8Var.emit(pair3, prcVar) == u85Var3) {
                                return u85Var3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                prcVar = new prc(this, continuation);
                Object obj42 = prcVar.k;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = prcVar.l;
                if (i2 == 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof qif) {
                    qifVar = (qif) continuation;
                    int i8 = qifVar.l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        qifVar.l = i8 - Integer.MIN_VALUE;
                        Object obj6 = qifVar.k;
                        u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                        i3 = qifVar.l;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    ResultKt.a(obj6);
                                    return Unit.INSTANCE;
                                }
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i4 = qifVar.o;
                            eb8Var = qifVar.n;
                            ResultKt.a(obj6);
                        } else {
                            ResultKt.a(obj6);
                            Pair pair4 = (Pair) obj;
                            String str4 = (String) pair4.first;
                            String str5 = (String) pair4.second;
                            r0c r0cVar2 = this.c;
                            i4 = 0;
                            if (str5 != null) {
                                g85 g85Var = r0cVar2.f;
                                v5k v5kVar = new v5k(r0cVar2, str4, str5, null, 3);
                                qifVar.n = eb8Var;
                                qifVar.o = 0;
                                qifVar.l = 1;
                                obj6 = coc.d(g85Var, v5kVar, qifVar);
                                break;
                            } else {
                                Result.Companion companion3 = Result.INSTANCE;
                                m882constructorimpl2 = Result.m882constructorimpl(ResultKt.createFailure((CheckoutError.Validation) r0cVar2.g.getValue()));
                                Result result = new Result(m882constructorimpl2);
                                qifVar.n = null;
                                qifVar.o = i4;
                                qifVar.l = 2;
                                break;
                            }
                        }
                        m882constructorimpl2 = ((Result) obj6).a;
                        Result result2 = new Result(m882constructorimpl2);
                        qifVar.n = null;
                        qifVar.o = i4;
                        qifVar.l = 2;
                    }
                }
                qifVar = new qif(this, continuation);
                Object obj62 = qifVar.k;
                u85 u85Var42 = u85.COROUTINE_SUSPENDED;
                i3 = qifVar.l;
                if (i3 == 0) {
                }
                m882constructorimpl2 = ((Result) obj62).a;
                Result result22 = new Result(m882constructorimpl2);
                qifVar.n = null;
                qifVar.o = i4;
                qifVar.l = 2;
        }
    }
}
