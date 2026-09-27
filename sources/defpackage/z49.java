package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z49 {
    public final String a;
    public final String b;

    public z49(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z49.class == obj.getClass()) {
            z49 z49Var = (z49) obj;
            if (TextUtils.equals(this.a, z49Var.a) && TextUtils.equals(this.b, z49Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return woa.r(sb, this.b, "]");
    }
}
