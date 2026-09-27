package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ur8 implements or4 {
    public final lr4 a;

    public ur8(lr4 lr4Var) {
        this.a = lr4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ur8) {
            if (Intrinsics.areEqual(this.a, ((ur8) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
