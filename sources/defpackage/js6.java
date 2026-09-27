package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class js6 {
    public final boolean a;
    public final boolean b;
    public final eng c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public js6(boolean z, boolean z2, eng engVar, boolean z3, boolean z4, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        engVar = (i & 4) != 0 ? eng.Inherit : engVar;
        this.a = z;
        this.b = z2;
        this.c = engVar;
        this.d = z3;
        this.e = z4;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof js6) {
                js6 js6Var = (js6) obj;
                if (this.a != js6Var.a || this.b != js6Var.b || this.c != js6Var.c || this.d != js6Var.d || this.e != js6Var.e || this.g != js6Var.g || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (hdi.g(hdi.g((this.c.hashCode() + hdi.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public js6(int i) {
        this(true, (i & 2) != 0, eng.Inherit, (i & 4) != 0, true, 224);
    }
}
