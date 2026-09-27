package com.google.android.libraries.places.widget.internal.placedetails;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzcy {
    public static final zzcz zza(double d) {
        boolean z;
        boolean z2;
        int i = (int) d;
        if (i > 0 && i < 5) {
            double d2 = d - i;
            if (d2 >= ConstantsKt.UNSET && d2 < 0.25d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new zzcz(i, false);
            }
            if (d2 >= 0.25d && d2 < 0.75d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return new zzcz(i, true);
            }
            return new zzcz(i + 1, false);
        }
        if (i == 5) {
            return new zzcz(5, false);
        }
        return new zzcz(0, false);
    }
}
