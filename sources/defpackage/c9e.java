package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class c9e implements h9e {
    public final cw6 a;

    public c9e(cw6 cw6Var) {
        this.a = cw6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c9e) || !Intrinsics.areEqual(this.a, ((c9e) obj).a)) {
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
        return "OnManageOneSavedPaymentMethod(savedPaymentMethod=" + this.a + ")";
    }
}
