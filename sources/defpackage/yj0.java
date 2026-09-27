package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yj0 {
    public final Object a;
    public final Object b;

    public yj0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj0)) {
            return false;
        }
        yj0 yj0Var = (yj0) obj;
        if (Intrinsics.areEqual(this.a, yj0Var.a) && Intrinsics.areEqual(this.b, yj0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.a);
        sb.append(", upper=");
        return woa.q(sb, this.b, ')');
    }
}
