package skip.foundation;

import defpackage.hm6;
import defpackage.ked;
import defpackage.led;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.InOut;
import skip.lib.MutableStruct;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 2*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u00012B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0017J+\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0001\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u0018\u001a\u0002H\u0019\"\u0004\b\u0001\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001e¢\u0006\u0002\u0010\u001fJ+\u0010 \u001a\u0002H\u0019\"\u0004\b\u0001\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\u0010\u001dJ\u001f\u0010 \u001a\u0002H\u0019\"\u0004\b\u0001\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001e¢\u0006\u0002\u0010\u001fJ-\u0010!\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0001\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\u0010\u001dJ!\u0010!\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0001\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001e¢\u0006\u0002\u0010\u001fJ-\u0010\"\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0001\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u0002H\u00190\u001b¢\u0006\u0002\u0010\u001dJ!\u0010\"\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0001\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001e¢\u0006\u0002\u0010\u001fJ\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0007J\b\u00101\u001a\u00020\u0002H\u0016R(\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008B@BX\u0082\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lskip/foundation/OSAllocatedUnfairLock;", "State", "Lskip/lib/MutableStruct;", "initialState", "unusedp_0", "", "<init>", "(Ljava/lang/Object;Ljava/lang/Void;)V", "uncheckedState", "(Ljava/lang/Object;)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "state", "getState", "()Ljava/lang/Object;", "setState", "Ljava/lang/Object;", "lock", "Ljava/util/concurrent/locks/Lock;", "", "unlock", "lockIfAvailable", "", "withLockUnchecked", "R", "body", "Lkotlin/Function1;", "Lskip/lib/InOut;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withLock", "withLockIfAvailableUnchecked", "withLockIfAvailable", "precondition", "condition", "", "supdate", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OSAllocatedUnfairLock<State> implements MutableStruct {
    private final Lock lock;
    private int smutatingcount;
    private State state;
    private Function1<Object, Unit> supdate;

    /* JADX WARN: Multi-variable type inference failed */
    private OSAllocatedUnfairLock(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        OSAllocatedUnfairLock oSAllocatedUnfairLock = (OSAllocatedUnfairLock) mutableStruct;
        setState(oSAllocatedUnfairLock.getState());
        this.lock = oSAllocatedUnfairLock.lock;
    }

    private static final Unit _get_state_$lambda$0(OSAllocatedUnfairLock oSAllocatedUnfairLock, Object obj) {
        oSAllocatedUnfairLock.setState(obj);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(OSAllocatedUnfairLock oSAllocatedUnfairLock, Object obj) {
        return _get_state_$lambda$0(oSAllocatedUnfairLock, obj);
    }

    public static /* synthetic */ Unit b(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return withLockIfAvailable$lambda$8(oSAllocatedUnfairLock);
    }

    public static /* synthetic */ Unit c(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return withLock$lambda$4(oSAllocatedUnfairLock);
    }

    public static /* synthetic */ Object d(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return withLock$lambda$2(oSAllocatedUnfairLock);
    }

    public static /* synthetic */ Unit e(OSAllocatedUnfairLock oSAllocatedUnfairLock, Object obj) {
        return withLock$lambda$3(oSAllocatedUnfairLock, obj);
    }

    public static /* synthetic */ Object f(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return withLockIfAvailable$lambda$6(oSAllocatedUnfairLock);
    }

    public static /* synthetic */ Unit g(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return withLock$lambda$1(oSAllocatedUnfairLock);
    }

    private final State getState() {
        return (State) StructKt.sref(this.state, new ked(this, 0));
    }

    public static /* synthetic */ Unit h(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return withLockIfAvailable$lambda$5(oSAllocatedUnfairLock);
    }

    public static /* synthetic */ Unit i(OSAllocatedUnfairLock oSAllocatedUnfairLock, Object obj) {
        return withLockIfAvailable$lambda$7(oSAllocatedUnfairLock, obj);
    }

    private final void setState(State state) {
        State state2 = (State) StructKt.sref$default(state, null, 1, null);
        willmutate();
        this.state = state2;
        didmutate();
    }

    private static final Unit withLock$lambda$1(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        oSAllocatedUnfairLock.lock.unlock();
        return Unit.INSTANCE;
    }

    private static final Object withLock$lambda$2(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return oSAllocatedUnfairLock.getState();
    }

    private static final Unit withLock$lambda$3(OSAllocatedUnfairLock oSAllocatedUnfairLock, Object obj) {
        oSAllocatedUnfairLock.setState(obj);
        return Unit.INSTANCE;
    }

    private static final Unit withLock$lambda$4(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        oSAllocatedUnfairLock.lock.unlock();
        return Unit.INSTANCE;
    }

    private static final Unit withLockIfAvailable$lambda$5(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        oSAllocatedUnfairLock.lock.unlock();
        return Unit.INSTANCE;
    }

    private static final Object withLockIfAvailable$lambda$6(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        return oSAllocatedUnfairLock.getState();
    }

    private static final Unit withLockIfAvailable$lambda$7(OSAllocatedUnfairLock oSAllocatedUnfairLock, Object obj) {
        oSAllocatedUnfairLock.setState(obj);
        return Unit.INSTANCE;
    }

    private static final Unit withLockIfAvailable$lambda$8(OSAllocatedUnfairLock oSAllocatedUnfairLock) {
        oSAllocatedUnfairLock.lock.unlock();
        return Unit.INSTANCE;
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final void lock() {
        this.lock.lock();
    }

    public final boolean lockIfAvailable() {
        return this.lock.tryLock();
    }

    @hm6
    public final void precondition(Object condition) {
        condition.getClass();
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new OSAllocatedUnfairLock((MutableStruct) this);
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void unlock() {
        this.lock.unlock();
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public final <R> R withLock(Function1<? super InOut<State>, ? extends R> body) {
        body.getClass();
        led ledVar = null;
        try {
            this.lock.lock();
            led ledVar2 = new led(this, 2);
            try {
                R invoke = body.invoke(new InOut(new led(this, 3), new ked(this, 2)));
                ledVar2.invoke();
                return invoke;
            } catch (Throwable th) {
                th = th;
                ledVar = ledVar2;
                if (ledVar != null) {
                    ledVar.invoke();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final <R> R withLockIfAvailable(Function1<? super InOut<State>, ? extends R> body) {
        body.getClass();
        led ledVar = null;
        try {
            if (!this.lock.tryLock()) {
                return null;
            }
            led ledVar2 = new led(this, 0);
            try {
                R invoke = body.invoke(new InOut(new led(this, 1), new ked(this, 1)));
                ledVar2.invoke();
                return invoke;
            } catch (Throwable th) {
                th = th;
                ledVar = ledVar2;
                if (ledVar != null) {
                    ledVar.invoke();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final <R> R withLockIfAvailableUnchecked(Function1<? super InOut<State>, ? extends R> body) {
        body.getClass();
        return (R) withLockIfAvailable(body);
    }

    public final <R> R withLockUnchecked(Function1<? super InOut<State>, ? extends R> body) {
        body.getClass();
        return (R) withLock(body);
    }

    public final <R> R withLockIfAvailableUnchecked(Function0<? extends R> body) {
        body.getClass();
        return (R) withLockIfAvailable(body);
    }

    public final <R> R withLockUnchecked(Function0<? extends R> body) {
        body.getClass();
        return (R) withLock(body);
    }

    public /* synthetic */ OSAllocatedUnfairLock(Object obj, Void r2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : r2);
    }

    public OSAllocatedUnfairLock(State state) {
        this.lock = new ReentrantLock();
        setState(state);
    }

    public OSAllocatedUnfairLock(State state, Void r2) {
        this.lock = new ReentrantLock();
        setState(state);
    }

    public final <R> R withLock(Function0<? extends R> body) {
        body.getClass();
        led ledVar = null;
        try {
            this.lock.lock();
            led ledVar2 = new led(this, 5);
            try {
                R invoke = body.invoke();
                ledVar2.invoke();
                return invoke;
            } catch (Throwable th) {
                th = th;
                ledVar = ledVar2;
                if (ledVar != null) {
                    ledVar.invoke();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final <R> R withLockIfAvailable(Function0<? extends R> body) {
        body.getClass();
        led ledVar = null;
        try {
            if (!this.lock.tryLock()) {
                return null;
            }
            led ledVar2 = new led(this, 4);
            try {
                R invoke = body.invoke();
                ledVar2.invoke();
                return invoke;
            } catch (Throwable th) {
                th = th;
                ledVar = ledVar2;
                if (ledVar != null) {
                    ledVar.invoke();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
