package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class p {
    public static final int a(jog jogVar, int i) {
        int i2;
        int[] iArr = jogVar.f;
        int i3 = i + 1;
        int length = jogVar.e.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= length) {
                i2 = (i4 + length) >>> 1;
                int i5 = iArr[i2];
                if (i5 < i3) {
                    i4 = i2 + 1;
                } else {
                    if (i5 <= i3) {
                        break;
                    }
                    length = i2 - 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
