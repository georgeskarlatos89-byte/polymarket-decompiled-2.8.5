package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yv2 extends cg3 {
    public final Function2 e;

    public /* synthetic */ yv2(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? g.a : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.cg3, defpackage.bg3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(j7f j7fVar, Continuation continuation) {
        xv2 xv2Var;
        int i;
        if (continuation instanceof xv2) {
            xv2Var = (xv2) continuation;
            int i2 = xv2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xv2Var.n = i2 - Integer.MIN_VALUE;
                Object obj = xv2Var.l;
                Object obj2 = u85.COROUTINE_SUSPENDED;
                i = xv2Var.n;
                if (i == 0) {
                    if (i == 1) {
                        j7fVar = xv2Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    xv2Var.k = j7fVar;
                    xv2Var.n = 1;
                    if (super.f(j7fVar, xv2Var) == obj2) {
                        return obj2;
                    }
                }
                if (!((i7f) j7fVar).e.B()) {
                    return Unit.INSTANCE;
                }
                dmk.n("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                return null;
            }
        }
        xv2Var = new xv2(this, (q55) continuation);
        Object obj3 = xv2Var.l;
        Object obj22 = u85.COROUTINE_SUSPENDED;
        i = xv2Var.n;
        if (i == 0) {
        }
        if (!((i7f) j7fVar).e.B()) {
        }
    }

    @Override // defpackage.cg3, defpackage.bg3
    public final bg3 h(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new yv2(this.e, coroutineContext, i, bufferOverflow);
    }

    public yv2(Function2 function2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(function2, coroutineContext, i, bufferOverflow);
        this.e = function2;
    }
}
