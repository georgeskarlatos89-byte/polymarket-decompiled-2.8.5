package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ swh c;

    public /* synthetic */ um6(int i, swh swhVar, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = swhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        swh swhVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return function1.invoke(swhVar.getValue());
            case 1:
                return function1.invoke(swhVar.getValue());
            default:
                return ((swh) function1.invoke(swhVar.getValue())).getValue();
        }
    }
}
