package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbwn implements zzbwm {
    private static final zzbwn zza = new zzbwn(null);
    private final Object zzb;

    private zzbwn(Object obj) {
        this.zzb = obj;
    }

    public static zzbwm zza(Object obj) {
        if (obj != null) {
            return new zzbwn(obj);
        }
        dmk.s("instance cannot be null");
        return null;
    }

    public static zzbwm zzc(Object obj) {
        if (obj == null) {
            return zza;
        }
        return new zzbwn(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final Object zzb() {
        return this.zzb;
    }
}
