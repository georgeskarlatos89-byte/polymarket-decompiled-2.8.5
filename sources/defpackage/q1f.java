package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class q1f extends m0d {
    public final Object a;
    public final long b;

    public q1f(long j, Object obj) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q1f) {
                q1f q1fVar = (q1f) obj;
                if (!Intrinsics.areEqual(this.a, q1fVar.a) || this.b != q1fVar.b) {
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
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.a);
        sb.append(", compositeKey=");
        return ix2.n(sb, this.b, ')');
    }
}
