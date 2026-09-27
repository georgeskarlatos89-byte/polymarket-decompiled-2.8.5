package defpackage;

import java.util.Locale;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class m59 {
    public final String a;
    public final String b;

    public m59(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m59) {
            m59 m59Var = (m59) obj;
            if (e.o(m59Var.a, this.a, true) && e.o(m59Var.b, this.b, true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.a.toLowerCase(locale);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.b.toLowerCase(locale);
        lowerCase2.getClass();
        return lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        return woa.r(sb, this.b, ", escapeValue=false)");
    }
}
