package com.google.android.libraries.places.internal;

import io.sentry.android.core.m0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzaer extends zzadq {
    private final String zza;

    public zzaer(String str) {
        this.zza = str;
    }

    @Override // com.google.android.libraries.places.internal.zzadq
    public String zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzadq
    public void zzd(RuntimeException runtimeException, zzado zzadoVar) {
        m0.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
