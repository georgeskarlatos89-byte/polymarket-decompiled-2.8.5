package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class rnh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jf2 b;

    public /* synthetic */ rnh(jf2 jf2Var, int i) {
        this.a = i;
        this.b = jf2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        jf2 jf2Var = this.b;
        switch (i) {
            case 0:
                jf2Var.d();
                return Unit.INSTANCE;
            case 1:
                jf2Var.d();
                return Unit.INSTANCE;
            default:
                jf2Var.c();
                return Unit.INSTANCE;
        }
    }
}
