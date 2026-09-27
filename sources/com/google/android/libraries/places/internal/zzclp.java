package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzclp implements Comparable {
    final zzbyi zza;
    final double zzb;

    public zzclp(zzbyi zzbyiVar, double d) {
        this.zza = zzbyiVar;
        this.zzb = d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.zzb, ((zzclp) obj).zzb);
    }
}
