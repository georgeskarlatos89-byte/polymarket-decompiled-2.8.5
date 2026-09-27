package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class dm5 {
    public final String a;
    public final r43 b;

    public dm5(r43 r43Var, String str) {
        r43Var.getClass();
        this.a = str;
        this.b = r43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm5)) {
            return false;
        }
        dm5 dm5Var = (dm5) obj;
        if (Intrinsics.areEqual(this.a, dm5Var.a) && this.b == dm5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CvcRecollectionData(lastFour=" + this.a + ", brand=" + this.b + ")";
    }
}
