package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function3 b;
    public final /* synthetic */ swh c;
    public final /* synthetic */ swh d;
    public final /* synthetic */ swh e;

    public /* synthetic */ vm6(Function3 function3, swh swhVar, swh swhVar2, swh swhVar3, int i) {
        this.a = i;
        this.b = function3;
        this.c = swhVar;
        this.d = swhVar2;
        this.e = swhVar3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        swh swhVar = this.e;
        swh swhVar2 = this.d;
        swh swhVar3 = this.c;
        Function3 function3 = this.b;
        switch (i) {
            case 0:
                return function3.invoke(swhVar3.getValue(), swhVar2.getValue(), swhVar.getValue());
            default:
                return function3.invoke(swhVar3.getValue(), swhVar2.getValue(), swhVar.getValue());
        }
    }
}
