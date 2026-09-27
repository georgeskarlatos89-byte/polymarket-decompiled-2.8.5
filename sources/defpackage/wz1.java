package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class wz1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public wz1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz1)) {
            return false;
        }
        wz1 wz1Var = (wz1) obj;
        if (this.a == wz1Var.a && this.b == wz1Var.b && this.c == wz1Var.c && this.d == wz1Var.d && this.e == wz1Var.e && this.f == wz1Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + hdi.g(hdi.g(hdi.g(hdi.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder h = k84.h("Transition(isFromZero=", ", isToZero=", ", isAddingDecimal=", this.a, this.b);
        hdi.B(h, this.c, ", isDeletingDecimal=", this.d, ", isDeleting=");
        h.append(this.e);
        h.append(", isAppending=");
        h.append(this.f);
        h.append(")");
        return h.toString();
    }

    public /* synthetic */ wz1() {
        this(false, false, false, false, false, false);
    }
}
