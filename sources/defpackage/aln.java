package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class aln {
    public static final String a(String str) {
        str.getClass();
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            StringBuilder sb = new StringBuilder(str.length());
            sb.append(Character.toUpperCase(charAt));
            sb.append((CharSequence) str, 1, str.length());
            return sb.toString();
        }
        return str;
    }

    public static final boolean b(int i, String str) {
        char charAt = str.charAt(i);
        if ('A' <= charAt && charAt < '[') {
            return true;
        }
        return false;
    }

    public static final String c(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
