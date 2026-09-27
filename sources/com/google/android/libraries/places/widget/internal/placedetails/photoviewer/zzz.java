package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzz {
    private final Context zza;
    private final int zzb;

    public zzz(Context context, int i) {
        context.getClass();
        this.zza = context;
        this.zzb = i;
    }

    private final float zzc(int i, int i2) {
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        iArr.getClass();
        TypedArray obtainStyledAttributes = this.zza.obtainStyledAttributes(this.zzb, iArr);
        float dimension = obtainStyledAttributes.getDimension(i, r1.getResources().getDimensionPixelSize(i2));
        obtainStyledAttributes.recycle();
        return dimension;
    }

    public final float zza() {
        return zzc(R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, R.dimen.gmp_sys_measurement_spacing_medium);
    }

    public final float zzb() {
        return zzc(R.styleable.PlacesMaterialThemeAttrs_placesSpacingLarge, R.dimen.gmp_sys_measurement_spacing_large);
    }
}
