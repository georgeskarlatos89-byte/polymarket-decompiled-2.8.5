package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzsy {
    public static final int zza(Context context, int i) {
        int i2;
        context.getClass();
        zzsz zzszVar = zzsz.WHITE;
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        iArr.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        if ((obtainStyledAttributes.getResources().getConfiguration().uiMode & 48) == 32) {
            i2 = R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionDarkTheme;
        } else {
            i2 = R.styleable.PlacesMaterialThemeAttrs_placesColorAttributionLightTheme;
        }
        int i3 = obtainStyledAttributes.getInt(i2, -1);
        zzsz zzszVar2 = zzsz.WHITE;
        if (i3 != zzszVar2.zza()) {
            zzszVar2 = zzsz.GRAY;
            if (i3 != zzszVar2.zza()) {
                zzsz zzszVar3 = zzsz.BLACK;
                if (i3 == zzszVar3.zza()) {
                    zzszVar2 = zzszVar3;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return context.getColor(zzszVar2.zzb());
    }
}
