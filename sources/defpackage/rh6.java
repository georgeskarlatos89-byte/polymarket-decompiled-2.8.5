package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class rh6 extends evn {
    public final d3g a;

    public rh6(d3g d3gVar) {
        this.a = d3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rh6) && Intrinsics.areEqual(this.a, ((rh6) obj).a)) {
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
        return "Error(errorMessage=" + this.a + ")";
    }
}
