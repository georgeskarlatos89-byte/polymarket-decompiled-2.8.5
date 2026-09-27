package defpackage;

import java.util.Locale;
import kotlin.text.Regex;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class p1i {
    public static final Regex a = new Regex("_[a-zA-Z]");
    public static final Regex b = new Regex("(?<=[a-zA-Z])[A-Z]");

    public static final String a(String str) {
        str.getClass();
        String valueOf = String.valueOf(str.charAt(0));
        valueOf.getClass();
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return sv6.n("get", upperCase, str.substring(1));
    }
}
