package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzac extends zzz {
    public zzac() {
        super(4);
    }

    public final zzac zzb(Object obj) {
        obj.getClass();
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, zzaa.zza(length, i));
            this.zza = objArr;
            this.zzc = false;
        } else if (this.zzc) {
            objArr = (Object[]) objArr.clone();
            this.zza = objArr;
            this.zzc = false;
        }
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = obj;
        return this;
    }

    public final zzaf zzc() {
        this.zzc = true;
        return zzaf.zzg(this.zza, this.zzb);
    }
}
