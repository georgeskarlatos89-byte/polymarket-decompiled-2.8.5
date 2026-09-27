package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sz9 extends uz9 {
    public final int a;
    public final String b;

    public sz9(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz9)) {
            return false;
        }
        sz9 sz9Var = (sz9) obj;
        if (this.a == sz9Var.a && Intrinsics.areEqual(this.b, sz9Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(code=" + this.a + ", message=" + this.b + ")";
    }
}
