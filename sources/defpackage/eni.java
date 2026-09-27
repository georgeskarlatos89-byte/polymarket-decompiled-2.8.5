package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class eni implements gni {
    public final xbe a;

    public eni(xbe xbeVar) {
        this.a = xbeVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof eni) || !Intrinsics.areEqual(this.a, ((eni) obj).a)) {
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
        return "Continue(paymentSelection=" + this.a + ")";
    }
}
