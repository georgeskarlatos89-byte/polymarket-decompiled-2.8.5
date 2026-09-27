package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class be1 {
    public final lk8 a;
    public final lk8 b;
    public final lk8 c;
    public final lk8 d;
    public final lk8 e;
    public final lk8 f;
    public final lk8 g;
    public final lk8 h;
    public final lk8 i;

    public be1(lk8 lk8Var, lk8 lk8Var2, lk8 lk8Var3, lk8 lk8Var4, lk8 lk8Var5, lk8 lk8Var6, lk8 lk8Var7, lk8 lk8Var8, lk8 lk8Var9) {
        this.a = lk8Var;
        this.b = lk8Var2;
        this.c = lk8Var3;
        this.d = lk8Var4;
        this.e = lk8Var5;
        this.f = lk8Var6;
        this.g = lk8Var7;
        this.h = lk8Var8;
        this.i = lk8Var9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be1)) {
            return false;
        }
        be1 be1Var = (be1) obj;
        if (Intrinsics.areEqual(this.a, be1Var.a) && Intrinsics.areEqual(this.b, be1Var.b) && Intrinsics.areEqual(this.c, be1Var.c) && Intrinsics.areEqual(this.d, be1Var.d) && Intrinsics.areEqual(this.e, be1Var.e) && Intrinsics.areEqual(this.f, be1Var.f) && Intrinsics.areEqual(this.g, be1Var.g) && Intrinsics.areEqual(this.h, be1Var.h) && Intrinsics.areEqual(this.i, be1Var.i)) {
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
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 0;
        lk8 lk8Var = this.a;
        if (lk8Var == null) {
            hashCode = 0;
        } else {
            hashCode = lk8Var.hashCode();
        }
        int i2 = hashCode * 31;
        lk8 lk8Var2 = this.b;
        if (lk8Var2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lk8Var2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        lk8 lk8Var3 = this.c;
        if (lk8Var3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lk8Var3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        lk8 lk8Var4 = this.d;
        if (lk8Var4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = lk8Var4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        lk8 lk8Var5 = this.e;
        if (lk8Var5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = lk8Var5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        lk8 lk8Var6 = this.f;
        if (lk8Var6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = lk8Var6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        lk8 lk8Var7 = this.g;
        if (lk8Var7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = lk8Var7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        lk8 lk8Var8 = this.h;
        if (lk8Var8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = lk8Var8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        lk8 lk8Var9 = this.i;
        if (lk8Var9 != null) {
            i = lk8Var9.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        return "BillingDetailsFormState(name=" + this.a + ", email=" + this.b + ", phone=" + this.c + ", line1=" + this.d + ", line2=" + this.e + ", city=" + this.f + ", postalCode=" + this.g + ", state=" + this.h + ", country=" + this.i + ")";
    }
}
