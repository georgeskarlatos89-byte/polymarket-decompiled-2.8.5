package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.polymarket.android.R;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.ArraysKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class syb {
    public static volatile y39 a;
    public static final on0 b = new Object();

    public static final d3g a(Throwable th) {
        if (th instanceof c0) {
            return xun.f(R.string.stripe_failure_connection_error, new Object[0]);
        }
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            return new uxh(localizedMessage, ArraysKt.e0(new Object[0]));
        }
        return xun.f(R.string.stripe_internal_error, new Object[0]);
    }

    public static ScheduledExecutorService b() {
        if (a != null) {
            return a;
        }
        synchronized (syb.class) {
            try {
                if (a == null) {
                    a = new y39(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final zrf c(nwa nwaVar) {
        zrf b2 = i3n.b(nwaVar, true);
        long m = nwaVar.m(b2.e());
        float f = b2.c;
        float f2 = b2.d;
        long m2 = nwaVar.m((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new zrf(Float.intBitsToFloat((int) (m >> 32)), Float.intBitsToFloat((int) (m & 4294967295L)), Float.intBitsToFloat((int) (m2 >> 32)), Float.intBitsToFloat((int) (m2 & 4294967295L)));
    }
}
