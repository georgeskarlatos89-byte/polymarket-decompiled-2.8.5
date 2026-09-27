package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class s5g extends w5g {
    public final sh7 a;

    public s5g(sh7 sh7Var) {
        sh7Var.getClass();
        this.a = sh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s5g) && Intrinsics.areEqual(this.a, ((s5g) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(value=" + this.a + ")";
    }
}
