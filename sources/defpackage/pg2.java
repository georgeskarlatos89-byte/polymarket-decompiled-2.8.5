package defpackage;

import com.polymarket.data.EDefaultDepositLimits;
import com.polymarket.data.EPaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class pg2 implements sg2 {
    public final EPaymentMethod.MethodType a;
    public final EDefaultDepositLimits.Limits b;

    public pg2(EPaymentMethod.MethodType methodType, EDefaultDepositLimits.Limits limits) {
        methodType.getClass();
        this.a = methodType;
        this.b = limits;
    }

    @Override // defpackage.sg2
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pg2) {
                pg2 pg2Var = (pg2) obj;
                if (this.a != pg2Var.a || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.b, pg2Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 961;
        EDefaultDepositLimits.Limits limits = this.b;
        if (limits == null) {
            hashCode = 0;
        } else {
            hashCode = limits.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "AddMethod(type=" + this.a + ", title=null, limits=" + this.b + ")";
    }
}
