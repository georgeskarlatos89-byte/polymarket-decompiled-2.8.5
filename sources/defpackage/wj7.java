package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class wj7 {
    public static final Pattern a = Pattern.compile("[\\\\&]");
    public static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern c;
    public static final dmk d;

    /* JADX WARN: Type inference failed for: r0v7, types: [dmk, java.lang.Object] */
    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        c = Pattern.compile("[ \t\r\n]+");
        d = new Object();
    }

    public static String a(String str) {
        String trim = str.trim();
        Locale locale = Locale.ROOT;
        return c.matcher(trim.toLowerCase(locale).toUpperCase(locale)).replaceAll(ApiConstant.SPACE);
    }

    public static String b(String str) {
        if (a.matcher(str).find()) {
            Matcher matcher = b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb = new StringBuilder(str.length() + 16);
                int i = 0;
                do {
                    sb.append((CharSequence) str, i, matcher.start());
                    String group = matcher.group();
                    d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb.append((CharSequence) group, 1, group.length());
                    } else {
                        sb.append(od9.a(group));
                    }
                    i = matcher.end();
                } while (matcher.find());
                if (i != str.length()) {
                    sb.append((CharSequence) str, i, str.length());
                }
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
