package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class y6d implements b7d {
    public final d3g a;

    public y6d(d3g d3gVar) {
        this.a = d3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y6d) && Intrinsics.areEqual(this.a, ((y6d) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        d3g d3gVar = this.a;
        if (d3gVar == null) {
            return 0;
        }
        return d3gVar.hashCode();
    }

    public final String toString() {
        return "Idle(message=" + this.a + ")";
    }
}
