package com.google.android.libraries.places.internal;

import defpackage.b7h;
import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzaad extends zzaae {
    static final zzaae zza;

    static {
        zzaae zzb = new zzaad(null, new b7h(0)).zzb();
        zza = zzb;
        zzaad zzaadVar = new zzaad(zzb, new b7h(), null);
        boolean z = !zzaadVar.zzh();
        Boolean bool = Boolean.TRUE;
        brn.r("Can't mutate after handing to trace", z);
        zzaac zzf = zzaae.zzf();
        brn.r("Key already present", !zzaadVar.zzd(zzf));
        zzaadVar.zzg().put(zzf, bool);
        zzaadVar.zzb();
    }

    private zzaad(zzaae zzaaeVar, b7h b7hVar) {
        super(null, b7hVar, null);
    }

    public /* synthetic */ zzaad(zzaae zzaaeVar, b7h b7hVar, byte[] bArr) {
        super(zzaaeVar, b7hVar, null);
    }
}
