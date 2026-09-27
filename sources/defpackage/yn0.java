package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class yn0 {
    public Object a;
    public do0 b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yn0) {
                yn0 yn0Var = (yn0) obj;
                if (!Intrinsics.areEqual(this.a, yn0Var.a) || !Intrinsics.areEqual(this.b, yn0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "AsyncOperation(id=" + this.a + ", phase=" + this.b + ")";
    }
}
