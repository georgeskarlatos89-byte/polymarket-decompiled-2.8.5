package com.google.android.gms.internal.mlkit_vision_segmentation_bundled;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbp extends zzax {
    final transient Object[] zza;

    private zzbp(Object obj, Object[] objArr, int i) {
        this.zza = objArr;
    }

    public static zzbp zzg(int i, Object[] objArr, zzaw zzawVar) {
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2);
        zzab.zzb(obj, obj2);
        return new zzbp(null, objArr, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c A[RETURN] */
    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzax, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.zza;
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                Objects.requireNonNull(obj2);
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzax
    public final zzaq zza() {
        return new zzbo(this.zza, 1, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzax
    public final zzay zzd() {
        return new zzbm(this, this.zza, 0, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_segmentation_bundled.zzax
    public final zzay zze() {
        return new zzbn(this, new zzbo(this.zza, 0, 1));
    }
}
