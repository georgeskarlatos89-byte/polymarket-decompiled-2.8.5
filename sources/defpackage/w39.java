package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class w39 {
    public static final /* synthetic */ int a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object m882constructorimpl;
        Object obj = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(new u39(a(Looper.getMainLooper()), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m882constructorimpl instanceof r5g)) {
            obj = m882constructorimpl;
        }
    }

    public static final Handler a(Looper looper) {
        Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        invoke.getClass();
        return (Handler) invoke;
    }
}
