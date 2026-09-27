package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class hc0 {
    public final ec0 a;

    public hc0(ec0 ec0Var) {
        ec0Var.getClass();
        this.a = ec0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hc0)) {
            return false;
        }
        return Intrinsics.areEqual(((hc0) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
