package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class t43 implements v43 {
    public final List a;
    public final r43 b;

    public t43(List list, r43 r43Var) {
        list.getClass();
        this.a = list;
        this.b = r43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t43)) {
            return false;
        }
        t43 t43Var = (t43) obj;
        if (Intrinsics.areEqual(this.a, t43Var.a) && this.b == t43Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        r43 r43Var = this.b;
        if (r43Var == null) {
            hashCode = 0;
        } else {
            hashCode = r43Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Eligible(preferredBrands=" + this.a + ", initialBrand=" + this.b + ")";
    }
}
