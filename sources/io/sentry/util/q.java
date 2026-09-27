package io.sentry.util;

import defpackage.woa;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class q {
    public static final Charset a = StandardCharsets.UTF_8;
    public static final Pattern b = Pattern.compile("[\\W_]+");

    public static String a(String str) {
        if (str != null && !str.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            Locale locale = Locale.ROOT;
            sb.append(substring.toUpperCase(locale));
            sb.append(str.substring(1).toLowerCase(locale));
            return sb.toString();
        }
        return str;
    }

    public static String b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            sb.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb.append((CharSequence) ",");
                sb.append((CharSequence) it.next());
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        if (str != null && str.startsWith("\"") && str.endsWith("\"")) {
            return woa.k(1, 1, str);
        }
        return str;
    }
}
