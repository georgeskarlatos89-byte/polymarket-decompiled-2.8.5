package com.google.android.libraries.places.internal;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzkl {
    private final Context zza;

    public zzkl(Context context) {
        this.zza = context;
    }

    private final void zzc(zzcas zzcasVar) {
        Context context = this.zza;
        String zza = zzql.zza(context.getPackageManager(), context.getPackageName());
        if (!TextUtils.isEmpty(zza)) {
            zzcan zzcanVar = zzcas.zza;
            zzcasVar.zzc(zzcao.zzc("X-Android-Package", zzcanVar), context.getPackageName());
            zzcasVar.zzc(zzcao.zzc("X-Places-Android-Sdk", zzcanVar), "5.3.0");
            zzcasVar.zzc(zzcao.zzc("X-Android-Cert", zzcanVar), zza);
        }
    }

    private static final void zzd(zzcas zzcasVar, String str) {
        if (!str.isEmpty()) {
            zzcasVar.zzc(zzcao.zzc("X-Goog-FieldMask", zzcas.zza), str);
        }
    }

    public final zzcas zza(String str, String str2) {
        zzcas zzcasVar = new zzcas();
        zzcasVar.zzc(zzcao.zzc("X-Goog-Api-Key", zzcas.zza), str);
        zzc(zzcasVar);
        zzd(zzcasVar, str2);
        return zzcasVar;
    }

    public final zzcas zzb(String str, String str2) {
        zzcas zzcasVar = new zzcas();
        zzcasVar.zzc(zzcao.zzc("Authorization", zzcas.zza), "Bearer ".concat(String.valueOf(str)));
        zzd(zzcasVar, str2);
        zzc(zzcasVar);
        return zzcasVar;
    }
}
