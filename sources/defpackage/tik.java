package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tik {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final svd a = new svd();
    public final StringBuilder b = new StringBuilder();

    public static String a(svd svdVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = svdVar.b;
        int i2 = svdVar.c;
        while (i < i2 && !z) {
            char c2 = (char) svdVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        svdVar.G(i - svdVar.b);
        return sb.toString();
    }

    public static String b(svd svdVar, StringBuilder sb) {
        c(svdVar);
        if (svdVar.a() == 0) {
            return null;
        }
        String a = a(svdVar, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) svdVar.t());
    }

    public static void c(svd svdVar) {
        while (true) {
            for (boolean z = true; svdVar.a() > 0 && z; z = false) {
                int i = svdVar.b;
                byte[] bArr = svdVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = svdVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            svdVar.G(i2 - svdVar.b);
                        }
                    }
                } else {
                    svdVar.G(1);
                }
            }
            return;
        }
    }
}
