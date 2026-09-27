package com.google.android.libraries.places.internal;

import defpackage.brn;
import defpackage.ujb;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbfh {
    private static final zzbfh zza = new zzbfh(zzbff.PROCEED, null, null, null, null);
    private final zzbff zzb;
    private final ujb zzc;

    static {
        new zzbfh(zzbff.DELAY_START, null, null, null, null);
    }

    private zzbfh(zzbff zzbffVar, zzbfg zzbfgVar, zzbfc zzbfcVar, ujb ujbVar, zzbxa zzbxaVar) {
        zzbffVar.getClass();
        this.zzb = zzbffVar;
        this.zzc = ujbVar;
    }

    public static zzbfh zza() {
        return zza;
    }

    public static zzbfh zzb(ujb ujbVar) {
        ujbVar.getClass();
        return new zzbfh(zzbff.CONTINUE_AFTER, null, null, ujbVar, null);
    }

    public final zzbff zzc() {
        return this.zzb;
    }

    public final ujb zzd() {
        boolean z;
        if (this.zzb == zzbff.CONTINUE_AFTER) {
            z = true;
        } else {
            z = false;
        }
        brn.s(z);
        return this.zzc;
    }
}
