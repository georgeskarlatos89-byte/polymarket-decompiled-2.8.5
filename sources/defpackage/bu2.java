package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class bu2 implements eb8 {
    public final /* synthetic */ Ref.b a;
    public final /* synthetic */ eb8 b;

    public bu2(eb8 eb8Var, Ref.b bVar) {
        this.a = bVar;
        this.b = eb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(IndexedValue indexedValue, Continuation continuation) {
        au2 au2Var;
        int i;
        if (continuation instanceof au2) {
            au2Var = (au2) continuation;
            int i2 = au2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                au2Var.n = i2 - Integer.MIN_VALUE;
                Object obj = au2Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = au2Var.n;
                Ref.b bVar = this.a;
                if (i == 0) {
                    if (i == 1) {
                        indexedValue = au2Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    indexedValue.getClass();
                    if (indexedValue.a > bVar.a) {
                        Object obj2 = indexedValue.b;
                        au2Var.k = indexedValue;
                        au2Var.n = 1;
                        if (this.b.emit(obj2, au2Var) == u85Var) {
                            return u85Var;
                        }
                    }
                    return Unit.INSTANCE;
                }
                bVar.a = indexedValue.a;
                return Unit.INSTANCE;
            }
        }
        au2Var = new au2(this, continuation);
        Object obj3 = au2Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = au2Var.n;
        Ref.b bVar2 = this.a;
        if (i == 0) {
        }
        bVar2.a = indexedValue.a;
        return Unit.INSTANCE;
    }

    @Override // defpackage.eb8
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a((IndexedValue) obj, continuation);
    }
}
