package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class re3 {
    public final jn a;
    public final Function1 b;
    public final h58 c;

    public re3(jn jnVar, h58 h58Var, Function1 function1) {
        this.a = jnVar;
        this.b = function1;
        this.c = h58Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof re3) {
            re3 re3Var = (re3) obj;
            if (Intrinsics.areEqual(this.a, re3Var.a) && Intrinsics.areEqual(this.b, re3Var.b) && Intrinsics.areEqual(this.c, re3Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
