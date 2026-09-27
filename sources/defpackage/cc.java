package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cc {
    public final List a;
    public final float b;
    public final float c;

    public cc(List list, float f, float f2) {
        list.getClass();
        this.a = list;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cc) {
                cc ccVar = (cc) obj;
                if (!Intrinsics.areEqual(this.a, ccVar.a) || !hy6.c(this.b, ccVar.b) || !hy6.c(this.c, ccVar.c) || !hy6.c(12.0f, 12.0f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(12.0f) + sv6.a(sv6.a(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        String d = hy6.d(this.b);
        String d2 = hy6.d(this.c);
        String d3 = hy6.d(12.0f);
        StringBuilder sb = new StringBuilder("AddPaymentMethodInitialVisibilityTrackerData(paymentMethodCodes=");
        sb.append(this.a);
        sb.append(", tabWidth=");
        sb.append(d);
        sb.append(", screenWidth=");
        return sv6.p(sb, d2, ", innerPadding=", d3, ")");
    }
}
