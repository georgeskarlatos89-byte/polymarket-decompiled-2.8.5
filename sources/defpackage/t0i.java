package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class t0i extends u0i {
    public final mo3 a;

    public t0i(mo3 mo3Var) {
        mo3Var.getClass();
        this.a = mo3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t0i) && Intrinsics.areEqual(this.a, ((t0i) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Message(chatEvent=" + this.a + ")";
    }
}
