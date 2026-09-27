package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
abstract class zzzs extends zzzn {
    private final zzaae zza;

    public zzzs(String str, UUID uuid, String str2, zzaae zzaaeVar, zzaaj zzaajVar) {
        super("<skip trace>", uuid, str2, zzaajVar);
        brn.h(zzaaeVar.zze());
        this.zza = zzaaeVar;
    }

    @Override // com.google.android.libraries.places.internal.zzaal
    public final zzaae zzg() {
        return zzaae.zza(this.zza, zzj());
    }
}
