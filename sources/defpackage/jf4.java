package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class jf4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ qqc c;
    public final /* synthetic */ qqc d;

    public /* synthetic */ jf4(qqc qqcVar, qqc qqcVar2, Function0 function0) {
        this.a = 2;
        this.c = qqcVar;
        this.d = qqcVar2;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function0 function0 = this.b;
        qqc qqcVar = this.d;
        qqc qqcVar2 = this.c;
        switch (i) {
            case 0:
                qqcVar2.setValue(null);
                if (((Boolean) qqcVar.getValue()).booleanValue()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                qqcVar2.setValue(null);
                if (((Boolean) qqcVar.getValue()).booleanValue()) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                return new csd((Function4) qqcVar2.getValue(), (Function1) qqcVar.getValue(), ((Number) function0.invoke()).intValue());
        }
    }

    public /* synthetic */ jf4(Function0 function0, qqc qqcVar, qqc qqcVar2, int i) {
        this.a = i;
        this.b = function0;
        this.c = qqcVar;
        this.d = qqcVar2;
    }
}
