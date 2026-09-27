package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.ace;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                dmk.s(ace.f(i2, "at index "));
                return null;
            }
        }
        return objArr;
    }
}
