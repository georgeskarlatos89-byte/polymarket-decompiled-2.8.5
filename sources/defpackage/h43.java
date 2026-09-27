package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h43 {
    public final List a;
    public final List b;

    public h43(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h43)) {
            return false;
        }
        h43 h43Var = (h43) obj;
        if (Intrinsics.areEqual(this.a, h43Var.a) && Intrinsics.areEqual(this.b, h43Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountRangesResult(accountRanges=" + this.a + ", unfilteredAccountRanges=" + this.b + ")";
    }
}
