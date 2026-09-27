package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y06 {
    public final a36 a;
    public final CoroutineContext b;

    public y06(a36 a36Var, CoroutineContext coroutineContext, int i) {
        switch (i) {
            case 1:
                a36Var.getClass();
                coroutineContext.getClass();
                this.a = a36Var;
                this.b = coroutineContext;
                return;
            default:
                this.a = a36Var;
                this.b = coroutineContext;
                return;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:36|37))(3:38|39|(1:41))|12|(3:25|26|27)(1:14)|15|16|(1:18)|19|(1:24)(2:21|22)))|44|6|7|(0)(0)|12|(0)(0)|15|16|(0)|19|(0)(0)|(2:(0)|(1:32))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        r8 = kotlin.Result.INSTANCE;
        r6 = kotlin.Result.m882constructorimpl(kotlin.ResultKt.createFailure(r6));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, q55 q55Var) {
        ap9 ap9Var;
        int i;
        Object m882constructorimpl;
        Throwable m883exceptionOrNullimpl;
        InputStream inputStream;
        Bitmap decodeStream;
        if (q55Var instanceof ap9) {
            ap9Var = (ap9) q55Var;
            int i2 = ap9Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ap9Var.n = i2 - Integer.MIN_VALUE;
                Object obj = ap9Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ap9Var.n;
                a36 a36Var = this.a;
                if (i == 0) {
                    if (i == 1) {
                        str = ap9Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    Result.Companion companion = Result.INSTANCE;
                    CoroutineContext coroutineContext = this.b;
                    bm9 bm9Var = new bm9(str, a36Var, coroutineContext);
                    ap9Var.k = str;
                    ap9Var.n = 1;
                    obj = coc.d(coroutineContext, new gqg(bm9Var, null, 10), ap9Var);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                inputStream = (InputStream) obj;
                if (inputStream == null) {
                    try {
                        decodeStream = BitmapFactory.decodeStream(inputStream);
                        inputStream.close();
                    } finally {
                    }
                } else {
                    decodeStream = null;
                }
                m882constructorimpl = Result.m882constructorimpl(decodeStream);
                m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
                if (m883exceptionOrNullimpl != null) {
                    a36Var.b(new RuntimeException(sv6.n("Could not get bitmap from url: ", str, "."), m883exceptionOrNullimpl));
                }
                if (!(m882constructorimpl instanceof r5g)) {
                    return null;
                }
                return m882constructorimpl;
            }
        }
        ap9Var = new ap9(this, q55Var);
        Object obj2 = ap9Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ap9Var.n;
        a36 a36Var2 = this.a;
        if (i == 0) {
        }
        inputStream = (InputStream) obj2;
        if (inputStream == null) {
        }
        m882constructorimpl = Result.m882constructorimpl(decodeStream);
        m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
        if (m883exceptionOrNullimpl != null) {
        }
        if (!(m882constructorimpl instanceof r5g)) {
        }
    }
}
