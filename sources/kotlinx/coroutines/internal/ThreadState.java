package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ThreadState {
    public final CoroutineContext a;
    public final Object[] b;
    public final ThreadContextElement[] c;
    public int d;

    public ThreadState(int i, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = new Object[i];
        this.c = new ThreadContextElement[i];
    }
}
