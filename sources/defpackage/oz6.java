package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class oz6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ otf b;

    public /* synthetic */ oz6(otf otfVar, int i) {
        this.a = i;
        this.b = otfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        otf otfVar = this.b;
        nse nseVar = (nse) obj;
        float floatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                nseVar.a();
                otfVar.a = floatValue;
                return Unit.INSTANCE;
            case 1:
                nseVar.a();
                otfVar.a = floatValue;
                return Unit.INSTANCE;
            default:
                nseVar.getClass();
                otfVar.a += floatValue;
                return Unit.INSTANCE;
        }
    }
}
