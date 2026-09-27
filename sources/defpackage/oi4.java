package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class oi4 extends AssertionError {
    public String a;
    public String b;

    @Override // java.lang.Throwable
    public final String getMessage() {
        String substring;
        String concat;
        String concat2;
        String str = this.a;
        String str2 = this.b;
        String message = super.getMessage();
        if (str != null && str2 != null && !str.equals(str2)) {
            int min = Math.min(str.length(), str2.length());
            int i = 0;
            while (true) {
                if (i < min) {
                    if (str.charAt(i) != str2.charAt(i)) {
                        substring = str.substring(0, i);
                        break;
                    }
                    i++;
                } else {
                    substring = str.substring(0, min);
                    break;
                }
            }
            int min2 = Math.min(str.length() - substring.length(), str2.length() - substring.length()) - 1;
            int i2 = 0;
            while (i2 <= min2 && str.charAt((str.length() - 1) - i2) == str2.charAt((str2.length() - 1) - i2)) {
                i2++;
            }
            String substring2 = str.substring(str.length() - i2);
            if (substring.length() <= 20) {
                concat = substring;
            } else {
                concat = "...".concat(substring.substring(substring.length() - 20));
            }
            if (substring2.length() <= 20) {
                concat2 = substring2;
            } else {
                concat2 = substring2.substring(0, 20).concat("...");
            }
            StringBuilder sb = new StringBuilder(concat);
            sb.append("[" + str.substring(substring.length(), str.length() - substring2.length()) + "]");
            sb.append(concat2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(concat);
            sb3.append("[" + str2.substring(substring.length(), str2.length() - substring2.length()) + "]");
            sb3.append(concat2);
            return ofn.l(sb2, sb3.toString(), message);
        }
        return ofn.l(str, str2, message);
    }
}
