package com.google.android.libraries.places.internal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzn {
    private final String zza;
    private final Object zzb;

    private zzbzn(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zzbzn zza(String str) {
        return new zzbzn("internal:health-check-consumer-listener", null);
    }

    public static zzbzn zzb(String str, Object obj) {
        return new zzbzn("internal:disable-subchannel-reconnect", obj);
    }

    public final String toString() {
        return this.zza;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzb;
    }
}
