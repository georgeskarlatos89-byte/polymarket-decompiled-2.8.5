package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class eb3 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ eb3(float f, Function0 function0) {
        this.b = f;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        float f = this.b;
        d7g d7gVar = (d7g) obj;
        d7gVar.getClass();
        switch (i) {
            case 0:
                float d = lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f);
                d7gVar.b(1.0f);
                d7gVar.G((-(d7gVar.s.getDensity() * f)) * d);
                return Unit.INSTANCE;
            default:
                d7gVar.b(((Number) function0.invoke()).floatValue() * f);
                d7gVar.h(1);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ eb3(Function0 function0, float f) {
        this.c = function0;
        this.b = f;
    }
}
