package com.google.android.libraries.places.internal;

import defpackage.jr9;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzzp extends zzaap {
    private final jr9 zza;
    private final jr9 zzb;
    private final UUID zzc;
    private final long zzd;

    public /* synthetic */ zzzp(jr9 jr9Var, jr9 jr9Var2, UUID uuid, long j, byte[] bArr) {
        this.zza = jr9Var;
        this.zzb = jr9Var2;
        this.zzc = uuid;
        this.zzd = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzaap) {
            zzaap zzaapVar = (zzaap) obj;
            if (this.zza.equals(zzaapVar.zza()) && this.zzb.equals(zzaapVar.zzb()) && this.zzc.equals(zzaapVar.zzc()) && this.zzd == zzaapVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        long j = this.zzd;
        return ((int) (j ^ (j >>> 32))) ^ (hashCode * 1000003);
    }

    @Override // com.google.android.libraries.places.internal.zzaap
    public final jr9 zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaap
    public final jr9 zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzaap
    public final UUID zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzaap
    public final long zzd() {
        return this.zzd;
    }
}
