package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rc3 extends zei implements Function2 {
    public final /* synthetic */ int k;
    public /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc3(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.k = i2;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                rc3 rc3Var = new rc3(2, 0, continuation);
                rc3Var.l = ((Boolean) obj).booleanValue();
                return rc3Var;
            case 1:
                rc3 rc3Var2 = new rc3(2, 1, continuation);
                rc3Var2.l = ((Boolean) obj).booleanValue();
                return rc3Var2;
            case 2:
                rc3 rc3Var3 = new rc3(2, 2, continuation);
                rc3Var3.l = ((Boolean) obj).booleanValue();
                return rc3Var3;
            case 3:
                rc3 rc3Var4 = new rc3(2, 3, continuation);
                rc3Var4.l = ((Boolean) obj).booleanValue();
                return rc3Var4;
            case 4:
                rc3 rc3Var5 = new rc3(2, 4, continuation);
                rc3Var5.l = ((Boolean) obj).booleanValue();
                return rc3Var5;
            case 5:
                rc3 rc3Var6 = new rc3(2, 5, continuation);
                rc3Var6.l = ((Boolean) obj).booleanValue();
                return rc3Var6;
            case 6:
                rc3 rc3Var7 = new rc3(2, 6, continuation);
                rc3Var7.l = ((Boolean) obj).booleanValue();
                return rc3Var7;
            case 7:
                rc3 rc3Var8 = new rc3(2, 7, continuation);
                rc3Var8.l = ((Boolean) obj).booleanValue();
                return rc3Var8;
            case 8:
                rc3 rc3Var9 = new rc3(2, 8, continuation);
                rc3Var9.l = ((Boolean) obj).booleanValue();
                return rc3Var9;
            case 9:
                rc3 rc3Var10 = new rc3(2, 9, continuation);
                rc3Var10.l = ((Boolean) obj).booleanValue();
                return rc3Var10;
            default:
                rc3 rc3Var11 = new rc3(2, 10, continuation);
                rc3Var11.l = ((Boolean) obj).booleanValue();
                return rc3Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.k;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
            case 0:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((rc3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        int i = this.k;
        boolean z = this.l;
        switch (i) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(z);
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(z);
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(z);
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(!z);
            case 4:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(z);
            case 5:
                u85 u85Var6 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(!z);
            case 6:
                u85 u85Var7 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(z);
            case 7:
                u85 u85Var8 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(!z);
            case 8:
                u85 u85Var9 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(!z);
            case 9:
                u85 u85Var10 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(!z);
            default:
                u85 u85Var11 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.valueOf(z);
        }
    }
}
