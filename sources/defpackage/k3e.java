package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class k3e {
    public final h6i a;
    public final h6i b;
    public final b9i c;
    public final n9i d;
    public final c5f e;
    public final rk8 f;
    public final Float g;
    public final rk8 h;
    public final rk9 i;
    public final float j;

    public k3e(h6i h6iVar, h6i h6iVar2, b9i b9iVar, n9i n9iVar, c5f c5fVar, rk8 rk8Var, Float f, rk8 rk8Var2, rk9 rk9Var, float f2) {
        rk9Var.getClass();
        this.a = h6iVar;
        this.b = h6iVar2;
        this.c = b9iVar;
        this.d = n9iVar;
        this.e = c5fVar;
        this.f = rk8Var;
        this.g = f;
        this.h = rk8Var2;
        this.i = rk9Var;
        this.j = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k3e) {
                k3e k3eVar = (k3e) obj;
                if (!Intrinsics.areEqual(this.a, k3eVar.a) || !Intrinsics.areEqual(this.b, k3eVar.b) || !Intrinsics.areEqual(this.c, k3eVar.c) || !Intrinsics.areEqual(this.d, k3eVar.d) || !Intrinsics.areEqual(this.e, k3eVar.e) || !Intrinsics.areEqual(this.f, k3eVar.f) || !Intrinsics.areEqual(this.g, k3eVar.g) || !Intrinsics.areEqual(this.h, k3eVar.h) || this.i != k3eVar.i || Float.compare(this.j, k3eVar.j) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Float f = this.g;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        return Float.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PaymentElementThemeValues(colorsLight=" + this.a + ", colorsDark=" + this.b + ", shapes=" + this.c + ", typography=" + this.d + ", primaryButtonStyle=" + this.e + ", formInsets=" + this.f + ", sectionSpacing=" + this.g + ", textFieldInsets=" + this.h + ", iconStyle=" + this.i + ", verticalModeRowPadding=" + this.j + ")";
    }
}
