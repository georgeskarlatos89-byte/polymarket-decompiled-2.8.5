package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzagh {
    public static final /* synthetic */ int zza = 0;
    private static final zzabm zzb;

    static {
        zzabp zza2 = zzabq.zza();
        zza2.zza('\"', "&quot;");
        zza2.zza('\'', "&#39;");
        zza2.zza('&', "&amp;");
        zza2.zza('<', "&lt;");
        zza2.zza('>', "&gt;");
        zzb = zza2.zzb();
    }

    public static String zza(String str) {
        return zzb.zza(str);
    }
}
