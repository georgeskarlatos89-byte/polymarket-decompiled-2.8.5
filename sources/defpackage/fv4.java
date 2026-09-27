package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fv4 implements iv4 {
    public final ev4 a;

    public fv4(ev4 ev4Var) {
        this.a = ev4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof fv4) || !Intrinsics.areEqual(this.a, ((fv4) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(result=" + this.a + ")";
    }
}
