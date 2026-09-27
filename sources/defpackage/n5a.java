package defpackage;

import android.content.Context;
import com.checkout.components.interfaces.model.PaymentMethodName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class n5a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5a b;

    public /* synthetic */ n5a(p5a p5aVar) {
        this.a = 0;
        this.b = p5aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        p5a p5aVar = this.b;
        switch (i) {
            case 0:
                p5a p5aVar2 = this.b;
                c0j c0jVar = p5aVar2.h;
                Context context = p5aVar2.a.a;
                esb esbVar = p5aVar2.e;
                nyf nyfVar = new nyf(1, p5aVar2, p5a.class, "buildThreeDSChallengeHandler", "buildThreeDSChallengeHandler$core_standardRelease(Z)V", 0, 29);
                c0jVar.getClass();
                context.getClass();
                esbVar.getClass();
                return new d0j(context, esbVar, nyfVar);
            case 1:
                p5aVar.o.get(PaymentMethodName.Card);
                return Unit.INSTANCE;
            default:
                p5aVar.o.get(PaymentMethodName.Card);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n5a(p5a p5aVar, rk4 rk4Var, int i) {
        this.a = i;
        this.b = p5aVar;
    }
}
