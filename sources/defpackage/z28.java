package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class z28 extends c38 {
    public final e48 a;

    public z28(e48 e48Var) {
        this.a = e48Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof z28) || !Intrinsics.areEqual(this.a, ((z28) obj).a)) {
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
        return "FinishWithResult(result=" + this.a + ")";
    }
}
