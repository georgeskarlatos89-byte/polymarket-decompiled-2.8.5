package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class cf2 {
    public final tzc a;
    public final tzc b;
    public final boolean c;
    public final boolean d;

    public cf2(tzc tzcVar, tzc tzcVar2, boolean z, boolean z2) {
        this.a = tzcVar;
        this.b = tzcVar2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf2)) {
            return false;
        }
        cf2 cf2Var = (cf2) obj;
        if (Intrinsics.areEqual(this.a, cf2Var.a) && Intrinsics.areEqual(this.b, cf2Var.b) && this.c == cf2Var.c && this.d == cf2Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        tzc tzcVar = this.a;
        if (tzcVar == null) {
            hashCode = 0;
        } else {
            hashCode = tzcVar.hashCode();
        }
        int i2 = hashCode * 31;
        tzc tzcVar2 = this.b;
        if (tzcVar2 != null) {
            i = tzcVar2.hashCode();
        }
        return Boolean.hashCode(this.d) + hdi.g((i2 + i) * 31, 31, this.c);
    }

    public final String toString() {
        return "CUINavigationBackResult(previousTop=" + this.a + ", currentTop=" + this.b + ", didPop=" + this.c + ", didDismiss=" + this.d + ")";
    }
}
