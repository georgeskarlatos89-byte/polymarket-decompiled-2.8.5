package com.google.android.libraries.places.internal;

import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaar implements Runnable {
    final /* synthetic */ Ref.ObjectRef zza;
    final /* synthetic */ zzaal zzb;
    final /* synthetic */ Runnable zzc;

    public zzaar(Ref.ObjectRef objectRef, zzaal zzaalVar, Runnable runnable) {
        this.zza = objectRef;
        this.zzb = zzaalVar;
        this.zzc = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzaax) this.zza.a) == null) {
            zzaal zzaalVar = this.zzb;
            zzaalVar.getClass();
            Runnable runnable = this.zzc;
            zzaal zzc = zzzx.zzc(zzzx.zzd(), zzaalVar);
            try {
                runnable.run();
            } finally {
            }
        } else {
            throw null;
        }
    }

    public final String toString() {
        Runnable runnable = this.zzc;
        StringBuilder sb = new StringBuilder(runnable.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(runnable);
        sb.append("]");
        return sb.toString();
    }
}
