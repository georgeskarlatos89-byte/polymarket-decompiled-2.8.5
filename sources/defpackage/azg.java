package defpackage;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class azg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bzg b;

    public /* synthetic */ azg(bzg bzgVar, int i) {
        this.a = i;
        this.b = bzgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        bzg bzgVar = this.b;
        switch (i) {
            case 0:
                lk8 lk8Var = (lk8) obj;
                lk8Var.getClass();
                return eb4.c(new Pair(bzgVar.e, lk8Var));
            default:
                if (((Boolean) obj).booleanValue() && !bzgVar.c) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
