package skip.foundation;

import defpackage.coc;
import defpackage.hm6;
import defpackage.j3j;
import defpackage.m51;
import defpackage.mv6;
import defpackage.pw8;
import defpackage.qyb;
import defpackage.wnh;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.GlobalsKt;
import skip.lib.KotlinConverting;
import skip.lib.NumbersKt;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 ;2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002:;B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\fB3\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u0010B-\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0004\u0010\u0014B5\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0004\u0010\u0018B;\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0007J\u0006\u00102\u001a\u00020\u0013J\u0006\u00109\u001a\u00020\u0013R*\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0005R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010#\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00168F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R*\u0010-\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010%\u001a\u0004\b/\u0010,\"\u0004\b0\u00101R\u0011\u00103\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b3\u00104R*\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006<"}, d2 = {"Lskip/foundation/Timer;", "Lskip/lib/KotlinConverting;", "Ljava/util/Timer;", "platformValue", "<init>", "(Ljava/util/Timer;)V", "timeInterval", "", "invocation", "", "repeats", "", "(DLjava/lang/Object;Z)V", "target", "selector", "userInfo", "(DLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V", "block", "Lkotlin/Function1;", "", "(DZLkotlin/jvm/functions/Function1;)V", "fire", "Lskip/foundation/Date;", "interval", "(Lskip/foundation/Date;DZLkotlin/jvm/functions/Function1;)V", "fireAt", "(Lskip/foundation/Date;DLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V", "newValue", "timer", "getTimer", "()Ljava/util/Timer;", "setTimer", "invalidated", "kotlin", "nocopy", "fireDate", "getFireDate$annotations", "()V", "getFireDate", "()Lskip/foundation/Date;", "setFireDate", "(Lskip/foundation/Date;)V", "value", "getTimeInterval", "()D", "tolerance", "getTolerance$annotations", "getTolerance", "setTolerance", "(D)V", "invalidate", "isValid", "()Z", "getUserInfo", "()Ljava/lang/Object;", "setUserInfo", "(Ljava/lang/Object;)V", OpsMetricTracker.START, "Task", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Timer implements KotlinConverting<java.util.Timer> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Function1<? super Timer, Unit> block;
    private boolean invalidated;
    private boolean repeats;
    private double timeInterval;
    private java.util.Timer timer;
    private Object userInfo;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0010\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lskip/foundation/Timer$Task;", "Ljava/util/TimerTask;", "task", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getTask$SkipFoundation", "()Lkotlin/jvm/functions/Function0;", "run", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Task extends TimerTask {
        private final Function0<Unit> task;

        public Task(Function0<Unit> function0) {
            function0.getClass();
            this.task = function0;
        }

        public final Function0<Unit> getTask$SkipFoundation() {
            return this.task;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            pw8 pw8Var = pw8.a;
            mv6 mv6Var = mv6.a;
            coc.c(pw8Var, qyb.b, null, new Timer$Task$run$1(this, null), 2);
        }
    }

    @hm6
    public Timer(Date date, double d, Object obj, Object obj2, Object obj3, boolean z) {
        date.getClass();
        obj.getClass();
        obj2.getClass();
        throw m51.d(null, 1, null);
    }

    private static final Unit _get_timer_$lambda$0(Timer timer, java.util.Timer timer2) {
        timer.setTimer(timer2);
        return Unit.INSTANCE;
    }

    private static final Unit _get_userInfo_$lambda$3(Timer timer, Object obj) {
        timer.setUserInfo(obj);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(Timer timer, Object obj) {
        return _get_userInfo_$lambda$3(timer, obj);
    }

    public static /* synthetic */ Unit b(Timer timer, java.util.Timer timer2) {
        return _get_timer_$lambda$0(timer, timer2);
    }

    public static /* synthetic */ Unit c(Function1 function1, Timer timer) {
        return start$lambda$5$lambda$4(function1, timer);
    }

    private final java.util.Timer getTimer() {
        return (java.util.Timer) StructKt.sref(this.timer, new j3j(this, 0));
    }

    private final void setTimer(java.util.Timer timer) {
        this.timer = (java.util.Timer) StructKt.sref$default(timer, null, 1, null);
    }

    private static final Unit start$lambda$5$lambda$4(Function1 function1, Timer timer) {
        if (function1 != null) {
            function1.invoke(timer);
        }
        return Unit.INSTANCE;
    }

    @hm6
    public final void fire() {
        throw m51.d(null, 1, null);
    }

    public final Date getFireDate() {
        throw m51.d(null, 1, null);
    }

    public final double getTimeInterval() {
        return this.timeInterval;
    }

    public final double getTolerance() {
        throw m51.d(null, 1, null);
    }

    public final Object getUserInfo() {
        return StructKt.sref(this.userInfo, new j3j(this, 1));
    }

    public final void invalidate() {
        synchronized (this) {
            try {
                java.util.Timer timer = getTimer();
                if (timer != null) {
                    timer.cancel();
                }
                setTimer(null);
                this.block = null;
                this.invalidated = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isValid() {
        boolean z;
        synchronized (this) {
            z = !this.invalidated;
        }
        return z;
    }

    @Override // skip.lib.KotlinConverting
    /* renamed from: kotlin, reason: avoid collision after fix types in other method */
    public java.util.Timer kotlin2(boolean nocopy) {
        return (java.util.Timer) StructKt.sref$default(getTimer(), null, 1, null);
    }

    public final void setFireDate(Date date) {
        date.getClass();
        throw m51.d(null, 1, null);
    }

    public final void setTolerance(double d) {
        throw m51.d(null, 1, null);
    }

    public final void setUserInfo(Object obj) {
        this.userInfo = StructKt.sref$default(obj, null, 1, null);
    }

    public final void start() {
        Function1<? super Timer, Unit> function1;
        synchronized (this) {
            try {
                if (!this.invalidated && (function1 = this.block) != null) {
                    Task task = new Task(new wnh(19, function1, this));
                    setTimer(new java.util.Timer(true));
                    long Long = NumbersKt.Long(Double.valueOf(this.timeInterval * 1000.0d));
                    if (this.repeats) {
                        java.util.Timer timer = getTimer();
                        if (timer != null) {
                            timer.schedule(task, Long, Long);
                        }
                    } else {
                        java.util.Timer timer2 = getTimer();
                        if (timer2 != null) {
                            timer2.schedule(task, Long);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007J2\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\nH\u0007J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010¨\u0006\u0012"}, d2 = {"Lskip/foundation/Timer$Companion;", "", "<init>", "()V", "scheduledTimer", "Lskip/foundation/Timer;", "timeInterval", "", "invocation", "repeats", "", "target", "selector", "userInfo", "withTimeInterval", "block", "Lkotlin/Function1;", "", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @hm6
        public final Timer scheduledTimer(double timeInterval, Object target, Object selector, Object userInfo, boolean repeats) {
            target.getClass();
            selector.getClass();
            GlobalsKt.fatalError$default(null, 1, null);
            throw new RuntimeException();
        }

        private Companion() {
        }

        @hm6
        public final Timer scheduledTimer(double timeInterval, Object invocation, boolean repeats) {
            invocation.getClass();
            GlobalsKt.fatalError$default(null, 1, null);
            throw new RuntimeException();
        }

        public final Timer scheduledTimer(double withTimeInterval, boolean repeats, Function1<? super Timer, Unit> block) {
            block.getClass();
            Timer timer = new Timer(withTimeInterval, repeats, block);
            timer.start();
            return timer;
        }
    }

    @Override // skip.lib.KotlinConverting
    public /* bridge */ /* synthetic */ java.util.Timer kotlin(boolean z) {
        return kotlin2(z);
    }

    @hm6
    public static /* synthetic */ void getFireDate$annotations() {
    }

    @hm6
    public static /* synthetic */ void getTolerance$annotations() {
    }

    @hm6
    public Timer(double d, Object obj, boolean z) {
        obj.getClass();
        throw m51.d(null, 1, null);
    }

    @hm6
    public Timer(double d, Object obj, Object obj2, Object obj3, boolean z) {
        obj.getClass();
        obj2.getClass();
        throw m51.d(null, 1, null);
    }

    public Timer(double d, boolean z, Function1<? super Timer, Unit> function1) {
        function1.getClass();
        this.timeInterval = d;
        this.repeats = z;
        this.block = function1;
    }

    @hm6
    public Timer(Date date, double d, boolean z, Function1<? super Timer, Unit> function1) {
        date.getClass();
        function1.getClass();
        throw m51.d(null, 1, null);
    }

    public Timer(java.util.Timer timer) {
        timer.getClass();
        setTimer(timer);
    }
}
