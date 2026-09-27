package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class fh {
    public final String a;
    public final t9 b;

    public fh(String str, t9 t9Var) {
        str.getClass();
        t9Var.getClass();
        this.a = str;
        this.b = t9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        if (Intrinsics.areEqual(this.a, fhVar.a) && Intrinsics.areEqual(this.b, fhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.a + ", pushClickEvent=" + this.b + ')';
    }
}
