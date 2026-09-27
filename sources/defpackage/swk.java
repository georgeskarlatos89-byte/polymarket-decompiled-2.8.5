package defpackage;

import bo.app.d3;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class swk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ swk(int i, d3 d3Var) {
        this.a = i;
        this.b = d3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        d3 d3Var = this.b;
        switch (i) {
            case 0:
                return d3.a(d3Var);
            case 1:
                return d3.e(d3Var);
            case 2:
                return d3.d(d3Var);
            case 3:
                return d3.b(d3Var);
            default:
                return d3.c(d3Var);
        }
    }
}
