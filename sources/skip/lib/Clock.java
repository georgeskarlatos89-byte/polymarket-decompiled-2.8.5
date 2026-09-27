package skip.lib;

import defpackage.dmk;
import defpackage.py2;
import defpackage.u85;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skip.lib.InstantProtocol;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u0011J,\u0010\u0012\u001a\u00020\b2\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014H\u0096@¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001aR\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lskip/lib/Clock;", "I", "Lskip/lib/InstantProtocol;", "", "now", "getNow", "()Lskip/lib/InstantProtocol;", "minimumResolution", "Lskip/lib/Duration;", "getMinimumResolution", "()Lskip/lib/Duration;", "sleep", "", "until", "tolerance", "(Lskip/lib/InstantProtocol;Lskip/lib/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "for_", "(Lskip/lib/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "measure", "work", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "durationBetween", OpsMetricTracker.START, "end", "(Lskip/lib/InstantProtocol;Lskip/lib/InstantProtocol;)Lskip/lib/Duration;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Clock<I extends InstantProtocol> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <I extends InstantProtocol> Object measure(Clock<I> clock, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Duration> continuation) {
            return Clock.access$measure$jd(clock, function1, continuation);
        }

        @Deprecated
        public static <I extends InstantProtocol> Object sleep(Clock<I> clock, Duration duration, Continuation<? super Unit> continuation) {
            return Clock.access$sleep$jd(clock, duration, continuation);
        }

        public static /* synthetic */ Object sleep$default(Clock clock, InstantProtocol instantProtocol, Duration duration, Continuation continuation, int i, Object obj) {
            return Clock.sleep$default(clock, instantProtocol, duration, continuation, i, obj);
        }
    }

    static /* synthetic */ Object access$measure$jd(Clock clock, Function1 function1, Continuation continuation) {
        return super.measure(function1, continuation);
    }

    static /* synthetic */ Object access$sleep$jd(Clock clock, Duration duration, Continuation continuation) {
        return super.sleep(duration, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v5, types: [skip.lib.InstantProtocol] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <I extends InstantProtocol> Object measure$suspendImpl(Clock<I> clock, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Duration> continuation) {
        Clock$measure$1 clock$measure$1;
        int i;
        I now;
        if (continuation instanceof Clock$measure$1) {
            clock$measure$1 = (Clock$measure$1) continuation;
            int i2 = clock$measure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clock$measure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = clock$measure$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = clock$measure$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ?? r5 = (InstantProtocol) clock$measure$1.L$2;
                        Clock<I> clock2 = (Clock) clock$measure$1.L$0;
                        kotlin.ResultKt.a(obj);
                        now = r5;
                        clock = clock2;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    kotlin.ResultKt.a(obj);
                    now = clock.getNow();
                    clock$measure$1.L$0 = clock;
                    clock$measure$1.L$1 = null;
                    clock$measure$1.L$2 = now;
                    clock$measure$1.label = 1;
                    if (function1.invoke(clock$measure$1) == u85Var) {
                        return u85Var;
                    }
                }
                return clock.durationBetween(now, clock.getNow());
            }
        }
        clock$measure$1 = new Clock$measure$1(clock, continuation);
        Object obj2 = clock$measure$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = clock$measure$1.label;
        if (i == 0) {
        }
        return clock.durationBetween(now, clock.getNow());
    }

    static /* synthetic */ Object sleep$default(Clock clock, InstantProtocol instantProtocol, Duration duration, Continuation continuation, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                duration = null;
            }
            return clock.sleep(instantProtocol, duration, continuation);
        }
        py2.f("Super calls with default arguments not supported in this target, function: sleep");
        return null;
    }

    static <I extends InstantProtocol> Object sleep$suspendImpl(Clock<I> clock, Duration duration, Continuation<? super Unit> continuation) {
        Object sleep = Task.INSTANCE.sleep(duration, continuation);
        if (sleep == u85.COROUTINE_SUSPENDED) {
            return sleep;
        }
        return Unit.INSTANCE;
    }

    Duration durationBetween(I start, I end);

    Duration getMinimumResolution();

    I getNow();

    default Object measure(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Duration> continuation) {
        return measure$suspendImpl(this, function1, continuation);
    }

    default Object sleep(Duration duration, Continuation<? super Unit> continuation) {
        return sleep$suspendImpl(this, duration, continuation);
    }

    Object sleep(I i, Duration duration, Continuation<? super Unit> continuation);
}
