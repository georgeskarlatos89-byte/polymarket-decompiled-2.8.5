package com.google.android.libraries.places.internal;

import android.content.Context;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzud implements zzug {
    private Context zza;
    private zzqs zzb;
    private zzbut zzc;

    public /* synthetic */ zzud(byte[] bArr) {
    }

    @Override // com.google.android.libraries.places.internal.zzug
    public final zzuh zza() {
        zzbwo.zzb(this.zza, Context.class);
        zzbwo.zzb(this.zzb, zzqs.class);
        return new zzue(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.libraries.places.internal.zzug
    public final /* synthetic */ zzug zzb(zzbut zzbutVar) {
        this.zzc = zzbutVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzug
    public final /* bridge */ /* synthetic */ zzug zzc(zzqs zzqsVar) {
        zzqsVar.getClass();
        this.zzb = zzqsVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzug
    public final /* bridge */ /* synthetic */ zzug zzd(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    private zzud() {
        throw null;
    }
}
