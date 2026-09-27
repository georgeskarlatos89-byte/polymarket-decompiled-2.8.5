package kotlin.text;

import defpackage.f05;
import defpackage.h3;
import defpackage.l3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class e extends StringsKt__StringNumberConversionsKt {
    public static String j(char[] cArr, int i, int i2) {
        h3 h3Var = l3.a;
        int length = cArr.length;
        h3Var.getClass();
        h3.a(i, i2, length);
        return new String(cArr, i, i2 - i);
    }

    public static String k(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }

    public static String l(byte[] bArr, int i, int i2) {
        h3 h3Var = l3.a;
        int length = bArr.length;
        h3Var.getClass();
        h3.a(0, i, length);
        return new String(bArr, 0, i, Charsets.UTF_8);
    }

    public static byte[] m(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }

    public static boolean n(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    public static boolean o(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static boolean p(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String q(int i, String str) {
        if (i >= 0) {
            if (i != 0) {
                int i2 = 1;
                if (i != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb = new StringBuilder(str.length() * i);
                            if (1 <= i) {
                                while (true) {
                                    sb.append((CharSequence) str);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            return sb.toString();
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i];
                        for (int i3 = 0; i3 < i; i3++) {
                            cArr[i3] = charAt;
                        }
                        return new String(cArr);
                    }
                    return "";
                }
                return str.toString();
            }
            return "";
        }
        f05.e(i, 46, "Count 'n' must be non-negative, but was ");
        return null;
    }

    public static String r(String str, char c, char c2) {
        str.getClass();
        String replace = str.replace(c, c2);
        replace.getClass();
        return replace;
    }

    public static String s(String str, String str2, String str3) {
        com.fingerprintjs.android.fpjs_pro.g.x(str, str2, str3);
        int v = StringsKt__StringsKt.v(0, str, str2, false);
        if (v < 0) {
            return str;
        }
        int length = str2.length();
        int i = 1;
        if (length >= 1) {
            i = length;
        }
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i2 = 0;
            do {
                sb.append((CharSequence) str, i2, v);
                sb.append(str3);
                i2 = v + length;
                if (v >= str.length()) {
                    break;
                }
                v = StringsKt__StringsKt.v(v + i, str, str2, false);
            } while (v > 0);
            sb.append((CharSequence) str, i2, str.length());
            return sb.toString();
        }
        throw new OutOfMemoryError();
    }

    public static boolean t(int i, String str, boolean z, String str2) {
        str.getClass();
        if (!z) {
            return str.startsWith(str2, i);
        }
        return p(str, i, str2, 0, str2.length(), z);
    }

    public static boolean u(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        if (!z) {
            return str.startsWith(str2);
        }
        return p(str, 0, str2, 0, str2.length(), z);
    }
}
