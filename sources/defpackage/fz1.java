package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fz1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ voc c;

    public /* synthetic */ fz1(float f, voc vocVar, int i) {
        this.a = i;
        this.b = f;
        this.c = vocVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = 1.0f;
        voc vocVar = this.c;
        float f2 = this.b;
        switch (i) {
            case 0:
                gvd gvdVar = (gvd) vocVar;
                if (gvdVar.y() > f2 && gvdVar.y() != 0.0f) {
                    f = Math.max(0.4f, f2 / gvdVar.y());
                }
                return Float.valueOf(f);
            default:
                if (f2 > 0.0f) {
                    f = 1.0f - (((gvd) vocVar).y() / f2);
                }
                return Float.valueOf(f);
        }
    }
}
