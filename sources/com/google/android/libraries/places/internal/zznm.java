package com.google.android.libraries.places.internal;

import defpackage.p23;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zznm {
    private final zzqk zza;

    public zznm(zzqk zzqkVar) {
        this.zza = zzqkVar;
    }

    public final zzqk zzc() {
        return this.zza;
    }

    public final p23 zzd() {
        return this.zza.getCancellationToken();
    }

    public abstract Map zze();

    public abstract String zzf();
}
