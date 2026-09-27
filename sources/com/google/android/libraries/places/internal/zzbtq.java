package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbtq implements Iterator {
    final /* synthetic */ zzbts zza;
    private int zzb;
    private Iterator zzc;

    public /* synthetic */ zzbtq(zzbts zzbtsVar, byte[] bArr) {
        Objects.requireNonNull(zzbtsVar);
        this.zza = zzbtsVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        Iterator it = this.zzc;
        if (it == null) {
            Iterator it2 = this.zza.zzk().entrySet().iterator();
            this.zzc = it2;
            return it2;
        }
        return it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzbts zzbtsVar = this.zza;
        if (i < zzbtsVar.zzj()) {
            return true;
        }
        if (!zzbtsVar.zzk().isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.zzb + 1;
        this.zzb = i;
        zzbts zzbtsVar = this.zza;
        if (i < zzbtsVar.zzj()) {
            return (zzbtp) zzbtsVar.zzi()[i];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzbts zzbtsVar = this.zza;
        zzbtsVar.zzh();
        int i = this.zzb;
        if (i < zzbtsVar.zzj()) {
            this.zzb = i - 1;
            zzbtsVar.zzg(i);
        } else {
            zza().remove();
        }
    }
}
