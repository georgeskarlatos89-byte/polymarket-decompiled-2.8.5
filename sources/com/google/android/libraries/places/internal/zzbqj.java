package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbqj extends zzbqk {
    final /* synthetic */ zzbqq zza;
    private int zzb;
    private final int zzc;

    public zzbqj(zzbqq zzbqqVar) {
        Objects.requireNonNull(zzbqqVar);
        this.zza = zzbqqVar;
        this.zzb = 0;
        this.zzc = zzbqqVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb < this.zzc) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbqm
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zza(i);
        }
        dmk.t();
        return (byte) 0;
    }
}
