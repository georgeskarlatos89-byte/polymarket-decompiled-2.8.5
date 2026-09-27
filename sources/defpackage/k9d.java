package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class k9d {
    public final dlg a;
    public final Function2 b;
    public il6 c;
    public boolean d;
    public final a35 e = new a35(12);

    public k9d(dlg dlgVar, Function2 function2, il6 il6Var) {
        this.a = dlgVar;
        this.b = function2;
        this.c = il6Var;
    }

    public static void a(gse gseVar) {
        List list = gseVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((nse) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function2 function2, q55 q55Var) {
        j9d j9dVar;
        int i;
        if (q55Var instanceof j9d) {
            j9dVar = (j9d) q55Var;
            int i2 = j9dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j9dVar.m = i2 - Integer.MIN_VALUE;
                Object obj = j9dVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = j9dVar.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    this.d = true;
                    f2c f2cVar = new f2c(this, function2, null, 8);
                    j9dVar.m = 1;
                    gjg gjgVar = new gjg(j9dVar, j9dVar.getContext());
                    if (izm.h(gjgVar, true, gjgVar, f2cVar) == u85Var) {
                        return u85Var;
                    }
                }
                this.d = false;
                return Unit.INSTANCE;
            }
        }
        j9dVar = new j9d(this, q55Var);
        Object obj2 = j9dVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = j9dVar.m;
        if (i == 0) {
        }
        this.d = false;
        return Unit.INSTANCE;
    }
}
