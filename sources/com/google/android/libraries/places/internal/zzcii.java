package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcii {
    private List zza;
    private int zzb;
    private int zzc;

    public zzcii(List list) {
        this.zza = list;
    }

    public final boolean zza() {
        if (this.zzb < this.zza.size()) {
            return true;
        }
        return false;
    }

    public final boolean zzb() {
        if (this.zzb == 0 && this.zzc == 0) {
            return true;
        }
        return false;
    }

    public final void zzc() {
        zzbyi zzbyiVar = (zzbyi) this.zza.get(this.zzb);
        int i = this.zzc + 1;
        this.zzc = i;
        if (i >= zzbyiVar.zza().size()) {
            this.zzb++;
            this.zzc = 0;
        }
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final SocketAddress zze() {
        return (SocketAddress) ((zzbyi) this.zza.get(this.zzb)).zza().get(this.zzc);
    }

    public final zzbww zzf() {
        return ((zzbyi) this.zza.get(this.zzb)).zzb();
    }

    public final void zzg(List list) {
        this.zza = list;
        zzd();
    }

    public final boolean zzh(SocketAddress socketAddress) {
        for (int i = 0; i < this.zza.size(); i++) {
            int indexOf = ((zzbyi) this.zza.get(i)).zza().indexOf(socketAddress);
            if (indexOf != -1) {
                this.zzb = i;
                this.zzc = indexOf;
                return true;
            }
        }
        return false;
    }
}
