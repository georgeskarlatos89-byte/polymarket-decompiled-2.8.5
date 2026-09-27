package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.ckn;
import defpackage.nhn;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzckp {
    private final zzckn zza;
    private final Map zzb;
    private final Map zzc;
    private final zzcnr zzd;
    private final Object zze;
    private final Map zzf;

    public zzckp(zzckn zzcknVar, Map map, Map map2, zzcnr zzcnrVar, Object obj, Map map3) {
        Map map4;
        this.zza = zzcknVar;
        this.zzb = Collections.unmodifiableMap(new HashMap(map));
        this.zzc = Collections.unmodifiableMap(new HashMap(map2));
        this.zzd = zzcnrVar;
        this.zze = obj;
        if (map3 != null) {
            map4 = Collections.unmodifiableMap(new HashMap(map3));
        } else {
            map4 = null;
        }
        this.zzf = map4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzckp.class == obj.getClass()) {
            zzckp zzckpVar = (zzckp) obj;
            if (ckn.a(this.zza, zzckpVar.zza) && ckn.a(this.zzb, zzckpVar.zzb) && ckn.a(this.zzc, zzckpVar.zzc) && ckn.a(this.zzd, zzckpVar.zzd) && ckn.a(this.zze, zzckpVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "defaultMethodConfig");
        b.f(this.zzb, "serviceMethodMap");
        b.f(this.zzc, "serviceMap");
        b.f(this.zzd, "retryThrottling");
        b.f(this.zze, "loadBalancingConfig");
        return b.toString();
    }

    public final Map zza() {
        return this.zzf;
    }

    public final zzbyz zzb() {
        if (this.zzc.isEmpty() && this.zzb.isEmpty() && this.zza == null) {
            return null;
        }
        return new zzcko(this, null);
    }

    public final Object zzc() {
        return this.zze;
    }

    public final zzcnr zzd() {
        return this.zzd;
    }

    public final zzckn zze(zzcax zzcaxVar) {
        zzckn zzcknVar = (zzckn) this.zzb.get(zzcaxVar.zzb());
        if (zzcknVar == null) {
            zzcknVar = (zzckn) this.zzc.get(zzcaxVar.zzc());
        }
        if (zzcknVar == null) {
            return this.zza;
        }
        return zzcknVar;
    }
}
