package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vz8 {
    public final float[] a;
    public final int[] b;

    public vz8(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(vz8 vz8Var) {
        int i = 0;
        while (true) {
            int[] iArr = vz8Var.b;
            if (i < iArr.length) {
                this.a[i] = vz8Var.a[i];
                this.b[i] = iArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    public final vz8 b(float[] fArr) {
        int c;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                c = iArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    c = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    c = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    c = sql.c(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = c;
        }
        return new vz8(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && vz8.class == obj.getClass()) {
                vz8 vz8Var = (vz8) obj;
                if (Arrays.equals(this.a, vz8Var.a) && Arrays.equals(this.b, vz8Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
