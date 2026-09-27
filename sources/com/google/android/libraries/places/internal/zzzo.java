package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.jr9;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzzo extends zzaao {
    private jr9 zza;
    private jr9 zzb;
    private UUID zzc;
    private long zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.internal.zzaao
    public final zzaao zza(jr9 jr9Var) {
        if (jr9Var != null) {
            this.zza = jr9Var;
            return this;
        }
        dmk.s("Null spansNames");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzaao
    public final zzaao zzb(jr9 jr9Var) {
        if (jr9Var != null) {
            this.zzb = jr9Var;
            return this;
        }
        dmk.s("Null extras");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzaao
    public final zzaao zzc(UUID uuid) {
        if (uuid != null) {
            this.zzc = uuid;
            return this;
        }
        dmk.s("Null rootTraceId");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzaao
    public final zzaao zzd(long j) {
        this.zzd = -1L;
        this.zze = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzaao
    public final zzaap zze() {
        jr9 jr9Var;
        jr9 jr9Var2;
        UUID uuid;
        if (this.zze == 1 && (jr9Var = this.zza) != null && (jr9Var2 = this.zzb) != null && (uuid = this.zzc) != null) {
            return new zzzp(jr9Var, jr9Var2, uuid, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" spansNames");
        }
        if (this.zzb == null) {
            sb.append(" extras");
        }
        if (this.zzc == null) {
            sb.append(" rootTraceId");
        }
        if (this.zze == 0) {
            sb.append(" rootDurationMs");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
