package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class n6f {
    public final djj a;
    public final fl6 b;
    public final uof c;

    public n6f(djj djjVar, fl6 fl6Var, uof uofVar) {
        this.a = djjVar;
        this.b = fl6Var;
        this.c = uofVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6f)) {
            return false;
        }
        n6f n6fVar = (n6f) obj;
        if (Intrinsics.areEqual(this.a, n6fVar.a) && Intrinsics.areEqual(this.b, n6fVar.b) && Intrinsics.areEqual(this.c, n6fVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        djj djjVar = this.a;
        if (djjVar == null) {
            hashCode = 0;
        } else {
            hashCode = Boolean.hashCode(djjVar.a);
        }
        int i2 = hashCode * 31;
        fl6 fl6Var = this.b;
        if (fl6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Boolean.hashCode(fl6Var.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        uof uofVar = this.c;
        if (uofVar != null) {
            i = Boolean.hashCode(uofVar.a);
        }
        return i3 + i;
    }

    public final String toString() {
        return "PrivacySettings(typingIndicators=" + this.a + ", deliveryReceipts=" + this.b + ", readReceipts=" + this.c + ")";
    }
}
