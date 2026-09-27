package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class aak extends o5g implements Function2 {
    public int l;
    public /* synthetic */ Object m;
    final /* synthetic */ View n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aak(View view, Continuation continuation) {
        super(2, continuation);
        this.n = view;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        aak aakVar = new aak(this.n, continuation);
        aakVar.m = obj;
        return aakVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((aak) create((fwg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r1.d(new defpackage.tj6(new defpackage.w9k((android.view.ViewGroup) r6)), r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r1.b(r6, r5) == r0) goto L17;
     */
    @Override // defpackage.l81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fwg fwgVar;
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        int i = this.l;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.a(obj);
                    return Unit.INSTANCE;
                }
                dmk.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fwgVar = (fwg) this.m;
            ResultKt.a(obj);
        } else {
            ResultKt.a(obj);
            fwgVar = (fwg) this.m;
            View view = this.n;
            this.m = fwgVar;
            this.l = 1;
        }
        View view2 = this.n;
        if (view2 instanceof ViewGroup) {
            this.m = null;
            this.l = 2;
            fwgVar.getClass();
        }
        return Unit.INSTANCE;
    }
}
