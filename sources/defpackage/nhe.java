package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class nhe implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uhe b;

    public /* synthetic */ nhe(uhe uheVar, int i) {
        this.a = i;
        this.b = uheVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = false;
        g8e g8eVar = null;
        uhe uheVar = this.b;
        switch (i) {
            case 0:
                uheVar.N.b(new hge(true));
                return Unit.INSTANCE;
            case 1:
                u7e u7eVar = (u7e) uheVar.m.getValue();
                if (u7eVar != null) {
                    g8eVar = u7eVar.K();
                }
                if (g8eVar == g8e.Vertical && !(uheVar.n.i.c.invoke() instanceof nge)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                u7e u7eVar2 = (u7e) uheVar.m.getValue();
                if (u7eVar2 != null) {
                    g8eVar = u7eVar2.K();
                }
                if (g8eVar == g8e.Horizontal) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
