package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class xg7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg7 b;

    public /* synthetic */ xg7(yg7 yg7Var, int i) {
        this.a = i;
        this.b = yg7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        yg7 yg7Var = this.b;
        switch (i) {
            case 0:
                csc cscVar = (csc) obj;
                if (cscVar != null) {
                    return yg7Var.c(cscVar, yg7Var.b().getContributedFunctions(cscVar, u7d.FOR_NON_TRACKED_SCOPE));
                }
                yg7.a(8);
                throw null;
            default:
                csc cscVar2 = (csc) obj;
                if (cscVar2 != null) {
                    return yg7Var.c(cscVar2, yg7Var.b().getContributedVariables(cscVar2, u7d.FOR_NON_TRACKED_SCOPE));
                }
                yg7.a(4);
                throw null;
        }
    }
}
