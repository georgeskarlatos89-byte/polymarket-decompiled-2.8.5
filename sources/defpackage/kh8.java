package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kh8 {
    public final ki8 a;
    public final pi8 b;
    public final int c;
    public final Integer d;
    public final Integer e;

    public kh8(ki8 ki8Var, pi8 pi8Var, int i, Integer num, Integer num2) {
        ki8Var.getClass();
        pi8Var.getClass();
        this.a = ki8Var;
        this.b = pi8Var;
        this.c = i;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh8)) {
            return false;
        }
        kh8 kh8Var = (kh8) obj;
        if (this.a == kh8Var.a && this.b == kh8Var.b && this.c == kh8Var.c && Intrinsics.areEqual(this.d, kh8Var.d) && Intrinsics.areEqual(this.e, kh8Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = woa.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Font(fontStyle=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontSize=");
        sb.append(this.c);
        sb.append(", lineHeight=");
        sb.append(this.d);
        sb.append(", letterSpacing=");
        return g.p(sb, this.e, ")");
    }
}
