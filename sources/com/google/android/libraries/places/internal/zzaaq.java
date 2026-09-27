package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaaq implements Runnable {
    final /* synthetic */ zzaam zza;
    final /* synthetic */ Runnable zzb;

    public zzaaq(zzaam zzaamVar, Runnable runnable) {
        this.zza = zzaamVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaam zzaamVar = this.zza;
        zzaamVar.getClass();
        zzaal zzc = zzzx.zzc(zzzx.zzd(), (zzaal) zzaamVar);
        try {
            this.zzb.run();
        } finally {
        }
    }

    public final String toString() {
        Runnable runnable = this.zzb;
        StringBuilder sb = new StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }
}
