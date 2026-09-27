package com.google.android.libraries.places.api.model;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzm extends zzdd {
    private final String zza;
    private final Integer zzb;
    private final Integer zzc;
    private final String zzd;
    private final String zze;

    public zzm(String str, Integer num, Integer num2, String str2, String str3) {
        this.zza = str;
        this.zzb = num;
        this.zzc = num2;
        this.zzd = str2;
        this.zze = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdd) {
            zzdd zzddVar = (zzdd) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzddVar.zza()) : zzddVar.zza() == null) {
                Integer num = this.zzb;
                if (num != null ? num.equals(zzddVar.zzb()) : zzddVar.zzb() == null) {
                    Integer num2 = this.zzc;
                    if (num2 != null ? num2.equals(zzddVar.zzc()) : zzddVar.zzc() == null) {
                        String str2 = this.zzd;
                        if (str2 != null ? str2.equals(zzddVar.zzd()) : zzddVar.zzd() == null) {
                            String str3 = this.zze;
                            if (str3 != null ? str3.equals(zzddVar.zze()) : zzddVar.zze() == null) {
                                return true;
                            }
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
        int hashCode4;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Integer num = this.zzb;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = hashCode ^ 1000003;
        Integer num2 = this.zzc;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i3 = ((((i2 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        String str2 = this.zzd;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        String str3 = this.zze;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 ^ i;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        Integer num = this.zzb;
        int length2 = String.valueOf(num).length();
        Integer num2 = this.zzc;
        int length3 = String.valueOf(num2).length();
        String str2 = this.zzd;
        int length4 = String.valueOf(str2).length();
        String str3 = this.zze;
        StringBuilder sb = new StringBuilder(length + 20 + length2 + 11 + length3 + 17 + length4 + 29 + String.valueOf(str3).length() + 1);
        sb.append("Photo{url=");
        sb.append(str);
        sb.append(", widthPx=");
        sb.append(num);
        sb.append(", heightPx=");
        sb.append(num2);
        sb.append(", lastUpdateTime=");
        sb.append(str2);
        return ix2.p(sb, ", lastUpdateTimeLanguageCode=", str3, "}");
    }

    @Override // com.google.android.libraries.places.api.model.zzdd
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.zzdd
    public final Integer zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.zzdd
    public final Integer zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.zzdd
    public final String zzd() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.zzdd
    public final String zze() {
        return this.zze;
    }
}
