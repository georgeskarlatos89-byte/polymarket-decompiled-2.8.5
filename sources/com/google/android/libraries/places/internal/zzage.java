package com.google.android.libraries.places.internal;

import defpackage.dmk;
import java.io.Closeable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzage implements Closeable {
    private static final ThreadLocal zza = new zzagd();
    private int zzb = 0;

    public static int zza() {
        return zzd().zzb;
    }

    public static zzage zzc() {
        zzage zzd = zzd();
        int i = zzd.zzb + 1;
        zzd.zzb = i;
        if (i != 0) {
            return zzd;
        }
        dmk.i("Overflow of RecursionDepth (possible error in core library)");
        return null;
    }

    private static zzage zzd() {
        return (zzage) zza.get();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.zzb;
        if (i > 0) {
            this.zzb = i - 1;
        } else {
            dmk.i("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }

    public final int zzb() {
        return this.zzb;
    }
}
