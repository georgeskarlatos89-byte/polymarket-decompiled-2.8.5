package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class lra {
    public static final lra c = new lra(null, null);
    public final nra a;
    public final ira b;

    public lra(nra nraVar, ira iraVar) {
        this.a = nraVar;
        this.b = iraVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lra)) {
            return false;
        }
        lra lraVar = (lra) obj;
        if (this.a == lraVar.a && Intrinsics.areEqual(this.b, lraVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        nra nraVar = this.a;
        if (nraVar == null) {
            hashCode = 0;
        } else {
            hashCode = nraVar.hashCode();
        }
        int i2 = hashCode * 31;
        ira iraVar = this.b;
        if (iraVar != null) {
            i = iraVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.a + ", type=" + this.b + ')';
    }
}
