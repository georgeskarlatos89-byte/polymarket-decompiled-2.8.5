package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zm6 implements Flow {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ zm6(int i, swh swhVar, Function1 function1) {
        this.a = i;
        this.b = swhVar;
        this.c = function1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(eb8 eb8Var, Continuation continuation) {
        int i = this.a;
        Function1 function1 = this.c;
        Flow flow = this.b;
        switch (i) {
            case 0:
                Object collect = flow.collect(new ym6(eb8Var, function1, 0), continuation);
                if (collect != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect;
            default:
                Object collect2 = flow.collect(new ym6(eb8Var, function1, 1), continuation);
                if (collect2 != u85.COROUTINE_SUSPENDED) {
                    return Unit.INSTANCE;
                }
                return collect2;
        }
    }
}
