package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p32 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ p32(Function0 function0, int i) {
        this.a = i;
        this.b = function0;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                if (((Number) obj).intValue() > 0) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.INSTANCE;
            case 2:
                function0.invoke();
                return Unit.INSTANCE;
            case 3:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return Unit.INSTANCE;
            case 4:
                Pair pair = (Pair) obj;
                int intValue = ((Number) pair.first).intValue();
                int intValue2 = ((Number) pair.second).intValue();
                if (intValue2 > 0 && intValue >= intValue2 - 3) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                if (((Number) obj).intValue() > 0) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
        }
    }
}
