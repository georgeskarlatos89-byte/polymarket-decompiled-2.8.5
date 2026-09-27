package com.google.android.gms.internal.mlkit_vision_common;

import com.fingerprintjs.android.fpjs_pro.g;
import defpackage.ix2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzma extends zzme {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzma(String str, boolean z, int i, zzlz zzlzVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzme) {
            zzme zzmeVar = (zzme) obj;
            if (this.zza.equals(zzmeVar.zzb()) && this.zzb == zzmeVar.zzc() && this.zzc == zzmeVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() ^ 1000003;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        return this.zzc ^ (((hashCode * 1000003) ^ i) * 1000003);
    }

    public final String toString() {
        return ix2.i(this.zzc, "}", g.r("MLKitLoggingOptions{libraryName=", this.zza, ", enableFirelog=", ", firelogEventType=", this.zzb));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzme
    public final boolean zzc() {
        return this.zzb;
    }
}
