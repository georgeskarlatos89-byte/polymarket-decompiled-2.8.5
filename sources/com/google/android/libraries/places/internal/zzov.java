package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzov implements zzph {
    private Context zza;
    private zzqe zzb;
    private zzqt zzc;
    private zzbut zzd;

    public /* synthetic */ zzov(byte[] bArr) {
    }

    @Override // com.google.android.libraries.places.internal.zzph
    public final zzpi zza() {
        zzbwo.zzb(this.zza, Context.class);
        zzbwo.zzb(this.zzb, zzqe.class);
        zzbwo.zzb(this.zzc, zzqt.class);
        return new zzow(this.zza, this.zzb, this.zzc, null, this.zzd);
    }

    @Override // com.google.android.libraries.places.internal.zzph
    public final /* synthetic */ zzph zzb(zzbut zzbutVar) {
        this.zzd = zzbutVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzph
    public final /* bridge */ /* synthetic */ zzph zzc(zzqt zzqtVar) {
        this.zzc = zzqtVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzph
    public final /* bridge */ /* synthetic */ zzph zzd(zzqe zzqeVar) {
        this.zzb = zzqeVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzph
    public final /* bridge */ /* synthetic */ zzph zze(Context context) {
        this.zza = context;
        return this;
    }

    private zzov() {
        throw null;
    }
}
