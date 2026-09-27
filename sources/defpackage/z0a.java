package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class z0a {
    public int[] a;
    public int b;

    public z0a(int i, DefaultConstructorMarker defaultConstructorMarker) {
        int[] iArr;
        if (i == 0) {
            iArr = m1a.a;
        } else {
            iArr = new int[i];
        }
        this.a = iArr;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        f27.m("Index must be between 0 and size");
        return 0;
    }

    public final int b() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        ahh.i("IntList is empty.");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0a) {
            z0a z0aVar = (z0a) obj;
            int i = z0aVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = z0aVar.a;
                IntRange k = lnf.k(0, i2);
                int i3 = k.a;
                int i4 = k.b;
                if (i3 <= i4) {
                    while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(i3);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }
}
