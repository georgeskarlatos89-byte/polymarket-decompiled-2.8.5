package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class o01 implements p01 {
    public final ece a;

    public o01(ece eceVar) {
        this.a = eceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o01) && Intrinsics.areEqual(this.a, ((o01) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ece eceVar = this.a;
        if (eceVar == null) {
            return 0;
        }
        return eceVar.hashCode();
    }

    public final String toString() {
        return "GoBack(address=" + this.a + ")";
    }
}
