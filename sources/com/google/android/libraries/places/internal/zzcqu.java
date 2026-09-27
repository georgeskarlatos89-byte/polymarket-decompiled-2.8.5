package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzcqu {
    static {
        Logger.getLogger(zzcqu.class.getName());
    }

    private zzcqu() {
    }

    public static zzcas zza(List list) {
        return zzbzh.zzb(zzc(list));
    }

    public static zzcas zzb(List list) {
        return zzbzh.zzb(zzc(list));
    }

    private static byte[][] zzc(List list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zzcrp zzcrpVar = (zzcrp) it.next();
            bArr[i] = zzcrpVar.zzf.s();
            bArr[i + 1] = zzcrpVar.zzg.s();
            i += 2;
        }
        return zzcou.zzb(bArr);
    }
}
