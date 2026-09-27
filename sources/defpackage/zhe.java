package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class zhe {
    public final d3g a;

    public zhe(d3g d3gVar) {
        d3gVar.getClass();
        this.a = d3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zhe) && Intrinsics.areEqual(this.a, ((zhe) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UserErrorMessage(message=" + this.a + ")";
    }
}
