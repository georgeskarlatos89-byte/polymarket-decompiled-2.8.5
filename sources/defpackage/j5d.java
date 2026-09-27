package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class j5d implements l5d {
    public final dt8 a;

    public j5d(dt8 dt8Var) {
        this.a = dt8Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof j5d) || !Intrinsics.areEqual(this.a, ((j5d) obj).a)) {
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
        return "Error(error=" + this.a + ")";
    }
}
