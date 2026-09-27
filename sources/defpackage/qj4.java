package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class qj4 implements rj4 {
    public final d3g a;

    public qj4(d3g d3gVar) {
        this.a = d3gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qj4) || !Intrinsics.areEqual(this.a, ((qj4) obj).a)) {
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
        return "Failed(error=" + this.a + ")";
    }
}
