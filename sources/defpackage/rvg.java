package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class rvg implements eb8 {
    public final bvg a;

    public rvg(j7f j7fVar) {
        this.a = j7fVar;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        Object n = this.a.n(obj, continuation);
        if (n == u85.COROUTINE_SUSPENDED) {
            return n;
        }
        return Unit.INSTANCE;
    }
}
