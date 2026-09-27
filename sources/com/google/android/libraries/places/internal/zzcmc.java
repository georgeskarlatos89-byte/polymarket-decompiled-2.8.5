package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcmc extends InputStream implements zzbzl {
    private final zzcmb zza;

    public zzcmc(zzcmb zzcmbVar) {
        brn.m(zzcmbVar, "buffer");
        this.zza = zzcmbVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.zza.zzf();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.zza.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.zza();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        zzcmb zzcmbVar = this.zza;
        if (zzcmbVar.zzf() == 0) {
            return -1;
        }
        int min = Math.min(zzcmbVar.zzf(), i2);
        zzcmbVar.zzi(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.zza.zzc();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        zzcmb zzcmbVar = this.zza;
        int min = (int) Math.min(zzcmbVar.zzf(), j);
        zzcmbVar.zzh(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzcmb zzcmbVar = this.zza;
        if (zzcmbVar.zzf() == 0) {
            return -1;
        }
        return zzcmbVar.zzg();
    }
}
