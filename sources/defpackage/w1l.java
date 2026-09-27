package defpackage;

import bo.app.y7;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ long c;

    public /* synthetic */ w1l(y7 y7Var, long j, int i) {
        this.a = i;
        this.b = y7Var;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        long j = this.c;
        y7 y7Var = this.b;
        switch (i) {
            case 0:
                return y7.c(y7Var, j);
            case 1:
                return y7.d(y7Var, j);
            case 2:
                return y7.a(y7Var, j);
            default:
                return y7.b(y7Var, j);
        }
    }
}
