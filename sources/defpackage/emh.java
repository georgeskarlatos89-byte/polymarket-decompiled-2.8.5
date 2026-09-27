package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class emh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ emh(float f, int i) {
        this.a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        float f = this.b;
        d7g d7gVar = (d7g) obj;
        d7gVar.getClass();
        switch (i) {
            case 0:
                d7gVar.b(f);
                return Unit.INSTANCE;
            case 1:
                d7gVar.b(f);
                return Unit.INSTANCE;
            case 2:
                d7gVar.b(f);
                return Unit.INSTANCE;
            default:
                d7gVar.m(f);
                return Unit.INSTANCE;
        }
    }
}
