package com.google.android.libraries.places.internal;

import android.os.Looper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzzk {
    private static Thread zza;

    public static boolean zza(Thread thread) {
        Thread thread2 = zza;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            zza = thread2;
        }
        if (thread == thread2) {
            return true;
        }
        return false;
    }
}
