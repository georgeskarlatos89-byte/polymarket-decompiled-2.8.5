package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ti8 {
    public final kh8 a;
    public final kh8 b;
    public final kh8 c;
    public final kh8 d;
    public final kh8 e;
    public final kh8 f;

    public ti8(kh8 kh8Var, kh8 kh8Var2, kh8 kh8Var3, kh8 kh8Var4, kh8 kh8Var5, kh8 kh8Var6) {
        kh8Var.getClass();
        kh8Var2.getClass();
        kh8Var3.getClass();
        kh8Var4.getClass();
        kh8Var5.getClass();
        kh8Var6.getClass();
        this.a = kh8Var;
        this.b = kh8Var2;
        this.c = kh8Var3;
        this.d = kh8Var4;
        this.e = kh8Var5;
        this.f = kh8Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti8)) {
            return false;
        }
        ti8 ti8Var = (ti8) obj;
        if (Intrinsics.areEqual(this.a, ti8Var.a) && Intrinsics.areEqual(this.b, ti8Var.b) && Intrinsics.areEqual(this.c, ti8Var.c) && Intrinsics.areEqual(this.d, ti8Var.d) && Intrinsics.areEqual(this.e, ti8Var.e) && Intrinsics.areEqual(this.f, ti8Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Fonts(heading=" + this.a + ", subheading=" + this.b + ", footnote=" + this.c + ", button=" + this.d + ", input=" + this.e + ", label=" + this.f + ")";
    }
}
