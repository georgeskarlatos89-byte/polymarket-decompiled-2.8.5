package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import org.msgpack.core.MessagePack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcmd extends zzccx {
    int zza;
    final int zzb;
    final byte[] zzc;
    int zzd = -1;

    public zzcmd(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        brn.g("offset must be >= 0", z);
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        brn.g("length must be >= 0", z2);
        int i3 = i2 + i;
        brn.g("offset + length exceeds array boundary", i3 <= bArr.length);
        this.zzc = bArr;
        this.zza = i;
        this.zzb = i3;
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb
    public final void zzb() {
        this.zzd = this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzccx, com.google.android.libraries.places.internal.zzcmb
    public final void zzc() {
        int i = this.zzd;
        if (i != -1) {
            this.zza = i;
            return;
        }
        throw new InvalidMarkException();
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final int zzf() {
        return this.zzb - this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final int zzg() {
        zzd(1);
        int i = this.zza;
        this.zza = i + 1;
        return this.zzc[i] & MessagePack.Code.EXT_TIMESTAMP;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final void zzh(int i) {
        zzd(i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final void zzi(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zzc, this.zza, bArr, i, i2);
        this.zza += i2;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final void zzj(OutputStream outputStream, int i) {
        zzd(i);
        outputStream.write(this.zzc, this.zza, i);
        this.zza += i;
    }

    @Override // com.google.android.libraries.places.internal.zzcmb
    public final /* bridge */ /* synthetic */ zzcmb zzk(int i) {
        zzd(i);
        int i2 = this.zza;
        this.zza = i2 + i;
        return new zzcmd(this.zzc, i2, i);
    }
}
