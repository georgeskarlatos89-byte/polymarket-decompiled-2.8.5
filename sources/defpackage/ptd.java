package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ptd {
    public final List a;
    public final Integer b;
    public final q24 c;
    public final int d;

    public ptd(List list, Integer num, q24 q24Var, int i) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = q24Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ptd) {
            ptd ptdVar = (ptd) obj;
            if (Intrinsics.areEqual(this.a, ptdVar.a) && Intrinsics.areEqual(this.b, ptdVar.b) && Intrinsics.areEqual(this.c, ptdVar.c) && this.d == ptdVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode();
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.d) + this.c.hashCode() + hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingState(pages=");
        sb.append(this.a);
        sb.append(", anchorPosition=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", leadingPlaceholderCount=");
        return sv6.o(sb, this.d, ')');
    }
}
