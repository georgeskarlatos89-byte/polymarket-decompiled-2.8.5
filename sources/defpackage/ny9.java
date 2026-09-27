package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ny9 {
    public final jy9 a;
    public final oy9 b;

    public ny9(jy9 jy9Var, oy9 oy9Var) {
        jy9Var.getClass();
        oy9Var.getClass();
        this.a = jy9Var;
        this.b = oy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny9)) {
            return false;
        }
        ny9 ny9Var = (ny9) obj;
        if (Intrinsics.areEqual(this.a, ny9Var.a) && Intrinsics.areEqual(this.b, ny9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputFieldViewItem(state=" + this.a + ", style=" + this.b + ")";
    }
}
