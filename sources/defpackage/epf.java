package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class epf implements swh, Flow, oq8 {
    public final /* synthetic */ swh a;
    private final jca job;

    public epf(sqc sqcVar, jca jcaVar) {
        this.a = sqcVar;
        this.job = jcaVar;
    }

    @Override // defpackage.oq8
    public final Flow a(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        if (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) {
            return ozm.c(this, coroutineContext, i, bufferOverflow);
        }
        return this;
    }

    @Override // defpackage.g3h
    public final List c() {
        return this.a.c();
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        return this.a.collect(eb8Var, continuation);
    }

    @Override // defpackage.swh
    public final Object getValue() {
        return this.a.getValue();
    }
}
