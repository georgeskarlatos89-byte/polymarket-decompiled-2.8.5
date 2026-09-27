package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.nhn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzw {
    private final List zza;
    private final zzbww zzb;
    private final Object zzc;

    public /* synthetic */ zzbzw(List list, zzbww zzbwwVar, Object obj, byte[] bArr) {
        brn.m(list, "addresses");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        brn.m(zzbwwVar, "attributes");
        this.zzb = zzbwwVar;
        this.zzc = obj;
    }

    public static zzbzv zza() {
        return new zzbzv();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbzw)) {
            return false;
        }
        zzbzw zzbzwVar = (zzbzw) obj;
        if (!ckn.a(this.zza, zzbzwVar.zza) || !ckn.a(this.zzb, zzbzwVar.zzb) || !ckn.a(this.zzc, zzbzwVar.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "addresses");
        b.f(this.zzc, "loadBalancingPolicyConfig");
        b.f(this.zzb, "attributes");
        return b.toString();
    }

    public final zzbzv zzb() {
        zzbzv zzbzvVar = new zzbzv();
        zzbzvVar.zza(this.zza);
        zzbzvVar.zzb(this.zzb);
        zzbzvVar.zzc(this.zzc);
        return zzbzvVar;
    }

    public final List zzc() {
        return this.zza;
    }

    public final zzbww zzd() {
        return this.zzb;
    }

    public final Object zze() {
        return this.zzc;
    }
}
