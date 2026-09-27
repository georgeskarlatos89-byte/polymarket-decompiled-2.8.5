package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class r6c {
    public final String a;
    public final boolean b;
    public final boolean c;

    public r6c(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == r6c.class) {
            r6c r6cVar = (r6c) obj;
            if (TextUtils.equals(this.a, r6cVar.a) && this.b == r6cVar.b && this.c == r6cVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int e = hdi.e(31, 31, this.a);
        int i2 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (e + i) * 31;
        if (this.c) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
