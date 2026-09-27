package com.google.android.libraries.places.internal;

import defpackage.brn;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbwz {
    private final String zza;
    private final Object zzb;

    private zzbwz(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zzbwz zza(String str) {
        brn.m(str, "debugString");
        return new zzbwz(str, null);
    }

    public static zzbwz zzb(String str, Object obj) {
        return new zzbwz("io.grpc.Grpc.CALL_OPTION_CUSTOM_LABEL", "");
    }

    public final String toString() {
        return this.zza;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzb;
    }
}
