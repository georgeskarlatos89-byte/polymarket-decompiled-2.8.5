package com.google.android.libraries.places.api.model;

import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzo extends zzdg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzo(String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdg) {
            zzdg zzdgVar = (zzdg) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzdgVar.zza()) : zzdgVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzdgVar.zzb()) : zzdgVar.zzb() == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(zzdgVar.zzc()) : zzdgVar.zzc() == null) {
                        String str4 = this.zzd;
                        if (str4 != null ? str4.equals(zzdgVar.zzd()) : zzdgVar.zzd() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        String str3 = this.zzc;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str4 = this.zzd;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 45 + length2 + 6 + length3 + 11 + String.valueOf(str4).length() + 1);
        k84.q(sb, "Author{displayName=", str, ", displayNameLanguageCode=", str2);
        k84.q(sb, ", url=", str3, ", photoUrl=", str4);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.zzdg
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzdg
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzdg
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.zzdg
    public final String zzd() {
        return this.zzd;
    }
}
