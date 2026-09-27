package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class du6 extends fxn {
    public final qh7 a;

    public du6(qh7 qh7Var) {
        this.a = qh7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof du6) || !Intrinsics.areEqual(this.a, ((du6) obj).a)) {
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
        return "UnrecoverableError(error=" + this.a + ")";
    }
}
