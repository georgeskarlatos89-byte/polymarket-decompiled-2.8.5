package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzqp extends zzqr {
    private String zza;
    private int zzb;
    private zzqs zzc;
    private byte zzd;

    public final zzqr zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        dmk.s("Null packageName");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzqr
    public final zzqr zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzqr
    public final zzqr zzc(zzqs zzqsVar) {
        if (zzqsVar != null) {
            this.zzc = zzqsVar;
            return this;
        }
        dmk.s("Null requestSource");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzqr
    public final zzqt zzd() {
        String str;
        zzqs zzqsVar;
        if (this.zzd == 1 && (str = this.zza) != null && (zzqsVar = this.zzc) != null) {
            return new zzqq(str, this.zzb, zzqsVar, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" packageName");
        }
        if (this.zzd == 0) {
            sb.append(" versionCode");
        }
        if (this.zzc == null) {
            sb.append(" requestSource");
        }
        dmk.n("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
