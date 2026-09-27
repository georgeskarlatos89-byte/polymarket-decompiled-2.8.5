package skip.lib;

import defpackage.dmk;
import defpackage.ggn;
import defpackage.pog;
import defpackage.py2;
import defpackage.qsn;
import defpackage.t85;
import defpackage.u85;
import defpackage.xym;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.collections.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001)B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R,\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u00140\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u0006*"}, d2 = {"Lskip/lib/TaskGroup;", "ChildTaskResult", "Lskip/lib/AsyncSequence;", "", "throwErrors", "<init>", "(Z)V", "Lskip/lib/TaskPriority;", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "operation", "", "addTask", "(Lskip/lib/TaskPriority;Lkotlin/jvm/functions/Function1;)V", "addTaskUnlessCancelled", "(Lskip/lib/TaskPriority;Lkotlin/jvm/functions/Function1;)Z", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lskip/lib/Result;", "Lskip/lib/Error;", "nextResult", "waitForAll", "cancelAll", "()V", "Lskip/lib/TaskGroup$Iterator;", "makeAsyncIterator", "()Lskip/lib/TaskGroup$Iterator;", "Z", "Lt85;", "coroutineScope", "Lt85;", "", "Lskip/lib/Task;", "tasks", "Ljava/util/List;", "_isCancelled", "isEmpty", "()Z", "isCancelled", "Iterator", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class TaskGroup<ChildTaskResult> implements AsyncSequence<ChildTaskResult> {
    private boolean _isCancelled;
    private final t85 coroutineScope;
    private final List<Task<Result<ChildTaskResult, Error>>> tasks;
    private final boolean throwErrors;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\u0096@¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lskip/lib/TaskGroup$Iterator;", "ChildTaskResult", "Lskip/lib/AsyncIteratorProtocol;", "taskGroup", "Lskip/lib/TaskGroup;", "<init>", "(Lskip/lib/TaskGroup;)V", "next", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Iterator<ChildTaskResult> implements AsyncIteratorProtocol<ChildTaskResult> {
        private final TaskGroup<ChildTaskResult> taskGroup;

        public Iterator(TaskGroup<ChildTaskResult> taskGroup) {
            taskGroup.getClass();
            this.taskGroup = taskGroup;
        }

        public final void cancel() {
            this.taskGroup.cancelAll();
        }

        @Override // skip.lib.AsyncIteratorProtocol
        public Object next(Continuation<? super ChildTaskResult> continuation) {
            return this.taskGroup.next(continuation);
        }
    }

    public TaskGroup(boolean z) {
        this.throwErrors = z;
        this.coroutineScope = qsn.a(xym.a());
        this.tasks = new ArrayList();
    }

    public static final /* synthetic */ List access$getTasks$p(TaskGroup taskGroup) {
        return taskGroup.tasks;
    }

    public static /* synthetic */ void addTask$default(TaskGroup taskGroup, TaskPriority taskPriority, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                taskPriority = null;
            }
            taskGroup.addTask(taskPriority, function1);
            return;
        }
        py2.f("Super calls with default arguments not supported in this target, function: addTask");
    }

    public static /* synthetic */ boolean addTaskUnlessCancelled$default(TaskGroup taskGroup, TaskPriority taskPriority, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                taskPriority = null;
            }
            return taskGroup.addTaskUnlessCancelled(taskPriority, function1);
        }
        py2.f("Super calls with default arguments not supported in this target, function: addTaskUnlessCancelled");
        return false;
    }

    public final void addTask(TaskPriority priority, Function1<? super Continuation<? super ChildTaskResult>, ? extends Object> operation) {
        operation.getClass();
        Task<Result<ChildTaskResult, Error>> task = new Task<>(false, this.coroutineScope, priority, (Function1<? super Continuation<? super Result<ChildTaskResult, Error>>, ? extends Object>) new TaskGroup$addTask$task$1(operation, null));
        if (get_isCancelled()) {
            task.cancel();
        }
        this.tasks.add(task);
    }

    public final boolean addTaskUnlessCancelled(TaskPriority priority, Function1<? super Continuation<? super ChildTaskResult>, ? extends Object> operation) {
        operation.getClass();
        if (get_isCancelled()) {
            return false;
        }
        addTask(priority, operation);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object allSatisfy(Function2<? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Boolean> continuation) {
        return super.allSatisfy(function2, continuation);
    }

    public final void cancelAll() {
        this._isCancelled = true;
        java.util.Iterator<T> it = this.tasks.iterator();
        while (it.hasNext()) {
            ((Task) it.next()).cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public <RE> AsyncSequence<RE> compactMap(Function2<? super ChildTaskResult, ? super Continuation<? super RE>, ? extends Object> function2) {
        return super.compactMap(function2);
    }

    @Override // skip.lib.AsyncSequence
    public Object contains(ChildTaskResult childtaskresult, Continuation<? super Boolean> continuation) {
        return super.contains((TaskGroup<ChildTaskResult>) childtaskresult, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public AsyncSequence<ChildTaskResult> drop(Function2<? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return super.drop(function2);
    }

    @Override // skip.lib.AsyncSequence
    public AsyncSequence<ChildTaskResult> dropFirst(int i) {
        return super.dropFirst(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public AsyncSequence<ChildTaskResult> filter(Function2<? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return super.filter(function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object first(Function2<? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super ChildTaskResult> continuation) {
        return super.first(function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public <RE> AsyncSequence<RE> flatMap(Function2<? super ChildTaskResult, ? super Continuation<? super AsyncSequence<RE>>, ? extends Object> function2) {
        return super.flatMap(function2);
    }

    /* renamed from: isCancelled, reason: from getter */
    public final boolean get_isCancelled() {
        return this._isCancelled;
    }

    public final boolean isEmpty() {
        return this.tasks.isEmpty();
    }

    @Override // skip.lib.AsyncSequence
    public AsyncSequenceIterator<ChildTaskResult> iterator() {
        return super.iterator();
    }

    @Override // skip.lib.AsyncSequence
    public Iterator<ChildTaskResult> makeAsyncIterator() {
        return new Iterator<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public <RE> AsyncSequence<RE> map(Function2<? super ChildTaskResult, ? super Continuation<? super RE>, ? extends Object> function2) {
        return super.map(function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object max(Continuation<? super ChildTaskResult> continuation) {
        return super.max(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object min(Continuation<? super ChildTaskResult> continuation) {
        return super.min(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object next(Continuation<? super ChildTaskResult> continuation) {
        TaskGroup$next$1 taskGroup$next$1;
        int i;
        Result result;
        if (continuation instanceof TaskGroup$next$1) {
            taskGroup$next$1 = (TaskGroup$next$1) continuation;
            int i2 = taskGroup$next$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taskGroup$next$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taskGroup$next$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = taskGroup$next$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    kotlin.ResultKt.a(obj);
                    taskGroup$next$1.label = 1;
                    obj = nextResult(taskGroup$next$1);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                result = (Result) obj;
                if (result != null) {
                    return null;
                }
                try {
                    return result.get();
                } catch (Exception e) {
                    if (!this.throwErrors) {
                        return null;
                    }
                    throw e;
                }
            }
        }
        taskGroup$next$1 = new TaskGroup$next$1(this, continuation);
        Object obj2 = taskGroup$next$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = taskGroup$next$1.label;
        if (i == 0) {
        }
        result = (Result) obj2;
        if (result != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(3:10|11|12)(2:14|15))(3:16|(5:20|(2:23|21)|24|25|(1:27)(1:28))|29)))|31|6|7|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nextResult(Continuation<? super Result<? extends ChildTaskResult, ? extends Error>> continuation) {
        TaskGroup$nextResult$1 taskGroup$nextResult$1;
        int i;
        if (continuation instanceof TaskGroup$nextResult$1) {
            taskGroup$nextResult$1 = (TaskGroup$nextResult$1) continuation;
            int i2 = taskGroup$nextResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taskGroup$nextResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taskGroup$nextResult$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = taskGroup$nextResult$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.a(obj);
                        return obj;
                    }
                    dmk.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.ResultKt.a(obj);
                if (!get_isCancelled() && !this.tasks.isEmpty()) {
                    pog pogVar = new pog(taskGroup$nextResult$1.getContext());
                    java.util.Iterator it = kotlin.collections.CollectionsKt.T0(access$getTasks$p(this)).iterator();
                    while (((c) it).a.hasNext()) {
                        IndexedValue indexedValue = (IndexedValue) ((c) it).next();
                        pogVar.j(((Task) indexedValue.b).getDeferred().a0(), new TaskGroup$nextResult$2$1$1(this, indexedValue.a, null));
                    }
                    taskGroup$nextResult$1.L$0 = null;
                    taskGroup$nextResult$1.I$0 = 0;
                    taskGroup$nextResult$1.I$1 = 0;
                    taskGroup$nextResult$1.label = 1;
                    Object g = pog.g(pogVar, taskGroup$nextResult$1);
                    if (g == u85Var) {
                        return u85Var;
                    }
                    return g;
                }
                return null;
            }
        }
        taskGroup$nextResult$1 = new TaskGroup$nextResult$1(this, continuation);
        Object obj2 = taskGroup$nextResult$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = taskGroup$nextResult$1.label;
        if (i == 0) {
        }
    }

    @Override // skip.lib.AsyncSequence
    public AsyncSequence<ChildTaskResult> prefix(int i) {
        return super.prefix(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public <R> Object reduce(R r, Function3<? super R, ? super ChildTaskResult, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super R> continuation) {
        return super.reduce(r, function3, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:37|38))(8:39|40|(2:43|41)|44|45|(2:47|(1:49))|35|36)|12|(4:14|(6:17|18|19|21|22|15)|30|(1:32))|35|36))|51|6|7|(0)(0)|12|(0)|35|36) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071 A[Catch: CancellationException -> 0x008e, TryCatch #0 {CancellationException -> 0x008e, blocks: (B:11:0x0028, B:12:0x006b, B:14:0x0071, B:15:0x0075, B:17:0x007b, B:32:0x008d, B:40:0x0035, B:41:0x0046, B:43:0x004c, B:45:0x005a, B:47:0x0060), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitForAll(Continuation<? super Unit> continuation) {
        TaskGroup$waitForAll$1 taskGroup$waitForAll$1;
        int i;
        if (continuation instanceof TaskGroup$waitForAll$1) {
            taskGroup$waitForAll$1 = (TaskGroup$waitForAll$1) continuation;
            int i2 = taskGroup$waitForAll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taskGroup$waitForAll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taskGroup$waitForAll$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = taskGroup$waitForAll$1.label;
                Exception exc = null;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    kotlin.ResultKt.a(obj);
                    List<Task<Result<ChildTaskResult, Error>>> list = this.tasks;
                    ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.w(list));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Task) it.next()).getDeferred());
                    }
                    if (!arrayList.isEmpty()) {
                        taskGroup$waitForAll$1.L$0 = null;
                        taskGroup$waitForAll$1.label = 1;
                        obj = ggn.a(arrayList, taskGroup$waitForAll$1);
                        if (obj == u85Var) {
                            return u85Var;
                        }
                    }
                    return Unit.INSTANCE;
                }
                List list2 = (List) obj;
                if (this.throwErrors) {
                    java.util.Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((Result) it2.next()).get();
                        } catch (CancellationError unused) {
                        } catch (Exception e) {
                            if (exc == null) {
                                exc = e;
                            }
                        }
                    }
                    if (exc != null) {
                        throw exc;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        taskGroup$waitForAll$1 = new TaskGroup$waitForAll$1(this, continuation);
        Object obj2 = taskGroup$waitForAll$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = taskGroup$waitForAll$1.label;
        Exception exc2 = null;
        if (i == 0) {
        }
        List list22 = (List) obj2;
        if (this.throwErrors) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object contains(Function2<? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super Boolean> continuation) {
        return super.contains((Function2) function2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object max(Function3<? super ChildTaskResult, ? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super ChildTaskResult> continuation) {
        return super.max(function3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public Object min(Function3<? super ChildTaskResult, ? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super ChildTaskResult> continuation) {
        return super.min(function3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public AsyncSequence<ChildTaskResult> prefix(Function2<? super ChildTaskResult, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return super.prefix(function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // skip.lib.AsyncSequence
    public <R> Object reduce(Void r1, R r, Function3<? super InOut<R>, ? super ChildTaskResult, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super R> continuation) {
        return super.reduce(r1, r, function3, continuation);
    }

    @Override // skip.lib.AsyncSequence
    public /* bridge */ /* synthetic */ AsyncIteratorProtocol makeAsyncIterator() {
        return makeAsyncIterator();
    }

    public TaskGroup() {
        this(false, 1, null);
    }

    public /* synthetic */ TaskGroup(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
