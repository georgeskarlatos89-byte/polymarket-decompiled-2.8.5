package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class j43 implements k43 {
    public final List a;
    public final List b;

    public j43(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.k43
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j43)) {
            return false;
        }
        j43 j43Var = (j43) obj;
        if (Intrinsics.areEqual(this.a, j43Var.a) && Intrinsics.areEqual(this.b, j43Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(ranges=" + this.a + ", unfilteredRanges=" + this.b + ")";
    }
}
