package defpackage;

import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class m8j {
    public final int a;
    public final String b;
    public final int c;
    public final el8[] d;
    public int e;

    static {
        u1k.G(0);
        u1k.G(1);
    }

    public m8j(String str, el8... el8VarArr) {
        boolean z;
        if (el8VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.b = str;
        this.d = el8VarArr;
        this.a = el8VarArr.length;
        int h = ggc.h(el8VarArr[0].n);
        this.c = h == -1 ? ggc.h(el8VarArr[0].m) : h;
        String str2 = el8VarArr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = el8VarArr[0].f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i2 = 1; i2 < el8VarArr.length; i2++) {
            String str3 = el8VarArr[i2].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i2, "languages", el8VarArr[0].d, el8VarArr[i2].d);
                return;
            } else {
                if (i != (el8VarArr[i2].f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i2, "role flags", Integer.toBinaryString(el8VarArr[0].f), Integer.toBinaryString(el8VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static void b(int i, String str, String str2, String str3) {
        StringBuilder r = m51.r("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        r.append(str3);
        r.append("' (track ");
        r.append(i);
        r.append(")");
        q7m.d("TrackGroup", "", new IllegalStateException(r.toString()));
    }

    public final int a(el8 el8Var) {
        int i = 0;
        while (true) {
            el8[] el8VarArr = this.d;
            if (i < el8VarArr.length) {
                if (el8Var == el8VarArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m8j.class == obj.getClass()) {
            m8j m8jVar = (m8j) obj;
            if (this.b.equals(m8jVar.b) && Arrays.equals(this.d, m8jVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.d) + hdi.e(527, 31, this.b);
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
