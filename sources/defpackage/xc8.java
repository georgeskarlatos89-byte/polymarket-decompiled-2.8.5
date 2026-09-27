package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xc8 implements eb8 {
    public final /* synthetic */ Ref.b a;
    public final /* synthetic */ int b;
    public final /* synthetic */ eb8 c;

    public xc8(Ref.b bVar, int i, eb8 eb8Var) {
        this.a = bVar;
        this.b = i;
        this.c = eb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        wc8 wc8Var;
        int i;
        if (continuation instanceof wc8) {
            wc8Var = (wc8) continuation;
            int i2 = wc8Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wc8Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = wc8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = wc8Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    Ref.b bVar = this.a;
                    int i3 = bVar.a;
                    if (i3 >= this.b) {
                        wc8Var.m = 1;
                        if (this.c.emit(obj, wc8Var) == u85Var) {
                            return u85Var;
                        }
                    } else {
                        bVar.a = i3 + 1;
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        wc8Var = new wc8(this, continuation);
        Object obj22 = wc8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = wc8Var.m;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
