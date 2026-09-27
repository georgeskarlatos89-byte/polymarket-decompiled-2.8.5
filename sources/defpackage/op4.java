package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class op4 {
    public final int a;
    public final Integer b;

    public op4(int i, rkl rklVar, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op4)) {
            return false;
        }
        op4 op4Var = (op4) obj;
        if (this.a == op4Var.a && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.b, op4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ')';
    }
}
