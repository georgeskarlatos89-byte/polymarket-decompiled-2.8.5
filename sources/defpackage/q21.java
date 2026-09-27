package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q21 extends m0d {
    public final Object a;
    public final long b;

    public q21(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q21) {
                q21 q21Var = (q21) obj;
                if (!Intrinsics.areEqual(this.a, q21Var.a) || this.b != q21Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.a);
        sb.append(", compositeKey=");
        return ix2.n(sb, this.b, ')');
    }
}
