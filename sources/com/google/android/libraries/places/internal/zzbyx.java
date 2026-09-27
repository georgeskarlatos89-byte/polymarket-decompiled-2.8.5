package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbyx {
    private Object zza;

    public /* synthetic */ zzbyx(byte[] bArr) {
    }

    public final zzbyx zza(Object obj) {
        brn.m(obj, "config");
        this.zza = obj;
        return this;
    }

    public final zzbyy zzb() {
        boolean z;
        if (this.zza != null) {
            z = true;
        } else {
            z = false;
        }
        brn.r("config is not set", z);
        return new zzbyy(zzccd.zza, this.zza, null, null);
    }

    private zzbyx() {
        throw null;
    }
}
