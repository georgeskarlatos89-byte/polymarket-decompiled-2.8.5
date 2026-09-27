package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.nhn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcbj {
    private final zzccf zza;
    private final zzbww zzb;
    private final zzcbf zzc;

    public zzcbj(zzccf zzccfVar, zzbww zzbwwVar, zzcbf zzcbfVar) {
        this.zza = zzccfVar;
        brn.m(zzbwwVar, "attributes");
        this.zzb = zzbwwVar;
        this.zzc = zzcbfVar;
    }

    public static zzcbi zza() {
        return new zzcbi();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcbj)) {
            return false;
        }
        zzcbj zzcbjVar = (zzcbj) obj;
        if (!ckn.a(this.zza, zzcbjVar.zza) || !ckn.a(this.zzb, zzcbjVar.zzb) || !ckn.a(this.zzc, zzcbjVar.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza.toString(), "addressesOrError");
        b.f(this.zzb, "attributes");
        b.f(this.zzc, "serviceConfigOrError");
        return b.toString();
    }

    public final zzccf zzb() {
        return this.zza;
    }

    public final zzbww zzc() {
        return this.zzb;
    }

    public final zzcbf zzd() {
        return this.zzc;
    }
}
