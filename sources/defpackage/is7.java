package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class is7 {
    public final String a;
    public final String b;

    public is7(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof is7) {
                is7 is7Var = (is7) obj;
                if (!Intrinsics.areEqual(this.a, is7Var.a) || !Intrinsics.areEqual(this.b, is7Var.b)) {
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
        return hdi.p("ExpiryDateValidationRequest(month=", this.a, ", year=", this.b, ")");
    }
}
