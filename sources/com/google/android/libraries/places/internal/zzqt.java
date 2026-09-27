package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzqt {
    public static zzqr zzd(Context context) {
        String packageName = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzqp zzqpVar = new zzqp();
        zzqpVar.zza(packageName);
        zzqpVar.zzb(i);
        zzqpVar.zzc(zzqs.PROGRAMMATIC_API);
        return zzqpVar;
    }

    public abstract String zza();

    public abstract int zzb();

    public abstract zzqs zzc();
}
