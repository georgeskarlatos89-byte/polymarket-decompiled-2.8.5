package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gb {
    public final int a;
    public final Uri[] b;
    public final j7c[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;

    static {
        ix2.v(0, 1, 2, 3, 4);
        ix2.v(5, 6, 7, 8, 9);
        u1k.G(10);
    }

    public gb(int i, int[] iArr, j7c[] j7cVarArr, long[] jArr, String[] strArr) {
        boolean z;
        Uri uri;
        int i2 = 0;
        if (iArr.length == j7cVarArr.length) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.a = i;
        this.d = iArr;
        this.c = j7cVarArr;
        this.e = jArr;
        this.b = new Uri[j7cVarArr.length];
        while (true) {
            Uri[] uriArr = this.b;
            if (i2 < uriArr.length) {
                j7c j7cVar = j7cVarArr[i2];
                if (j7cVar == null) {
                    uri = null;
                } else {
                    g7c g7cVar = j7cVar.b;
                    g7cVar.getClass();
                    uri = g7cVar.a;
                }
                uriArr[i2] = uri;
                i2++;
            } else {
                this.f = strArr;
                return;
            }
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gb.class == obj.getClass()) {
            gb gbVar = (gb) obj;
            if (this.a == gbVar.a && Arrays.equals(this.c, gbVar.c) && Arrays.equals(this.d, gbVar.d) && Arrays.equals(this.e, gbVar.e) && Arrays.equals(this.f, gbVar.f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31;
    }
}
