package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class gs1 {
    public final boolean a;
    public final fs1 b;

    public gs1(boolean z, fs1 fs1Var) {
        this.a = z;
        this.b = fs1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gs1) {
                gs1 gs1Var = (gs1) obj;
                if (this.a != gs1Var.a || !Intrinsics.areEqual(this.b, gs1Var.b)) {
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
        int hashCode2 = Boolean.hashCode(this.a) * 31;
        fs1 fs1Var = this.b;
        if (fs1Var == null) {
            hashCode = 0;
        } else {
            hashCode = fs1Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "BuyButtonState(visible=" + this.a + ", buyButtonOverride=" + this.b + ")";
    }
}
