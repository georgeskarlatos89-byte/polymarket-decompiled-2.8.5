package com.google.android.libraries.places.internal;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzrr {
    public static int zza(int i, int i2, int i3) {
        if (zzb(i, i2, i3)) {
            return i3;
        }
        return i2;
    }

    public static boolean zzb(int i, int i2, int i3) {
        double zze = zze(i);
        double zzd = zzd(zze(i2), zze);
        if (zzd > 3.0d || zzd > zzd(zze(i3), zze)) {
            return false;
        }
        return true;
    }

    public static void zzc(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(rgb, PorterDuff.Mode.SRC_ATOP);
        mutate.setAlpha(Color.alpha(i));
    }

    private static double zzd(double d, double d2) {
        return Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d) / 100.0d;
    }

    private static double zze(int i) {
        return (zzf(Color.red(i) / 255.0d) * 0.2126d) + (zzf(Color.green(i) / 255.0d) * 0.7152d) + (zzf(Color.blue(i) / 255.0d) * 0.0722d);
    }

    private static double zzf(double d) {
        if (d <= 0.03928d) {
            return d / 12.92d;
        }
        return Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }
}
