package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pek {
    public final fy9 a;
    public final xx9 b;
    public final Function1 c;
    public final Function1 d;

    public pek(fy9 fy9Var, xx9 xx9Var, Function1 function1, Function1 function12) {
        fy9Var.getClass();
        xx9Var.getClass();
        function1.getClass();
        function12.getClass();
        this.a = fy9Var;
        this.b = xx9Var;
        this.c = function1;
        this.d = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pek)) {
            return false;
        }
        pek pekVar = (pek) obj;
        if (Intrinsics.areEqual(this.a, pekVar.a) && Intrinsics.areEqual(this.b, pekVar.b) && Intrinsics.areEqual(this.c, pekVar.c) && Intrinsics.areEqual(this.d, pekVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WalletCvvViewState(style=" + this.a + ", state=" + this.b + ", onValueChange=" + this.c + ", onFocusChanged=" + this.d + ")";
    }
}
