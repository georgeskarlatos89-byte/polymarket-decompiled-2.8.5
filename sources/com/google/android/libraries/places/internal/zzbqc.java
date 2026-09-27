package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzbqc implements zzbth {
    static {
        int i = zzbrh.zzb;
        int i2 = zzbqe.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbth
    public final /* bridge */ /* synthetic */ Object zza(zzbqu zzbquVar, zzbrh zzbrhVar) {
        zzbtx zzbtxVar;
        zzbsz zzbszVar = (zzbsz) zzb(zzbquVar, zzbrhVar);
        if (zzbszVar != null && !zzbszVar.zzbU()) {
            if (!(zzbszVar instanceof zzbqa)) {
                if (zzbszVar instanceof zzbqb) {
                    throw null;
                }
                zzbtxVar = new zzbtx(zzbszVar);
            } else {
                zzbtxVar = new zzbtx((zzbqa) zzbszVar);
            }
            throw zzbtxVar.zza();
        }
        return zzbszVar;
    }
}
