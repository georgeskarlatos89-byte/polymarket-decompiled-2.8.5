package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class q32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nwh b;

    public /* synthetic */ q32(nwh nwhVar, int i) {
        this.a = i;
        this.b = nwhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ib4(ib4.b(ib4.b, ((Number) this.b.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14));
            default:
                return new ib4(ib4.b(ib4.b, ((Number) this.b.getValue()).floatValue() * 0.08f, 0.0f, 0.0f, 0.0f, 14));
        }
    }
}
