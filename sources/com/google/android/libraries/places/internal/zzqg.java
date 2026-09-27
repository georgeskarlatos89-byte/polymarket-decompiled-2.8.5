package com.google.android.libraries.places.internal;

import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzqg extends zzqj {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzqg(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzqj) {
            zzqj zzqjVar = (zzqj) obj;
            if (this.zza.equals(zzqjVar.zza()) && ((str = this.zzb) != null ? str.equals(zzqjVar.zzb()) : zzqjVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(str2.length() + 47 + length + 1);
        k84.q(sb, "PlacesFirstPartyConfig{jwtToken=", str2, ", localeString=", str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzqj
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzqj
    public final String zzb() {
        return this.zzb;
    }
}
