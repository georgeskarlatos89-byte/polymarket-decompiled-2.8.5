package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ot3 implements Function1 {
    public final /* synthetic */ boolean a;

    public ot3(boolean z) {
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        d7g d7gVar = (d7g) obj;
        d7gVar.getClass();
        float f2 = 1.0f;
        boolean z = this.a;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.45f;
        }
        d7gVar.b(f);
        if (!z) {
            f2 = 0.86f;
        }
        d7gVar.r(f2);
        d7gVar.s(f2);
        return Unit.INSTANCE;
    }
}
