package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.ckn;
import defpackage.dmk;
import defpackage.nhn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzccf {
    private final zzccd zza;
    private final Object zzb;

    private zzccf(zzccd zzccdVar, Object obj) {
        this.zza = zzccdVar;
        this.zzb = obj;
    }

    public static zzccf zza(Object obj) {
        return new zzccf(null, obj);
    }

    public static zzccf zzb(zzccd zzccdVar) {
        brn.m(zzccdVar, "status");
        zzccf zzccfVar = new zzccf(zzccdVar, null);
        brn.e(zzccdVar, "cannot use OK status: %s", !zzccdVar.zzj());
        return zzccfVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzccf) {
            zzccf zzccfVar = (zzccf) obj;
            if (zzc() == zzccfVar.zzc()) {
                if (zzc()) {
                    return ckn.a(this.zzb, zzccfVar.zzb);
                }
                return ckn.a(this.zza, zzccfVar.zza);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        zzccd zzccdVar = this.zza;
        af9 b = nhn.b(this);
        if (zzccdVar == null) {
            b.f(this.zzb, "value");
        } else {
            b.f(zzccdVar, "error");
        }
        return b.toString();
    }

    public final boolean zzc() {
        if (this.zza == null) {
            return true;
        }
        return false;
    }

    public final Object zzd() {
        if (this.zza == null) {
            return this.zzb;
        }
        dmk.n("No value present.");
        return null;
    }

    public final zzccd zze() {
        zzccd zzccdVar = this.zza;
        if (zzccdVar == null) {
            return zzccd.zza;
        }
        return zzccdVar;
    }
}
