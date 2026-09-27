package defpackage;

import bo.app.v2;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class p1l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2 b;

    public /* synthetic */ p1l(v2 v2Var, int i) {
        this.a = i;
        this.b = v2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        v2 v2Var = this.b;
        switch (i) {
            case 0:
                return v2.c(v2Var);
            case 1:
                return v2.a(v2Var);
            default:
                return v2.b(v2Var);
        }
    }
}
