package defpackage;

import android.content.LocusId;
import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xqb {
    public final String a;
    public final LocusId b;

    public xqb(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            this.b = new LocusId(str);
        } else {
            dmk.v("id cannot be empty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xqb.class != obj.getClass()) {
            return false;
        }
        String str = ((xqb) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
