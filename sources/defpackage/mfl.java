package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class mfl {
    public static final HashSet c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder a;
    public boolean b = false;

    public mfl(StringBuilder sb) {
        this.a = sb;
    }

    public static int b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt != '\"' && charAt != '\\') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    public final void a(String str, Object obj) {
        boolean z = this.b;
        char c2 = ' ';
        StringBuilder sb = this.a;
        if (z) {
            sb.append(' ');
        } else {
            if (sb.length() > 0) {
                if (sb.length() > 1000 || sb.indexOf("\n") != -1) {
                    c2 = '\n';
                }
                sb.append(c2);
            }
            sb.append("[CONTEXT ");
            this.b = true;
        }
        sb.append(str);
        sb.append('=');
        if (obj == null) {
            sb.append(true);
            return;
        }
        if (c.contains(obj.getClass())) {
            sb.append(obj);
            return;
        }
        sb.append('\"');
        String obj2 = obj.toString();
        int i = 0;
        while (true) {
            int b = b(obj2, i);
            if (b != -1) {
                sb.append((CharSequence) obj2, i, b);
                i = b + 1;
                char charAt = obj2.charAt(b);
                if (charAt != '\t') {
                    if (charAt != '\n') {
                        if (charAt != '\r') {
                            if (charAt != '\"' && charAt != '\\') {
                                sb.append((char) 65533);
                            }
                        } else {
                            charAt = 'r';
                        }
                    } else {
                        charAt = 'n';
                    }
                } else {
                    charAt = 't';
                }
                sb.append("\\");
                sb.append(charAt);
            } else {
                sb.append((CharSequence) obj2, i, obj2.length());
                sb.append('\"');
                return;
            }
        }
    }
}
