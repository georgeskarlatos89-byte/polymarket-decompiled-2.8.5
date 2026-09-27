package kotlinx.coroutines.debug.internal;

import defpackage.nw5;
import defpackage.ts4;
import defpackage.v85;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"kotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner", "T", "Lkotlin/coroutines/Continuation;", "Lv85;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugProbesImpl$CoroutineOwner<T> implements Continuation<T>, v85 {
    @Override // defpackage.v85
    public final v85 getCallerFrame() {
        throw null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        throw null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        ts4 ts4Var = nw5.a;
        nw5.a.remove(this);
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
