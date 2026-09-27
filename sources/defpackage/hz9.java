package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class hz9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz9 b;

    public /* synthetic */ hz9(iz9 iz9Var, int i) {
        this.a = i;
        this.b = iz9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        iz9 iz9Var = this.b;
        pdj pdjVar = (pdj) obj;
        switch (i) {
            case 0:
                pdjVar.getClass();
                iz9 iz9Var2 = (iz9) pdjVar;
                alk alkVar = iz9Var.p;
                if (!Intrinsics.areEqual(iz9Var2.o, alkVar)) {
                    iz9Var2.o = alkVar;
                    iz9Var2.d1();
                }
                return odj.SkipSubtreeAndContinueTraversal;
            default:
                pdjVar.getClass();
                iz9Var.o = ((iz9) pdjVar).p;
                return Boolean.FALSE;
        }
    }
}
