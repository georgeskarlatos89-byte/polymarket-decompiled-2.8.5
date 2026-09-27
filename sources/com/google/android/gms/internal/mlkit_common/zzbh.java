package com.google.android.gms.internal.mlkit_common;

import defpackage.dfd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbh {
    private final Map zza;
    private final Map zzb;
    private final dfd zzc;

    public zzbh(Map map, Map map2, dfd dfdVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = dfdVar;
    }

    public final byte[] zza(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new zzbe(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
