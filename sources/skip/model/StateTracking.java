package skip.model;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.ErrorKt;
import skip.lib.StructKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lskip/model/StateTracking;", "", "<init>", "()V", "Companion", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StateTracking {
    private static int bodyDepth;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<StateTracker> trackers = new ArrayList();
    private static final ThreadLocal<List<StateMutationTransaction>> transactionStack = new ThreadLocal<>();
    private static final ThreadLocal<StateMutationTransaction> readCursor = new ThreadLocal<>();

    public static final /* synthetic */ int access$getBodyDepth$cp() {
        return bodyDepth;
    }

    public static final /* synthetic */ ThreadLocal access$getReadCursor$cp() {
        return readCursor;
    }

    public static final /* synthetic */ List access$getTrackers$cp() {
        return trackers;
    }

    public static final /* synthetic */ ThreadLocal access$getTransactionStack$cp() {
        return transactionStack;
    }

    public static final /* synthetic */ void access$setBodyDepth$cp(int i) {
        bodyDepth = i;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0013J\u0010\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bJ \u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001fJ\u0006\u0010 \u001a\u00020\u000eJ\b\u0010!\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\"\u001a\u00020\u000eJ\b\u0010#\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010$\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lskip/model/StateTracking$Companion;", "", "<init>", "()V", "bodyDepth", "", "trackers", "", "Lskip/model/StateTracker;", "transactionStack", "Ljava/lang/ThreadLocal;", "Lskip/model/StateMutationTransaction;", "readCursor", "register", "", "tracker", "pushBody", "popBody", "pushTransaction", "Lskip/model/StateMutationTransactionToken;", "transaction", "popTransaction", "token", "currentTransaction", "getCurrentTransaction", "()Lskip/model/StateMutationTransaction;", "recordRead", "captureRead", "Lskip/model/CapturedRead;", "T", "body", "Lkotlin/Function0;", "clearReadCursor", "captureLastReadAndClear", "resetForTesting", "activateTrackers", "isMainThread", "", "()Z", "SkipModel"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void activateTrackers() {
            if (!StateTracking.access$getTrackers$cp().isEmpty()) {
                StateTracker[] stateTrackerArr = (StateTracker[]) StateTracking.access$getTrackers$cp().toArray(new StateTracker[0]);
                StateTracking.access$getTrackers$cp().clear();
                for (StateTracker stateTracker : (StateTracker[]) StructKt.sref$default(stateTrackerArr, null, 1, null)) {
                    stateTracker.trackState();
                }
            }
        }

        private final boolean isMainThread() {
            Boolean bool;
            try {
                bool = Boolean.valueOf(Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper()));
            } catch (Throwable unused) {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final StateMutationTransaction captureLastReadAndClear() {
            StateMutationTransaction stateMutationTransaction = (StateMutationTransaction) StateTracking.access$getReadCursor$cp().get();
            if (stateMutationTransaction != null) {
                StateTracking.access$getReadCursor$cp().set(null);
            }
            return stateMutationTransaction;
        }

        public final <T> CapturedRead<T> captureRead(Function0<? extends T> body) {
            body.getClass();
            StateMutationTransaction stateMutationTransaction = (StateMutationTransaction) StateTracking.access$getReadCursor$cp().get();
            StateTracking.access$getReadCursor$cp().set(null);
            try {
                T invoke = body.invoke();
                StateMutationTransaction stateMutationTransaction2 = (StateMutationTransaction) StateTracking.access$getReadCursor$cp().get();
                StateTracking.access$getReadCursor$cp().set(stateMutationTransaction);
                return new CapturedRead<>(invoke, stateMutationTransaction2);
            } catch (Throwable th) {
                Object aserror = ErrorKt.aserror(th);
                StateTracking.access$getReadCursor$cp().set(stateMutationTransaction);
                aserror.getClass();
                throw ((Throwable) aserror);
            }
        }

        public final void clearReadCursor() {
            StateTracking.access$getReadCursor$cp().set(null);
        }

        public final StateMutationTransaction getCurrentTransaction() {
            List list = (List) StateTracking.access$getTransactionStack$cp().get();
            if (list != null && !list.isEmpty()) {
                return (StateMutationTransaction) list.get(list.size() - 1);
            }
            return null;
        }

        public final void popBody() {
            if (isMainThread() && StateTracking.access$getBodyDepth$cp() > 0) {
                StateTracking.access$setBodyDepth$cp(StateTracking.access$getBodyDepth$cp() - 1);
                activateTrackers();
                if (StateTracking.access$getBodyDepth$cp() == 0) {
                    StateTracking.access$getReadCursor$cp().set(null);
                }
            }
        }

        public final void popTransaction(StateMutationTransactionToken token) {
            token.getClass();
            List list = (List) StateTracking.access$getTransactionStack$cp().get();
            if (list != null) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
                if (list.isEmpty()) {
                    StateTracking.access$getTransactionStack$cp().set(null);
                }
            }
        }

        public final void pushBody() {
            if (isMainThread()) {
                if (StateTracking.access$getBodyDepth$cp() == 0) {
                    StateTracking.access$getReadCursor$cp().set(null);
                }
                StateTracking.access$setBodyDepth$cp(StateTracking.access$getBodyDepth$cp() + 1);
                activateTrackers();
            }
        }

        public final StateMutationTransactionToken pushTransaction(StateMutationTransaction transaction) {
            transaction.getClass();
            StateMutationTransactionToken stateMutationTransactionToken = new StateMutationTransactionToken(getCurrentTransaction());
            List list = (List) StateTracking.access$getTransactionStack$cp().get();
            if (list == null) {
                list = new ArrayList();
                StateTracking.access$getTransactionStack$cp().set(list);
            }
            list.add(transaction);
            return stateMutationTransactionToken;
        }

        public final void recordRead(StateMutationTransaction transaction) {
            if (transaction != null && StateTracking.access$getReadCursor$cp().get() == null) {
                StateTracking.access$getReadCursor$cp().set(transaction);
            }
        }

        public final void register(StateTracker tracker) {
            tracker.getClass();
            if (isMainThread() && StateTracking.access$getBodyDepth$cp() > 0) {
                StateTracking.access$getTrackers$cp().add(tracker);
            } else {
                tracker.trackState();
            }
        }

        public final void resetForTesting() {
            StateTracking.access$getTransactionStack$cp().set(null);
            StateTracking.access$getReadCursor$cp().set(null);
        }

        private Companion() {
        }
    }
}
