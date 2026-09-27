package defpackage;

import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tdj implements Comparable {
    public final int a;
    public final int b;
    public final wwg c;

    public tdj(int i, int i2, wwg wwgVar) {
        this.a = i;
        this.b = i2;
        this.c = wwgVar;
    }

    public final boolean a() {
        if (this.c.a.b != this.a) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tdj tdjVar = (tdj) obj;
        tdjVar.getClass();
        int i = tdjVar.a;
        int i2 = this.a;
        if (i2 != i) {
            return i2 - i;
        }
        if (a() == tdjVar.a()) {
            IntRange intRange = this.c.a;
            int i3 = intRange.a;
            int i4 = intRange.b;
            IntRange intRange2 = tdjVar.c.a;
            int i5 = intRange2.a;
            int i6 = intRange2.b;
            int i7 = (i3 + i4) - (i5 + i6);
            if (i7 != 0) {
                if (i3 == i4) {
                    return i7;
                }
                if (i5 == i6) {
                    return i7;
                }
                return -i7;
            }
            int i8 = this.b - tdjVar.b;
            if (a()) {
                return -i8;
            }
            return i8;
        }
        if (a()) {
            return 1;
        }
        return -1;
    }

    public final String toString() {
        String str;
        if (a()) {
            str = "Open";
        } else {
            str = "Close";
        }
        return str + ": " + this.a + " (" + this.c + ')';
    }
}
