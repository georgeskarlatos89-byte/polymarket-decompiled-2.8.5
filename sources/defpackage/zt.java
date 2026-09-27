package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zt implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow b;

    public /* synthetic */ zt(Flow flow, int i) {
        this.a = i;
        this.b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        int i = this.a;
        Flow flow = this.b;
        switch (i) {
            case 0:
                Object collect = flow.collect(new rg(eb8Var, 1), continuation);
                if (collect != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect;
            case 1:
                Object collect2 = flow.collect(new rg(eb8Var, 2), continuation);
                if (collect2 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect2;
            case 2:
                Object collect3 = flow.collect(new rg(eb8Var, 3), continuation);
                if (collect3 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect3;
            case 3:
                Object collect4 = flow.collect(new rg(eb8Var, 5), continuation);
                if (collect4 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect4;
            case 4:
                Object collect5 = flow.collect(new rg(eb8Var, 6), continuation);
                if (collect5 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect5;
            case 5:
                Object collect6 = flow.collect(new ud8(eb8Var), continuation);
                if (collect6 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect6;
            case 6:
                Object collect7 = flow.collect(new rg(eb8Var, 23), continuation);
                if (collect7 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect7;
            case 7:
                Object collect8 = flow.collect(new rg(eb8Var, 24), continuation);
                if (collect8 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect8;
            case 8:
                Object collect9 = flow.collect(new x3e(eb8Var, 0), continuation);
                if (collect9 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect9;
            case 9:
                Object collect10 = flow.collect(new x3e(eb8Var, 3), continuation);
                if (collect10 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect10;
            default:
                Object collect11 = flow.collect(new x3e(eb8Var, 4), continuation);
                if (collect11 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect11;
        }
    }
}
