package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.nhn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcbf {
    private final zzccd zza;
    private final Object zzb;

    private zzcbf(zzccd zzccdVar) {
        this.zzb = null;
        brn.m(zzccdVar, "status");
        this.zza = zzccdVar;
        brn.e(zzccdVar, "cannot use OK status: %s", !zzccdVar.zzj());
    }

    public static zzcbf zza(Object obj) {
        return new zzcbf(obj);
    }

    public static zzcbf zzb(zzccd zzccdVar) {
        return new zzcbf(zzccdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcbf.class == obj.getClass()) {
            zzcbf zzcbfVar = (zzcbf) obj;
            if (ckn.a(this.zza, zzcbfVar.zza) && ckn.a(this.zzb, zzcbfVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj != null) {
            af9 b = nhn.b(this);
            b.f(obj, "config");
            return b.toString();
        }
        af9 b2 = nhn.b(this);
        b2.f(this.zza, "error");
        return b2.toString();
    }

    public final Object zzc() {
        return this.zzb;
    }

    public final zzccd zzd() {
        return this.zza;
    }

    private zzcbf(Object obj) {
        brn.m(obj, "config");
        this.zzb = obj;
        this.zza = null;
    }
}
