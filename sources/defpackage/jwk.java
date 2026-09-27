package defpackage;

import bo.app.c5;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class jwk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;

    public /* synthetic */ jwk(c5 c5Var, int i) {
        this.a = i;
        this.b = c5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        c5 c5Var = this.b;
        switch (i) {
            case 0:
                return c5.a(c5Var);
            case 1:
                return c5.b(c5Var);
            case 2:
                return c5.c(c5Var);
            default:
                return c5.d(c5Var);
        }
    }
}
