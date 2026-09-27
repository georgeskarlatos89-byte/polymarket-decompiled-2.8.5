package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.dmk;
import defpackage.woa;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzi {
    public static void zza(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            dmk.s(woa.o("null value in entry: ", obj, "=null"));
        } else {
            Objects.toString(obj2);
            dmk.s("null key in entry: null=".concat(String.valueOf(obj2)));
        }
    }
}
