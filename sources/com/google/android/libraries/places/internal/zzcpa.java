package com.google.android.libraries.places.internal;

import java.net.URI;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcpa implements zzcpb {
    private final URI zza;

    public zzcpa(URI uri, byte[] bArr) {
        uri.getClass();
        this.zza = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcpa)) {
            return false;
        }
        return this.zza.equals(((zzcpa) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcpb
    public final zzcbl zza(zzcbg zzcbgVar, zzcbe zzcbeVar) {
        return zzcbgVar.zza(this.zza, zzcbeVar);
    }
}
