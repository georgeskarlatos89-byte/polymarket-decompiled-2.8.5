package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class jeg implements neg {
    public final ggb a;

    public jeg(ggb ggbVar) {
        ggbVar.getClass();
        this.a = ggbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jeg) && Intrinsics.areEqual(this.a, ((jeg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Link(paymentDetails=" + this.a + ")";
    }
}
