package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uc8 implements eb8 {
    public final /* synthetic */ eb8 a;
    public final /* synthetic */ Ref.ObjectRef b;

    public uc8(eb8 eb8Var, Ref.ObjectRef objectRef) {
        this.a = eb8Var;
        this.b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.Unit, java.lang.Object] */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        tc8 tc8Var;
        int i;
        try {
            if (continuation instanceof tc8) {
                tc8Var = (tc8) continuation;
                int i2 = tc8Var.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    tc8Var.m = i2 - Integer.MIN_VALUE;
                    Object obj2 = tc8Var.k;
                    u85 u85Var = u85.COROUTINE_SUSPENDED;
                    i = tc8Var.m;
                    if (i == 0) {
                        if (i == 1) {
                            ResultKt.a(obj2);
                        } else {
                            dmk.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        ResultKt.a(obj2);
                        eb8 eb8Var = this.a;
                        tc8Var.m = 1;
                        if (eb8Var.emit(obj, tc8Var) == u85Var) {
                            return u85Var;
                        }
                    }
                    this = Unit.INSTANCE;
                    return this;
                }
            }
            if (i == 0) {
            }
            this = Unit.INSTANCE;
            return this;
        } catch (Throwable th) {
            this.b.a = th;
            throw th;
        }
        tc8Var = new tc8(this, continuation);
        Object obj22 = tc8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = tc8Var.m;
    }
}
