package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xhg {
    public final String a;
    public final Integer b;
    public final Integer c;

    public xhg(String str, Integer num, Integer num2) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhg)) {
            return false;
        }
        xhg xhgVar = (xhg) obj;
        if (Intrinsics.areEqual(this.a, xhgVar.a) && Intrinsics.areEqual(this.b, xhgVar.b) && Intrinsics.areEqual(this.c, xhgVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScannedCard(pan=");
        sb.append(this.a);
        sb.append(", expirationMonth=");
        sb.append(this.b);
        sb.append(", expirationYear=");
        return g.p(sb, this.c, ")");
    }
}
