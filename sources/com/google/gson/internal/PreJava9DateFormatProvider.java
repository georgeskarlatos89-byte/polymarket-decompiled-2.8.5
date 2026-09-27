package com.google.gson.internal;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.ace;
import defpackage.dmk;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    private static String getDatePartOfDateTimePattern(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    dmk.v(ace.f(i, "Unknown DateFormat style: "));
                    return null;
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String getTimePartOfDateTimePattern(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "h:mm a";
                }
                dmk.v(ace.f(i, "Unknown DateFormat style: "));
                return null;
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat getUsDateTimeFormat(int i, int i2) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i) + ApiConstant.SPACE + getTimePartOfDateTimePattern(i2), Locale.US);
    }
}
