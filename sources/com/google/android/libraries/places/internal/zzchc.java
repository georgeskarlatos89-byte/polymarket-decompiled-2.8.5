package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.nhn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
class zzchc extends zzcbl {
    private final zzcbl zzb;

    public zzchc(zzcbl zzcblVar) {
        brn.m(zzcblVar, "delegate can not be null");
        this.zzb = zzcblVar;
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zzb, "delegate");
        return b.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final String zza() {
        return this.zzb.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public void zzb(zzcbh zzcbhVar) {
        this.zzb.zzb(zzcbhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public void zzc() {
        this.zzb.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzd() {
        this.zzb.zzd();
    }
}
