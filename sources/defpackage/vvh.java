package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class vvh implements eb8 {
    public final /* synthetic */ Ref.a a;
    public final /* synthetic */ eb8 b;

    public vvh(Ref.a aVar, eb8 eb8Var) {
        this.a = aVar;
        this.b = eb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, Continuation<? super Unit> continuation) {
        uvh uvhVar;
        int i2;
        if (continuation instanceof uvh) {
            uvhVar = (uvh) continuation;
            int i3 = uvhVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uvhVar.m = i3 - Integer.MIN_VALUE;
                Object obj = uvhVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i2 = uvhVar.m;
                if (i2 == 0) {
                    if (i2 == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    if (i > 0) {
                        Ref.a aVar = this.a;
                        if (!aVar.a) {
                            aVar.a = true;
                            o4h o4hVar = o4h.START;
                            uvhVar.m = 1;
                            if (this.b.emit(o4hVar, uvhVar) == u85Var) {
                                return u85Var;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        uvhVar = new uvh(this, continuation);
        Object obj2 = uvhVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i2 = uvhVar.m;
        if (i2 == 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.eb8
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Number) obj).intValue(), continuation);
    }
}
