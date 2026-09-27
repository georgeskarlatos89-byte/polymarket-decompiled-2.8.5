package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class xhe extends aie {
    public final zhe b;

    public xhe(zhe zheVar) {
        super(zheVar);
        this.b = zheVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xhe) && Intrinsics.areEqual(this.b, ((xhe) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        zhe zheVar = this.b;
        if (zheVar == null) {
            return 0;
        }
        return zheVar.a.hashCode();
    }

    public final String toString() {
        return "Reset(message=" + this.b + ")";
    }
}
