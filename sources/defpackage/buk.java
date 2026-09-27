package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class buk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi1 b;

    public /* synthetic */ buk(pi1 pi1Var, int i) {
        this.a = i;
        this.b = pi1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        pi1 pi1Var = this.b;
        switch (i) {
            case 0:
                pi1Var.a.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                pi1Var.a.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
