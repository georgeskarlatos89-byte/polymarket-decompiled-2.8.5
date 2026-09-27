package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcoz implements zzcpb {
    private final zzccp zza;

    public zzcoz(zzccp zzccpVar, byte[] bArr) {
        zzccpVar.getClass();
        this.zza = zzccpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcoz)) {
            return false;
        }
        return this.zza.equals(((zzcoz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcpb
    public final zzcbl zza(zzcbg zzcbgVar, zzcbe zzcbeVar) {
        return zzcbgVar.zzb(this.zza, zzcbeVar);
    }
}
