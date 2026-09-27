package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class b96 {
    public final c96 a;

    public b96(c96 c96Var) {
        this.a = c96Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b96.class == obj.getClass()) {
                b96 b96Var = (b96) obj;
                if (Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.a, b96Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }
}
