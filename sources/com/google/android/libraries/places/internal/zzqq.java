package com.google.android.libraries.places.internal;

import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzqq extends zzqt {
    private final String zza;
    private final int zzb;
    private final zzqs zzc;

    public /* synthetic */ zzqq(String str, int i, zzqs zzqsVar, byte[] bArr) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzqsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzqt) {
            zzqt zzqtVar = (zzqt) obj;
            if (this.zza.equals(zzqtVar.zza()) && this.zzb == zzqtVar.zzb() && this.zzc.equals(zzqtVar.zzc())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzqs zzqsVar = this.zzc;
        return ((this.zzb ^ (hashCode * 1000003)) * 1000003) ^ zzqsVar.hashCode();
    }

    public final String toString() {
        String obj = this.zzc.toString();
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 40 + length + 16 + length2 + 1);
        sb.append("ClientProfile{packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(i);
        return ix2.p(sb, ", requestSource=", obj, "}");
    }

    @Override // com.google.android.libraries.places.internal.zzqt
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzqt
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzqt
    public final zzqs zzc() {
        return this.zzc;
    }
}
