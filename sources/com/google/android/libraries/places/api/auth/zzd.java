package com.google.android.libraries.places.api.auth;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzd extends zzb {
    private final boolean zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzd(boolean z, String str, String str2, byte[] bArr) {
        this.zzb = z;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.zzb == zzbVar.zza() && ((str = this.zzc) != null ? str.equals(zzbVar.zzb()) : zzbVar.zzb() == null) && ((str2 = this.zzd) != null ? str2.equals(zzbVar.zzc()) : zzbVar.zzc() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        String str = this.zzc;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = hashCode ^ ((i ^ 1000003) * 1000003);
        String str2 = this.zzd;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return (i3 * 1000003) ^ i2;
    }

    public final String toString() {
        boolean z = this.zzb;
        int length = String.valueOf(z).length();
        String str = this.zzc;
        int length2 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 26 + String.valueOf(str2).length() + 1);
        sb.append("AppCheckResult{appCheckEnabled=");
        sb.append(z);
        sb.append(", appCheckToken=");
        sb.append(str);
        return ix2.p(sb, ", appCheckTokenFetchError=", str2, "}");
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final boolean zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.auth.zzb
    public final String zzc() {
        return this.zzd;
    }
}
