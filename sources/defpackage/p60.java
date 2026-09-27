package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import com.polymarket.usdependencies.AppMetrics;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p60 extends zei implements Function2 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p60(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.k = i2;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.k) {
            case 0:
                return new p60(2, 0, continuation);
            case 1:
                return new p60(2, 1, continuation);
            case 2:
                return new p60(2, 2, continuation);
            case 3:
                return new p60(2, 3, continuation);
            case 4:
                return new p60(2, 4, continuation);
            case 5:
                return new p60(2, 5, continuation);
            case 6:
                return new p60(2, 6, continuation);
            case 7:
                return new p60(2, 7, continuation);
            default:
                return new p60(2, 8, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.k) {
            case 0:
                return ((p60) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((p60) create((eb8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((p60) create((Flow) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((p60) create((kkg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((p60) create((gh9) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((p60) create((t85) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((p60) create((kkg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                ((p60) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return Boolean.TRUE;
            default:
                return ((p60) create((eb8) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        switch (this.k) {
            case 0:
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Choreographer.getInstance();
            case 1:
                u85 u85Var2 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 2:
                u85 u85Var3 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 3:
                u85 u85Var4 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 4:
                u85 u85Var5 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 5:
                u85 u85Var6 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                if (li0.a == null) {
                    li0.a = Long.valueOf(SystemClock.uptimeMillis());
                    AppMetrics.Launch.INSTANCE.attempt();
                }
                return Unit.INSTANCE;
            case 6:
                u85 u85Var7 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
            case 7:
                u85 u85Var8 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Boolean.TRUE;
            default:
                u85 u85Var9 = u85.COROUTINE_SUSPENDED;
                ResultKt.a(obj);
                return Unit.INSTANCE;
        }
    }
}
