package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class vog extends yv8 {
    public final ybe b;

    public vog(ybe ybeVar) {
        this.b = ybeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vog) && Intrinsics.areEqual(this.b, ((vog) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ybe ybeVar = this.b;
        if (ybeVar == null) {
            return 0;
        }
        return ybeVar.hashCode();
    }

    public final String toString() {
        return "SelectPaymentMethod(selection=" + this.b + ")";
    }
}
