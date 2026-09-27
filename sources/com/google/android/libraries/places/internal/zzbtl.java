package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbtl implements zzbsx {
    private final zzbsz zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzbtl(zzbsz zzbszVar, String str, Object[] objArr) {
        this.zza = zzbszVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.zzd = i | (charAt2 << i3);
                return;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbsx
    public final boolean zza() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbsx
    public final zzbsz zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbsx
    public final int zzc() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 4) == 4) {
            return 3;
        }
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
