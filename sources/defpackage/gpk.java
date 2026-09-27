package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gpk {
    public static final String a = dm0.j("WorkerFactory");

    public static zjb a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        zjb zjbVar;
        String str2 = a;
        try {
            cls = Class.forName(str).asSubclass(zjb.class);
        } catch (Throwable th) {
            dm0.g().f(str2, "Invalid class: " + str, th);
            cls = null;
        }
        if (cls != null) {
            try {
                zjbVar = (zjb) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                dm0.g().f(str2, "Could not instantiate " + str, th2);
            }
            if (zjbVar == null && zjbVar.d) {
                dmk.n(hdi.p("WorkerFactory (", gpk.class.getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
                return null;
            }
            return zjbVar;
        }
        zjbVar = null;
        if (zjbVar == null) {
        }
        return zjbVar;
    }
}
