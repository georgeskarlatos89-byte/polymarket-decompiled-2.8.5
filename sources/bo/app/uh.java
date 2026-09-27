package bo.app;

import defpackage.sv6;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class uh {
    public final List a;
    public final wh b;
    public final List c;

    public uh(List list, wh whVar, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = whVar;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh)) {
            return false;
        }
        uh uhVar = (uh) obj;
        if (Intrinsics.areEqual(this.a, uhVar.a) && Intrinsics.areEqual(this.b, uhVar.b) && Intrinsics.areEqual(this.c, uhVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        wh whVar = this.b;
        if (whVar == null) {
            hashCode = 0;
        } else {
            hashCode = whVar.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggeredActionsReceivedEvent(triggeredActions=");
        sb.append(this.a);
        sb.append(", triggersChecksum=");
        sb.append(this.b);
        sb.append(", reuseByIdReferences=");
        return sv6.r(sb, this.c, ')');
    }
}
