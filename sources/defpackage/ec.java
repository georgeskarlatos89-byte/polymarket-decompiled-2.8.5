package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ec extends g8n {
    public final mk8 a;
    public final String b;

    public ec(mk8 mk8Var, String str) {
        str.getClass();
        this.a = mk8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        if (Intrinsics.areEqual(this.a, ecVar.a) && Intrinsics.areEqual(this.b, ecVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        mk8 mk8Var = this.a;
        if (mk8Var == null) {
            hashCode = 0;
        } else {
            hashCode = mk8Var.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "OnFormFieldValuesChanged(formValues=" + this.a + ", selectedPaymentMethodCode=" + this.b + ")";
    }
}
