package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class xkm {
    public static final w97 a = new w97(13);

    public static void a() {
        grn.g("Not in application's main thread", c());
    }

    public static final String b(f3e f3eVar) {
        a3e a3eVar;
        tde tdeVar;
        zde zdeVar;
        f3eVar.getClass();
        if (f3eVar instanceof a3e) {
            a3eVar = (a3e) f3eVar;
        } else {
            a3eVar = null;
        }
        if (a3eVar == null) {
            return null;
        }
        ude udeVar = a3eVar.a.f;
        if (udeVar instanceof tde) {
            tdeVar = (tde) udeVar;
        } else {
            tdeVar = null;
        }
        if (tdeVar == null || (zdeVar = tdeVar.a) == null) {
            return null;
        }
        return zdeVar.a;
    }

    public static boolean c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            grn.g("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
