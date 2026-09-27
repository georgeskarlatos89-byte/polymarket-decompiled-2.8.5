package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dr6 extends gr6 {
    public final String a;
    public final String b;

    public dr6(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dr6) {
                dr6 dr6Var = (dr6) obj;
                if (!Intrinsics.areEqual(this.a, dr6Var.a) || !Intrinsics.areEqual(this.b, dr6Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetTag(key=");
        sb.append(this.a);
        sb.append(", value=");
        return m51.m(sb, this.b, ')');
    }
}
