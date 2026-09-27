package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ha4 extends ja4 {
    public final ga4 a;

    public ha4(ga4 ga4Var) {
        ga4Var.getClass();
        this.a = ga4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ha4) && Intrinsics.areEqual(this.a, ((ha4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FinishWithResult(result=" + this.a + ")";
    }
}
