package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbfa {
    private final Object zza;
    private final LinkedHashMap zzb;
    private int zzc;

    public zzbfa(zzbfb zzbfbVar, Object obj, int i) {
        Objects.requireNonNull(zzbfbVar);
        this.zzb = new LinkedHashMap();
        this.zza = obj;
        this.zzc = i;
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }

    public final boolean zzb() {
        if (this.zzb.isEmpty() && this.zzc == 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    public final /* synthetic */ int zzd() {
        return this.zzc;
    }

    public final /* synthetic */ void zze(int i) {
        this.zzc = i;
    }
}
