package defpackage;

import com.polymarket.data.EKYCState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vla extends zei implements Function2 {
    public final /* synthetic */ int k;
    public final /* synthetic */ Function0 l;
    public final /* synthetic */ qqc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vla(Function0 function0, qqc qqcVar, Continuation continuation, int i) {
        super(2, continuation);
        this.k = i;
        this.l = function0;
        this.m = qqcVar;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.k;
        qqc qqcVar = this.m;
        Function0 function0 = this.l;
        switch (i) {
            case 0:
                return new vla(function0, qqcVar, continuation, 0);
            case 1:
                return new vla(function0, qqcVar, continuation, 1);
            default:
                return new vla(function0, qqcVar, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.k) {
            case 0:
                return ((vla) create((EKYCState) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((vla) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((vla) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        Function0 function0 = this.l;
        qqc qqcVar = this.m;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                qqcVar.setValue(Boolean.FALSE);
                function0.invoke();
                return Unit.INSTANCE;
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (!((Boolean) qqcVar.getValue()).booleanValue()) {
                    function0.invoke();
                    qqcVar.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            default:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (((Boolean) qqcVar.getValue()).booleanValue()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
