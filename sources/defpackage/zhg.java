package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zhg implements big {
    public final String a;
    public final Integer b;
    public final Integer c;

    public zhg(String str, Integer num, Integer num2) {
        str.getClass();
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // defpackage.big
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.big
    public final String b() {
        return this.a;
    }

    @Override // defpackage.big
    public final Integer c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhg)) {
            return false;
        }
        zhg zhgVar = (zhg) obj;
        if (Intrinsics.areEqual(this.a, zhgVar.a) && Intrinsics.areEqual(this.b, zhgVar.b) && Intrinsics.areEqual(this.c, zhgVar.c)) {
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
        StringBuilder sb = new StringBuilder("Unvalidated(cardNumber=");
        sb.append(this.a);
        sb.append(", expirationYear=");
        sb.append(this.b);
        sb.append(", expirationMonth=");
        return g.p(sb, this.c, ")");
    }
}
