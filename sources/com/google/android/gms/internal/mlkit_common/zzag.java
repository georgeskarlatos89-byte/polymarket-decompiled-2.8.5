package com.google.android.gms.internal.mlkit_common;

import defpackage.ix2;
import defpackage.m51;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzag {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzag(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(ix2.p(m51.r("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}
