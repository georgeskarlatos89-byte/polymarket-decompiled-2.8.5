package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class oc4 implements eb8 {
    public final /* synthetic */ eq1 a;
    public final /* synthetic */ int b;

    public oc4(eq1 eq1Var, int i) {
        this.a = eq1Var;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (defpackage.x7n.d(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5.a.n(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.eb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation<? super Unit> continuation) {
        nc4 nc4Var;
        int i;
        if (continuation instanceof nc4) {
            nc4Var = (nc4) continuation;
            int i2 = nc4Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nc4Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = nc4Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = nc4Var.m;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.a(obj2);
                            return Unit.INSTANCE;
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj2);
                } else {
                    ResultKt.a(obj2);
                    IndexedValue indexedValue = new IndexedValue(this.b, obj);
                    nc4Var.m = 1;
                }
                nc4Var.m = 2;
            }
        }
        nc4Var = new nc4(this, continuation);
        Object obj22 = nc4Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = nc4Var.m;
        if (i == 0) {
        }
        nc4Var.m = 2;
    }
}
