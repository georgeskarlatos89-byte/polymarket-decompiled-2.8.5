package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class vjh {
    public final List a;
    public final dkh b;

    static {
        new vjh(CollectionsKt.emptyList(), null);
    }

    public vjh(List list, dkh dkhVar) {
        list.getClass();
        this.a = list;
        this.b = dkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjh)) {
            return false;
        }
        vjh vjhVar = (vjh) obj;
        if (Intrinsics.areEqual(this.a, vjhVar.a) && Intrinsics.areEqual(this.b, vjhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        dkh dkhVar = this.b;
        if (dkhVar == null) {
            hashCode = 0;
        } else {
            hashCode = dkhVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "SquadsAvatarBubbleGroupContent(members=" + this.a + ", highlight=" + this.b + ")";
    }
}
