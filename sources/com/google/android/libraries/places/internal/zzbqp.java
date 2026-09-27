package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbqp extends zzbqo {
    private final byte[] zzb;

    public zzbqp(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final zzbqq zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzo = zzbqq.zzo(0, i2, bArr.length);
        if (zzo == 0) {
            return zzbqq.zza;
        }
        return new zzbql(bArr, 0, zzo);
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final void zzd(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, 0, bArr, 0, i3);
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final void zze(zzbqi zzbqiVar) {
        byte[] bArr = this.zzb;
        zzbqiVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final boolean zzf(zzbqq zzbqqVar) {
        boolean z = zzbqqVar instanceof zzbqp;
        if (z) {
            return Arrays.equals(this.zzb, ((zzbqp) zzbqqVar).zzb);
        }
        boolean z2 = zzbqqVar instanceof zzbql;
        if (z2) {
            byte[] bArr = this.zzb;
            int zzb = zzbqqVar.zzb();
            int length = bArr.length;
            if (length <= zzb) {
                if (length <= zzbqqVar.zzb()) {
                    if (z) {
                        return zzbqq.zzp(bArr, 0, ((zzbqp) zzbqqVar).zzb, 0, length);
                    }
                    if (z2) {
                        zzbql zzbqlVar = (zzbql) zzbqqVar;
                        return zzbqq.zzp(bArr, 0, zzbqlVar.zzi(), zzbqlVar.zzj(), length);
                    }
                    return zzbqqVar.zzc(0, length).equals(zzc(0, length));
                }
                int zzb2 = zzbqqVar.zzb();
                dmk.d(String.valueOf(length).length() + 27 + String.valueOf(zzb2).length(), length, zzb2);
                return false;
            }
            dmk.c(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
            return false;
        }
        return zzbqqVar.zzf(this);
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final int zzg(int i, int i2, int i3) {
        return zzbsh.zzc(i, this.zzb, 0, i3);
    }

    @Override // com.google.android.libraries.places.internal.zzbqq
    public final zzbqu zzh() {
        byte[] bArr = this.zzb;
        return zzbqu.zzJ(bArr, 0, bArr.length, true);
    }

    public final /* synthetic */ byte[] zzi() {
        return this.zzb;
    }
}
