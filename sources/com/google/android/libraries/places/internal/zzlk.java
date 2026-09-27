package com.google.android.libraries.places.internal;

import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzlk {
    public static String zza(Locale locale) {
        String country = locale.getCountry();
        if (country.length() == 2) {
            char charAt = country.charAt(0);
            char charAt2 = country.charAt(1);
            if (Character.isLetter(charAt) && Character.isLetter(charAt2)) {
                return country;
            }
            return "";
        }
        return "";
    }
}
