package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h93 {
    public final Integer a;
    public final Integer b;
    public final r43 c;
    public final p5e d;

    public h93(Integer num, Integer num2, r43 r43Var, p5e p5eVar) {
        this.a = num;
        this.b = num2;
        this.c = r43Var;
        this.d = p5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93Var = (h93) obj;
        if (Intrinsics.areEqual(this.a, h93Var.a) && Intrinsics.areEqual(this.b, h93Var.b) && this.c == h93Var.c && Intrinsics.areEqual(this.d, h93Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        r43 r43Var = this.c;
        if (r43Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r43Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        p5e p5eVar = this.d;
        if (p5eVar != null) {
            i = p5eVar.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "CardUpdateParams(expiryMonth=" + this.a + ", expiryYear=" + this.b + ", cardBrand=" + this.c + ", billingDetails=" + this.d + ")";
    }
}
