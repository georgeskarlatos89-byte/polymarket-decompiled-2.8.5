package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class al1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl1 b;

    public /* synthetic */ al1(rl1 rl1Var, int i) {
        this.a = i;
        this.b = rl1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        rl1 rl1Var = this.b;
        switch (i) {
            case 0:
                return "Setting pending config object: " + rl1Var;
            case 1:
                return "Braze.configure() called with configuration: " + rl1Var;
            default:
                return "Setting Braze Override configuration with config: " + rl1Var;
        }
    }
}
