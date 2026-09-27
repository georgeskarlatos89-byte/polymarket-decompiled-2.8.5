package com.google.android.libraries.places.internal;

import defpackage.ckn;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbww {
    public static final zzbww zza;
    private static final IdentityHashMap zzc;
    private final IdentityHashMap zzb;

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        zzc = identityHashMap;
        zza = new zzbww(identityHashMap);
    }

    private zzbww(IdentityHashMap identityHashMap) {
        this.zzb = identityHashMap;
    }

    public static zzbwu zzb() {
        return new zzbwu(zza, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbww.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = this.zzb;
        IdentityHashMap identityHashMap2 = ((zzbww) obj).zzb;
        if (identityHashMap.size() != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !ckn.a(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.zzb.entrySet()) {
            i += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return i;
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Object zza(zzbwv zzbwvVar) {
        return this.zzb.get(zzbwvVar);
    }

    public final zzbwu zzc() {
        return new zzbwu(this, null);
    }

    public final /* synthetic */ IdentityHashMap zzd() {
        return this.zzb;
    }

    public /* synthetic */ zzbww(IdentityHashMap identityHashMap, byte[] bArr) {
        this.zzb = identityHashMap;
    }
}
