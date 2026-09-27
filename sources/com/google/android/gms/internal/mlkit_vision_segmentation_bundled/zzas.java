package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import defpackage.bd0;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzas extends zzao {
    public zzas() {
        super(4);
    }

    public final zzas zza(Object obj) {
        obj.getClass();
        int i = this.zzb;
        int i2 = i + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = bd0.API_PRIORITY_OTHER;
            }
            objArr = Arrays.copyOf(objArr, i3);
            this.zza = objArr;
            this.zzc = false;
        } else if (this.zzc) {
            objArr = (Object[]) objArr.clone();
            this.zza = objArr;
            this.zzc = false;
        }
        int i4 = this.zzb;
        this.zzb = i4 + 1;
        objArr[i4] = obj;
        return this;
    }

    public final zzav zzb() {
        this.zzc = true;
        return zzav.zzg(this.zza, this.zzb);
    }
}
