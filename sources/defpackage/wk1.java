package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class wk1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fs9 b;

    public /* synthetic */ wk1(fs9 fs9Var, int i) {
        this.a = i;
        this.b = fs9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        fs9 fs9Var = this.b;
        switch (i) {
            case 0:
                return "Error reenqueueing In-App Message from event " + fs9Var;
            default:
                return "Error retrying In-App Message from event " + fs9Var;
        }
    }
}
