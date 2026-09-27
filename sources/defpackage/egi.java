package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class egi {
    public final Set a;
    public final sh7 b;

    public egi(Set set, sh7 sh7Var) {
        set.getClass();
        this.a = set;
        this.b = sh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egi)) {
            return false;
        }
        egi egiVar = (egi) obj;
        if (Intrinsics.areEqual(this.a, egiVar.a) && Intrinsics.areEqual(this.b, egiVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        sh7 sh7Var = this.b;
        if (sh7Var == null) {
            hashCode = 0;
        } else {
            hashCode = sh7Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "WatchedChannelsRefresh(refreshedCids=" + this.a + ", error=" + this.b + ")";
    }
}
