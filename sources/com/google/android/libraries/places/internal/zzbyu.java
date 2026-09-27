package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.nhn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyu {
    public final String zza;
    public final zzbyt zzb;
    public final long zzc;
    public final zzbzk zzd;
    public final zzbzk zze;

    public /* synthetic */ zzbyu(String str, zzbyt zzbytVar, long j, zzbzk zzbzkVar, zzbzk zzbzkVar2, byte[] bArr) {
        this.zza = str;
        brn.m(zzbytVar, "severity");
        this.zzb = zzbytVar;
        this.zzc = j;
        this.zzd = null;
        this.zze = zzbzkVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbyu) {
            zzbyu zzbyuVar = (zzbyu) obj;
            if (ckn.a(this.zza, zzbyuVar.zza) && ckn.a(this.zzb, zzbyuVar.zzb) && this.zzc == zzbyuVar.zzc && ckn.a(null, null) && ckn.a(this.zze, zzbyuVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, Long.valueOf(this.zzc), null, this.zze});
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "description");
        b.f(this.zzb, "severity");
        b.b(this.zzc, "timestampNanos");
        b.f(null, "channelRef");
        b.f(this.zze, "subchannelRef");
        return b.toString();
    }
}
