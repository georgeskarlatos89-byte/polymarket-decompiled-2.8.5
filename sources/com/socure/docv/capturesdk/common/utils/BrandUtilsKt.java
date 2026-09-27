package com.socure.docv.capturesdk.common.utils;

import android.os.Build;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, d2 = {"isPixel9Device", "", "capturesdk_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrandUtilsKt {
    public static final boolean isPixel9Device() {
        String str = Build.DEVICE;
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String str2 = Build.MODEL;
        str2.getClass();
        String lowerCase2 = str2.toLowerCase(locale);
        lowerCase2.getClass();
        if (!e.u(lowerCase, "pixel 9", false) && !e.u(lowerCase2, "pixel 9", false) && !Intrinsics.areEqual(lowerCase, "tokay") && !Intrinsics.areEqual(lowerCase, "caiman")) {
            return false;
        }
        return true;
    }
}
