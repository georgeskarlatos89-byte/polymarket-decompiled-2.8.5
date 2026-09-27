package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fk5 {
    public final boolean a;
    public final String b;

    public fk5(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk5)) {
            return false;
        }
        fk5 fk5Var = (fk5) obj;
        if (this.a == fk5Var.a && Intrinsics.areEqual(this.b, fk5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SelectionConfirmationState(isConfirming=" + this.a + ", error=" + this.b + ")";
    }
}
