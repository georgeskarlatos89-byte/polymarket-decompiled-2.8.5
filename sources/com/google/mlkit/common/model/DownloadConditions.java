package com.google.mlkit.common.model;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class DownloadConditions {
    private final boolean zza;
    private final boolean zzb;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private boolean zza = false;
        private boolean zzb = false;

        public DownloadConditions build() {
            return new DownloadConditions(this.zza, this.zzb, null);
        }

        public Builder requireCharging() {
            this.zza = true;
            return this;
        }

        public Builder requireWifi() {
            this.zzb = true;
            return this;
        }
    }

    public /* synthetic */ DownloadConditions(boolean z, boolean z2, zzb zzbVar) {
        this.zza = z;
        this.zzb = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        if (this.zza == downloadConditions.zza && this.zzb == downloadConditions.zzb) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb)});
    }

    public boolean isChargingRequired() {
        return this.zza;
    }

    public boolean isWifiRequired() {
        return this.zzb;
    }
}
