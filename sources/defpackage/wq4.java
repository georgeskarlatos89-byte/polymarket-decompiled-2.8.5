package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wq4 implements Function1 {
    public final /* synthetic */ int a;
    public final xl8 b;

    public /* synthetic */ wq4(xl8 xl8Var, int i) {
        this.a = i;
        this.b = xl8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        xl8 xl8Var = this.b;
        switch (i) {
            case 0:
                ec0 ec0Var = (ec0) obj;
                ec0Var.getClass();
                return ec0Var.A0(xl8Var);
            default:
                xl8 xl8Var2 = (xl8) obj;
                xl8Var2.getClass();
                if (!xl8Var2.a.c() && Intrinsics.areEqual(xl8Var2.b(), xl8Var)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
