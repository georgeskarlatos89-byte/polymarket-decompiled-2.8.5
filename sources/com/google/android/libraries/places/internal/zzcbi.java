package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.util.Collections;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcbi {
    private zzccf zza = zzccf.zza(Collections.EMPTY_LIST);
    private final zzbww zzb = zzbww.zza;
    private zzcbf zzc;

    public final zzcbi zza(zzccf zzccfVar) {
        brn.m(zzccfVar, "StatusOr addresses cannot be null.");
        this.zza = zzccfVar;
        return this;
    }

    public final zzcbi zzb(zzcbf zzcbfVar) {
        this.zzc = zzcbfVar;
        return this;
    }

    public final zzcbj zzc() {
        return new zzcbj(this.zza, this.zzb, this.zzc);
    }
}
