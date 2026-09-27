package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class wsk {
    public static final boolean a = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    public static void a(int i, Class cls, String str) {
        boolean z = a;
        if (z && i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && z) {
                        Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                        return;
                    }
                    return;
                }
                Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
        }
    }

    public static void b(Class cls, Throwable th) {
        boolean z = a;
        if (z && z) {
            Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
        }
    }
}
