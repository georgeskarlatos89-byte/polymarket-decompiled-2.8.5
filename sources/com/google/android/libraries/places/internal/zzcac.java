package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.nhn;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class zzcac extends zzbzp {
    private static final zzcbf zza = zzcbf.zza(new zzcab());

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(zzd(), "policy");
        b.g("priority", String.valueOf(5));
        b.c("available", true);
        return b.toString();
    }

    public abstract boolean zzb();

    public abstract int zzc();

    public abstract String zzd();

    public zzcbf zze(Map map) {
        return zza;
    }
}
