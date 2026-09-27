package com.google.android.libraries.places.internal;

import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzagb {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzagf zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.libraries.places.internal.zzagf] */
    static {
        zzagg zzaggVar;
        int i = 0;
        while (true) {
            if (i < 2) {
                zzaggVar = null;
                try {
                    zzaggVar = (zzagf) Class.forName(zza[i]).asSubclass(zzagf.class).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                }
                if (zzaggVar != null) {
                    break;
                } else {
                    i++;
                }
            } else {
                zzaggVar = new zzagg();
                break;
            }
        }
        zzb = zzaggVar;
    }

    public static StackTraceElement zza(Class cls, int i) {
        zzagc.zza(cls, "target");
        return zzb.zza(cls, 2);
    }

    public static StackTraceElement[] zzb(Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            dmk.v("invalid maximum depth: 0");
            return null;
        }
        return zzb.zzb(cls, i, 2);
    }
}
