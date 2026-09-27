package io.sentry.android.core.anr;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b {
    public final StackTraceElement[] a;
    public final int b;
    public final int c;
    public final int d;

    public b(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        this.a = stackTraceElementArr;
        this.b = i;
        this.c = i2;
        int i3 = 1;
        while (i <= this.c) {
            i3 = (i3 * 31) + this.a[i].hashCode();
            i++;
        }
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i = bVar.b;
        if (this.d != bVar.d) {
            return false;
        }
        int i2 = this.c;
        int i3 = this.b;
        int i4 = (i2 - i3) + 1;
        if (i4 != (bVar.c - i) + 1) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!this.a[i3 + i5].equals(bVar.a[i + i5])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.d;
    }
}
