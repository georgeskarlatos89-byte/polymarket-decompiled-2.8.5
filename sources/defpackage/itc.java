package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class itc {
    public final etc a;
    public final etc b;

    public itc(etc etcVar, etc etcVar2) {
        this.a = etcVar;
        this.b = etcVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itc)) {
            return false;
        }
        itc itcVar = (itc) obj;
        if (Intrinsics.areEqual(this.a, itcVar.a) && Intrinsics.areEqual(this.b, itcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        etc etcVar = this.a;
        if (etcVar == null) {
            hashCode = 0;
        } else {
            hashCode = etcVar.hashCode();
        }
        int i2 = hashCode * 31;
        etc etcVar2 = this.b;
        if (etcVar2 != null) {
            i = etcVar2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "NavBackStackEntryUpdate(previousBackStackEntry=" + this.a + ", currentBackStackEntry=" + this.b + ")";
    }
}
