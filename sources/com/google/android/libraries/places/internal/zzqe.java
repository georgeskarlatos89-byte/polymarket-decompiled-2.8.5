package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import defpackage.brn;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzqe implements zzrc {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;
    private PlacesAppCheckTokenProvider zzd;

    @Override // com.google.android.libraries.places.internal.zzrc
    public final synchronized String zza() {
        brn.r("ApiConfig must be initialized.", zzd());
        this.zza.getClass();
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzrc
    public final synchronized Locale zzb() {
        Locale locale;
        try {
            brn.r("ApiConfig must be initialized.", zzd());
            if (this.zzb == null) {
                locale = Locale.getDefault();
            } else {
                locale = this.zzb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return locale;
    }

    public final synchronized void zzc(String str, Locale locale, boolean z) {
        brn.m(str, "API Key must not be null.");
        brn.g("API Key must not be empty.", !str.isEmpty());
        this.zza = str;
        this.zzb = locale;
        this.zzc = z;
    }

    public final synchronized boolean zzd() {
        if (this.zza != null) {
            return true;
        }
        return false;
    }

    public final void zze(PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        if (this.zzd == null) {
            this.zzd = placesAppCheckTokenProvider;
        }
    }

    public final synchronized void zzf() {
        this.zza = null;
        this.zzb = null;
        this.zzc = false;
        this.zzd = null;
    }

    public final boolean zzg() {
        return this.zzc;
    }

    public final PlacesAppCheckTokenProvider zzh() {
        brn.r("ApiConfig must be initialized.", zzd());
        return this.zzd;
    }
}
