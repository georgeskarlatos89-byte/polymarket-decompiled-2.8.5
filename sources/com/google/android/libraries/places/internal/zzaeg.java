package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaeg implements Iterator {
    final /* synthetic */ zzaeh zza;
    private int zzb;

    public zzaeg(zzaeh zzaehVar) {
        Objects.requireNonNull(zzaehVar);
        this.zza = zzaehVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zza.zza.zzg()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.zzb;
        this.zzb = i + 1;
        zzaej zzaejVar = this.zza.zza;
        return zzaejVar.zzd(zzaejVar.zzf()[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
