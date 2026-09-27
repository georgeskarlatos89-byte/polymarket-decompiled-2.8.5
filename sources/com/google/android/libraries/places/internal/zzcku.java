package com.google.android.libraries.places.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcku extends FilterInputStream {
    private final int zza;
    private final zzcoo zzb;
    private long zzc;
    private long zzd;
    private long zze;

    public zzcku(InputStream inputStream, int i, zzcoo zzcooVar) {
        super(inputStream);
        this.zze = -1L;
        this.zza = i;
        this.zzb = zzcooVar;
    }

    private final void zza() {
        long j = this.zzd;
        long j2 = this.zzc;
        if (j > j2) {
            this.zzb.zzl(j - j2);
            this.zzc = this.zzd;
        }
    }

    private final void zzb() {
        long j = this.zzd;
        int i = this.zza;
        if (j <= i) {
            return;
        }
        zzccd zzccdVar = zzccd.zzf;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("Decompressed gRPC message exceeds maximum size ");
        sb.append(i);
        throw new zzccg(zzccdVar.zze(sb.toString()), null);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.zze = this.zzd;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.zzd++;
        }
        zzb();
        zza();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.zze != -1) {
                ((FilterInputStream) this).in.reset();
                this.zzd = this.zze;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip2 = ((FilterInputStream) this).in.skip(j);
        this.zzd += skip2;
        zzb();
        zza();
        return skip2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.zzd += read;
        }
        zzb();
        zza();
        return read;
    }
}
