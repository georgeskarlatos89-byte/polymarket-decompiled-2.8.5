package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class ns2 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final oh8 e;
    public final String f;

    public ns2(float f, float f2, float f3, int i, oh8 oh8Var, String str) {
        oh8Var.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = oh8Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ns2) {
                ns2 ns2Var = (ns2) obj;
                if (Float.compare(this.a, ns2Var.a) != 0 || Float.compare(this.b, ns2Var.b) != 0 || Float.compare(this.c, ns2Var.c) != 0 || this.d != ns2Var.d || !Intrinsics.areEqual(this.e, ns2Var.e) || !Intrinsics.areEqual(this.f, ns2Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + woa.b(this.d, sv6.a(sv6.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = hdi.u(this.a, this.b, "CUITypographySpec(size=", ", lineHeight=", ", letterSpacing=");
        u.append(this.c);
        u.append(", numericWeight=");
        u.append(this.d);
        u.append(", family=");
        u.append(this.e);
        u.append(", fontFeatureSettings=");
        u.append(this.f);
        u.append(")");
        return u.toString();
    }
}
