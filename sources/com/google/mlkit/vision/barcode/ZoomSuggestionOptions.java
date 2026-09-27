package com.google.mlkit.vision.barcode;

import defpackage.dkn;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class ZoomSuggestionOptions {
    private final ZoomCallback zza;
    private final float zzb;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private final ZoomCallback zza;
        private float zzb;

        public Builder(ZoomCallback zoomCallback) {
            this.zza = zoomCallback;
        }

        public ZoomSuggestionOptions build() {
            return new ZoomSuggestionOptions(this.zza, this.zzb, null);
        }

        public Builder setMaxSupportedZoomRatio(float f) {
            this.zzb = f;
            return this;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public interface ZoomCallback {
        boolean setZoom(float f);
    }

    public /* synthetic */ ZoomSuggestionOptions(ZoomCallback zoomCallback, float f, zzb zzbVar) {
        this.zza = zoomCallback;
        this.zzb = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoomSuggestionOptions)) {
            return false;
        }
        ZoomSuggestionOptions zoomSuggestionOptions = (ZoomSuggestionOptions) obj;
        if (dkn.b(this.zza, zoomSuggestionOptions.zza) && this.zzb == zoomSuggestionOptions.zzb) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Float.valueOf(this.zzb)});
    }

    public final float zza() {
        return this.zzb;
    }

    public final ZoomCallback zzb() {
        return this.zza;
    }
}
