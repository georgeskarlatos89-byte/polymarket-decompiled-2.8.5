package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzaat {
    private final zzaal zza;

    private zzaat(zzaal zzaalVar) {
        this.zza = zzaalVar;
    }

    public static zzaat zza() {
        return new zzaat(zzzx.zzb(false));
    }

    public static Runnable zzb(zzaat zzaatVar, Runnable runnable) {
        zzaal zzaalVar = zzaatVar.zza;
        brn.m(zzaalVar, "Trying to propagate null trace");
        int i = zzaas.zza;
        runnable.getClass();
        return new zzaaq(zzaalVar, runnable);
    }

    public final String toString() {
        return this.zza.toString();
    }
}
