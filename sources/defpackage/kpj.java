package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kpj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ float c;

    public /* synthetic */ kpj(float f, int i, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = 1.0f;
        float f2 = this.c;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) function0.invoke()).intValue();
                if (intValue != Integer.MAX_VALUE) {
                    f = lnf.d(intValue / f2, 0.0f, 1.0f);
                }
                return Float.valueOf(f);
            default:
                return Float.valueOf(lnf.d((-((Number) function0.invoke()).floatValue()) / f2, 0.0f, 1.0f));
        }
    }
}
