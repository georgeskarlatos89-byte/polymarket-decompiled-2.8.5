package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class uli {
    public final d3g a;
    public final boolean b;

    public uli(d3g d3gVar, boolean z) {
        this.a = d3gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uli) {
                uli uliVar = (uli) obj;
                if (!Intrinsics.areEqual(this.a, uliVar.a) || this.b != uliVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PrimaryButton(label=" + this.a + ", enabled=" + this.b + ")";
    }
}
