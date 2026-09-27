package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum zzsz {
    WHITE(0, R.color.place_details_attribution_color_white),
    GRAY(1, R.color.place_details_attribution_color_gray),
    BLACK(2, R.color.place_details_attribution_color_black);

    private final int zzd;
    private final int zze;

    zzsz(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zze;
    }
}
