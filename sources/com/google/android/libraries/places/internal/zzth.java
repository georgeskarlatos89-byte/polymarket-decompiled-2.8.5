package com.google.android.libraries.places.internal;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.libraries.places.R;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzth {
    public static final /* synthetic */ int zza = 0;
    private static final int zzb = R.style.PlacesMaterialTheme;
    private static final int[] zzc = {R.attr.placesColorSurface, R.attr.placesColorOutlineDecorative, R.attr.placesColorPrimary, R.attr.placesColorOnSurface, R.attr.placesColorOnSurfaceVariant, R.attr.placesColorSecondaryContainer, R.attr.placesColorOnSecondaryContainer, R.attr.placesColorNeutralContainer, R.attr.placesColorOnNeutralContainer, R.attr.placesColorOnNeutralContainerVariant, R.attr.placesColorPositiveContainer, R.attr.placesColorOnPositiveContainer, R.attr.placesColorPositive, R.attr.placesColorNegative, R.attr.placesColorInfo, R.attr.placesColorButtonBorder, R.attr.placesColorButtonPrimaryBorder, R.attr.placesColorPrimaryContainer, R.attr.placesColorOnPrimaryContainer, R.attr.placesColorStarRating, R.attr.placesColorDisabledSurface};
    private static final int[] zzd = {R.attr.placesTextAppearanceBodySmall, R.attr.placesTextAppearanceBodyMedium, R.attr.placesTextAppearanceLabelMedium, R.attr.placesTextAppearanceLabelLarge, R.attr.placesTextAppearanceHeadlineMedium, R.attr.placesTextAppearanceDisplaySmall, R.attr.placesTextAppearanceTitleSmall, R.attr.placesTextAppearanceTitleMedium, R.attr.placesTextAppearanceTitleLarge};
    private static final int[] zze = {R.attr.placesSpacingExtraSmall, R.attr.placesSpacingSmall, R.attr.placesSpacingMedium, R.attr.placesSpacingLarge, R.attr.placesSpacingExtraLarge, R.attr.placesSpacingTwoExtraLarge};
    private static final int[] zzf = {R.attr.placesBorderWidth, R.attr.placesBorderWidthButton, R.attr.placesBorderWidthButtonPrimary};
    private static final int[] zzg = {R.attr.placesCornerRadius, R.attr.placesCornerRadiusButton, R.attr.placesCornerRadiusButtonPrimary, R.attr.placesCornerRadiusThumbnail, R.attr.placesCornerRadiusCollageOuter, R.attr.placesCornerRadiusCard, R.attr.placesCornerRadiusDialog};
    private static final int[] zzh = {R.attr.placesColorAttributionLightTheme, R.attr.placesColorAttributionDarkTheme};

    public static final boolean zza(Context context, int i) {
        context.getClass();
        return zzg(context, i, zzh);
    }

    public static final boolean zzb(Context context, int i) {
        context.getClass();
        return zzg(context, i, zzc);
    }

    public static final boolean zzc(Context context, int i) {
        context.getClass();
        return zzg(context, i, zzf);
    }

    public static final boolean zzd(Context context, int i) {
        context.getClass();
        return zzg(context, i, zzg);
    }

    public static final boolean zze(Context context, int i) {
        context.getClass();
        return zzg(context, i, zze);
    }

    public static final boolean zzf(Context context, int i) {
        context.getClass();
        return zzg(context, i, zzd);
    }

    private static final boolean zzg(Context context, int i, int[] iArr) {
        int i2 = zzb;
        if (i == i2) {
            return false;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, i);
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        for (int i3 : iArr) {
            contextThemeWrapper.getTheme().resolveAttribute(i3, typedValue, true);
            if (!contextThemeWrapper2.getTheme().resolveAttribute(i3, typedValue2, true)) {
                return false;
            }
            if (typedValue.data != typedValue2.data) {
                return true;
            }
        }
        return false;
    }
}
