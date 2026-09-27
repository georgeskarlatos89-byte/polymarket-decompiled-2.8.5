package com.google.android.libraries.places.internal;

import android.content.Context;
import defpackage.brn;
import defpackage.mr9;
import defpackage.vt1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzrd {
    private final Context zza;

    public zzrd(Context context) {
        brn.m(context, "Context must not be null.");
        this.zza = context;
    }

    public final mr9 zza() {
        Context context = this.zza;
        String packageName = context.getPackageName();
        String zza = zzql.zza(context.getPackageManager(), packageName);
        vt1 a = mr9.a();
        if (packageName != null) {
            a.w("X-Android-Package", packageName);
        }
        if (zza != null) {
            a.w("X-Android-Cert", zza);
        }
        return a.f(true);
    }
}
