package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class q5g implements v5g {
    public final d3g a;

    public q5g(d3g d3gVar) {
        this.a = d3gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof q5g) || !Intrinsics.areEqual(this.a, ((q5g) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(message=" + this.a + ")";
    }
}
