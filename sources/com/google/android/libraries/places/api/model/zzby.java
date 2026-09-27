package com.google.android.libraries.places.api.model;

import defpackage.k84;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzby extends PlusCode {
    private final String zza;
    private final String zzb;

    public zzby(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlusCode) {
            PlusCode plusCode = (PlusCode) obj;
            String str = this.zza;
            if (str != null ? str.equals(plusCode.getCompoundCode()) : plusCode.getCompoundCode() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(plusCode.getGlobalCode()) : plusCode.getGlobalCode() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public final String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public final String getGlobalCode() {
        return this.zzb;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 35 + String.valueOf(str2).length() + 1);
        k84.q(sb, "PlusCode{compoundCode=", str, ", globalCode=", str2);
        sb.append("}");
        return sb.toString();
    }
}
