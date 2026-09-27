package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ swh c;
    public final /* synthetic */ swh d;

    public /* synthetic */ wm6(Function2 function2, swh swhVar, swh swhVar2, int i) {
        this.a = i;
        this.b = function2;
        this.c = swhVar;
        this.d = swhVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        swh swhVar = this.d;
        swh swhVar2 = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                return function2.invoke(swhVar2.getValue(), swhVar.getValue());
            default:
                return function2.invoke(swhVar2.getValue(), swhVar.getValue());
        }
    }
}
