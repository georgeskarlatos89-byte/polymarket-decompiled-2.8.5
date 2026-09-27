package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class x49 {
    public final String a;
    public final String b;

    public x49(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x49)) {
            return false;
        }
        x49 x49Var = (x49) obj;
        if (Intrinsics.areEqual(this.a, x49Var.a) && Intrinsics.areEqual(this.b, x49Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(name=");
        sb.append(this.a);
        sb.append(", value=");
        return m51.m(sb, this.b, ')');
    }
}
