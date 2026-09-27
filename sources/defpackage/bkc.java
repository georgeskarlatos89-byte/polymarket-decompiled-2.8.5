package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class bkc {
    public final ni a;
    public final int b;
    public final String c;
    public final String d;

    public bkc(ni niVar, int i, String str, String str2) {
        this.a = niVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bkc) {
            bkc bkcVar = (bkc) obj;
            if (this.a == bkcVar.a && this.b == bkcVar.b && this.c.equals(bkcVar.c) && this.d.equals(bkcVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(this.a);
        sb.append(", keyId=");
        sb.append(this.b);
        sb.append(", keyType='");
        return sv6.p(sb, this.c, "', keyPrefix='", this.d, "')");
    }
}
