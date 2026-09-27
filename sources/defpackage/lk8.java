package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class lk8 {
    public final String a;
    public final boolean b;

    public lk8(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk8)) {
            return false;
        }
        lk8 lk8Var = (lk8) obj;
        if (Intrinsics.areEqual(this.a, lk8Var.a) && this.b == lk8Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "FormFieldEntry(value=" + this.a + ", isComplete=" + this.b + ")";
    }
}
