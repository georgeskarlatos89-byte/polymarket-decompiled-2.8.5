package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class pi7 {
    public final int a;
    public final List b;

    public pi7(int i, List list) {
        list.getClass();
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi7)) {
            return false;
        }
        pi7 pi7Var = (pi7) obj;
        if (this.a == pi7Var.a && Intrinsics.areEqual(this.b, pi7Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ErrorDetail(code=" + this.a + ", messages=" + this.b + ")";
    }
}
