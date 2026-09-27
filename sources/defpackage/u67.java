package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class u67 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final r43 d;
    public final String e;
    public final Set f;
    public final p5e g;

    public u67(String str, Integer num, Integer num2, r43 r43Var, String str2, Set set, p5e p5eVar) {
        r43Var.getClass();
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = r43Var;
        this.e = str2;
        this.f = set;
        this.g = p5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u67)) {
            return false;
        }
        u67 u67Var = (u67) obj;
        if (Intrinsics.areEqual(this.a, u67Var.a) && Intrinsics.areEqual(this.b, u67Var.b) && Intrinsics.areEqual(this.c, u67Var.c) && this.d == u67Var.d && Intrinsics.areEqual(this.e, u67Var.e) && Intrinsics.areEqual(this.f, u67Var.f) && Intrinsics.areEqual(this.g, u67Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.c;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int hashCode6 = (this.d.hashCode() + ((i3 + hashCode3) * 31)) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i4 = (hashCode6 + hashCode4) * 31;
        Set set = this.f;
        if (set == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = set.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        p5e p5eVar = this.g;
        if (p5eVar != null) {
            i = p5eVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "EditCardPayload(last4=" + this.a + ", expiryMonth=" + this.b + ", expiryYear=" + this.c + ", brand=" + this.d + ", displayBrand=" + this.e + ", networks=" + this.f + ", billingDetails=" + this.g + ")";
    }
}
