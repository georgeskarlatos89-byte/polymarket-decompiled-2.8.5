package com.google.android.libraries.places.internal;

import defpackage.brn;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzbzm {
    private static final Object[][] zza = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    private List zzb;
    private final zzbww zzc = zzbww.zza;
    private Object[][] zzd = zza;

    public final zzbzm zza(zzbzn zzbznVar, Object obj) {
        Object[][] objArr;
        brn.m(zzbznVar, "key");
        brn.m(obj, "value");
        int i = 0;
        while (true) {
            objArr = this.zzd;
            if (i < objArr.length) {
                if (zzbznVar == objArr[i][0]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            int length = objArr.length;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + 1, 2);
            System.arraycopy(objArr, 0, objArr2, 0, length);
            this.zzd = objArr2;
            i = objArr2.length - 1;
            objArr = objArr2;
        }
        objArr[i] = new Object[]{zzbznVar, obj};
        return this;
    }

    public final zzbzm zzb(List list) {
        brn.g("addrs is empty", !list.isEmpty());
        this.zzb = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public final zzbzo zzc() {
        return new zzbzo(this.zzb, this.zzc, this.zzd, null);
    }
}
