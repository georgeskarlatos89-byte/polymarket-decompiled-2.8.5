package com.google.android.libraries.places.internal;

import io.ably.lib.transport.Defaults;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcsd {
    private final String zza;
    private final int zzb;
    private final String zzc;

    public /* synthetic */ zzcsd(zzcsc zzcscVar, byte[] bArr) {
        this.zza = zzcscVar.zzb;
        this.zzb = zzcscVar.zzd();
        this.zzc = zzcscVar.toString();
    }

    public static int zzc(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return Defaults.TLS_PORT;
        }
        return -1;
    }

    public static int zzd(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzcsd) && ((zzcsd) obj).zzc.equals(this.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc;
    }

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }
}
