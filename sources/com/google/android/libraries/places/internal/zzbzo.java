package com.google.android.libraries.places.internal;

import defpackage.af9;
import defpackage.brn;
import defpackage.nhn;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzo {
    private final List zza;
    private final zzbww zzb;
    private final Object[][] zzc;

    public /* synthetic */ zzbzo(List list, zzbww zzbwwVar, Object[][] objArr, byte[] bArr) {
        brn.m(list, "addresses are not set");
        this.zza = list;
        brn.m(zzbwwVar, "attrs");
        this.zzb = zzbwwVar;
        brn.m(objArr, "customOptions");
        this.zzc = objArr;
    }

    public static zzbzm zzd() {
        return new zzbzm();
    }

    public final String toString() {
        af9 b = nhn.b(this);
        b.f(this.zza, "addrs");
        b.f(this.zzb, "attrs");
        b.f(Arrays.deepToString(this.zzc), "customOptions");
        return b.toString();
    }

    public final List zza() {
        return this.zza;
    }

    public final zzbww zzb() {
        return this.zzb;
    }

    public final Object zzc(zzbzn zzbznVar) {
        brn.m(zzbznVar, "key");
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzc;
            if (i < objArr.length) {
                Object[] objArr2 = objArr[i];
                if (zzbznVar != objArr2[0]) {
                    i++;
                } else {
                    return objArr2[1];
                }
            } else {
                return zzbznVar.zzc();
            }
        }
    }
}
