package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ae9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ de9 b;

    public /* synthetic */ ae9(de9 de9Var, int i) {
        this.a = i;
        this.b = de9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        de9 de9Var = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                if (!booleanValue && !de9Var.i.getReportsPlaybackState()) {
                    de9Var.p(r98.Failed);
                }
                return Unit.INSTANCE;
            default:
                if (booleanValue && de9Var.i.getReportsPlaybackState()) {
                    de9Var.p(r98.Paused);
                }
                return Unit.INSTANCE;
        }
    }
}
