package com.google.android.libraries.places.internal;

import defpackage.hdi;
import java.io.File;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzacm extends zzacn {
    private final int zzd;
    private int zzf = 0;
    private final String zzb = "com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs";
    private final String zzc = "addInternalUsageAttributionId";
    private final String zze = "AuxLibConfigs.java";

    public /* synthetic */ zzacm(String str, String str2, int i, String str3, byte[] bArr) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzacm) {
            zzacm zzacmVar = (zzacm) obj;
            if (this.zzc.equals(zzacmVar.zzc) && this.zzd == zzacmVar.zzd) {
                String str = this.zzb;
                String str2 = zzacmVar.zzb;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (int i = 0; i < str.length(); i++) {
                            char charAt = str.charAt(i);
                            char charAt2 = str2.charAt(i);
                            if (charAt == charAt2 || ((charAt & 65534) == 46 && (charAt ^ charAt2) == 1)) {
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i == 0) {
            int e = hdi.e(4867, 31, this.zzc) + this.zzd;
            this.zzf = e;
            return e;
        }
        return i;
    }

    @Override // com.google.android.libraries.places.internal.zzacn
    public final String zza() {
        return this.zzb.replace('/', '.');
    }

    @Override // com.google.android.libraries.places.internal.zzacn
    public final String zzb() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzacn
    public final int zzc() {
        return (char) this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzacn
    public final String zzd() {
        String str = this.zze;
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.libraries.places.internal.zzacn
    public final String zze() {
        return this.zze;
    }
}
