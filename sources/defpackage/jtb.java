package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jtb {
    public long[] a;
    public int b;

    public jtb(int i, DefaultConstructorMarker defaultConstructorMarker) {
        long[] jArr;
        if (i == 0) {
            jArr = eub.a;
        } else {
            jArr = new long[i];
        }
        this.a = jArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jtb) {
            jtb jtbVar = (jtb) obj;
            int i = jtbVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = jtbVar.a;
                IntRange k = lnf.k(0, i2);
                int i3 = k.a;
                int i4 = k.b;
                if (i3 <= i4) {
                    while (jArr[i3] == jArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(j);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }
}
