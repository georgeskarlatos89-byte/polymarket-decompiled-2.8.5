package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class by9 {
    public final xx9 a;
    public final fy9 b;

    public by9(xx9 xx9Var, fy9 fy9Var) {
        xx9Var.getClass();
        fy9Var.getClass();
        this.a = xx9Var;
        this.b = fy9Var;
    }

    public static by9 a(by9 by9Var) {
        xx9 xx9Var = by9Var.a;
        fy9 fy9Var = by9Var.b;
        by9Var.getClass();
        xx9Var.getClass();
        fy9Var.getClass();
        return new by9(xx9Var, fy9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by9)) {
            return false;
        }
        by9 by9Var = (by9) obj;
        if (Intrinsics.areEqual(this.a, by9Var.a) && Intrinsics.areEqual(this.b, by9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputComponentViewItem(state=" + this.a + ", style=" + this.b + ")";
    }
}
