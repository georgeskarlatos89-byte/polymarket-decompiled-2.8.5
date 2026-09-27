package com.google.android.libraries.places.internal;

import java.util.concurrent.Future;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcnc {
    final Object zza;
    Future zzb;
    boolean zzc;

    public zzcnc(Object obj) {
        this.zza = obj;
    }

    public final void zza(Future future) {
        boolean z;
        synchronized (this.zza) {
            try {
                z = this.zzc;
                if (!z) {
                    this.zzb = future;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    public final Future zzb() {
        this.zzc = true;
        return this.zzb;
    }
}
