package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qyb {
    public static final qyb a = new Object();
    public static final u39 b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qyb] */
    static {
        String str;
        Object next;
        int i = eji.a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = pwg.q(lwg.b(Arrays.asList(new c20()).iterator())).iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    ((pyb) next).getClass();
                    do {
                        ((pyb) it.next()).getClass();
                    } while (it.hasNext());
                }
            }
            if (((pyb) next) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    b = new u39(w39.a(mainLooper), null, 2, null);
                    return;
                } else {
                    dmk.n("The main looper is not available");
                    return;
                }
            }
            dmk.n("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
