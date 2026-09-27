package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rt4 {
    public final String a;
    public final hd b;

    public rt4(String str, hd hdVar) {
        this.a = str;
        this.b = hdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt4)) {
            return false;
        }
        rt4 rt4Var = (rt4) obj;
        if (Intrinsics.areEqual(this.a, rt4Var.a) && Intrinsics.areEqual(this.b, rt4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        hd hdVar = this.b;
        if (hdVar != null) {
            i = hdVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "Shipping(name=" + this.a + ", address=" + this.b + ")";
    }
}
