package defpackage;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class bba {
    public final onk a;
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bba(onk onkVar, Collection collection, int i) {
        this(onkVar, collection, r7, r8, r9);
        boolean z;
        boolean z2;
        boolean z3;
        if (onkVar.a == ycd.NOT_NULL) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bba)) {
            return false;
        }
        bba bbaVar = (bba) obj;
        if (Intrinsics.areEqual(this.a, bbaVar.a) && Intrinsics.areEqual(this.b, bbaVar.b) && this.c == bbaVar.c && this.d == bbaVar.d && this.e == bbaVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + hdi.g(hdi.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.b);
        sb.append(", definitelyNotNull=");
        sb.append(this.c);
        sb.append(", preferQualifierOverBound=");
        sb.append(this.d);
        sb.append(", preferQualifierOverSupertype=");
        return hdi.t(sb, this.e, ')');
    }

    public bba(onk onkVar, Collection collection, boolean z, boolean z2, boolean z3) {
        collection.getClass();
        this.a = onkVar;
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
