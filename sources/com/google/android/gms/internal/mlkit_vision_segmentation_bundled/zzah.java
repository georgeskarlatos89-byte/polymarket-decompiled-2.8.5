package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.dmk;
import defpackage.f27;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzah implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzal zze;

    public /* synthetic */ zzah(zzal zzalVar, zzag zzagVar) {
        this.zze = zzalVar;
        this.zzb = zzal.zza(zzalVar);
        this.zzc = zzalVar.zze();
    }

    private final void zzb() {
        if (zzal.zza(this.zze) == this.zzb) {
            return;
        }
        f27.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzc >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        dmk.t();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        zzb();
        if (this.zzd >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzi.zzd(z, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzal zzalVar = this.zze;
        zzalVar.remove(zzal.zzg(zzalVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
