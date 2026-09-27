package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class acd {
    public static bcd a(String str) {
        String str2;
        Map b = bcd.b();
        Object obj = null;
        if (str != null) {
            Locale locale = Locale.US;
            locale.getClass();
            str2 = str.toLowerCase(locale);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Object obj2 = b.get(str2);
        if (obj2 != null) {
            obj = obj2;
        }
        return (bcd) obj;
    }
}
