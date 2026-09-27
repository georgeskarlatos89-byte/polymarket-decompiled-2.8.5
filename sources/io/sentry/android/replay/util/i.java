package io.sentry.android.replay.util;

import android.os.Build;
import defpackage.dmk;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class i {
    public static String a(g gVar) {
        String str;
        gVar.getClass();
        int i = h.a[gVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = Build.SOC_MANUFACTURER;
            } else {
                dmk.a();
                return null;
            }
        } else {
            str = Build.SOC_MODEL;
        }
        str.getClass();
        return str;
    }
}
