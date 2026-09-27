package com.google.android.gms.internal.mlkit_common;

import defpackage.dmk;
import defpackage.sv6;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            dmk.s(sv6.n("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        dmk.s("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
