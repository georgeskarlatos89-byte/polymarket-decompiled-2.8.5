package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fzb {
    public final d3g a;
    public final boolean b;

    public fzb(d3g d3gVar, boolean z) {
        this.a = d3gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzb)) {
            return false;
        }
        fzb fzbVar = (fzb) obj;
        if (Intrinsics.areEqual(this.a, fzbVar.a) && this.b == fzbVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        d3g d3gVar = this.a;
        if (d3gVar == null) {
            hashCode = 0;
        } else {
            hashCode = d3gVar.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "MandateText(text=" + this.a + ", showAbovePrimaryButton=" + this.b + ")";
    }
}
