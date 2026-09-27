package defpackage;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class f22 implements eb8 {
    public final /* synthetic */ float a;
    public final /* synthetic */ lkg b;
    public final /* synthetic */ Ref.a c;

    public f22(float f, lkg lkgVar, Ref.a aVar) {
        this.a = f;
        this.b = lkgVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r7.g(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (defpackage.lkg.f(r8, r7, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Pair pair, Continuation continuation) {
        e22 e22Var;
        int i;
        if (continuation instanceof e22) {
            e22Var = (e22) continuation;
            int i2 = e22Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e22Var.m = i2 - Integer.MIN_VALUE;
                Object obj = e22Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = e22Var.m;
                Ref.a aVar = this.c;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.a(obj);
                } else {
                    ResultKt.a(obj);
                    y8a y8aVar = (y8a) pair.first;
                    int intValue = ((Number) pair.second).intValue();
                    if (y8aVar != null && intValue != 0) {
                        int e = i5c.e(((y8aVar.c / 2.0f) + (y8aVar.a + this.a)) - (intValue / 2.0f));
                        lkg lkgVar = this.b;
                        int e2 = lnf.e(e, 0, lkgVar.e.y());
                        if (aVar.a) {
                            e22Var.m = 1;
                        } else {
                            e22Var.m = 2;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                aVar.a = true;
                return Unit.INSTANCE;
            }
        }
        e22Var = new e22(this, continuation);
        Object obj2 = e22Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = e22Var.m;
        Ref.a aVar2 = this.c;
        if (i == 0) {
        }
        aVar2.a = true;
        return Unit.INSTANCE;
    }

    @Override // defpackage.eb8
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a((Pair) obj, continuation);
    }
}
