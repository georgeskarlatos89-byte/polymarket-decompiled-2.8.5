package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class tih implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nwh b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ tih(nwh nwhVar, Function0 function0, int i) {
        this.a = i;
        this.b = nwhVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = 1.0f;
        Function0 function0 = this.c;
        nwh nwhVar = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) nwhVar.getValue()).booleanValue() || !((Boolean) function0.invoke()).booleanValue()) {
                    f = 0.0f;
                }
                return Float.valueOf(f);
            default:
                return Float.valueOf(Math.max(((Number) nwhVar.getValue()).floatValue(), lnf.d(((Number) function0.invoke()).floatValue(), 0.0f, 1.0f)));
        }
    }
}
