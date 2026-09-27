package com.google.android.libraries.places.internal;

import defpackage.dmk;
import defpackage.m51;
import defpackage.woa;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzbqq implements Iterable, Serializable {
    public static final zzbqq zza = new zzbqp(zzbsh.zza);
    private int zzb = 0;

    static {
        int i = zzbqe.zza;
    }

    public static zzbqq zzk(byte[] bArr, int i, int i2) {
        try {
            return zzl(bArr, i, i2, false);
        } catch (zzbsm e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static zzbqq zzl(byte[] bArr, int i, int i2, boolean z) {
        if (i2 == 0) {
            return zza;
        }
        zzo(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzbqp(bArr2);
    }

    public static zzbqq zzm(byte[] bArr, boolean z) {
        if (bArr.length == 0) {
            return zza;
        }
        return new zzbqp(bArr);
    }

    public static int zzo(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    dmk.k("Beginning index larger than ending index: ", String.valueOf(i).length() + 44 + String.valueOf(i2).length(), ", ", i, i2);
                    return 0;
                }
                dmk.k("End index: ", String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), " >= ", i2, i3);
                return 0;
            }
            dmk.j("Beginning index: ", String.valueOf(i).length() + 21, i, " < 0");
            return 0;
        }
        return i4;
    }

    public static /* synthetic */ boolean zzp(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        zzo(i, i4, bArr.length);
        zzo(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzbqq)) {
            return false;
        }
        zzbqq zzbqqVar = (zzbqq) obj;
        int zzb = zzb();
        if (zzb != zzbqqVar.zzb()) {
            return false;
        }
        if (zzb == 0) {
            return true;
        }
        int i = this.zzb;
        int i2 = zzbqqVar.zzb;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        return zzf(zzbqqVar);
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i == 0) {
            int zzb = zzb();
            i = zzg(zzb, 0, zzb);
            if (i == 0) {
                i = 1;
            }
            this.zzb = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbqj(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb = zzb();
        if (zzb() <= 50) {
            concat = zzbtu.zza(zzn());
        } else {
            concat = zzbtu.zza(zzc(0, 47).zzn()).concat("...");
        }
        return woa.r(m51.q("<ByteString@", hexString, " size=", zzb, " contents=\""), concat, "\">");
    }

    public abstract byte zza(int i);

    public abstract int zzb();

    public abstract zzbqq zzc(int i, int i2);

    public abstract void zzd(byte[] bArr, int i, int i2, int i3);

    public abstract void zze(zzbqi zzbqiVar);

    public abstract boolean zzf(zzbqq zzbqqVar);

    public abstract int zzg(int i, int i2, int i3);

    public abstract zzbqu zzh();

    public final byte[] zzn() {
        int zzb = zzb();
        if (zzb == 0) {
            return zzbsh.zza;
        }
        byte[] bArr = new byte[zzb];
        zzd(bArr, 0, 0, zzb);
        return bArr;
    }
}
