package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class gz1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ voc b;

    public /* synthetic */ gz1(voc vocVar, int i) {
        this.a = i;
        this.b = vocVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        voc vocVar = this.b;
        switch (i) {
            case 0:
                ((gvd) vocVar).z((int) (((n1a) obj).a >> 32));
                return Unit.INSTANCE;
            case 1:
                nwa nwaVar = (nwa) obj;
                nwaVar.getClass();
                ((gvd) vocVar).z((((int) (nwaVar.h() & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (i3n.d(nwaVar) & 4294967295L)));
                return Unit.INSTANCE;
            case 2:
                ((gvd) vocVar).z(((Float) obj).floatValue());
                return Unit.INSTANCE;
            default:
                ((gvd) vocVar).z((int) (((n1a) obj).a >> 32));
                return Unit.INSTANCE;
        }
    }
}
