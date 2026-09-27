package com.google.android.libraries.places.internal;

import com.appsflyer.AppsFlyerProperties;
import defpackage.brn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzcsm {
    private final zzbxb zza;
    private final zzbxa zzb;

    public zzcsm(zzbxb zzbxbVar, zzbxa zzbxaVar) {
        brn.m(zzbxbVar, AppsFlyerProperties.CHANNEL);
        this.zza = zzbxbVar;
        brn.m(zzbxaVar, "callOptions");
        this.zzb = zzbxaVar;
    }

    public abstract zzcsm zza(zzbxb zzbxbVar, zzbxa zzbxaVar);

    public final zzbxb zzc() {
        return this.zza;
    }

    public final zzbxa zzd() {
        return this.zzb;
    }

    public final zzcsm zze(zzbxg... zzbxgVarArr) {
        return zza(zzbxi.zza(this.zza, Arrays.asList(zzbxgVarArr)), this.zzb);
    }
}
