package com.google.android.gms.internal.mlkit_vision_mediapipe;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzhk {
    public static synchronized boolean zza(Context context) {
        boolean zzb;
        synchronized (zzhk.class) {
            zzb = zzb(context, context.getCacheDir().getAbsolutePath());
        }
        return zzb;
    }

    private static native boolean zzb(Context context, String str);
}
