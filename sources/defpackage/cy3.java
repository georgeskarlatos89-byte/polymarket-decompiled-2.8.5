package defpackage;

import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import kotlin.ResultKt;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cy3 {
    public final CheckoutKMPRememberMe a;
    public final PrimitiveStateFlowRepository b;
    public final g85 c;

    public cy3(CheckoutKMPRememberMe checkoutKMPRememberMe, PrimitiveStateFlowRepository primitiveStateFlowRepository) {
        mv6 mv6Var = mv6.a;
        a66 a66Var = a66.c;
        a66Var.getClass();
        this.a = checkoutKMPRememberMe;
        this.b = primitiveStateFlowRepository;
        this.c = a66Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, q55 q55Var) {
        ayk aykVar;
        int i;
        if (q55Var instanceof ayk) {
            aykVar = (ayk) q55Var;
            int i2 = aykVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aykVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aykVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = aykVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    gxk gxkVar = new gxk(str, this, null, 3);
                    aykVar.m = 1;
                    obj = coc.d(this.c, gxkVar, aykVar);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.b.update((PrimitiveStateFlowRepository) bool);
                return Unit.INSTANCE;
            }
        }
        aykVar = new ayk(this, q55Var);
        Object obj2 = aykVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = aykVar.m;
        if (i == 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        this.b.update((PrimitiveStateFlowRepository) bool2);
        return Unit.INSTANCE;
    }
}
