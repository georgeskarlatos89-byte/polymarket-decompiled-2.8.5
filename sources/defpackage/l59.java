package defpackage;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class l59 {
    public final String a;
    public final List b;
    public final double c;

    public l59(String str, List list) {
        Double d;
        Object obj;
        String str2;
        Double g;
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((m59) obj).a, "q")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        m59 m59Var = (m59) obj;
        double d2 = 1.0d;
        if (m59Var != null && (str2 = m59Var.b) != null && (g = d.g(str2)) != null) {
            double doubleValue = g.doubleValue();
            if (ConstantsKt.UNSET <= doubleValue && doubleValue <= 1.0d) {
                d = g;
            }
            if (d != null) {
                d2 = d.doubleValue();
            }
        }
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l59)) {
            return false;
        }
        l59 l59Var = (l59) obj;
        if (Intrinsics.areEqual(this.a, l59Var.a) && Intrinsics.areEqual(this.b, l59Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValue(value=");
        sb.append(this.a);
        sb.append(", params=");
        return sv6.r(sb, this.b, ')');
    }
}
