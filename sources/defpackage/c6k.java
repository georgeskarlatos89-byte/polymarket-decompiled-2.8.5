package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c6k {
    public final wo1 a;

    public c6k(wo1 wo1Var) {
        this.a = wo1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c6k) || !Intrinsics.areEqual(this.a, ((c6k) obj).a)) {
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
        return "VenmoPaymentAuthRequestParams(browserSwitchOptions=" + this.a + ")";
    }
}
