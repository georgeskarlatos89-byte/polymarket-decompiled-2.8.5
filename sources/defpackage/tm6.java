package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tm6 implements swh {
    public final /* synthetic */ int a = 0;
    public final Flow b;
    public final Function0 c;

    public tm6(Flow flow, Function0 function0) {
        this.b = flow;
        this.c = function0;
    }

    @Override // defpackage.g3h
    public final List c() {
        int i = this.a;
        Function0 function0 = this.c;
        switch (i) {
            case 0:
                return eb4.c(function0.invoke());
            default:
                return eb4.c(function0.invoke());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        sm6 sm6Var;
        int i;
        ne8 ne8Var;
        int i2;
        jca jcaVar;
        switch (this.a) {
            case 0:
                if (continuation instanceof sm6) {
                    sm6Var = (sm6) continuation;
                    int i3 = sm6Var.m;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sm6Var.m = i3 - Integer.MIN_VALUE;
                        Object obj = sm6Var.k;
                        u85 u85Var = u85.COROUTINE_SUSPENDED;
                        i = sm6Var.m;
                        if (i == 0) {
                            if (i != 1) {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ResultKt.a(obj);
                        } else {
                            ResultKt.a(obj);
                            sc6 sc6Var = new sc6(this, eb8Var, (Continuation) null, 6);
                            sm6Var.m = 1;
                            if (qsn.f(sc6Var, sm6Var) == u85Var) {
                                return u85Var;
                            }
                        }
                        f05.c();
                        return null;
                    }
                }
                sm6Var = new sm6(this, continuation);
                Object obj2 = sm6Var.k;
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                i = sm6Var.m;
                if (i == 0) {
                }
                f05.c();
                return null;
            default:
                if (continuation instanceof ne8) {
                    ne8Var = (ne8) continuation;
                    int i4 = ne8Var.n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ne8Var.n = i4 - Integer.MIN_VALUE;
                        Object obj3 = ne8Var.l;
                        u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                        i2 = ne8Var.n;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                jca jcaVar2 = ne8Var.k;
                                ResultKt.a(obj3);
                                jcaVar = jcaVar2;
                            } else {
                                dmk.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ResultKt.a(obj3);
                            jca jcaVar3 = (jca) ne8Var.getContext().get(jca.C0);
                            Flow b = otl.b(this.b);
                            ne8Var.k = jcaVar3;
                            ne8Var.n = 1;
                            if (b.collect(eb8Var, ne8Var) == u85Var3) {
                                return u85Var3;
                            }
                            jcaVar = jcaVar3;
                        }
                        while (true) {
                            if (jcaVar == null && !jcaVar.isActive()) {
                                throw jcaVar.z();
                            }
                        }
                    }
                }
                ne8Var = new ne8(this, continuation);
                Object obj32 = ne8Var.l;
                u85 u85Var32 = u85.COROUTINE_SUSPENDED;
                i2 = ne8Var.n;
                if (i2 == 0) {
                }
                while (true) {
                    if (jcaVar == null) {
                    }
                }
        }
    }

    @Override // defpackage.swh
    public final Object getValue() {
        int i = this.a;
        Function0 function0 = this.c;
        switch (i) {
            case 0:
                return function0.invoke();
            default:
                return function0.invoke();
        }
    }

    public tm6(Function0 function0, Flow flow) {
        this.c = function0;
        this.b = flow;
    }
}
