package defpackage;

import android.os.CancellationSignal;
import android.util.Log;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class me5 {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal != null) {
            if (cancellationSignal.isCanceled()) {
                Log.i("PlayServicesImpl", "the flow has been canceled");
                return true;
            }
            return false;
        }
        Log.i("PlayServicesImpl", "No cancellationSignal found");
        return false;
    }

    public static void b(CancellationSignal cancellationSignal, Function0 function0) {
        if (!a(cancellationSignal)) {
            function0.invoke();
        }
    }
}
