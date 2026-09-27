package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class nk0 {
    public static final hk0 a = new hk0(4);
    public static final hk0 b = new hk0(3);
    public static final ik0 c = new ik0(1);
    public static final ik0 d = new ik0(0);
    public static final ndg e = new ndg(23);
    public static final gdn f = new gdn(23);
    public static final nim g = new nim(23);
    public static final azk h = new azk(23);

    public static void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f2 = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i7;
            } else {
                return;
            }
        }
    }

    public static void b(int i, int[] iArr, int[] iArr2, boolean z) {
        float length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        if (iArr.length == 0) {
            length = 0.0f;
        } else {
            length = (i - i3) / iArr.length;
        }
        float f2 = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 < length3) {
                int i7 = iArr[length3];
                iArr2[length3] = Math.round(f2);
                f2 += i7 + length;
            } else {
                return;
            }
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z) {
        float f2;
        if (iArr.length != 0) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 : iArr) {
                i3 += i4;
            }
            float max = (i - i3) / Math.max(iArr.length - 1, 1);
            if (z && iArr.length == 1) {
                f2 = max;
            } else {
                f2 = 0.0f;
            }
            if (!z) {
                int length = iArr.length;
                int i5 = 0;
                while (i2 < length) {
                    int i6 = iArr[i2];
                    iArr2[i5] = Math.round(f2);
                    f2 += i6 + max;
                    i2++;
                    i5++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i7 + max;
            }
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (!z) {
            int length2 = iArr.length;
            float f2 = length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        float f3 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += i7 + length;
        }
    }
}
