package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class n32 implements eb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ n32(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.eb8
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new Float(((Number) obj).floatValue()));
                return Unit.INSTANCE;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                function1.invoke(bool);
                return Unit.INSTANCE;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                if (function1 != null) {
                    function1.invoke(bool2);
                }
                return Unit.INSTANCE;
            case 3:
                function1.invoke((mk8) obj);
                return Unit.INSTANCE;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                function1.invoke(bool3);
                return Unit.INSTANCE;
        }
    }
}
