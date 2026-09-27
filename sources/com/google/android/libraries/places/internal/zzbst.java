package com.google.android.libraries.places.internal;

import com.fingerprintjs.android.fpjs_pro.g;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbst {
    private final zzbss zza;

    private zzbst(zzbul zzbulVar, Object obj, zzbul zzbulVar2, Object obj2) {
        this.zza = new zzbss(zzbulVar, obj, zzbulVar2, obj2);
    }

    public static zzbst zza(zzbul zzbulVar, Object obj, zzbul zzbulVar2, Object obj2) {
        return new zzbst(zzbulVar, obj, zzbulVar2, obj2);
    }

    public static void zzb(zzbra zzbraVar, zzbss zzbssVar, Object obj, Object obj2) {
        zzbrm.zzi(zzbraVar, zzbssVar.zza, 1, obj);
        zzbrm.zzi(zzbraVar, zzbssVar.zzc, 2, obj2);
    }

    public static int zzc(zzbss zzbssVar, Object obj, Object obj2) {
        return zzbrm.zzk(zzbssVar.zza, 1, obj) + zzbrm.zzk(zzbssVar.zzc, 2, obj2);
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzbss zzbssVar = this.zza;
        int zzF = zzbra.zzF(i << 3);
        int zzc = zzc(zzbssVar, obj, obj2);
        return g.C(zzc, zzc, zzF);
    }

    public final zzbss zze() {
        return this.zza;
    }
}
