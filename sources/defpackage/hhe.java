package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hhe implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ xdh c;

    public /* synthetic */ hhe(xdh xdhVar, Function0 function0) {
        this.c = xdhVar;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        xdh xdhVar = this.c;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                if (xdhVar != null) {
                    ((hk6) xdhVar).a();
                }
                function0.invoke();
                return Unit.INSTANCE;
            default:
                function0.invoke();
                if (xdhVar != null) {
                    ((hk6) xdhVar).a();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ hhe(Function0 function0, xdh xdhVar) {
        this.b = function0;
        this.c = xdhVar;
    }
}
