package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaei implements Iterator {
    final /* synthetic */ zzaej zza;
    private final zzacw zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzaei(zzaej zzaejVar, zzacw zzacwVar, int i, byte[] bArr) {
        Objects.requireNonNull(zzaejVar);
        this.zza = zzaejVar;
        this.zzb = zzacwVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
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
        Object zze = this.zzb.zze(this.zza.zze(this.zzc));
        int i = this.zzd;
        if (i != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.zzd >>>= numberOfTrailingZeros;
            this.zzc += numberOfTrailingZeros;
            return zze;
        }
        this.zzc = -1;
        return zze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
