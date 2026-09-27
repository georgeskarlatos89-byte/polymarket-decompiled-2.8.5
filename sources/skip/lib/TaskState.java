package skip.lib;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lskip/lib/TaskState;", "", "<init>", "()V", "priority", "Lskip/lib/TaskPriority;", "getPriority", "()Lskip/lib/TaskPriority;", "setPriority", "(Lskip/lib/TaskPriority;)V", "isCancelled", "", "()Z", "setCancelled", "(Z)V", "onCancellation", "", "Lkotlin/Function0;", "", "getOnCancellation", "()Ljava/util/List;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TaskState {
    private boolean isCancelled;
    private final List<Function0<Unit>> onCancellation = new ArrayList();
    private TaskPriority priority;

    public final List<Function0<Unit>> getOnCancellation() {
        return this.onCancellation;
    }

    public final TaskPriority getPriority() {
        return this.priority;
    }

    /* renamed from: isCancelled, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    public final void setCancelled(boolean z) {
        this.isCancelled = z;
    }

    public final void setPriority(TaskPriority taskPriority) {
        this.priority = taskPriority;
    }
}
