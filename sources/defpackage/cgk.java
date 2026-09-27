package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cgk implements egk {
    public final nx8 a;
    public final boolean b;
    public final ux8 c;
    public final List d;

    public cgk(nx8 nx8Var, boolean z, ux8 ux8Var, List list) {
        nx8Var.getClass();
        list.getClass();
        this.a = nx8Var;
        this.b = z;
        this.c = ux8Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgk)) {
            return false;
        }
        cgk cgkVar = (cgk) obj;
        if (this.a == cgkVar.a && this.b == cgkVar.b && Intrinsics.areEqual(this.c, cgkVar.c) && Intrinsics.areEqual(this.d, cgkVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = hdi.g(this.a.hashCode() * 31, 31, this.b);
        ux8 ux8Var = this.c;
        if (ux8Var == null) {
            hashCode = 0;
        } else {
            hashCode = ux8Var.hashCode();
        }
        return this.d.hashCode() + ((g + hashCode) * 31);
    }

    public final String toString() {
        return "GooglePay(buttonType=" + this.a + ", allowCreditCards=" + this.b + ", billingAddressParameters=" + this.c + ", additionalEnabledNetworks=" + this.d + ")";
    }
}
