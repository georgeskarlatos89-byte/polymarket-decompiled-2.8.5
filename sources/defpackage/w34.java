package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class w34 {
    public final c44 a;
    public final p34 b;

    public w34(c44 c44Var, p34 p34Var) {
        c44Var.getClass();
        this.a = c44Var;
        this.b = p34Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w34) {
            if (Intrinsics.areEqual(this.a, ((w34) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
