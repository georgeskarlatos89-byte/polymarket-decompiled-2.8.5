package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g9e implements h9e {
    public final String a;
    public final nwa b;

    public g9e(String str, nwa nwaVar) {
        this.a = str;
        this.b = nwaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g9e) {
                g9e g9eVar = (g9e) obj;
                if (!Intrinsics.areEqual(this.a, g9eVar.a) || !Intrinsics.areEqual(this.b, g9eVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdatePaymentMethodVisibility(itemCode=" + this.a + ", coordinates=" + this.b + ")";
    }
}
