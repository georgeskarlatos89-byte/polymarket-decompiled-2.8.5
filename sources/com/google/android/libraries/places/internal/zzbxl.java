package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.nhn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbxl {
    private final zzbxa zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzbxl(zzbxa zzbxaVar, int i, boolean z, boolean z2) {
        brn.m(zzbxaVar, "callOptions");
        this.zza = zzbxaVar;
        this.zzb = i;
        this.zzc = z;
        this.zzd = z2;
    }

    public static zzbxk zza() {
        return new zzbxk();
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "callOptions");
        b.g("previousAttempts", String.valueOf(this.zzb));
        b.c("isTransparentRetry", this.zzc);
        b.c("isHedging", this.zzd);
        return b.toString();
    }
}
