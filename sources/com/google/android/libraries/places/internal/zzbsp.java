package com.google.android.libraries.places.internal;

import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzbsp {
    public static final List zza(Object obj, long j) {
        int i;
        zzbsg zzbsgVar = (zzbsg) zzbuf.zzl(obj, j);
        if (!zzbsgVar.zza()) {
            int size = zzbsgVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzbsg zzg = zzbsgVar.zzg(i);
            zzbuf.zzm(obj, j, zzg);
            return zzg;
        }
        return zzbsgVar;
    }
}
