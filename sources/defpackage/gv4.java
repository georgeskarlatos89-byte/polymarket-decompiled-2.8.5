package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gv4 implements iv4 {
    public final su4 a;

    public gv4(su4 su4Var) {
        su4Var.getClass();
        this.a = su4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gv4) && Intrinsics.areEqual(this.a, ((gv4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Confirming(option=" + this.a + ")";
    }
}
