package defpackage;

import com.polymarket.data.EAmount;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class zl6 {
    public final EAmount a;

    public zl6(EAmount eAmount) {
        this.a = eAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zl6) && Intrinsics.areEqual(this.a, ((zl6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        EAmount eAmount = this.a;
        if (eAmount == null) {
            return 0;
        }
        return eAmount.hashCode();
    }

    public final String toString() {
        return "DepositFlowConfig(initialAmount=" + this.a + ")";
    }
}
