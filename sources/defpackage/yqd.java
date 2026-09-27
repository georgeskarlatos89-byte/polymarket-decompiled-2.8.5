package defpackage;

import android.os.Build;
import android.util.Log;
import kotlin.ResultKt;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yqd {
    public final re8 a;
    public final q24 b;
    public final bw4 c = new bw4(0);
    public final bw4 d = new bw4(0);
    public final Flow e = hhl.c(new f2c(this, null, 13));

    public yqd(re8 re8Var, q24 q24Var) {
        this.a = re8Var;
        this.b = q24Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(otd otdVar, q55 q55Var) {
        xqd xqdVar;
        int i;
        otd otdVar2;
        Object obj;
        otd otdVar3;
        if (q55Var instanceof xqd) {
            xqdVar = (xqd) q55Var;
            int i2 = xqdVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xqdVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = xqdVar.l;
                Object obj3 = u85.COROUTINE_SUSPENDED;
                i = xqdVar.n;
                if (i == 0) {
                    if (i == 1) {
                        otd otdVar4 = xqdVar.k;
                        ResultKt.a(obj2);
                        otdVar2 = otdVar4;
                        obj = obj2;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    xqdVar.k = otdVar;
                    xqdVar.n = 1;
                    Object invoke = this.a.invoke(xqdVar);
                    if (invoke == obj3) {
                        return obj3;
                    }
                    otdVar2 = otdVar;
                    obj = invoke;
                }
                otdVar3 = (otd) obj;
                if (otdVar3 == otdVar2) {
                    otdVar3.registerInvalidatedCallback(new fua(0, this, yqd.class, "invalidate", "invalidate()V", 0, 14));
                    if (otdVar2 != null) {
                        otdVar2.unregisterInvalidatedCallback(new fua(0, this, yqd.class, "invalidate", "invalidate()V", 0, 15));
                    }
                    if (otdVar2 != null) {
                        otdVar2.invalidate();
                    }
                    if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                        otdVar3.toString();
                    }
                    return otdVar3;
                }
                dmk.n("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
                return null;
            }
        }
        xqdVar = new xqd(this, q55Var);
        Object obj22 = xqdVar.l;
        Object obj32 = u85.COROUTINE_SUSPENDED;
        i = xqdVar.n;
        if (i == 0) {
        }
        otdVar3 = (otd) obj;
        if (otdVar3 == otdVar2) {
        }
    }
}
