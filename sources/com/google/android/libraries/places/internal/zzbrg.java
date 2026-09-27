package com.google.android.libraries.places.internal;

import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbrg {
    private final Object zza;
    private final int zzb;

    public zzbrg(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbrg)) {
            return false;
        }
        zzbrg zzbrgVar = (zzbrg) obj;
        if (this.zza != zzbrgVar.zza || this.zzb != zzbrgVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.zzb;
    }
}
