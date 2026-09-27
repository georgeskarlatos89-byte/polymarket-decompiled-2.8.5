package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class tg5 {
    public final String a;
    public final gde b;
    public final p5e c;

    public tg5(String str, gde gdeVar, p5e p5eVar) {
        str.getClass();
        gdeVar.getClass();
        this.a = str;
        this.b = gdeVar;
        this.c = p5eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg5)) {
            return false;
        }
        tg5 tg5Var = (tg5) obj;
        if (Intrinsics.areEqual(this.a, tg5Var.a) && Intrinsics.areEqual(this.b, tg5Var.b) && Intrinsics.areEqual(this.c, tg5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        p5e p5eVar = this.c;
        if (p5eVar == null) {
            hashCode = 0;
        } else {
            hashCode = p5eVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CustomPaymentMethodInput(paymentElementCallbackIdentifier=" + this.a + ", type=" + this.b + ", billingDetails=" + this.c + ")";
    }
}
