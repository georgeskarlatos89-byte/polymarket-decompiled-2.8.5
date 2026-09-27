package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzagc {
    public static Object zza(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        dmk.s(str.concat(" must not be null"));
        return null;
    }

    public static void zzb(boolean z, String str) {
        if (z) {
            return;
        }
        dmk.v(str);
    }

    public static void zzc(boolean z, String str) {
        if (z) {
            return;
        }
        dmk.n(str);
    }

    public static String zzd(String str) {
        if (zze(str.charAt(0))) {
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!zze(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    dmk.v("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                    return null;
                }
            }
            return str;
        }
        dmk.v("identifier must start with an ASCII letter: ".concat(str));
        return null;
    }

    private static boolean zze(char c) {
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }
}
