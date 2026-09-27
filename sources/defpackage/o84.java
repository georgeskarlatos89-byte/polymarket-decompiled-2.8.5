package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class o84 {
    public final String a;
    public final String b;

    public o84(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o84)) {
            return false;
        }
        o84 o84Var = (o84) obj;
        if (Intrinsics.areEqual(this.a, o84Var.a) && Intrinsics.areEqual(this.b, o84Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpeningInfo(delimiter=");
        sb.append(this.a);
        sb.append(", info=");
        return m51.m(sb, this.b, ')');
    }
}
