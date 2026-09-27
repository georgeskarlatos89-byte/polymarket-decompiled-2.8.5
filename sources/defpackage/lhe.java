package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lhe {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;

    public lhe(boolean z, boolean z2, boolean z3, Function0 function0) {
        function0.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhe)) {
            return false;
        }
        lhe lheVar = (lhe) obj;
        if (this.a == lheVar.a && this.b == lheVar.b && this.c == lheVar.c && Intrinsics.areEqual(this.d, lheVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + hdi.g(hdi.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder h = k84.h("PaymentSheetTopBarState(showTestModeLabel=", ", showEditMenu=", ", isEditing=", this.a, this.b);
        h.append(this.c);
        h.append(", onEditIconPressed=");
        h.append(this.d);
        h.append(")");
        return h.toString();
    }
}
