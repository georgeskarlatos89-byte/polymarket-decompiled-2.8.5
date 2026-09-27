package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class r3n {
    public static final Object a = new Object();
    public static wdk b;

    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void b(Context context) {
        if (b == null) {
            wdk wdkVar = new wdk(context);
            b = wdkVar;
            synchronized (wdkVar.a) {
                wdkVar.g = true;
            }
        }
    }

    public static void c(Intent intent) {
        synchronized (a) {
            try {
                if (b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    b.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void d(ywa ywaVar) {
        nj6.h(ywaVar).O();
    }

    public static ComponentName e(Context context, Intent intent) {
        synchronized (a) {
            try {
                b(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    b.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
