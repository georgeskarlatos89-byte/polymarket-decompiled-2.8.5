package com.google.android.libraries.places.internal;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckw extends OutputStream {
    final /* synthetic */ zzckz zza;
    private final List zzb;
    private zzcpc zzc;

    public /* synthetic */ zzckw(zzckz zzckzVar, byte[] bArr) {
        Objects.requireNonNull(zzckzVar);
        this.zza = zzckzVar;
        this.zzb = new ArrayList();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.zzc == null) {
            zzckz zzckzVar = this.zza;
            zzcpc zza = zzckzVar.zzh().zza(Math.max(4096, i2));
            this.zzc = zza;
            this.zzb.add(zza);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.zzc.zzc());
            zzcpc zzcpcVar = this.zzc;
            if (min == 0) {
                int zzd = zzcpcVar.zzd();
                zzcpc zza2 = this.zza.zzh().zza(Math.max(i2, zzd + zzd));
                this.zzc = zza2;
                this.zzb.add(zza2);
            } else {
                zzcpcVar.zza(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }

    public final /* synthetic */ int zza() {
        Iterator it = this.zzb.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzcpc) it.next()).zzd();
        }
        return i;
    }

    public final /* synthetic */ List zzb() {
        return this.zzb;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        zzcpc zzcpcVar = this.zzc;
        byte b = (byte) i;
        if (zzcpcVar == null || zzcpcVar.zzc() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            zzcpcVar.zzb(b);
        }
    }
}
