package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class gj8 {
    public final fj8 a;
    public final fj8 b;

    public gj8(fj8 fj8Var, fj8 fj8Var2) {
        this.a = fj8Var;
        this.b = fj8Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj8)) {
            return false;
        }
        gj8 gj8Var = (gj8) obj;
        if (Intrinsics.areEqual(this.a, gj8Var.a) && Intrinsics.areEqual(this.b, gj8Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        fj8 fj8Var = this.a;
        if (fj8Var == null) {
            hashCode = 0;
        } else {
            hashCode = fj8Var.hashCode();
        }
        int i2 = hashCode * 31;
        fj8 fj8Var2 = this.b;
        if (fj8Var2 != null) {
            i = fj8Var2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "FootballLineupRowUi(leading=" + this.a + ", trailing=" + this.b + ")";
    }
}
