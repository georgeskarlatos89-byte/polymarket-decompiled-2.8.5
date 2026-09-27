package com.google.android.libraries.places.internal;

import io.ably.lib.transport.Defaults;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzpd implements zzbwm {
    public static zzpd zza() {
        return zzpc.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzctp
    public final /* synthetic */ Object zzb() {
        zzcpt zzf = zzcpt.zzf("mapsmobilesdks-pa.googleapis.com", Defaults.TLS_PORT);
        zzf.zzg();
        Optional empty = Optional.empty();
        zzcas zzcasVar = new zzcas();
        zzcasVar.zzc(zzcao.zzc("X-Goog-Api-Key", zzcas.zza), (String) empty.orElse("AIzaSyDgmW4ZMvNblSXqMOgsbY8uRrTnfR3E7pY"));
        zzf.zzb(zzcsy.zza(zzcasVar));
        zzf.zzd(5L, TimeUnit.MINUTES);
        return zzf.zze();
    }
}
