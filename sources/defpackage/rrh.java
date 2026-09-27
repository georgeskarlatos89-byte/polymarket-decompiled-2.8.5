package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rrh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qrh b;

    public /* synthetic */ rrh(qrh qrhVar, int i) {
        this.a = i;
        this.b = qrhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = this.a;
        float f = 1.0f;
        qrh qrhVar = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Number) qrhVar.invoke()).floatValue() / 0.5f;
                if (floatValue <= 1.0f) {
                    f = floatValue;
                }
                return Float.valueOf(f);
            case 1:
                return Float.valueOf(lnf.d((((Number) qrhVar.invoke()).floatValue() - 0.1f) / 0.9f, 0.0f, 1.0f));
            default:
                if (((Number) qrhVar.invoke()).floatValue() < 0.33333334f) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
