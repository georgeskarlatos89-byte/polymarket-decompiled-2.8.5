package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xx9 {
    public final jy9 a;
    public final owi b;

    public /* synthetic */ xx9() {
        this(new jy9(null, null, null, 31), new owi(7, null));
    }

    public static xx9 a(xx9 xx9Var, jy9 jy9Var) {
        owi owiVar = xx9Var.b;
        xx9Var.getClass();
        owiVar.getClass();
        return new xx9(jy9Var, owiVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx9)) {
            return false;
        }
        xx9 xx9Var = (xx9) obj;
        if (Intrinsics.areEqual(this.a, xx9Var.a) && Intrinsics.areEqual(this.b, xx9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputComponentState(inputFieldState=" + this.a + ", errorState=" + this.b + ")";
    }

    public xx9(jy9 jy9Var, owi owiVar) {
        jy9Var.getClass();
        owiVar.getClass();
        this.a = jy9Var;
        this.b = owiVar;
    }
}
