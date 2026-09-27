package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yd8 implements eb8 {
    public final /* synthetic */ eb8 a;
    public final /* synthetic */ Ref.b b;

    public yd8(eb8 eb8Var, Ref.b bVar) {
        this.a = eb8Var;
        this.b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        xd8 xd8Var;
        int i;
        if (continuation instanceof xd8) {
            xd8Var = (xd8) continuation;
            int i2 = xd8Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xd8Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = xd8Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = xd8Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    Ref.b bVar = this.b;
                    int i3 = bVar.a;
                    bVar.a = i3 + 1;
                    if (i3 >= 0) {
                        IndexedValue indexedValue = new IndexedValue(i3, obj);
                        xd8Var.m = 1;
                        if (this.a.emit(indexedValue, xd8Var) == u85Var) {
                            return u85Var;
                        }
                    } else {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                }
                return Unit.INSTANCE;
            }
        }
        xd8Var = new xd8(this, continuation);
        Object obj22 = xd8Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = xd8Var.m;
        if (i == 0) {
        }
        return Unit.INSTANCE;
    }
}
