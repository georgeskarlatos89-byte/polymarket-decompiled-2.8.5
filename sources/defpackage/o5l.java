package defpackage;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class o5l {
    public static final pf5 b = new Object();
    public static final pf5 c = new Object();
    public static final pf5 d = new Object();
    public static final pf5 e = new Object();
    public static final pf5 f = new Object();
    public final /* synthetic */ int a = 3;

    public static cs7 a(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && !CharsKt.c(charAt) && charAt != '/') {
                return cs7.g;
            }
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt2 = str.charAt(i2);
            if (Character.isDigit(charAt2)) {
                sb.append(charAt2);
            }
        }
        String sb2 = sb.toString();
        return new cs7(r2i.H(2, sb2), r2i.C(2, sb2));
    }

    public int hashCode() {
        switch (this.a) {
            case 3:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                String simpleName = lvf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
                simpleName.getClass();
                return simpleName;
            default:
                return super.toString();
        }
    }
}
