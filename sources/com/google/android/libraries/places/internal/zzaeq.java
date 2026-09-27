package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaeq {
    private final zzafy zza;
    private final String zzb;

    public zzaeq(zzafy zzafyVar, String str) {
        zzagc.zza(zzafyVar, "parser");
        this.zza = zzafyVar;
        zzagc.zza(str, "message");
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaeq) {
            zzaeq zzaeqVar = (zzaeq) obj;
            if (this.zza.equals(zzaeqVar.zza) && this.zzb.equals(zzaeqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ this.zzb.hashCode();
    }

    public final zzafy zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
