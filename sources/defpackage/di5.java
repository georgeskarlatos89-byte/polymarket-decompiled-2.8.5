package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class di5 {
    public final i8e a;

    public di5(i8e i8eVar) {
        i8eVar.getClass();
        this.a = i8eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof di5) && this.a == ((di5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + hdi.g(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "CustomerPermissions(removePaymentMethod=" + this.a + ", canRemoveLastPaymentMethod=false, canUpdateCardExpiryAndBillingDetails=false)";
    }
}
