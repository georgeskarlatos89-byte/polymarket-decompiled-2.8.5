package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcra {
    private final String[] zza;

    public /* synthetic */ zzcra(zzcqz zzcqzVar, byte[] bArr) {
        this.zza = (String[]) zzcqzVar.zzc().toArray(new String[zzcqzVar.zzc().size()]);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int zza = zza();
        for (int i = 0; i < zza; i++) {
            sb.append(zzb(i));
            sb.append(": ");
            sb.append(zzc(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length >> 1;
    }

    public final String zzb(int i) {
        int i2 = i + i;
        if (i2 >= 0) {
            String[] strArr = this.zza;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
            return null;
        }
        return null;
    }

    public final String zzc(int i) {
        int i2 = i + i + 1;
        if (i2 >= 0) {
            String[] strArr = this.zza;
            if (i2 < strArr.length) {
                return strArr[i2];
            }
            return null;
        }
        return null;
    }
}
