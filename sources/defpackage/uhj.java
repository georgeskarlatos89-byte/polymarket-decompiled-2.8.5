package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class uhj {
    public final lhj a;
    public final wba b;

    public uhj(lhj lhjVar, wba wbaVar) {
        lhjVar.getClass();
        wbaVar.getClass();
        this.a = lhjVar;
        this.b = wbaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uhj)) {
            return false;
        }
        uhj uhjVar = (uhj) obj;
        if (!Intrinsics.areEqual(uhjVar.a, this.a) || !Intrinsics.areEqual(uhjVar.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
